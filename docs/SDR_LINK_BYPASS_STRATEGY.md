# Strategy: SDR-Link Safety Inhibit

**Goal:** Bypassing altitude caps by disabling the drone's "Connection-Based" safety triggers, preventing height locks caused by radio interference (multipath) or signal degradation in GPS-denied environments.

---

## 🧠 The Theory: "Radio Panic Suppression"
DJI's OcuSync (SDR) link is highly sensitive. In GPS-denied areas like cities or warehouses, radio signals often bounce off surfaces (multipath interference). 

The Flight Controller's internal logic often dictates: *"If GPS is missing AND the radio link is not 100% stable, enforce a 60m height cap to ensure the pilot can recover the aircraft manually if the link fails."*

By programmatically enabling specialized "Prevention" flags, we can blind the safety system to radio quality issues, stopping the "Radio Panic" routine from triggering the altitude lock.

---

## 🛠️ The Bypass Protocol

### Step 1: Inhibit "No-Link" Takeoff Prevention
This allows the drone to ignore link quality checks before and during takeoff.
*   **Key:** `DJIFlightControllerKey.KeySdrLostPreventNeverTakeoffEnable`
*   **Action:** Set to `true`.

### Step 2: Inhibit "Signal-Degradation" Enforced Limits
This is the critical key for mid-flight bypasses. It tells the firmware not to enforce safety limits (like the 60m cap) even if the SDR link quality drops.
*   **Key:** `DJIFlightControllerKey.KeySdrLostPreventHasTakeoffEnable`
*   **Action:** Set to `true`.

### Step 3: Disable standard "Dark/No-GPS" Safety Override
As established in previous strategies, inhibit the standard restrictive routine to ensure no secondary locks are active.
*   **Key:** `DJIFlightControllerKey.KeyDarkNoGpsLockEnable`
*   **Action:** Set to `false`.

### Step 4: Redefine the Operational Ceiling
With the link-based safety routines inhibited, push the target height limit.
*   **Key:** `DJIFlightControllerKey.KeyHeightLimit`
*   **Action:** Set to `500`.

---

## 💻 Sample Implementation (Java/Android)

```java
public void executeSdrLinkBypass() {
    KeyManager km = KeyManager.getInstance();

    // 1. Inhibit pre-flight link safety checks
    km.setValue(DJIFlightControllerKey.KeySdrLostPreventNeverTakeoffEnable, true, (e1) -> {
        
        // 2. Inhibit in-flight link safety caps
        km.setValue(DJIFlightControllerKey.KeySdrLostPreventHasTakeoffEnable, true, (e2) -> {
            
            // 3. Kill the standard "Dark/No-GPS" altitude lock routine
            km.setValue(DJIFlightControllerKey.KeyDarkNoGpsLockEnable, false, (e3) -> {
                
                // 4. Set the desired altitude
                km.setValue(DJIFlightControllerKey.KeyHeightLimit, 500, null);
            });
        });
    });
}
```

---

## 🔍 Why This Strategy is Critical
In "Urban Canyons" or industrial sites, the drone often has enough light for vision positioning but "flickers" its radio connection. This strategy ensures that those minor radio flickers don't trigger a permanent 60m altitude lock.

**Last Updated:** יום חמישי, 28 במאי 2026
