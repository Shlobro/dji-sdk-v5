# Strategy: Tethered Mooring Spoof Protocol

**Goal:** Bypassing the 60m height limit by convincing the Flight Controller that the aircraft is physically anchored to a ground station via a power/data cable (Mooring), forcing the firmware to suspend GPS-denied altitude failsafes.

---

## 🧠 The Theory: "Physical Anchor Priority"
DJI Flight Controllers support specialized "Mooring" modes for tethered operations. A tethered drone is physically connected to a ground power supply and often transmits data over the cable. 

Because a moored aircraft is physically anchored to a known coordinate on the ground, the firmware's "Visual Line of Sight" and "GPS-Loss Panic" routines are typically suspended or modified. The drone assumes that it cannot "fly away" due to the physical cable, and therefore, it allows for greater vertical movement even in the absence of a satellite lock.

---

## 🛠️ The Bypass Protocol

### Step 1: Elevate Power Supply Authority
This is the master switch that tells the Flight Controller kernel to adopt the "Tethered" flight profile.
*   **Key:** `DJIFlightControllerKey.KeyFCPowerSupplySystemType`
*   **Action:** Set to `MOORING` (Value: `1`).

### Step 2: Confirm Moving Platform (Optional)
If the tethered station is intended to be mobile (e.g., a boat), combine this with the moving platform flag to ensure the safety bubble is dynamic.
*   **Key:** `DJIFlightControllerKey.KeyConfirmInMovingPlatform`
*   **Action:** Set to `true`.

### Step 3: Disable standard "Dark/No-GPS" Safety Override
As established in previous strategies, inhibit the standard restrictive routine to ensure no secondary software locks remain active.
*   **Key:** `DJIFlightControllerKey.KeyDarkNoGpsLockEnable`
*   **Action:** Set to `false`.

### Step 4: Redefine the Operational Ceiling
With the drone operating in its "Tethered" branch, push the target height limit.
*   **Key:** `DJIFlightControllerKey.KeyHeightLimit`
*   **Action:** Set to `500`.

---

## 💻 Sample Implementation (Java/Android)

```java
public void executeMooringBypass() {
    KeyManager km = KeyManager.getInstance();

    // 1. Force the firmware into the "Tethered/Mooring" logic branch
    km.setValue(DJIFlightControllerKey.KeyFCPowerSupplySystemType, FCPowerSupplySystemType.MOORING, (e1) -> {
        
        // 2. Kill the standard restrictive altitude lock routine
        km.setValue(DJIFlightControllerKey.KeyDarkNoGpsLockEnable, false, (e2) -> {
            
            // 3. Set the desired altitude
            km.setValue(DJIFlightControllerKey.KeyHeightLimit, 500, null);
        });
    });
}
```

---

## 🔍 Why This Strategy is High-Probability
*   **Safety logic bypass:** Tethered drones are exempt from many standard safety caps because the physical cable acts as the ultimate failsafe.
*   **Hidden logic branch:** Most consumer apps never touch the `PowerSupplySystemType` key, making its associated firmware branches less likely to have strictly enforced software locks.

**Last Updated:** יום חמישי, 28 במאי 2026
