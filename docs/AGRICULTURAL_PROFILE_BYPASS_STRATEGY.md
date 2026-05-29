# Strategy: Agricultural Profile Elevation Protocol

**Goal:** Bypassing the 60m height limit by activating the "MG-Series" (Agricultural) terminal climb logic, which is designed for high-altitude terrain tracking and often operates independently of consumer safety caps.

---

## 🧠 The Theory: "Personality Spoofing"
DJI Flight Controllers share a significant amount of code across different aircraft types. Agricultural drones (MG/T-series) require the ability to climb high above their takeoff point for hilly spraying missions. These drones use a specific parameter called **`KeyMGTerminalClimbHeight`**. 

By programmatically activating "Farm Mode" parameters and pushing a value to the MG-specific climb height key, we can potentially unlock a climb-logic branch that does not check against the standard consumer "GPS-Denied" failsafes.

---

## 🛠️ The Bypass Protocol

### Step 1: Initialize Agricultural Parameters
Activate the data structures required for the Agricultural flight profile. This "prepares" the firmware to listen to MG-series commands.
*   **Key:** `DJIFlightControllerKey.KeyMGFarmWorkMode` / `KeyMGFarmFlyParam`
*   **Action:** Initialize with standard/empty values.

### Step 2: Set the MG Terminal Climb Height
This is the specialized height governor used by the Agricultural logic branch.
*   **Key:** `DJIFlightControllerKey.KeyMGTerminalClimbHeight`
*   **Action:** Set to `500.0`.
*   **Significance:** Tells the firmware that the mission-critical terminal height is 500m, which may override the 60m safety ceiling.

### Step 3: Disable the "Dark/No-GPS" Safety Override
As per the Master Protocol, inhibit the standard restrictive routine to ensure no secondary locks are active.
*   **Key:** `DJIFlightControllerKey.KeyDarkNoGpsLockEnable`
*   **Action:** Set to `false`.

### Step 4: Redefine the Operational Ceiling
With the drone operating in its "Agricultural" personality, push the target height limit.
*   **Key:** `DJIFlightControllerKey.KeyHeightLimit`
*   **Action:** Set to `500`.

---

## 💻 Sample Implementation (Java/Android)

```java
public void executeAgriculturalBypass() {
    KeyManager km = KeyManager.getInstance();

    // 1. Force the firmware to adopt the Agricultural (MG) personality
    km.setValue(DJIFlightControllerKey.KeyMGFarmWorkMode, new MGFarmWorkModeMsg(), (e1) -> {
        
        // 2. Set the terminal climb height used by the MG logic branch
        // This is a direct setter that often bypasses consumer-grade locks.
        km.setValue(DJIFlightControllerKey.KeyMGTerminalClimbHeight, 500.0, (e2) -> {
            
            // 3. Kill the standard "Dark/No-GPS" altitude lock
            km.setValue(DJIFlightControllerKey.KeyDarkNoGpsLockEnable, false, (e3) -> {
                
                // 4. Set the desired altitude
                km.setValue(DJIFlightControllerKey.KeyHeightLimit, 500, null);
            });
        });
    });
}
```

---

## 🔍 Why This Strategy is High-Probability
*   **Logic Path Divergence:** Consumer safety routines are often written specifically for the "P" and "S" modes. Agricultural missions use different internal state machines where "Visual Line of Sight" is handled differently due to terrain.
*   **Direct Control:** `KeyMGTerminalClimbHeight` is an explicit, settable ceiling discovered in the shared flight controller key registry.

**Last Updated:** יום חמישי, 28 במאי 2026
