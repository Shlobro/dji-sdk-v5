# DJI SDK V5: Backdoors and Internal Testing Commands

This document covers highly sensitive keys that appear to be for internal DJI development or factory testing. These keys often allow for raw communication with aircraft subsystems.

---

## 🦅 The "Eagle" Subsystem: KeyEagleTestCmd
**Key:** `DJIProductKey.KeyEagleTestCmd`  
**Type:** `DJIActionKeyInfo<EagleTestParam, EmptyMsg>`  

This action allows sending raw commands directly to specific internal chips. It is the most powerful "backdoor" found in the SDK.

### Parameters: `EagleTestParam`
| Field | Type | Description |
| :--- | :--- | :--- |
| `cmd` | String | The command string to execute. |
| `cmdId` | Integer | Numeric ID of the command. |
| `cmdLength` | Integer | Length of the command string. |
| `param` | String | Raw parameters for the command. |
| `paramLen` | Integer | Length of the parameters. |
| `timeout` | Integer | Execution timeout in milliseconds. |
| `chip` | `DJIChip` | The target hardware chip for the command. |

### Target Chips: `DJIChip`
The commands can be routed to specific processors:
*   `E1E`: Likely the main SOC or Flight Controller.
*   `E2F`: Potentially the video/image processor.
*   `E2C`: Potentially a peripheral or radio chip.

---

## 🚫 NFZ & Blacklist Management: KeyUpdateDroneBlacklist
**Key:** `DJIProductKey.KeyUpdateDroneBlacklist`  
**Type:** `DJIActionKeyInfo<EmptyMsg, EmptyMsg>`  

An action to trigger a "Blacklist Update" on the drone. Since it takes an `EmptyMsg`, it likely tells the drone to re-sync its blacklist from the controller's storage or a local cache.

---

## 🎮 Remote Controller Spoofing: KeyMockRcHardwareState
**Key:** `DJIRemoteControllerKey.KeyMockRcHardwareState`  
**Type:** `DJIKeyInfo<RcCustomButtonHardwareStatus>`  

Allows the app to **fake** physical interactions with the Remote Controller.

### Spoofable Inputs: `RcCustomButtonHardwareStatus`
*   **C1, C2, C3, C4 Buttons:** Can be set to "clicked" programmatically.
*   **5-Dimension Button:** Can spoof "Pressed" status in any direction.

---

## 🌡️ Internal Hardware Tests
Found in `DJIProductKey`:

| Key | Type | Description |
| :--- | :--- | :--- |
| `KeyTemperatureTestEnable` | Boolean | Toggles a hardware stress test based on temperature. |
| `KeyPingCertainDJIComponent` | Action | Low-level ICMP-like ping to internal hardware modules (OcuSync, Gimbal, etc). |
| `KeyStartFirmwareBuriedDataTransfer` | Action | Unknown low-level data transfer mode for firmware forensic/telemetry data. |

---

## ⚠️ Security Warning
These commands are intended for DJI internal use ONLY. 
*   **KeyEagleTestCmd** could potentially brick the aircraft if an invalid raw command is sent to a chip.
*   **KeyMockRcHardwareState** can interfere with a pilot's physical control of the aircraft, which is a major safety risk.
*   These keys are highly likely to be removed or blocked in future public SDK releases.

**Last Updated:** יום חמישי, 28 במאי 2026
