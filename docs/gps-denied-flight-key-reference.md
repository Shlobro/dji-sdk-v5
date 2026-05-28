# DJI SDK GPS-Denied Flight Key Reference

This note summarizes the local SDK investigation for operating DJI aircraft, especially Matrice-class aircraft, in weak-GNSS or GPS-denied conditions.

Scope:

- Identify SDK keys that help detect GNSS degradation.
- Identify keys that enable or monitor alternate positioning sources such as vision positioning and RTK.
- Identify virtual-stick/manual-control keys relevant when GPS hold is unavailable or degraded.
- Identify height-limit and no-GPS-limit indicators.
- Separate supported operational surfaces from safety/geofence/no-GPS-limit bypass ideas.

This document does not describe bypassing DJI geofencing, no-GPS height limits, NFZ controls, firmware safety checks, or other aircraft-enforced limits. The SDK exposes normal user configuration and diagnostics, but the aircraft ultimately enforces safety and regulatory constraints.

## Source Locations

Main local sources inspected:

- `D:\Projects\DJI-SDK-Sample-App\app\src\main\assets\Decompiled-DJI-Classes\dji\keysdk\FlightControllerKey.java`
- `D:\Projects\DJI-SDK-Sample-App\app\src\main\assets\Decompiled-DJI-Classes\dji\keysdk\RemoteControllerKey.java`
- `D:\Projects\dji-sdk-v5\Decompiled-DJI-Classes\dji\sdk\keyvalue\key\DJIFlightControllerKey.java`
- `D:\Projects\dji-sdk-v5\Decompiled-DJI-Classes\dji\sdk\keyvalue\key\DJIFlightAssistantKey.java`
- `D:\Projects\dji-sdk-v5\Decompiled-DJI-Classes\dji\sdk\keyvalue\key\DJIRtkMobileStationKey.java`
- `D:\Projects\dji-sdk-v5\Decompiled-DJI-Classes\dji\sdk\keyvalue\key\DJIRadarKey.java`
- `D:\Projects\dji-sdk-v5\Decompiled-DJI-Classes\dji\sdk\keyvalue\value\flightcontroller\*.java`

There are two key systems in the local projects:

- v4-style app code uses `dji.keysdk.KeyManager` and key constants such as `FlightControllerKey.VISION_ASSISTED_POSITIONING_ENABLED`.
- v5 SDK code uses `dji.sdk.keyvalue.key.*` and strongly typed `DJIKeyInfo<T>` definitions, with explicit `canGet`, `canSet`, `canListen`, and `canPerformAction` flags.

## Practical Conclusion

No supported public SDK key was found that simply:

- Forces the aircraft from GNSS/GPS hold into ATTI mode.
- Removes the aircraft-enforced no-GPS height limit.
- Releases geofence/NFZ/flysafe limits.

The supported SDK path for GPS-denied work is:

1. Monitor GNSS failure and flight-mode state.
2. Enable and monitor vision positioning where supported.
3. Enable and monitor RTK or other alternate positioning where available.
4. Use virtual stick/manual control surfaces within the aircraft's permitted envelope.
5. Monitor no-GPS height-limit state and reason keys.
6. Treat safety limits as aircraft-enforced constraints, not app-side settings.

## High-Value Key Groups

### GNSS And Flight-Mode Diagnostics

These keys tell the app whether the aircraft has degraded GNSS, what flight mode it is in, and why GPS mode may not be available.

v5:

```java
DJIFlightControllerKey.KeyFCFlightMode
DJIFlightControllerKey.KeyGPSModeFailureReason
DJIFlightControllerKey.KeyGPSSignalLevel
DJIFlightControllerKey.KeyGPSSatelliteCount
DJIFlightControllerKey.KeyGPSInterferenceState
DJIFlightControllerKey.KeyGPSSpoofingState
DJIFlightControllerKey.KeyAircraftAttitude
```

v4-style names found:

```java
FlightControllerKey.FLIGHT_MODE
FlightControllerKey.FLIGHT_MODE_STRING
FlightControllerKey.GPS_SIGNAL_LEVEL
FlightControllerKey.ATTITUDE_PITCH
FlightControllerKey.ATTITUDE_ROLL
FlightControllerKey.ATTITUDE_YAW
FlightControllerKey.ABSOLUTE_GPS_ALTITUDE
FlightControllerKey.IS_ABSOLUTE_GPS_ALTITUDE_SUPPORT
```

Relevant value classes:

```java
dji.sdk.keyvalue.value.flightcontroller.FCFlightMode
dji.sdk.keyvalue.value.flightcontroller.FCGPSModeFailureReason
dji.sdk.keyvalue.value.flightcontroller.GPSSignalLevel
dji.sdk.keyvalue.value.flightcontroller.GPSInterferenceState
dji.sdk.keyvalue.value.flightcontroller.GPSSpoofingState
dji.sdk.keyvalue.value.common.Attitude
```

Notes:

- `KeyFCFlightMode` is get/listen only in the v5 decompiled key definition.
- The flight mode enum contains ATTI-related states, but this is telemetry, not a public setter for forcing ATTI.
- `KeyGPSModeFailureReason` is important for logging why GPS mode is unavailable.

### No-GPS Height Limits And Limit Reasons

These are the keys most directly related to "why am I limited without GPS?"

v5:

```java
DJIFlightControllerKey.KeyLimitHeightABSWithoutGPS
DJIFlightControllerKey.KeyHeightLimitReason
DJIFlightControllerKey.KeyHeightLimit
DJIFlightControllerKey.KeyHeightLimitRange
DJIFlightControllerKey.KeyFlightLimitHeight
DJIFlightControllerKey.KeyLimitMaxFlightHeightInMeter
DJIFlightControllerKey.KeyIsNearHeightLimit
DJIFlightControllerKey.KeyIsInLimitHeightArea
DJIFlightControllerKey.KeyAccurateLimitHeight
DJIFlightControllerKey.KeyIsSupportReleaseLimitHeight
```

v4-style names found:

```java
FlightControllerKey.NO_GPS_MAX_FLIGHT_HEIGHT
FlightControllerKey.IS_NO_GPS_MAX_FLIGHT_HEIGHT_SUPPORTED
FlightControllerKey.NEED_LIMIT_FLIGHT_HEIGHT
FlightControllerKey.MAX_FLIGHT_HEIGHT_LIMIT_REASON
FlightControllerKey.MAX_FLIGHT_HEIGHT
FlightControllerKey.MAX_FLIGHT_HEIGHT_RANGE
FlightControllerKey.MAX_FLIGHT_HEIGHT_IN_NFZ
FlightControllerKey.LIMIT_MAX_FLIGHT_HEIGHT_IN_METER
FlightControllerKey.HAS_REACHED_MAX_FLIGHT_HEIGHT
```

Important distinction:

- `KeyHeightLimit` / `MAX_FLIGHT_HEIGHT` is the normal user-configurable height limit.
- `KeyLimitHeightABSWithoutGPS` and no-GPS limit keys are diagnostics or aircraft-enforced limit indicators.
- `KeyHeightLimitReason` identifies why the height limit exists.

Relevant reason enum:

```java
dji.sdk.keyvalue.value.flightcontroller.FCHeightLimitReason
```

Observed reason values include:

```text
NO_GPS_LIMIT
NFZ
NOVICE_MODE
PROP_COVER
EU_C0
POOR_GPS_AT_NIGHT
GPS_LEVEL_NEVER_BE_GOOD_AND_NO_APP_POSE
```

Operational use:

- Log `KeyHeightLimitReason` before flight and whenever height-limit state changes.
- Log `KeyLimitHeightABSWithoutGPS` when GNSS is weak or absent.
- Do not treat normal `HeightLimit` as a way to override aircraft-enforced no-GPS or flysafe limits.

### Vision Positioning And Obstacle Avoidance

These are the most useful supported keys for GPS-denied operation if the aircraft has usable vision positioning in the environment.

v5 settable keys:

```java
DJIFlightAssistantKey.KeyVisionPositioningEnabled      // Boolean
DJIFlightAssistantKey.KeyLandingProtectionEnabled      // Boolean
DJIFlightAssistantKey.KeyPrecisionLandingEnabled       // Boolean
DJIFlightAssistantKey.KeyObstacleAvoidanceEnabled      // Boolean
DJIFlightAssistantKey.KeyActiveObstacleAvoidanceEnabled // Boolean
DJIFlightAssistantKey.KeyHorizontalAvoidanceEnable     // Boolean
DJIFlightAssistantKey.KeyUpwardsAvoidanceEnable        // Boolean
DJIFlightAssistantKey.KeyDownwardsAvoidanceEnable      // Boolean
DJIFlightAssistantKey.KeyHorizontalAvoidanceDistance   // Double
DJIFlightAssistantKey.KeyUpwardsAvoidanceDistance      // Double
DJIFlightAssistantKey.KeyDownwardsAvoidanceDistance    // Integer
```

v5 monitoring keys:

```java
DJIFlightControllerKey.KeyIsVisionSensorUsed
DJIFlightControllerKey.KeyUltrasonicHeight
DJIFlightControllerKey.KeyVisionPositioningLevel
DJIFlightControllerKey.KeyFusionPositioningLevel
DJIFlightControllerKey.KeyHoveringPositionMode
DJIFlightControllerKey.KeyHoveringPositionModeIsAvailable
DJIFlightControllerKey.KeyDisableHoveringPositionMode
```

v4-style names found:

```java
FlightControllerKey.VISION_ASSISTED_POSITIONING_ENABLED
FlightControllerKey.IS_VISION_POSITIONING_SENSOR_BEING_USED
FlightControllerKey.ULTRASONIC_HEIGHT_IN_METERS
FlightControllerKey.VISION_SYSTEM_WARNING
FlightControllerKey.VISION_DETECTION_STATE
FlightControllerKey.COLLISION_AVOIDANCE_ENABLED
FlightControllerKey.ACTIVE_OBSTACLE_AVOIDANCE_ENABLED
FlightControllerKey.ACTIVE_OBSTACLE_AVOIDANCE_MODE
FlightControllerKey.UPWARDS_AVOIDANCE_ENABLED
FlightControllerKey.RTH_OBSTACLE_AVOIDANCE_ENABLED
FlightControllerKey.OMNI_HORIZONTAL_AVOIDANCE_ENABLED
FlightControllerKey.OMNI_VERTICAL_AVOIDANCE_ENABLED
FlightControllerKey.OMNI_HORIZONTAL_AVOIDANCE_DISTANCE
FlightControllerKey.OMNI_UP_AVOIDANCE_DISTANCE
FlightControllerKey.OMNI_DOWN_AVOIDANCE_DISTANCE
FlightControllerKey.OMNI_PERCEPTION_AVOIDANCE_STATE
FlightControllerKey.HORIZONTAL_AVOIDANCE_DISTANCE
FlightControllerKey.UP_AVOIDANCE_DISTANCE
FlightControllerKey.DOWN_AVOIDANCE_DISTANCE
```

Operational use:

- Enable vision positioning only when the aircraft and environment support it.
- Monitor whether vision is actually being used; an enabled setting does not guarantee usable visual positioning.
- GPS-denied indoor/dark/textureless environments can still degrade vision positioning.

### Positioning Source And Positioning Quality

These keys reveal which source the aircraft is using for positioning.

v5:

```java
DJIFlightControllerKey.KeyPositioningDataSource
DJIFlightControllerKey.KeyDronePositionSource
DJIFlightControllerKey.KeyVisionPositioningLevel
DJIFlightControllerKey.KeyFusionPositioningLevel
```

Relevant value classes:

```java
dji.sdk.keyvalue.value.flightcontroller.PositioningDataSource
dji.sdk.keyvalue.value.flightcontroller.DronePositionSource
dji.sdk.keyvalue.value.flightcontroller.PositioningLevel
```

Observed positioning source enum values include:

```text
PositioningDataSource.NONE
PositioningDataSource.MVO
PositioningDataSource.GPS
PositioningDataSource.RTK

DronePositionSource.GPS
DronePositionSource.VIO
```

Operational use:

- Treat `VIO` or `MVO` as the key signal that non-GNSS visual odometry/vision positioning may be active.
- Treat `RTK` as the key signal that RTK/fusion positioning may be available.
- Log transitions between sources.

### RTK And Alternate Positioning

RTK is the most explicit supported alternate high-accuracy positioning surface in the SDK.

v5 settable keys:

```java
DJIRtkMobileStationKey.KeyRTKEnable                 // Boolean
DJIRtkMobileStationKey.KeyNtripNetworkRtkConfigInfo // NtripNetworkRtkConfigInfo
DJIRtkMobileStationKey.KeyFCRealRTKReferenceSource  // RTKReferenceStationSource
DJIRtkMobileStationKey.KeyRTKKeepStatusEnable       // Boolean
```

v5 monitoring keys:

```java
DJIRtkMobileStationKey.KeyIsRTKDongleConnect
DJIRtkMobileStationKey.KeyIsRTKConnected
DJIRtkMobileStationKey.KeyIsRTKWorking
DJIRtkMobileStationKey.KeyIsRTKBeingUsed
DJIRtkMobileStationKey.KeyIsInRTKMode
DJIRtkMobileStationKey.KeyIsRTKFusionDataUsable
DJIRtkMobileStationKey.KeyRTKPositioningStatus
DJIRtkMobileStationKey.KeyRTKLocation
DJIRtkMobileStationKey.KeyRTKHeading
DJIRtkMobileStationKey.KeyRTKSatelliteCount
DJIRtkMobileStationKey.KeyRTKSatelliteInfo
DJIRtkMobileStationKey.KeyRTKError
DJIRtkMobileStationKey.KeyRTKAbsoluteAltitude
DJIRtkMobileStationKey.KeyRTKHomePointInfo
DJIRtkMobileStationKey.KeyRTKTakeoffAltitudeInfo
DJIRtkMobileStationKey.KeyRTKSingnalType
```

v4-style names found:

```java
FlightControllerKey.IS_RTK_SUPPORTED
FlightControllerKey.RTK_ENABLED
FlightControllerKey.IS_RTK_CONNECTED
FlightControllerKey.RTK_STATE
FlightControllerKey.RTK_BASE_STATION_LOCATION_STATE
FlightControllerKey.RTK_REFERENCE_STATION_SOURCE
FlightControllerKey.RTK_FUSION_MOBILE_LOCATION
FlightControllerKey.RTK_FUSION_MOBILE_HEADING
FlightControllerKey.IS_RTK_FUSION_DATA_USABLE
FlightControllerKey.RTK_POSITIONING_SOLUTION
FlightControllerKey.RTK_HEADING_SOLUTION
FlightControllerKey.RTK_FUSION_HOME_LOCATION_DATA_SOURCE
FlightControllerKey.RTK_FUSION_TAKE_OFF_ALTITUDE
FlightControllerKey.RTK_FUSION_AIRCRAFT_TO_HOME_DISTANCE
FlightControllerKey.RTK_CONNECT_TYPE
FlightControllerKey.RTK_DEVICE_NAME
FlightControllerKey.RTK_DEVICE_PASSWORD
FlightControllerKey.RTK_BASE_STATION_LIST
FlightControllerKey.RTK_BASE_STATION_CONNECTION_STATE
FlightControllerKey.RTK_CONNECTED_WITH_BASE_STATION
```

Operational use:

- Enable RTK where legally and technically available.
- Confirm `IsRTKWorking`, `IsRTKBeingUsed`, and `IsRTKFusionDataUsable`, not just `RTKEnable`.
- Monitor `RTKPositioningStatus`, heading, and error state before allowing GPS-denied workflows that depend on precise positioning.

### Virtual Stick And Manual Control

Virtual stick is the supported programmable control surface. It does not remove aircraft limits, but it is the relevant SDK control mechanism when autonomous GPS navigation is not available or not desired.

v5:

```java
DJIFlightControllerKey.KeyVirtualStickEnabled
DJIFlightControllerKey.KeyVirtualStickControlModeEnabled
DJIFlightControllerKey.KeyVirtualStickFlightControlParam
```

v4-style names found:

```java
FlightControllerKey.IS_VIRTUAL_STICK_CONTROL_MODE_AVAILABLE
FlightControllerKey.VIRTUAL_STICK_CONTROL_MODE_ENABLED
FlightControllerKey.SEND_VIRTUAL_STICK_FLIGHT_CONTROL_DATA
```

Relevant value class:

```java
dji.sdk.keyvalue.value.flightcontroller.VirtualStickFlightControlParam
```

Operational use:

- Confirm virtual-stick availability before enabling it.
- Use conservative velocity/attitude commands in weak-positioning environments.
- Continue monitoring flight mode, attitude, obstacle state, and height-limit state while commanding.

### ATTI-Adjacent Keys

These keys are related to ATTI mode or ATTI tuning, but they do not amount to a supported "force ATTI" API.

v5 telemetry:

```java
DJIFlightControllerKey.KeyFCFlightMode
```

Relevant enum:

```java
dji.sdk.keyvalue.value.flightcontroller.FCFlightMode
```

ATTI-related mode values exist in the enum, including:

```text
ATTI
ATTI_HOVER
GPS_ATTI
```

Suspicious/internal-looking settable keys found:

```java
DJIFlightControllerKey.KeyFCGPSEnabled
DJIFlightControllerKey.KeyGnssExisted
DJIFlightControllerKey.KeyGnssEnhanceOn
DJIFlightControllerKey.KeyGnssPlusEnable
DJIFlightControllerKey.KeyDarkNoGpsLockEnable
DJIFlightControllerKey.KeyFCYawRateInAttiNormal
DJIFlightControllerKey.KeyAttiNormalModePitchRollExp
DJIFlightControllerKey.KeyAttiNormalModeYawExp
DJIFlightControllerKey.KeyAttiNormalModeThrottleExp
DJIFlightControllerKey.KeyFCYawBufferInAttiNormal
```

Interpretation:

- These show DJI has internal GNSS/ATTI configuration surfaces.
- They should not be treated as supported production controls without official documentation and aircraft-specific testing.
- The safe supported behavior is to monitor flight mode rather than force it.

### Navigation Mode And Ground Station

Keys found:

```java
DJIFlightControllerKey.KeyNavigationModeEnabled
DJIFlightControllerKey.KeyGroundStationModeEnabled
```

v4-style names found:

```java
FlightControllerKey.ENTER_NAVIGATION_MODE
```

Interpretation:

- `KeyNavigationModeEnabled` is read/listen in the v5 definition found.
- `GroundStationModeEnabled` appears settable in v5.
- These should be treated as mission/navigation-mode plumbing, not as a GPS-denied bypass.

### Remote Controller / Mode Switch

Useful telemetry around pilot mode state:

v4-style names:

```java
RemoteControllerKey.FLIGHT_MODE_SWITCH_POSITION
RemoteControllerKey.GPS_DATA
RemoteControllerKey.RTK_CHANNEL_ENABLE
```

v5 value classes found:

```java
dji.sdk.keyvalue.value.remotecontroller.RCFlightModeSwitch
dji.sdk.keyvalue.value.remotecontroller.RcGPSInfo
```

Operational use:

- Log physical RC mode switch state alongside aircraft `FCFlightMode`.
- Do not assume app-side virtual stick state is the only source of control-mode changes.

## Suggested Runtime Monitor

For GPS-denied operations, build a runtime status panel/log around these values:

```java
KeyFCFlightMode
KeyGPSModeFailureReason
KeyGPSSignalLevel
KeyGPSSatelliteCount
KeyGPSInterferenceState
KeyGPSSpoofingState
KeyAircraftAttitude
KeyIsVisionSensorUsed
KeyVisionPositioningEnabled
KeyVisionPositioningLevel
KeyFusionPositioningLevel
KeyPositioningDataSource
KeyDronePositionSource
KeyVirtualStickEnabled
KeyVirtualStickControlModeEnabled
KeyHeightLimitReason
KeyLimitHeightABSWithoutGPS
KeyIsNearHeightLimit
KeyRTKEnable
KeyIsRTKConnected
KeyIsRTKWorking
KeyIsRTKBeingUsed
KeyIsRTKFusionDataUsable
KeyRTKPositioningStatus
KeyRTKError
```

Suggested gating logic:

```text
1. Check aircraft connection and product support.
2. Read FCFlightMode and GPSModeFailureReason.
3. Check PositioningDataSource / DronePositionSource.
4. If using vision:
   - require VisionPositioningEnabled
   - require IsVisionSensorUsed or acceptable VisionPositioningLevel
   - require acceptable obstacle/perception state for the environment
5. If using RTK:
   - require RTKEnable
   - require IsRTKConnected
   - require IsRTKWorking
   - require IsRTKBeingUsed or IsRTKFusionDataUsable
   - reject/hold if RTKError is non-normal
6. Check HeightLimitReason and LimitHeightABSWithoutGPS.
7. Enable virtual stick only after the above state is logged and acceptable.
8. During flight, continuously watch source transitions, attitude, height-limit state, and failsafe state.
```

## v4 KeyManager Patterns

The app's aux light control used this style:

```java
DJIKey key = FlightControllerKey.createFlightAssistantKey(
    FlightControllerKey.BOTTOM_AUXILIARY_LIGHT_MODE
);

KeyManager.getInstance().setValue(key, FillLightMode.ON, callback);
```

Equivalent pattern examples for GPS-denied-adjacent controls:

```java
DJIKey visionKey = FlightControllerKey.createFlightAssistantKey(
    FlightControllerKey.VISION_ASSISTED_POSITIONING_ENABLED
);

KeyManager.getInstance().setValue(visionKey, true, callback);
```

```java
DJIKey obstacleKey = FlightControllerKey.createFlightAssistantKey(
    FlightControllerKey.COLLISION_AVOIDANCE_ENABLED
);

KeyManager.getInstance().setValue(obstacleKey, true, callback);
```

```java
DJIKey rtkKey = FlightControllerKey.createRTKKey(
    FlightControllerKey.RTK_ENABLED
);

KeyManager.getInstance().setValue(rtkKey, true, callback);
```

```java
DJIKey virtualStickKey = FlightControllerKey.create(
    FlightControllerKey.VIRTUAL_STICK_CONTROL_MODE_ENABLED
);

KeyManager.getInstance().setValue(virtualStickKey, true, callback);
```

Exact support and accepted value type are aircraft, payload, firmware, SDK version, and current aircraft state dependent.

## v5 KeyManager Patterns

The v5 decompiled keys expose value types directly:

```java
DJIFlightAssistantKey.KeyVisionPositioningEnabled      // DJIKeyInfo<Boolean>
DJIRtkMobileStationKey.KeyRTKEnable                    // DJIKeyInfo<Boolean>
DJIFlightControllerKey.KeyHeightLimit                  // DJIKeyInfo<Integer>
DJIFlightControllerKey.KeyFCFlightMode                 // DJIKeyInfo<FCFlightMode>, get/listen only
DJIFlightControllerKey.KeyHeightLimitReason            // DJIKeyInfo<FCHeightLimitReason>, get/listen only
```

Read the `.canSet(true)` flag before calling `setValue`.

## Matrice 400 Implications

For Matrice 400 or similar enterprise aircraft, the keys most worth testing on hardware are:

```java
DJIFlightControllerKey.KeyFCFlightMode
DJIFlightControllerKey.KeyGPSModeFailureReason
DJIFlightControllerKey.KeyHeightLimitReason
DJIFlightControllerKey.KeyLimitHeightABSWithoutGPS
DJIFlightControllerKey.KeyPositioningDataSource
DJIFlightControllerKey.KeyDronePositionSource
DJIFlightControllerKey.KeyVisionPositioningLevel
DJIFlightControllerKey.KeyFusionPositioningLevel
DJIFlightAssistantKey.KeyVisionPositioningEnabled
DJIFlightAssistantKey.KeyObstacleAvoidanceEnabled
DJIFlightAssistantKey.KeyLandingProtectionEnabled
DJIFlightControllerKey.KeyVirtualStickEnabled
DJIFlightControllerKey.KeyVirtualStickControlModeEnabled
DJIRtkMobileStationKey.KeyRTKEnable
DJIRtkMobileStationKey.KeyIsRTKConnected
DJIRtkMobileStationKey.KeyIsRTKWorking
DJIRtkMobileStationKey.KeyIsRTKBeingUsed
DJIRtkMobileStationKey.KeyIsRTKFusionDataUsable
DJIRtkMobileStationKey.KeyRTKPositioningStatus
```

Recommended experiment:

1. Bench-test key availability while connected to the M400.
2. Log all GPS/vision/RTK/source/height-limit keys at 5-10 Hz.
3. Test outdoors with normal GNSS first.
4. Test controlled weak-GNSS scenarios without attempting to bypass aircraft limits.
5. Confirm whether `DronePositionSource` transitions to `VIO` and whether `PositioningDataSource` transitions away from `GPS`.
6. Confirm whether virtual stick remains available and responsive in the expected flight modes.
7. Confirm the aircraft's no-GPS height-limit behavior via `HeightLimitReason` and `LimitHeightABSWithoutGPS`.

## Do Not Treat As Bypass Keys

The following are useful to know about but should not be treated as supported bypass controls:

```java
DJIFlightControllerKey.KeyFCGPSEnabled
DJIFlightControllerKey.KeyGnssExisted
DJIFlightControllerKey.KeyDarkNoGpsLockEnable
DJIFlightControllerKey.KeyHeightLimit
DJIFlightControllerKey.KeyDistanceLimit
FlightControllerKey.FLY_ZONE_LIMITATION_ENABLED
FlightControllerKey.SET_HOME_LOCATION_WITHOUT_LIMITATION
```

Reasons:

- Some are internal-looking, model-dependent, or not publicly documented.
- Some only configure normal user limits.
- Some may be rejected by firmware depending on aircraft state.
- Some may implicate safety, flysafe, or regulatory enforcement.

## Short List

If only implementing one GPS-denied dashboard, start with this:

```java
KeyFCFlightMode
KeyGPSModeFailureReason
KeyGPSSignalLevel
KeyGPSInterferenceState
KeyGPSSpoofingState
KeyAircraftAttitude
KeyIsVisionSensorUsed
KeyVisionPositioningEnabled
KeyVisionPositioningLevel
KeyFusionPositioningLevel
KeyPositioningDataSource
KeyDronePositionSource
KeyVirtualStickEnabled
KeyVirtualStickControlModeEnabled
KeyHeightLimitReason
KeyLimitHeightABSWithoutGPS
KeyRTKEnable
KeyIsRTKConnected
KeyIsRTKWorking
KeyIsRTKBeingUsed
KeyIsRTKFusionDataUsable
KeyRTKPositioningStatus
KeyRTKError
```
