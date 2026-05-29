# DJI SDK V5: Advanced Settable Keys Reference

This document tracks interesting, undocumented, or powerful keys discovered within the DJI SDK V5 decompiled classes. These keys can be used with `KeyManager.getInstance().setValue()` or `performAction()`.

---

## 🛡️ Stealth & Privacy Operations
Used to reduce the electronic and visual footprint of the aircraft.

| Key | Class | Type | Description |
| :--- | :--- | :--- | :--- |
| `KeyEIDSwitch` | `DJIFlightControllerKey` | Boolean | **Master Switch for Remote ID (RID).** Set to `false` to disable broadcasting aircraft identity. |
| `KeyOidUploadEnable` | `DJIProductKey` | Boolean | Toggles uploading of Operational ID data to DJI servers. |
| `KeyLEDsSettings` | `DJIFlightControllerKey` | Object | Controls all aircraft navigation and status lights. |
| `KeyBatteryLEDsEnabled` | `DJIBatteryKey` | Boolean | Disables the green charging/status LEDs on the physical battery. |
| `KeyESCBeepEnabled` | `DJIFlightControllerKey` | Boolean | Silences the motor ESC startup tones and error chirps. |
| `KeyOperatorRegistrationNumber` | `DJIFlightControllerKey` | String | Sets the RID Operator ID string. |
| `KeyFCUUIDSetting` | `DJIFlightControllerKey` | String | **Internal Identity.** Potentially allows changing the unique hardware UUID. |

---

## 🎮 Flight Dynamics & Control
Override standard flight limits and "feel."

| Key | Class | Type | Description |
| :--- | :--- | :--- | :--- |
| `KeyFCGPSEnabled` | `DJIFlightControllerKey` | Boolean | **Force ATTI Mode.** Set to `false` to make the drone ignore GPS positioning. |
| `KeyLimitFlightSpeed` | `DJIFlightControllerKey` | Double | Hard governor for horizontal velocity (m/s). Works across all flight modes. |
| `KeyRCScaleInNormal` | `DJIFlightControllerKey` | Double | Adjusts stick sensitivity (Expo) for Normal mode. |
| `KeyRCScaleInSport` | `DJIFlightControllerKey` | Double | Adjusts stick sensitivity (Expo) for Sport mode. |
| `KeyMotorPowerAbnormalLock` | `DJIFlightControllerKey` | Boolean | Potentially bypasses motor startup locks caused by ESC errors. |
| `KeyVisionAvoidEnable` | `DJIFlightControllerKey` | Boolean | Force-disables obstacle avoidance sensors. |
| `KeyLowBatteryWarningThreshold` | `DJIFlightControllerKey` | Integer | Customize the percentage for the first battery alarm. |
| `KeyMockRcHardwareState` | `DJIRemoteControllerKey` | Object | **Hardware Spoofing.** Allows injecting virtual stick movements. |

---

## 📡 Signal & Regional Hacking
Modify transmission and bypass geographic restrictions.

| Key | Class | Type | Description |
| :--- | :--- | :--- | :--- |
| `KeyAreaCodeFromGround` | `DJIAirlinkKey` | `AreaCodeInfo` | **Regional Spoofing.** Allows the app to tell the drone its location (e.g., "US", "CN"). Used to bypass regional power limits or NFZs. |
| `KeyRcMachineMode` | `DJIRemoteControllerKey` | Enum | Toggle between Master/Slave relationships for the Remote Controller. |
| `KeyBandwidth` | `DJIAirlinkKey` | Enum | Set to lower bandwidth (e.g., 10MHz) to **drastically increase range** and link stability. |
| `KeyFrequencyPoint` | `DJIAirlinkKey` | Integer | Manually lock the transmission to a specific radio frequency. |
| `KeyChannelSelectionMode` | `DJIAirlinkKey` | Enum | Toggle between Auto and Manual frequency hopping. |
| `KeyUpdateDroneBlacklist` | `DJIProductKey` | Action | **NFZ Override.** Triggers a geofence database update. |

---

## 🛠️ Diagnostics & Hardware Maintenance
Deep system access and bypasses.

| Key | Class | Type | Description |
| :--- | :--- | :--- | :--- |
| `KeyGnssExisted` | `DJIFlightControllerKey` | Boolean | Lie to the firmware about whether the GPS module is physically present. |
| `KeyGnssTypeAvaliableRange` | `DJIFlightControllerKey` | Msg | Restrict which satellite constellations (GPS/BDS/Galileo) are used. |
| `KeyFlightNumWithoutInternet` | `DJIProductKey` | Integer | Tracks how many flights have occurred without an internet connection. High values may trigger locks. |
| `KeyEnforceUpgradeEnable` | `DJIAccessoryKey` | Boolean | Bypasses "Firmware Update Required" locks. |
| `KeyBatteryIsOutOfDate` | `DJIBatteryKey` | Boolean | Potentially resets the "Expired/Old Battery" safety flags. |
| `KeyHMSResetMaintainData` | `DJIHmsKey` | - | **Odometer Reset.** Clears maintenance history and mileage. |
| `KeyPowerControl` | `DJIProductKey` | - | Remote aircraft shutdown or reboot command. |
| `KeyEagleTestCmd` | `DJIProductKey` | Object | **Backdoor Command.** Sends raw testing commands to the "Eagle" subsystem. |
| `KeySelfDiagnosticMode` | `DJIAccessoryKey` | Boolean | Enables verbose internal error reporting for advanced troubleshooting. |

---

## ⚠️ Safety Warning
Most of these keys are **undocumented** by DJI and exist for internal testing or enterprise-specific needs.
*   **Regulatory Compliance:** Disabling Remote ID (`KeyEIDSwitch`) or spoofing Area Codes is illegal in many jurisdictions.
*   **Hardware Safety:** Bypassing battery limits or motor locks can lead to mid-air failures or fire.
*   **Stability:** Forcing ATTI mode or changing GNSS settings without a deep understanding of flight physics can lead to a "Fly-away."

**Last Updated:** יום חמישי, 28 במאי 2026
