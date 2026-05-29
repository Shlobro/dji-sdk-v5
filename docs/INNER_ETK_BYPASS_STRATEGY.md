# Strategy: Inner ETK Logic Bypass

**Goal:** Bypassing altitude caps by disabling the core firmware modules responsible for vision and precision positioning, forcing the aircraft into an unrestricted "Engineering/Test" logic branch.

---

## 🧠 The Theory: "Firmware Module Deactivation"
DJI's internal Engineering Test Kit (ETK) contains "God Mode" switches used by firmware developers. While standard SDK keys often toggle "UI-level" settings, the **Inner ETK** keys are linked to the raw logic modules in the Flight Controller's kernel.

*   **VP (Vision Positioning):** The module that processes downward camera and ultrasonic data.
*   **HP (High-Precision):** The module that fuses GNSS and RTK data into a spatial coordinate.

By programmatically disabling these logic blocks, you prevent the firmware from entering the "State Branches" where height limits are enforced. If the kernel module for Vision Positioning is inactive, the code that checks for "Vision-Loss at 60m" is effectively bypassed because the system no longer recognizes the vision module as an active part of the flight plan.

---

## 🛠️ The Bypass Protocol

### Step 1: Deactivate Inner Vision Logic
Explicitly disable the internal Vision Positioning kernel module.
*   **Key:** `DJIFlightControllerKey.KeyInnerETKVpEnabled`
*   **Action:** Set to `false`.

### Step 2: Deactivate Inner Precision Logic
Explicitly disable the internal GNSS/RTK fusion kernel module.
*   **Key:** `DJIFlightControllerKey.KeyInnerETKHpEnabled`
*   **Action:** Set to `false`.

### Step 3: Disable the "Dark/No-GPS" Safety Override
Inhibit the standard restrictive routine discovered in the decompiled classes to ensure no secondary locks are active.
*   **Key:** `DJIFlightControllerKey.KeyDarkNoGpsLockEnable`
*   **Action:** Set to `false`.

### Step 4: Redefine the Operational Ceiling
With the core positioning modules inhibited, push the target height limit.
*   **Key:** `DJIFlightControllerKey.KeyHeightLimit`
*   **Action:** Set to `500`.

---

## 💻 Sample Implementation (Java/Android)

```java
public void executeInnerETKBypass() {
    KeyManager km = KeyManager.getInstance();

    // 1. Kill the Kernel-Level Vision Positioning module
    km.setValue(DJIFlightControllerKey.KeyInnerETKVpEnabled, false, (e1) -> {
        
        // 2. Kill the Kernel-Level Precision/GPS fusion module
        km.setValue(DJIFlightControllerKey.KeyInnerETKHpEnabled, false, (e2) -> {
            
            // 3. Set the desired altitude
            km.setValue(DJIFlightControllerKey.KeyHeightLimit, 500, null);
        });
    });
}
```

---

## 🔍 Why This Strategy is High-Probability
*   **Kernel-Level Access:** These "Inner" keys operate at a deeper level than the standard "Enabled" flags. They are designed for hardware stress testing where all software safety layers must be stripped away.
*   **Hidden Status:** These keys are undocumented and bypass almost all public SDK logic filters.

**Last Updated:** יום חמישי, 28 במאי 2026
