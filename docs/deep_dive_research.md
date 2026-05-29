# Deep Dive Research: Geofence and JNI Backdoors

This document captures findings from reverse-engineering the geofence database handling and JNI-level backdoor commands.

---

## 🚫 Geofence Database (FlySafe)
DJI uses a multi-layered verification system for its No-Fly Zone (NFZ) databases.

### Database Files
Located in the app's assets or downloaded to private storage:
*   `flysafe_areas_djigo.db.confumix`: The primary geofence database.
*   `dji.nfzdb2.confumix`: Basic NFZ database.
*   `dji.nfzdb2.sig`: Cryptographic signature for the basic database.

### The "Confumix" Format
The `.confumix` extension indicates an encrypted or obfuscated SQLite database.
*   **Verification:** Handled by `dji.csdk.fscore.jni.db.JNIFSBasicDbConfigManager.verifyDbSignature()`.
*   **Update Mechanism:** Managed by `JNIFSBasicDbUpgradeHelper`. Databases are likely delivered as ZIP files and unzipped to the drone.

### Data Structure: `FlyForbidElement`
This class defines the internal schema for geofence zones:
*   `id`, `area_id`: Unique identifiers.
*   `type`: Zone type (Warning, Authorization, Restricted).
*   `shape`: `CIRCLE` (0), `SINGLE_POLYGON` (1), `MULTI_POLYGON` (12).
*   `lat`, `lng`, `radius`: Spatial coordinates.
*   `limit_height`: Altitude cap for the zone.
*   `is_unlock`: Whether the zone has been unlocked by the user.

---

## 🔓 NFZ Unlocking: WhiteListLicense
A `WhiteListLicense` is the aircraft's permission slip to enter restricted airspace.

### Key Fields
*   **`liscenseAllBytes`**: Raw binary data of the license.
*   **`startTimeStamp` / `endTimeStamp`**: The validity window.
*   **`mHeightLimit`**: A field that can **override the default height limit** for the drone.
*   **`licenseType`**: Includes specific types like `ParameterConfigurationLicense` which can modify flight controller behaviors.

### Protocol Buffers
DJI uses **Protocol Buffers** to serialize and transmit these licenses:
*   `parseFromProtoBufLicenseModel(LicenseModel licenseModel)`
*   This suggests that the raw binary format of the license is defined by a `.proto` file, which is much easier to reverse-engineer than a custom proprietary format.

---

## 🦅 JNI & Backdoors: KeyEagleTestCmd
The "Eagle" system appears to be a raw hardware communication bridge.

### Execution Flow
1.  **Action Triggered:** `KeyManager.performAction(DJIProductKey.KeyEagleTestCmd, param)`.
2.  **Serialization:** `EagleTestParam` is converted to a byte array via `toBytes()`.
3.  **JNI Bridge:** `dji.jni.JNIKeyValue.doAction()` calls the native method `native_do_action`.
4.  **Hardware Dispatch:** The firmware routes the command to the chip specified in `DJIChip` (`E1E`, `E2F`, or `E2C`).

### Power Capabilities
*   **Raw Commands:** Allows sending arbitrary strings to internal processors.
*   **Identity Spoofing:** Likely works in conjunction with `KeyFCUUIDSetting`.

---

## 🛠️ Deep System Control: InnerTools
The `dji.sdk.innertools.InnerTools` class contains features meant only for DJI developers.

| Feature | Method | Description |
| :--- | :--- | :--- |
| **ADB Access** | `setAdbDataLinkEnable` | **ADB over Datalink.** Allows running Android Debug Bridge commands on the aircraft through the RC link. |
| **Network Control** | `setTcpServerInfo` | Connects the drone/RC to a remote TCP control server. |
| **USB Muxing** | `setUsbmuxdMode` | Enables low-level USB multiplexing for hardware diagnostics. |
| **Command Watch** | `setCmdWatchFilter` | Allows sniffing all internal V1/V5 commands passing through the system. |
| **Key Blacklist** | `setKeyBlacklist` | Programmatically disables specific SDK keys. |

---

## ⚠️ Tactical Potential
The combination of `KeyAreaCodeFromGround` (Regional Spoofing) and `importFlySafeDynamicDatabaseToMSDK` (Custom NFZ DB) represents the most direct path to bypassing DJI's geographic restrictions.

**Last Updated:** יום חמישי, 28 במאי 2026
