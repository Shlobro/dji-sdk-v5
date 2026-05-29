# Internal Technical Reference: KeyFCGPSEnabled

**Key Identifier:** `DJIFlightControllerKey.KeyFCGPSEnabled`  
**Status:** Undocumented / Internal-Only  
**Data Type:** `Boolean`  

---

## ⚠️ Disclaimer
This documentation is based on codebase analysis and reverse-engineering of the DJI SDK V5 (MSDK V5) decompiled classes. This key is **not officially supported** by DJI. Use in production environments or during live flights is highly discouraged as it may bypass safety logic or cause unpredictable aircraft behavior.

---

## Technical Definition
As found in `DJIFlightControllerKey.java`:

```java
public static final DJIKeyInfo<Boolean> KeyFCGPSEnabled = new DJIKeyInfo(
    componentType.value(), 
    subComponentType.value(), 
    "FCGPSEnabled", 
    SingleValueConverter.BooleanConverter
)
.canGet(true)
.canSet(true)
.canListen(false)
.canPerformAction(false)
.setIsEvent(false);
```

### Capabilities
| Capability | Status | Description |
| :--- | :--- | :--- |
| **Get** | Supported | Returns the current software state of the GPS positioning logic. |
| **Set** | Supported | Allows programmatic toggling of the GPS positioning logic. |
| **Listen** | **Not Supported** | Real-time updates via `KeyManager.listen()` are unavailable for this key. |
| **Action** | Not Supported | This is a state variable, not a command trigger. |

---

## Hypothesized Behaviors
The exact internal firmware reaction to this key is currently **unverified**. Based on the architecture of DJI Flight Controllers, the following behaviors are hypothesized:

### 1. Setting to `FALSE` (Force ATTI)
*   **Hypothesis:** The Flight Controller (FC) will ignore all valid GNSS/GPS data for positioning.
*   **Expected Result:** The aircraft will immediately transition into **ATTI (Attitude) Mode**. It will maintain altitude (via barometer/vision) but will drift with the wind. 
*   **Use Case:** Often used in internal testing to simulate GPS-denied environments or for manual flight training.

### 2. Setting to `TRUE` (Enable GPS)
*   **Scenario A: Environment-limited (No Signal):** If the drone is indoors, setting this to `true` will likely have **no effect**. The software "allows" GPS, but the hardware has no data to act upon.
*   **Scenario B: Software-limited:** If the drone was previously forced into ATTI mode via this key, setting it to `true` should allow the drone to resume **P-Mode (GPS)** flight immediately, assuming sufficient satellite lock is present.
*   **Scenario C: RC Switch Priority:** If the physical switch on the Remote Controller is set to ATTI mode, setting this key to `true` will likely be **ignored or overridden** by the hardware switch.

### 3. Edge Case: Compass/Sensor Failure
*   **Warning:** If the aircraft has entered ATTI mode due to a **Compass Error** or **IMU Mismatch**, forcing `KeyFCGPSEnabled` to `true` may be dangerous. Without a reliable heading, the aircraft may attempt to correct its position using GPS while oriented incorrectly, leading to "toilet-bowling" or a fly-away.

---

## Recommended Monitoring
Because this key does not support listeners, developers should monitor the following "Official" keys to verify the aircraft's response to changes in `KeyFCGPSEnabled`:

1.  **`KeyFCFlightMode`**: To confirm if the mode actually transitions between `ATTI` and `P_GPS`.
2.  **`KeyGPSModeFailureReason`**: To see if the FC reports a specific reason for ignoring the GPS enable command.
3.  **`KeyGPSSatelliteCount`**: To ensure the prerequisite hardware data is available.

---
**Last Updated:** May 2026  
**Source:** DJI SDK V5 Decompilation Analysis
