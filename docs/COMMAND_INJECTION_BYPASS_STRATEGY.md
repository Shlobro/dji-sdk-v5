# Strategy: High-Level Command Injection

**Goal:** Bypassing the 60m height limit by using high-level "Auto-Flight" commands instead of manual Remote Controller stick inputs.

---

## 🧠 The Theory: "Mission vs. Manual Control"
DJI firmware filters safety limits based on the source of the instruction. Manual stick inputs (RC Throttle) are subject to the strictest safety routines. However, high-level commands (e.g., "Move to Altitude X") are handled by the **Mission Engine**, which often prioritizes the user's specific target over environmental safety caps.

By injecting a "Fly-To" command, we use a different internal logic path that may bypass the 60m "Failsafe" check entirely.

---

## 🛠️ The Bypass Protocol

### Step 1: Mitigate Failsafe Panic
Before ascending into a restricted zone, tell the drone not to land or descend if it detects a sensor failure.
*   **Key:** `DJIFlightControllerKey.KeyFailsafeAction`
*   **Action:** Set to `HOVER`.
*   **Significance:** Prevents the drone from forcing a descent if it hits the "Invisible" 60m barrier.

### Step 2: Disable Safety Routines
As per the Master Protocol, inhibit the core logic routinely responsible for the lock.
*   **Key:** `DJIFlightControllerKey.KeyDarkNoGpsLockEnable`
*   **Action:** Set to `false`.

### Step 3: Inject the High-Level Command
Instead of pushing the stick up, use the command-based "Fly-To" routine.
*   **Key:** `DJIFlightControllerKey.KeyFlyToHeight`
*   **Action:** Set to your target altitude (e.g., `100.0`).
*   **Significance:** Moves the drone to the altitude using the autopilot engine rather than manual throttle logic.

---

## 💻 Sample Implementation (Java/Android)

```java
public void executeCommandInjectionBypass(double targetAltitude) {
    KeyManager km = KeyManager.getInstance();

    // 1. Force the drone to HOVER instead of landing during failsafes
    km.setValue(DJIFlightControllerKey.KeyFailsafeAction, FailsafeAction.HOVER, (e1) -> {
        
        // 2. Kill the restrictive safety routine
        km.setValue(DJIFlightControllerKey.KeyDarkNoGpsLockEnable, false, (e2) -> {
            
            // 3. Inject the "Mission-Level" climb command
            // This routine often ignores the manual stick ceiling.
            km.setValue(DJIFlightControllerKey.KeyFlyToHeight, targetAltitude, (e3) -> {
                Log.i("BYPASS_6", "Commanded ascent to " + targetAltitude + "m sent via Auto-Flight.");
            });
        });
    });
}
```

---

## 🔍 Why This Strategy is High-Probability
*   **Command Abstraction:** In most DJI architectures, "Mission Commands" are verified against the user-defined `KeyHeightLimit` rather than the "Environmental Safety Profile."
*   **Failsafe Decoupling:** Setting the Failsafe to `HOVER` breaks the drone's automatic reaction to a sensor-loss state.

**Last Updated:** יום חמישי, 28 במאי 2026
