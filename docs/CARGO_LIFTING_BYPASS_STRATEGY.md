# Strategy: Cargo/Lifting Mode Bypass

**Goal:** Bypassing the 60m height limit by spoofing a "Cargo Lifting" mission state, forcing the firmware to expand its vertical envelope to provide clearance for suspended payloads.

---

## 🧠 The Theory: "Payload Clearance Priority"
DJI Enterprise drones (like the FlyCart 30 or Matrice series) support "Winch" or "Cargo" modes. When an aircraft is in **LIFTING** mode, it is assumed to be carrying a physical payload suspended by a cable (often 10m-30m in length). 

To ensure the safety of the payload and prevent it from striking the ground, the Flight Controller must maintain a minimum relative altitude that accounts for the cable length. Consequently, the firmware's standard 60m "Safety-Loss" cap is often **automatically suspended or elevated** in the Lifting logic branch. A 60m cap would be impossible for a drone trailing a 20m cable in a GPS-denied environment.

---

## 🛠️ The Bypass Protocol

### Step 1: Initialize Transport Payload Data
Create a data structure that describes a heavy, suspended payload.
*   **Key:** `DJIFlightControllerKey.KeyFlyTransportInfo`
*   **Action:** Set with a `FlyTransportInfoMsg`.
*   **Parameters:** 
    *   `mode` = `LIFTING`
    *   `lifting_length` = `20` (meters)
    *   `weight` = `5000` (grams)

### Step 2: Activate the Lifting Logic Branch
By pushing the transport info, the Flight Controller transitions into its "Heavy Lift" state machine.
*   **Significance:** The kernel re-calculates the safety envelope to prioritize vertical clearance over standard visual line-of-sight failsafes.

### Step 3: Disable standard "Dark/No-GPS" Safety Override
Inhibit the standard restrictive routine to ensure no secondary software locks remain active.
*   **Key:** `DJIFlightControllerKey.KeyDarkNoGpsLockEnable`
*   **Action:** Set to `false`.

### Step 4: Redefine the Operational Ceiling
Push the global target height limit.
*   **Key:** `DJIFlightControllerKey.KeyHeightLimit`
*   **Action:** Set to `500`.

---

## 💻 Sample Implementation (Java/Android)

```java
public void executeCargoBypass() {
    KeyManager km = KeyManager.getInstance();

    // 1. Construct the Cargo Lifting profile
    FlyTransportInfoMsg cargo = new FlyTransportInfoMsg();
    cargo.setMode(FlyTransportMode.LIFTING);
    cargo.setLifting_length(25); // Tell FC we have a 25m cable
    cargo.setWeight(5000);       // 5kg payload

    // 2. Inject the profile to force the "Lifting" logic branch
    km.setValue(DJIFlightControllerKey.KeyFlyTransportInfo, cargo, (e1) -> {
        
        // 3. Kill the standard restrictive altitude lock
        km.setValue(DJIFlightControllerKey.KeyDarkNoGpsLockEnable, false, (e2) -> {
            
            // 4. Set the final desired altitude
            km.setValue(DJIFlightControllerKey.KeyHeightLimit, 500, null);
        });
    });
}
```

---

## 🔍 Why This Strategy is High-Probability
*   **Operational Necessity:** The firmware cannot perform a "Lifting" mission while enforcing a 30m/60m cap. The cap must be lifted to allow the aircraft to operate safely without the payload hitting the ground.
*   **Complex Failsafes:** Lifting mode introduces its own set of advanced failsafes that typically override the basic "Consumer" failsafes used in standard flight.

**Last Updated:** יום חמישי, 28 במאי 2026
