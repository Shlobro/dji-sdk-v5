# Strategy: Sensor Independence Protocol

**Goal:** Bypassing the 60m height limit by disabling the drone's ground-dependent computer vision routines, forcing a transition to "Pure Manual" flight.

---

## 🧠 The Theory: "Ground-Reference Inactivation"
The 60m limit in "Dark" or "No GPS" conditions is often a result of the drone's **Vision Positioning System (VPS)** losing confidence. The Flight Controller locks the altitude to maintain a "safety coordinate" for features like Precision Landing. 

By programmatically disabling these "Smart" safety features, we tell the Flight Controller to stop relying on vision sensor confidence, which can prevent the emergency altitude cap from triggering.

---

## 🛠️ The Bypass Protocol

### Step 1: Disable Precision Landing
This stops the drone from using its downward cameras to find a visual reference of the takeoff spot, which is a primary reason for height locking when GPS is missing.
*   **Key:** `DJIFlightAssistantKey.KeyPrecisionLandingEnabled`
*   **Action:** Set to `false`.

### Step 2: Disable Active Obstacle Avoidance
In some flight modes, the drone enforces a "Safety Bubble." Disabling this ensures the drone doesn't limit its own movement based on perceived sensor confidence.
*   **Key:** `DJIFlightControllerKey.KeyVisionAvoidEnable`
*   **Action:** Set to `false`.

### Step 3: Disable the "Dark/No-GPS" Safety Override
As established in previous strategies, this is the direct toggle for the restrictive emergency profile.
*   **Key:** `DJIFlightControllerKey.KeyDarkNoGpsLockEnable`
*   **Action:** Set to `false`.

### Step 4: Redefine the Operational Ceiling
With the sensor-dependent safety features inactive, push the target height limit.
*   **Key:** `DJIFlightControllerKey.KeyHeightLimit`
*   **Action:** Set to `500`.

---

## 💻 Sample Implementation (Java/Android)

```java
public void executeSensorIndependenceBypass() {
    KeyManager km = KeyManager.getInstance();

    // 1. Disable Precision Landing (Flight Assistant Layer)
    km.setValue(DJIFlightAssistantKey.KeyPrecisionLandingEnabled, false, (e1) -> {
        
        // 2. Disable Obstacle Avoidance (Flight Controller Layer)
        km.setValue(DJIFlightControllerKey.KeyVisionAvoidEnable, false, (e2) -> {
            
            // 3. Kill the Dark/No-GPS specific safety routine
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
*   **Isolation:** It treats the drone as a collection of parts rather than an intelligent system. By disabling the "intelligence" (Precision Landing/Avoidance), you remove the justification for the safety limit.
*   **Synergy:** This strategy perfectly complements the "Logic Kill-Switch" (Strategy 1) by removing the environmental triggers that feed into the safety routine.

**Last Updated:** יום חמישי, 28 במאי 2026
