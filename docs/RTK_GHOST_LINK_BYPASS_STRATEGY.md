# Strategy: RTK Ghost-Link Protocol

**Goal:** Bypassing altitude caps by forcing the aircraft into an "RTK-Priority" state, moving the Flight Controller into a high-precision logic branch that ignores standard GPS-denied safety limits.

---

## 🧠 The Theory: "Positioning Authority Levels"
DJI firmware prioritizes positioning sources in a strict hierarchy:
1.  **RTK (Highest):** Centimeter-level precision. Ignores standard consumer safety caps (like the 60m limit) because the reference is assumed superior to standard GNSS.
2.  **GPS (Medium):** Subject to 60m altitude lock if signal quality drops.
3.  **Vision/VPS (Lowest):** Restricted to ~30m height.

By programmatically enabling the RTK subsystem and forcing a "Maintain State" command, we can trick the drone into operating under the RTK logic branch, which lacks the 60m failsafe ceiling found in the standard GPS branch.

---

## 🛠️ The Bypass Protocol

### Step 1: Initialize the RTK Engine
Wake up the high-precision fusion drivers. Even if no physical RTK base station is present, enabling the engine shifts the firmware's focus.
*   **Key:** `DJIRtkMobileStationKey.KeyRTKEnable`
*   **Action:** Set to `true`.

### Step 2: Enable RTK Status Maintenance
Force the drone to "Keep" its precision state. This is a critical override that tells the firmware to prioritize the high-precision state machine even if the link is unstable or missing.
*   **Key:** `DJIRtkMobileStationKey.KeyRTKKeepStatusEnable`
*   **Action:** Set to `true`.

### Step 3: Disable standard "Dark/No-GPS" Safety Override
As per the Master Protocol, inhibit the standard restrictive routine to ensure no fallback locks are active.
*   **Key:** `DJIFlightControllerKey.KeyDarkNoGpsLockEnable`
*   **Action:** Set to `false`.

### Step 4: Redefine the Operational Ceiling
With the drone operating in its "High-Precision" state branch, push the target height limit.
*   **Key:** `DJIFlightControllerKey.KeyHeightLimit`
*   **Action:** Set to `500`.

---

## 💻 Sample Implementation (Java/Android)

```java
public void executeRTKGhostBypass() {
    KeyManager km = KeyManager.getInstance();

    // 1. Enable the RTK Positioning Engine
    km.setValue(DJIRtkMobileStationKey.KeyRTKEnable, true, (e1) -> {
        
        // 2. Force the firmware to maintain the high-priority RTK state
        km.setValue(DJIRtkMobileStationKey.KeyRTKKeepStatusEnable, true, (e2) -> {
            
            // 3. Kill the standard restrictive safety routine
            km.setValue(DJIFlightControllerKey.KeyDarkNoGpsLockEnable, false, (e3) -> {
                
                // 4. Set the desired altitude (up to 500m)
                km.setValue(DJIFlightControllerKey.KeyHeightLimit, 500, null);
            });
        });
    });
}
```

---

## 🔍 Why This Strategy is High-Probability
*   **Architectural Superiority:** RTK flight is handled by different internal algorithms than standard GPS flight. These "Enterprise" algorithms are built for missions that require vertical flexibility.
*   **Authority Spoofing:** By "Enabling" RTK, you are declaring that the aircraft is in a high-precision mission, which often suspends the "Visual Line of Sight" failsafes used for consumer pilots.

**Last Updated:** יום חמישי, 28 במאי 2026
