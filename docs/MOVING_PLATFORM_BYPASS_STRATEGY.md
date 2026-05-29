# Strategy: Moving Platform Authorization Protocol

**Goal:** Bypassing altitude caps by convincing the Flight Controller that the aircraft is operating from a mobile ground station (boat/vehicle), forcing a transition to a more permissive dynamic safety envelope.

---

## 🧠 The Theory: "Dynamic vs. Static Failsafes"
DJI Flight Controllers enforce the 60m height cap in GPS-denied areas primarily to keep the drone near its static takeoff point. If the takeoff point is "Moving" (e.g., a boat on the water), the drone must allow for greater vertical and horizontal flexibility to ensure it doesn't get "left behind" by the platform. 

By programmatically spoofing a "Moving Platform" state, we tell the firmware that its home-point is dynamic, which may trigger a more permissive safety envelope designed for high-speed tracking and complex recoveries.

---

## 🛠️ The Bypass Protocol

### Step 1: Confirm Moving Platform State
This is the primary flag that tells the Flight Controller to expect a non-static home point.
*   **Key:** `DJIFlightControllerKey.KeyConfirmInMovingPlatform`
*   **Action:** Set to `true`.

### Step 2: Enable Dynamic Home Point
Ensure the drone is actively updating its target return coordinate based on the mobile station's position.
*   **Key:** `DJIFlightAssistantKey.KeyDynamicHomeEnable`
*   **Action:** Set to `true`.

### Step 3: Disable standard "Dark/No-GPS" Safety Override
As established in previous strategies, inhibit the standard restrictive routine to ensure no secondary locks are active.
*   **Key:** `DJIFlightControllerKey.KeyDarkNoGpsLockEnable`
*   **Action:** Set to `false`.

### Step 4: Redefine the Operational Ceiling
With the drone operating under the moving-platform logic branch, push the target height limit.
*   **Key:** `DJIFlightControllerKey.KeyHeightLimit`
*   **Action:** Set to `500`.

---

## 💻 Sample Implementation (Java/Android)

```java
public void executeMovingPlatformBypass() {
    KeyManager km = KeyManager.getInstance();

    // 1. Authorize the "Moving Platform" logic profile
    km.setValue(DJIFlightControllerKey.KeyConfirmInMovingPlatform, true, (e1) -> {
        
        // 2. Enable Dynamic Home Point (Flight Assistant Layer)
        km.setValue(DJIFlightAssistantKey.KeyDynamicHomeEnable, true, (e2) -> {
            
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

## 🔍 Why This Strategy is High-Probability
*   **Logic Branch Redirection:** Drones flying from moving platforms use a different set of safety calculations. The firmware priorities "Tracking the Platform" over "Visual Line of Sight Failsafes."
*   **Synergy with Virtual Sticks:** This strategy works particularly well when combined with Strategy 4 (SDK Authority), as it creates a "Dynamic Mission" profile for the aircraft.

**Last Updated:** יום חמישי, 28 במאי 2026
