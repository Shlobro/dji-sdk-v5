/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.intelligent.poi;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.flightassistant.SpotlightZoomStatusTipAndExitReason;
import dji.sdk.keyvalue.value.flightassistant.SpotlightZoomSurroundState;

@Keep
public class POIInfo {
    private boolean isRunning;
    private double radius;
    private double curSpeed;
    private double targetSpeed;
    private double maxSpeed;
    private boolean isRollStick;
    private boolean isGimbalPitchLocked;
    private SpotlightZoomSurroundState surroundState;
    private SpotlightZoomStatusTipAndExitReason exitStatus;

    public boolean isRunning() {
        return false;
    }

    public void setRunning(boolean bl) {
    }

    public double getRadius() {
        return 0.0;
    }

    public void setRadius(double d2) {
    }

    public double getCurSpeed() {
        return 0.0;
    }

    public void setCurSpeed(double d2) {
    }

    public double getTargetSpeed() {
        return 0.0;
    }

    public void setTargetSpeed(double d2) {
    }

    public double getMaxSpeed() {
        return 0.0;
    }

    public void setMaxSpeed(double d2) {
    }

    public boolean isRollStick() {
        return false;
    }

    public void setRollStick(boolean bl) {
    }

    public boolean isGimbalPitchLocked() {
        return false;
    }

    public void setGimbalPitchLocked(boolean bl) {
    }

    public SpotlightZoomSurroundState getSurroundState() {
        return null;
    }

    public void setSurroundState(SpotlightZoomSurroundState spotlightZoomSurroundState) {
    }

    public SpotlightZoomStatusTipAndExitReason getExitStatus() {
        return null;
    }

    public void setExitStatus(SpotlightZoomStatusTipAndExitReason spotlightZoomStatusTipAndExitReason) {
    }

    @NonNull
    public String toString() {
        return null;
    }
}

