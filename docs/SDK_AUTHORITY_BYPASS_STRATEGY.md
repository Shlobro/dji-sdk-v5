# Strategy: SDK Control Authority Hijack

**Goal:** Bypassing the 60m height limit by shifting flight control from the physical Remote Controller (RC) to the SDK's Virtual Stick subsystem.

---

## 🧠 The Theory: "Command Layer Priority"
DJI firmware enforces safety limits (like the 60m GPS-denied ceiling) differently depending on the **Source of Authority**:
1.  **Manual Layer (Physical RC Sticks):** Subject to maximum safety oversight. Firmware routines hard-cap the climb rate and altitude to ensure pilot-aircraft visual connection.
2.  **SDK Layer (Virtual Sticks):** Used for automated missions and precise maneuvers. Because the drone assumes "Mission Logic" is active, it often ignores "Manual Failsafes" in favor of user-defined software limits (`KeyHeightLimit`).

---

## 🛠️ The Bypass Protocol

### Step 1: Enable Multiple Flight Modes
The aircraft must be in a state where it can accept external control inputs and mode transitions.
*   **Key:** `DJIFlightControllerKey.KeyMultipleFlightModeEnabled`
*   **Action:** Set to `true`.

### Step 2: Acquire SDK Control Authority
Tell the Flight Controller to stop listening to the physical sticks and start listening to the app's software commands.
*   **Key:** `DJIFlightControllerKey.KeyVirtualStickEnabled`
*   **Action:** Set to `true`.

### Step 3: Disable the "Dark/No-GPS" Safety Override
Even in SDK mode, we should inhibit the specific safety lock discovered in the decompiled logic to prevent the firmware from overriding our commands.
*   **Key:** `DJIFlightControllerKey.KeyDarkNoGpsLockEnable`
*   **Action:** Set to `false`.

### Step 4: Execute Software-Based Ascent
Instead of the pilot pushing the stick up, the app sends a continuous stream of vertical velocity commands.
*   **Action:** `DJIFlightControllerKey.KeySendVirtualStickFlightControlData`
*   **Parameter:** Set `verticalThrottle` to a positive value (e.g., `2.0 m/s`).

---

## 💻 Sample Implementation (Java/Android)

```java
public void executeAuthorityBypass() {
    KeyManager km = KeyManager.getInstance();

    // 1. Authorize SDK Control
    km.setValue(DJIFlightControllerKey.KeyVirtualStickEnabled, true, (e1) -> {
        if (e1 != null) return;

        // 2. Kill the restrictive safety routine
        km.setValue(DJIFlightControllerKey.KeyDarkNoGpsLockEnable, false, (e2) -> {
            
            // 3. Command the climb via Virtual Stick stream
            // This code path often bypasses the 60m RC-Stick cap.
            VirtualStickFlightControlParam vsData = new VirtualStickFlightControlParam();
            vsData.setVerticalThrottle(2.5); // Climb at 2.5 m/s
            vsData.setPitch(0);
            vsData.setRoll(0);
            vsData.setYaw(0);
            
            // Repeat this command in a loop (usually every 100ms)
            km.performAction(DJIFlightControllerKey.KeySendVirtualStickFlightControlData, vsData);
        });
    });
}
```

---

## 🔍 Why This Strategy is High-Probability
*   **Bypassing the Input Parser:** In many DJI flight controllers, the "Manual Safety Check" is part of the RC stick input parser. By using Virtual Sticks, you inject control data *after* that parser, directly into the flight planning module.
*   **Mission Consistency:** If the drone is executing a "Mission," it assumes the operator has planned the altitude safety.

## ⚠️ Mission Critical Warnings
*   **Heartbeat Required:** Virtual Stick mode requires a constant stream of data (usually 5-10Hz). If your app stops sending data, the drone will hover or land.
*   **RC Override:** If the pilot makes a large stick movement on the physical controller, some drones will automatically kick the SDK out of Virtual Stick mode for safety.

**Last Updated:** יום חמישי, 28 במאי 2026
