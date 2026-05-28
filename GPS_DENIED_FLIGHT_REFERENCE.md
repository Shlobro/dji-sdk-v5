# GPS-Denied Flight on the Matrice 400 — MSDK V5 Reference

A consolidated reference of every SDK surface relevant to flying the M400 in GPS-degraded or GPS-denied environments, derived from the decompiled MSDK V5 classes at:

```
Mobile-SDK-Android-V5/SampleCode-V5/android-sdk-v5-sample/src/main/assets/Decompiled-DJI-Classes/
```

All key paths below are under `dji.sdk.keyvalue.key.DJIFlightControllerKey` unless otherwise noted.

---

## 1. The two GPS-denied flight modes that actually exist

The M400 firmware exposes two distinct features through MSDK V5. They are different things and solve different problems.

### 1a. Auto Explore — the closest to "true" GPS-free flight

Vision-based autonomous frontier exploration. No GPS coordinates required. This is what you want for genuinely GPS-denied flight (indoors, tunnels, dense urban canyons, under canopy).

`FCFlightMode.AUTO_EXPLORE = 83` is a first-class flight controller mode.

**Action keys:**

| Key | Purpose |
|---|---|
| `KeyEnterAutoExplore` | Begin Auto Explore |
| `KeyResumeAutoExplore` | Resume after pause |
| `KeyExitAutoExplore` | Exit normally |
| `KeyEndAutoExplore` | End session |
| `KeyEndEarlyAutoExplore` | Early termination |
| `KeyEnterModelFixAutoExplore` / `KeyExitModelFixAutoExplore` | Pin/release the internal 3D model |
| `KeyEnterManualAutoExplore` / `KeyExitManualAutoExplore` | Manual override during explore |
| `KeyAutoExploreBreakPoint` | Set a resume point |

**Settable config:**

| Key | Type | Notes |
|---|---|---|
| `KeyAutoExploreConfig` | `AutoExploreConfigMsg` | Full config struct, get + set |
| `KeyAutoExploreMaxSpeed` | Integer | Bounded by `KeyAutoExploreMaxSpeedLimit` (read-only) |
| `KeyAutoExploreMinDistance` | Integer | Min standoff from obstacles |

**Telemetry (read-only, listen-able):**

| Key | Type |
|---|---|
| `KeyAutoExploreState` | `AutoExploreStateMsg` |
| `KeyAutoExploreTrajectory` | `AutoExploreTrajectoryMsg` |
| `KeyAutoExploreFrontier` | `AutoExploreFrontierMsg` |

**State machine** (`AutoExploreState`):
```
STANDDOWN (0) → PREPROCESS (1) → MARCHON_TARGET_AREA (2)
              → EXPLORE_TARGET_AREA (3) → MANUAL (4)
              → EMERGENCY (5) → DONE (6)
```

### 1b. Visual Exploration — GPS recovery, not GPS replacement

This is *not* a way to fly without GPS. It's a way to *recover* a GNSS fix when raw signal is degraded, using onboard cameras to scan the sky for visible satellites and uploaded ephemeris data to compute a position. Useful near tall structures, but it still requires GNSS to bootstrap.

`FCFlightMode.VISUAL_EXPLORATION = 74`.

**Action keys:**

| Key | Purpose |
|---|---|
| `KeyStartVisualExploration` / `KeyStopVisualExploration` | Standard cycle |
| `KeyStartVisualExplorationWithDeparturePoint` / `KeyStopVisualExplorationWithDeparturePoint` | With explicit departure point |
| `KeyStartDeparturePointSetMode` | Enter departure-point set mode |
| `KeyStartDeparturePointExploration` | Begin departure-point exploration |
| `KeyStartExecuteDepartureWayline` (`StartExecuteDepartureWaylineMsg`) | Fly a departure wayline from the vision-set point |
| `KeyVisualExplorationEphemerisUpload` (`EphemerisUploadCommandMsg`) | Upload satellite ephemeris files |

**Settable:**

| Key | Type | Notes |
|---|---|---|
| `KeyVisualExplorationRotateNumber` | Integer | Sky-scanning rotation count |
| `KeyVisualExplorationRotateRate` | Double | Rotation rate |

**Telemetry:**

| Key | Type |
|---|---|
| `KeyVisualExplorationTaskInfo` | `VisualExplorationTaskInfoMsg` |
| `KeyVisualExplorationTaskInfoWithDeparturePoint` | `VisualExplorationTaskInfoMsg` |
| `KeyVisualExplorationEphemerisFilename` | String |

**Stage machine** (`VisualExplorationStage`):
```
IDLE → SKY_PARSING → SATELLITE_SEARCHING → TRANSFING
     → MANUAL_SET_DEPARTURE_POINT → WAIT_EXECUTE_DEPARTURE_WAYLINE
     → EXECUTE_DEPARTURE_WAYLINE
```

**Critical: `VisualExplorationErrorCode` enum tells you what will block operation.** The blockers worth knowing:

| Code | Meaning | Implication |
|---|---|---|
| 4 | `DRONE_IS_NOT_IN_AIR` | Must be airborne to start |
| 7 | `WIND_SPD_BIG` | Wind-sensitive |
| 10 | `RUNNING_AT_NIGHT` | Daylight only — vision system requires light |
| 11 | `HEIGHT_LIMIT` | Geofence ceiling still applies |
| 12 | `BOUNDARY_LIMIT` | Geofence perimeter still applies |
| 13 | `OA_LIMIT` | Obstacle-avoidance blocks operation |
| 18 | `START_FAIL_FOR_HEADING_LEVEL` | Needs heading lock |
| 20 | `START_FAIL_FOR_GNSS_INIT_FAIL` | GNSS init must succeed |
| 21 | `START_FAIL_FOR_GNSS_LEVEL_LOW` | GNSS still required to bootstrap |
| 116 | `NO_EPHEMERIS` | Must upload ephemeris first |
| 117 | `EPHEMERIS_NOT_VALID` | Stale/invalid ephemeris |
| 128–131 | `TRANSFER_HEIGHT_ERROR / HEIGHT_LIMIT / TIMEOUT / GNSS_TIME_OUT` | Transit-phase failures |
| 178 | `HOME_NOT_SET_VE` | Home point required |
| 180 | `ATTI_MODE_VE` | **Cannot run in ATTI mode** |

---

## 2. Flight modes — what's reportable vs. settable

`FCFlightMode` enum (in `dji.sdk.keyvalue.value.flightcontroller.FCFlightMode`) — **all read-only.** The FC reports these; you cannot command a switch to ATTI.

Relevant entries for GPS-denied context:

| Value | Mode |
|---|---|
| 0 | `MANUAL` |
| 1 | `ATTI` |
| 2 | `ATTI_CL` |
| 3 | `ATTI_HOVER` |
| 4 | `HOVER` |
| 5 | `GPS_BRAKE` |
| 6 | `GPS_ATTI` |
| 13 | `ATTI_LANDING` |
| 17 | `JOYSTICK` (Virtual Stick) |
| 23 | `ATTI_LIMITED` |
| 33 | `CONFIRM_LANDING` |
| 74 | `VISUAL_EXPLORATION` |
| 83 | `AUTO_EXPLORE` |

The simplified `FlightMode` enum (`dji.sdk.keyvalue.value.flightcontroller.FlightMode`) also includes `ATTI = 1` and `VIRTUAL_STICK = 9`. `FlightModeUtil.getFlightMode(FCFlightMode)` collapses the FC's detailed mode into this simpler enum.

**You cannot force ATTI from SDK code.** It is entered automatically by the FC when GNSS is lost or the physical RC mode switch is moved. Treating it as a target state is wrong — `ATTI_MODE_VE` is explicitly a failure code for Visual Exploration.

---

## 3. Height limits — what's adjustable vs. firmware-enforced

### Settable (within firmware-allowed range)

| Key | Type | Notes |
|---|---|---|
| `KeyHeightLimit` | Integer | User-tunable max altitude. Bounded by `KeyHeightLimitRange` |
| `KeyGoHomeHeight` | Integer | RTH altitude. Bounded by `KeyGoHomeHeightRange` |
| `KeyDistanceLimit` | Integer | Horizontal distance cap. Bounded by `KeyDistanceLimitRange` |
| `KeyNoviceModeEnabled` | Boolean | Disable to remove the 30 m novice cap |

### Read-only (firmware caps you can observe but not override)

| Key | Type | Meaning |
|---|---|---|
| `KeyFlightLimitHeight` | Integer | Absolute geofence ceiling |
| `KeyLimitMaxFlightHeightInMeter` | Integer | Regulatory cap (EU C0 = 120 m etc.) |
| **`KeyLimitHeightABSWithoutGPS`** | Double | **The cap that kicks in when GNSS is lost — directly relevant to GPS-denied work** |
| `KeyAccurateLimitHeight` | Double | Accurate-altitude limit |
| `KeyFCPropCoverLimitHeight` | Double | Cap when prop covers are on |
| `KeyFCPropCoverLimitDistance` | Double | Distance cap when prop covers are on |
| `KeyTouchDownConfirmLimitHeight` | Integer | Touchdown-confirmation height |
| `KeyIsInLimitHeightArea` | Boolean | Currently inside a limit zone |
| `KeyIsNearHeightLimit` | Boolean | Approaching the cap |
| `KeyIsNearDistanceLimit` | Boolean | Approaching the distance cap |
| `KeyHeightLimitReason` | `FCHeightLimitReason` | **Why** the cap is active |
| `KeyFlightLimitUsedOnboardDB` | Boolean | Limit sourced from onboard DB |
| `KeyIsSupportReleaseLimitHeight` | Boolean | Whether aircraft *supports* unlock (no corresponding action key exposed) |

### `FCHeightLimitReason` — diagnoses which cap is biting

| Value | Reason |
|---|---|
| 0 | `NONE` |
| 1 | `NO_GPS_LIMIT` — **the GPS-denied cap** |
| 2 | `COMPASS_NOT_CALIBRATE_WITH_GPS` |
| 3 | `IN_WAYPOINT` |
| 4 | `AVOID_GROUND` |
| 5 | `NORMAL` |
| 6 | `NFZ` |
| 7 | `NOVICE_MODE` |
| 8 | `WIFI_MODE` |
| 9 | `WRISTBAND` |
| 10 | `REAL_NAME` |
| 11 | `INVALID_REF_HEIGHT` |
| 12 | `PROP_COVER` |
| 13 | `EU_C0` |
| 14 | `POOR_GPS_AT_NIGHT` |
| 15 | `GPS_LEVEL_NEVER_BE_GOOD_AND_NO_APP_POSE` |

### Unlock path (the only legitimate way to raise hard caps)

| Key/Class | Purpose |
|---|---|
| `dji.sdk.keyvalue.value.flightcontroller.FlysafeHeightLicenseInfo` | Holds `heightLimit` from a DJI-signed license |
| `dji.component.flysafe.unlock.model.WhiteListLicense` (`mHeightLimit`) | Self-unlock whitelist license |
| `dji.csdk.flysafe.v3.License`, `LicenseModel` | Applied via FlySafe v3 |

The hard ceiling cannot be flipped from app code. Raising it requires a DJI Custom Unlock license bound to the aircraft's serial number.

---

## 4. GNSS / positioning telemetry

Use these to know **what's actually wrong with your fix** before deciding which strategy to use.

### Position quality

| Key | Type | Notes |
|---|---|---|
| `KeyMultiGNSSInfo` | `List<GNSSInfo>` | Per-constellation satellite info |
| `KeyGnssAssessTaskCommand` | Action: `GnssEnvironmentAssessTaskCommandInfo` → `GnssEnvironmentAssessTaskResultMsg` | Trigger a GNSS environment assessment |

Related value classes:
- `FCGNSSType`
- `GNSSType` (RTK mobile station variant in `dji.sdk.keyvalue.value.rtkmobilestation`)
- `CurrentGnssAssessInfoMsg` (carries `GnssEnvironmentAssessResultFailCode`)
- `GnssEnvironmentAssessLocationSuggestCode` — directional block hints (`NORTH_BLOCK`, `SOUTH_BLOCK`, `EAST_BLOCK`, `WEST_BLOCK`, `NORTH_EAST_BLOCK`, etc.)

### `GnssEnvironmentAssessResultFailCode` — why the assessment failed

| Value | Code |
|---|---|
| 0 | `STATUS_SUCCESS` |
| 16 | `ASSESS_RESULT_UNAVAILABLE` |
| 17 | `GNSS_DATA_UNAVAILABLE` |
| 32 | `SPP_LOW_POS_RATE` |
| 33 | `SPP_LOW_POS_ACCURACY` |
| 34 | `SPP_POS_SAT_INSUFFICIENT` |
| 35 | `SPP_POS_HIGH_PDOP` |
| 36–39 | `HEADING_*` (low fix rate, switch to float, low accuracy, insufficient sats) |
| 40 | `RTK_POS_NO_VALID_DATA` |
| 41 | `RTK_POS_TOO_MANY_ERROR_PERIODS` |
| 48–51 | Ephemeris issues (`NO_EPHEMERIS`, `SAT_COCER_LESS`, `EPHEMERIS_NOT_VALID`, `EPHEMERIS_DATA_NOT_MATCHING`) |
| 64–67 | Observation issues (`OBS_SAT_SNR_LOW`, `OBS_SAT_FREQUENT_CYCLE_SLIP`, `OBS_SAT_NUM_INSUFFICIENT`, `OBS_MIN_SAT_NUM_LESS`) |
| 80 | `POSITION_CHANGED` |

### RTK

`dji.v5.manager.aircraft.rtk.RTKSystemState` exposes `isRTKEnabled` (read-only state). For mobile station: `DJIRtkMobileStationKey`, with `RTKPositioningSolution`, `RTKLocation`, `RTKReceiverInfo`, `RTKSingnalType`.

RTK gives centimeter accuracy when available — but it depends on a base station and won't help when GNSS itself is unavailable.

---

## 5. Perception / vision system (`DJIFlightAssistantKey`)

The downward + omnidirectional vision system is what keeps the M400 stable when GNSS is gone.

### Settable

| Key | Type | Use |
|---|---|---|
| `KeyVisionAllowedDirection` | `VisionAllowedDirectionInfo` | **Mask which directions vision is active in** — useful for proximity inspection where OA would otherwise block |

### Manager interfaces

- `dji.v5.manager.aircraft.perception.IVisualManager`
- `dji.v5.manager.aircraft.perception.PerceptionManager`
- `dji.v5.manager.aircraft.perception.data.PerceptionInfo`
- `dji.v5.inner.aircraft.perception.IndustryPerceptionDelegate` (industrial perception delegate — this is the M400-class one)

### Related value classes

- `VisionAssistDirection`
- `AssistantVideoModeMsg`
- `Vision2100CheckStatus`
- `ObstacleAvoidanceException`
- `ModeEntryPermissionCheckerResult`

The perception manager controls obstacle avoidance enables and brake distances at runtime — critical when flying close to structures in GPS-denied environments where you may want OA off in certain directions.

---

## 6. Auxiliary lighting — required for vision/VPS in low light

The downward auxiliary light keeps VPS fed when ambient light is low. **In GPS-denied flight (indoor, tunnel, night), the downward VPS is what's keeping you in the air — this light is mission-critical, not optional.**

### V5 keys

Look in `DJIFlightAssistantKey` for keys containing `FillLight` or `AuxiliaryLight`. `FillLightMode` enum lives at `dji.sdk.keyvalue.value.flightassistant.FillLightMode` with values `AUTO / OFF / ON / BEACON`.

### V4 equivalents (from `D:\Projects\DJI-SDK-Sample-App`)

| Key string | Component |
|---|---|
| `FlightControllerKey.BOTTOM_AUXILIARY_LIGHT_MODE` | Downward fill light |
| `FlightControllerKey.TOP_AUXILIARY_LIGHT_MODE` | Upward fill light (M300/M350/M400) |

Set via `KeyManager.getInstance().setValue(lightKey, FillLightMode.ON, callback)`.

### Other lights worth controlling in dark environments

| Key | Component | Purpose |
|---|---|---|
| `DJISpotLightKey.KeyIsSpotLightOpened` | Spotlight payload | High-power inspection light |
| `DJISpotLightKey.KeyBrightness` | Spotlight payload | 0–100 |
| `DJIBeaconKey.KeyIsBeaconOpened` | Beacon | Anti-collision strobe |
| `DJIBeaconKey.KeyFlashingFrequency` | Beacon | Strobe Hz |
| `DJIPayloadKey.KeyLightCtrl` (`LightCtrlMsg`) | PSDK payload | Per-channel light control |
| `DJIPayloadKey.KeyLightGimbalControlEnabled` | PSDK payload | Slave a light to gimbal aim |

---

## 7. Flight-control commands & stick behavior

### Direct flight actions

| Key | Notes |
|---|---|
| `KeyStartTakeoff` / `KeyStopTakeoff` | Manual takeoff |
| `KeyPrecisionStartTakeoff` | Precision takeoff (records home pose) |
| `KeyStartAutoLanding` / `KeyStopAutoLanding` | Auto-land |
| `KeyHomeLocationUsingCurrentAircraftLocation` | Reset home to current position |
| `KeyPaperPlanePause` / `KeyPaperPlaneGoHome` | Paper Plane mode commands |

### Stick scaling — relevant when flying carefully in tight GPS-denied spaces

| Key | Settable | Purpose |
|---|---|---|
| `KeyRCScaleInNormal` | yes | Stick response in Normal mode |
| `KeyRCScaleInSport` | yes | Stick response in Sport mode |
| `KeyRCScaleInTripod` | yes | Stick response in Tripod mode |
| `KeyLimitFlightSpeed` | yes | Max speed cap |

Lowering these gives you finer control in confined GPS-denied environments. Tripod mode + reduced scale is the standard configuration for indoor work.

### Virtual Stick (programmatic flight control)

`FlightMode.VIRTUAL_STICK = 9` / `FCFlightMode.JOYSTICK = 17`. The only programmatic flight-command interface in MSDK. When GNSS is healthy the FC fuses your commands with GPS-stabilized hold; in degraded GNSS the same commands ride on top of vision-based hold. You cannot tell it to "ignore GPS" — it uses whatever positioning is available.

---

## 8. RC customization — wire physical buttons to GPS-denied workflows

In GPS-denied flight you're often hands-on with the sticks and don't want to be reaching for the screen. Bind C1/C2/C3 (and the back-side buttons) to your most-used actions.

`DJIRemoteControllerKey`:

| Key | Purpose |
|---|---|
| `KeyRcCustomButtonConfig` (`RcButtonActionMsg`) | Set custom button binding |
| `KeyRcFetchCustomButtonConfig` (`RcCustomizableButton` → `RcButtonActionMsg`) | Read current binding |
| `KeyRcResetButtonConfig` | Reset to defaults |
| `KeyRcButtonConfig` (`RcMultiButtonActionConfigMsg`) | Multi-button profile |
| `KeyRcSelectButtonProfileGroup` (String) | Switch profile group |
| `KeyRcShakeMotor` | Haptic alert (use on degraded GNSS, low battery, geofence approach) |

`RcButtonAction` enum and `RCFlightModeSwitch` are the values to bind.

**Suggested bindings for GPS-denied work:** start/stop Auto Explore, toggle spotlight, toggle aux light, request gimbal control, trigger haptic on degraded GNSS event.

---

## 9. Airlink / RF — surviving RF-noisy industrial sites

GPS-denied environments often coincide with RF-noisy ones (buildings, machinery, jammers). `DJIAirlinkKey`:

| Key | Settable | Purpose |
|---|---|---|
| `KeyFrequencyBand` | yes | 2.4 vs 5.8 GHz vs DFS |
| `KeyFrequencyPoint` | yes | Specific frequency point index |
| `KeyChannelNumber` | yes | Manual channel selection |
| `KeyChannelSelectionMode` | yes | Auto vs manual |
| `KeyBandwidth` | yes | Channel bandwidth |
| `KeyLightbridgeDataRate` | yes | Data rate |
| `KeyPrimaryVideoFeedBandwidth` | yes | Video bandwidth |
| `KeyLinkModeControlLinkMode` | yes | O3/O4 link mode |
| `KeyRelayLinkModeControlLinkMode` | yes | Relay mode (RC-to-RC or dongle) |
| `KeyWlmLinkMode` | yes | 4G/cellular link mode |
| `KeyWlmDownloadServiceMode` | yes | 4G download service |
| `KeyWlmWriteDongleApnInfo` | action | Configure cellular dongle APN |
| `KeyEnableAutoFramerate` / `KeySendMaxDecodeFramerate` / `KeyRequireIFrame` | actions | Video stream tuning |

`DJIRemoteControllerKey`:
- `KeyRcEnableRtk` — toggle RTK
- `KeyRcEnable4G` — toggle cellular as control fallback

---

## 10. Audio cues for autonomous GPS-denied missions

`DJISpeakerKey` (aircraft speaker) and `DJIPayloadKey` megaphone keys let you push WAV files and trigger them on events.

| Key | Purpose |
|---|---|
| `DJISpeakerKey.KeySendAudioFile` | Upload WAV |
| `DJISpeakerKey.KeyPlayAudio(int index)` | Trigger by index |
| `DJISpeakerKey.KeyStopAudio` | Stop |
| `DJISpeakerKey.KeyVolume` | Set volume |
| `DJIPayloadKey.KeyMegaphoneStartPlay/StopPlay/PausePlay` | Megaphone payload |

Use for: scripted announcements during Auto Explore, low-GNSS audible warnings, geofence-breach alerts.

---

## 11. Decision matrix — which approach for which scenario

| Scenario | Recommended approach |
|---|---|
| Indoor / tunnel / cave (no GNSS at all) | **Auto Explore** + bright aux/spot lights + Tripod mode + reduced stick scaling. Disable forward OA via `KeyVisionAllowedDirection` if needed for close approach. |
| Urban canyon (intermittent GNSS) | **Visual Exploration** to recover GNSS fix when degraded. Upload ephemeris before flight. |
| Under tree canopy | **Visual Exploration** if some sky is visible (sky-parsing needs it). Otherwise Auto Explore. |
| Near tall structure / inspection | Reduce `RCScaleInTripod`, mask vision direction toward structure, manually fly with VPS. |
| Need to fly above current cap | **Not possible from SDK code.** Acquire DJI Custom Unlock license; apply via `FlysafeHeightLicenseInfo` / `WhiteListLicense`. |
| Need to force ATTI mode | **Not exposed.** ATTI is FC-entered automatically on GNSS loss. Cannot be commanded. |
| Programmatic nav without GNSS coords | **Virtual Stick** — works regardless of GNSS state but fusion behavior depends on what's available. |
| RTK-precise positioning when GNSS works | Enable RTK via `KeyRcEnableRtk`; monitor `RTKSystemState.isRTKEnabled`. |

---

## 12. Hard limits — what the SDK will not let you do

These are firmware-enforced below the MSDK boundary. Nothing in the Java layer can override them.

- Cannot raise hard height ceiling without DJI-signed unlock license
- Cannot force ATTI mode (`ATTI_MODE_VE` is an explicit failure code)
- Cannot disable GNSS at the FC level
- Cannot bypass geofence/NFZ without unlock
- Cannot run Visual Exploration at night (`RUNNING_AT_NIGHT` failure code)
- Cannot run Visual Exploration in high wind (`WIND_SPD_BIG` failure code)
- Auto Explore is bounded by `AutoExploreMaxSpeedLimit` (read-only) and `AutoExploreMinDistance`

---

## 13. Key files for reference

| File | Contains |
|---|---|
| `dji/sdk/keyvalue/key/DJIFlightControllerKey.java` | All FC keys — Auto Explore, Visual Exploration, height limits, GNSS assess |
| `dji/sdk/keyvalue/key/DJIFlightAssistantKey.java` | Vision/perception keys, fill light, OA |
| `dji/sdk/keyvalue/key/DJIRtkMobileStationKey.java` | RTK mobile station |
| `dji/sdk/keyvalue/key/DJIRemoteControllerKey.java` | RC customization, RTK/4G toggles, haptics |
| `dji/sdk/keyvalue/key/DJIAirlinkKey.java` | RF, video link, 4G dongle |
| `dji/sdk/keyvalue/key/DJISpotLightKey.java`, `DJIBeaconKey.java`, `DJISpeakerKey.java`, `DJIPayloadKey.java` | Lights, beacon, audio |
| `dji/sdk/keyvalue/value/flightcontroller/FCFlightMode.java` | Full flight mode enum |
| `dji/sdk/keyvalue/value/flightcontroller/FCHeightLimitReason.java` | Diagnose height cap source |
| `dji/sdk/keyvalue/value/flightcontroller/VisualExplorationErrorCode.java` | All VE blockers and their meanings |
| `dji/sdk/keyvalue/value/flightcontroller/GnssEnvironmentAssessResultFailCode.java` | GNSS assess failure modes |
| `dji/sdk/keyvalue/value/flightcontroller/AutoExploreState.java` | Auto Explore state machine |
| `dji/sdk/keyvalue/value/flightcontroller/VisualExplorationStage.java` | VE stage machine |
| `dji/v5/manager/aircraft/perception/PerceptionManager.java` | Runtime OA control |
| `dji/v5/manager/aircraft/rtk/RTKSystemState.java` | RTK state |

---

## 14. Recommended starting workflow for M400 GPS-denied flight

1. **Before takeoff**
   - Upload ephemeris via `KeyVisualExplorationEphemerisUpload` (in case you want to recover GNSS mid-flight)
   - Set `KeyHeightLimit`, `KeyDistanceLimit` appropriately within firmware range
   - Configure `KeyAutoExploreConfig` (max speed, min distance)
   - Set `FillLightMode.ON` for aux light
   - Lower `KeyRCScaleInTripod` if planning manual flight
   - Bind C-buttons for Auto Explore start/stop, spotlight toggle, gimbal control

2. **During flight — monitor**
   - `KeyMultiGNSSInfo` for satellite count
   - `KeyHeightLimitReason` to detect when `NO_GPS_LIMIT` engages
   - `KeyLimitHeightABSWithoutGPS` to know the cap that will apply
   - `KeyIsInLimitHeightArea`, `KeyIsNearHeightLimit`
   - `FCFlightMode` for automatic mode transitions
   - `KeyAutoExploreState` if Auto Explore is running

3. **On GNSS loss**
   - Aircraft auto-transitions to an ATTI variant; aux light + VPS keep it stable
   - To resume normal flight envelope: try `KeyStartVisualExploration` to recover fix
   - To continue in GPS-denied mode: `KeyEnterAutoExplore` if mission permits
   - Use `KeyRcShakeMotor` to alert operator

4. **Failsafe**
   - Verify `KeyGoHomeHeight` is set above local obstacles
   - Confirm home point is set (Visual Exploration requires it)
   - Have RTH height that accounts for the `LimitHeightABSWithoutGPS` cap if GNSS is lost during RTH
