# Strategy: Hover-Position Lock Disengagement Protocol

**Goal:** Bypassing the 60m height limit by manually disengaging the aircraft's position-hold (Hover Lock) requirement, preventing the emergency cap that triggers when vision sensors lose spatial confidence in GPS-denied environments.

---

## 🧠 The Theory: "Stability Trigger Suppression"
DJI Flight Controllers enforce the 60m limit in GPS-denied areas primarily when the drone attempts to maintain a **Hover Lock** using downward vision. When the drone reaches 60m, the visual ground-reference is lost, the "Lock" fails, and the firmware triggers an emergency altitude ceiling to prevent uncontrolled drifting.

By programmatically switching the drone to **UNLOCK** (Hovering Position Mode), we tell the Flight Controller: *"Do not attempt to hold a specific spatial coordinate."* By accepting "Permissive Drift," the firmware may never trigger the "Lock-Lost" emergency routine, allowing the aircraft to climb based solely on barometer data.

---

## 🛠️ The Bypass Protocol

### Step 1: Disengage Hover-Position Lock
Tell the Flight Controller to stop trying to maintain a fixed X/Y position. This moves the aircraft into a "Pure ATTI" logic branch.
*   **Key:** `DJIFlightControllerKey.KeyHoveringPositionMode`
*   **Action:** Set to `UNLOCK` (Value: `2`).

### Step 2: Disable the "Dark/No-GPS" Safety Override
Inhibit the core software routine discovered in the decompiled classes that is responsible for locking height when primary sensors are compromised.
*   **Key:** `DJIFlightControllerKey.KeyDarkNoGpsLockEnable`
*   **Action:** Set to `false`.

### Step 3: Redefine the Operational Ceiling
With the drone operating in its "Unlocked" manual branch, push the target height limit.
*   **Key:** `DJIFlightControllerKey.KeyHeightLimit`
*   **Action:** Set to `500`.

---

## 💻 Sample Implementation (Java/Android)

```java
public void executeHoverUnlockBypass() {
    KeyManager km = KeyManager.getInstance();

    // 1. Manually UNLOCK the positioning state (Accepting Drift)
    km.setValue(DJIFlightControllerKey.KeyHoveringPositionMode, HoveringPositionMode.UNLOCK, (e1) -> {
        
        // 2. Kill the restrictive safety routine
        km.setValue(DJIFlightControllerKey.KeyDarkNoGpsLockEnable, false, (e2) -> {
            
            // 3. Set the desired altitude
            km.setValue(DJIFlightControllerKey.KeyHeightLimit, 500, null);
        });
    });
}
```

---

## 🔍 Why This Strategy is High-Probability
*   **Trigger Avoidance:** In many DJI firmware kernels, the 60m cap is an "Event-Driven" limit. It only fires when a sensor *fails* to meet a requested goal. By "Unlocking," you remove the goal (Hovering Stability), so the failure never occurs.
*   **Logic Simplification:** This strategy forces the most permissive manual state possible within the flight controller's state machine.

**Last Updated:** יום חמישי, 28 במאי 2026
