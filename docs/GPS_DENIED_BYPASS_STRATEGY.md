# Strategy: Bypassing GPS-Denied Height Restrictions

**Goal:** Overriding the 30m/60m altitude ceiling enforced by the DJI Flight Controller when the aircraft has no GPS signal or is in "Dark" (low-light) conditions.

---

## 🏗️ Technical Architecture
The DJI MSDK V5 uses a "Safety Hierarchy" to determine the maximum allowed altitude. When GPS is lost, the Flight Controller (FC) switches from the user-defined `KeyHeightLimit` to a hard-coded safety profile. To bypass this, we must disable the safety profile and spoof the hardware status.

---

## 🛠️ Step-by-Step Bypass Protocol

### Step 1: Disable the "Dark/No-GPS" Safety Lock
This is the primary software switch discovered in the decompiled classes. It allows the developer to tell the firmware to ignore the restrictive profile that triggers during GPS loss.

*   **Key:** `DJIFlightControllerKey.KeyDarkNoGpsLockEnable`
*   **Action:** Set to `false`.
*   **Significance:** This removes the primary software barrier that locks the drone into a "Safety Box."

### Step 2: Set the Global Height Limit
Once the safety lock is disabled, you must redefine the drone's target ceiling.

*   **Key:** `DJIFlightControllerKey.KeyHeightLimit`
*   **Action:** Set to your desired altitude (e.g., `500`).
*   **Significance:** This ensures that once the software restriction is removed, the drone knows it is allowed to climb to the higher value.

### Step 3: Hardware Presence Spoofing (Optional/Nuclear)
If the firmware still ignores the command because it physically detects 0 satellites, you can trick the system logic into thinking there is no GPS hardware installed at all.

*   **Key:** `DJIFlightControllerKey.KeyGnssExisted`
*   **Action:** Set to `false`.
*   **Significance:** By telling the drone its "GPS module is missing," you prevent the transition into the "GPS-Lost-Emergency" state. The drone may fall back to a standard ATTI/Manual profile which respects the user-defined `KeyHeightLimit` rather than a restricted failsafe limit.

### Step 4: Verification & Feedback
To ensure the bypass is active before you attempt to climb, monitor the "Absolute" limit reporting.

*   **Key:** `DJIFlightControllerKey.KeyLimitHeightABSWithoutGPS`
*   **Monitor:** Watch this value. If it changes from `30.0/60.0` to `500.0`, the bypass is successful.
*   **Diagnostic:** Check `DJIFlightControllerKey.KeyHeightLimitReason`. It should return `NORMAL` or `NONE` instead of `NO_GPS_LIMIT`.

---

## 💻 Sample Implementation (Java/Android)

```java
public void executeHeightBypass(int targetAltitude) {
    KeyManager km = KeyManager.getInstance();

    // 1. Disable the restrictive safety profile
    km.setValue(DJIFlightControllerKey.KeyDarkNoGpsLockEnable, false, (error) -> {
        if (error == null) {
            // 2. Push the new height limit
            km.setValue(DJIFlightControllerKey.KeyHeightLimit, targetAltitude, null);
            
            // 3. (Optional) Force the drone into a non-GPS hardware state
            km.setValue(DJIFlightControllerKey.KeyGnssExisted, false, null);
        }
    });

    // 4. Verification Listener
    km.listen(DJIFlightControllerKey.KeyLimitHeightABSWithoutGPS, this, (oldV, newVal) -> {
        Log.i("BYPASS_STATUS", "Absolute Ceiling is now: " + newVal + "m");
    });
}
```

---

## ⚠️ Mission Critical Warnings
*   **Drift Hazard:** Without GPS, the drone **will drift with the wind**. Climbing above 60m without GPS increases the risk of the drone being carried away by stronger high-altitude winds.
*   **Barometer Reliance:** In this mode, the drone relies 100% on the Barometer for height. Air pressure changes can cause altitude inaccuracies.
*   **Legal:** Many regions have a legal ceiling of 120m regardless of GPS status. Use this bypass only in authorized, enclosed, or private testing environments.

**Last Updated:** יום חמישי, 28 במאי 2026
