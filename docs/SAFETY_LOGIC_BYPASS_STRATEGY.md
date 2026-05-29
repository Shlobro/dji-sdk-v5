# Strategy: Safety-Logic State Machine Override

**Goal:** Bypassing the 60m height limit by convincing the Flight Controller to enter a "Permissive Manual" state rather than an "Emergency Sensor-Loss" state.

---

## 🧠 The Theory: "User Choice vs. Hardware Failure"
DJI Flight Controllers differentiate between two reasons for flying without GPS:
1.  **Hardware Failure (Emergency):** The drone *wants* GPS but can't find it. The firmware triggers a "Safety Lock" (usually 30m or 60m) to ensure the pilot keeps the drone in visual line-of-sight.
2.  **User Choice (Manual/ATTI):** The pilot *tells* the drone to ignore GPS. In this state, the firmware often treats the flight as a standard manual mission and respects the user-defined `KeyHeightLimit` (up to 500m).

---

## 🛠️ The Bypass Protocol

### Step 1: Enable Multiple Flight Modes
The Flight Controller must be allowed to transition between different logic profiles. If this is disabled, the drone stays in its most restrictive "P-Only" safety mode.
*   **Key:** `DJIFlightControllerKey.KeyMultipleFlightModeEnabled`
*   **Action:** Set to `true`.

### Step 2: Disable the "Dark/No-GPS" Safety Routine
This key is the literal switch for the safety routine that locks altitude when sensors are compromised (e.g., at night or in GPS-denied environments).
*   **Key:** `DJIFlightControllerKey.KeyDarkNoGpsLockEnable`
*   **Action:** Set to `false`.

### Step 3: Trigger a Manual State Transition
Instead of letting the drone "lose" GPS and panic, we preemptively tell the drone to stop using it. This moves the drone from the "Emergency" branch of the code to the "Manual" branch.
*   **Key:** `DJIFlightControllerKey.KeyFCGPSEnabled`
*   **Action:** Set to `false`.

### Step 4: Redefine the Operational Ceiling
Now that the safety locks are inhibited and the drone is in a manual state, push the target height limit.
*   **Key:** `DJIFlightControllerKey.KeyHeightLimit`
*   **Action:** Set to `500`.

---

## 💻 Sample Implementation (Java/Android)

```java
public void executeSafetyLogicBypass() {
    KeyManager km = KeyManager.getInstance();

    // 1. Unlock the Flight Controller state machine
    km.setValue(DJIFlightControllerKey.KeyMultipleFlightModeEnabled, true, (e1) -> {
        
        // 2. Kill the specific "Dark/No-GPS" altitude lock routine
        km.setValue(DJIFlightControllerKey.KeyDarkNoGpsLockEnable, false, (e2) -> {
            
            // 3. Preemptively disable GPS to force a "Manual" rather than "Emergency" state
            km.setValue(DJIFlightControllerKey.KeyFCGPSEnabled, false, (e3) -> {
                
                // 4. Set the desired ceiling
                km.setValue(DJIFlightControllerKey.KeyHeightLimit, 500, null);
            });
        });
    });

    // Verification: Watch the Absolute Limit report
    km.listen(DJIFlightControllerKey.KeyLimitHeightABSWithoutGPS, this, (oldV, newVal) -> {
        Log.i("BYPASS", "Confirmed Absolute Altitude Limit: " + newVal + "m");
    });
}
```

---

## 🔍 Why This Strategy is High-Probability
*   **Direct Naming:** `KeyDarkNoGpsLockEnable` is a pinpoint match for the behavior you are seeing.
*   **Logical Consistency:** Bypassing a "Safety Lock" by setting its "Enable" flag to `false` is the most standard way to override firmware protections.
*   **State Control:** Using `KeyFCGPSEnabled` ensures the drone doesn't constantly try (and fail) to re-acquire GPS, which is what usually keeps the 60m limit active.

**Last Updated:** יום חמישי, 28 במאי 2026
