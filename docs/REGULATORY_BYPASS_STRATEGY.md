# Strategy: Regulatory Sandbox Protocol (CE Bypass)

**Goal:** Bypassing hard-coded regional altitude limits (such as the 120m EU C0 cap) by manually disabling the Flight Controller's internal regulatory compliance and information engines.

---

## 🧠 The Theory: "Legal vs. Safety Limits"
DJI Flight Controllers enforce two distinct types of height caps:
1.  **Safety Limits (60m):** Triggered by environmental factors (No GPS, low light, prop guards). These are designed to prevent aircraft loss.
2.  **Regulatory Limits (120m):** Triggered by geographic location (GPS sensing of a CE/EU region). These are hard-coded to ensure the drone complies with local aviation laws (e.g., EASA).

Strategy 11 targets the **Compliance Engine**. By disabling the routines that "watch" for regional restrictions, the drone may fail to activate the hard-coded legal ceilings, falling back to the user-defined `KeyHeightLimit`.

---

## 🛠️ The Bypass Protocol

### Step 1: Disable Regulatory Enforcement
This is the master switch that tells the Flight Controller to stop enforcing regional-specific restrictions like the European C0 height cap.
*   **Key:** `DJIFlightControllerKey.KeyCeRegulatoryRestrictionEnable`
*   **Action:** Set to `false`.

### Step 2: Inhibit Regulatory Information Sharing
This key controls the internal reporting of the drone's regional status. Disabling it prevents the compliance status from being shared with other sub-systems (like AirLink power controls).
*   **Key:** `DJIFlightControllerKey.KeyCeInfoEnable`
*   **Action:** Set to `false`.

### Step 3: Combine with Safety Overrides
Note that if you bypass the regulatory 120m limit but are still in a "No-GPS" area, the drone will still hit the 60m safety limit. **Strategy 11 must be combined with the Master Protocol safety overrides to be effective.**

---

## 💻 Sample Implementation (Java/Android)

```java
public void executeRegulatoryBypass() {
    KeyManager km = KeyManager.getInstance();

    // 1. Kill the internal legal compliance routine
    km.setValue(DJIFlightControllerKey.KeyCeRegulatoryRestrictionEnable, false, (e1) -> {
        
        // 2. Kill the information layer that reports regional status
        km.setValue(DJIFlightControllerKey.KeyCeInfoEnable, false, (e2) -> {
            
            // 3. Set desired ceiling (ignores the 120m legal cap)
            km.setValue(DJIFlightControllerKey.KeyHeightLimit, 500, null);
        });
    });
}
```

---

## 🔍 Why This Strategy is Critical
If your drone is successfully bypassing the 60m safety limit (using Strategies 1-10) but suddenly stops at exactly **120m**, you have hit the **Regulatory Wall**. This strategy is the specific solution for that second barrier.

**Last Updated:** יום חמישי, 28 במאי 2026
