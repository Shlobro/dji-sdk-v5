# Strategy: ATTI Profile Expansion Protocol

**Goal:** Bypassing altitude and performance caps in GPS-denied environments by manually expanding the Flight Controller's internal performance parameters for the "Emergency ATTI" profile.

---

## 🧠 The Theory: "The Restricted Power Branch"
When a DJI aircraft enters ATTI mode (due to GPS loss), the firmware transitions from the standard "P/S" logic branches to a restricted **"ATTI-Normal" Profile**. This branch is designed with severe hard-coded safety limits:
1.  **Tilt Angle Limit:** Prevents aggressive horizontal acceleration.
2.  **Climb Rate Limit:** Restricts vertical velocity to ensure visibility.
3.  **Altitude Limit:** The 60m/30m hard-cap.

In many firmware architectures, the 60m height cap is a constant stored *inside* this ATTI-Normal profile. By programmatically overwriting the climb rate and tilt constants for the ATTI-Normal branch, we can potentially "un-limit" the mode's capabilities, allowing the Flight Controller to respect higher altitude targets and full motor power.

---

## 🛠️ The Bypass Protocol

### Step 1: Force ATTI Profile Activation
Preemptively tell the drone to stop using GPS. This ensures the firmware is actively using the "ATTI-Normal" logic branch which we intend to modify.
*   **Key:** `DJIFlightControllerKey.KeyFCGPSEnabled`
*   **Action:** Set to `false`.

### Step 2: Expand Vertical Climb Authority
Manually redefine the maximum upward velocity allowed in the ATTI profile.
*   **Key:** `DJIFlightControllerKey.KeyVertVelUpInAttiNormal`
*   **Action:** Set to `5.0` or `6.0` (m/s).
*   **Significance:** Tells the firmware that a high-speed climb is valid even without GPS.

### Step 3: Restore Full Maneuverability
Overwrite the emergency tilt limit to allow the aircraft to fight wind and maintain control at higher altitudes.
*   **Key:** `DJIFlightControllerKey.KeyTiltInAttiNormal`
*   **Action:** Set to `30.0` or `35.0` (degrees).

### Step 4: Disable the "Dark/No-GPS" Safety Override
As established in previous strategies, inhibit the standard restrictive routine.
*   **Key:** `DJIFlightControllerKey.KeyDarkNoGpsLockEnable`
*   **Action:** Set to `false`.

### Step 5: Redefine the Operational Ceiling
Push the final target height limit.
*   **Key:** `DJIFlightControllerKey.KeyHeightLimit`
*   **Action:** Set to `500`.

---

## 💻 Sample Implementation (Java/Android)

```java
public void executeAttiExpansionBypass() {
    KeyManager km = KeyManager.getInstance();

    // 1. Activate the ATTI logic branch
    km.setValue(DJIFlightControllerKey.KeyFCGPSEnabled, false, (e1) -> {
        
        // 2. Expand Vertical Velocity Cap (m/s)
        km.setValue(DJIFlightControllerKey.KeyVertVelUpInAttiNormal, 6.0, (e2) -> {
            
            // 3. Expand Tilt Authority (Degrees)
            km.setValue(DJIFlightControllerKey.KeyTiltInAttiNormal, 35.0, (e3) -> {
                
                // 4. Kill the restrictive altitude lock routine
                km.setValue(DJIFlightControllerKey.KeyDarkNoGpsLockEnable, false, (e4) -> {
                    
                    // 5. Set desired altitude
                    km.setValue(DJIFlightControllerKey.KeyHeightLimit, 500, null);
                });
            });
        });
    });
}
```

---

## 🔍 Why This Strategy is High-Probability
*   **Direct Tuning:** It targets the specific numeric constants used by the failsafe logic. If the 60m lock is mathematically derived from the "Safety Envelope" of the ATTI profile, widening that envelope (Velocity/Tilt) can break the lock.
*   **Failsafe Redirection:** It moves the aircraft from a "Passive Emergency" to an "Active Manual" configuration.

**Last Updated:** יום חמישי, 28 במאי 2026
