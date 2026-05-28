/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.v5.manager.intelligent.spotlight;

import androidx.annotation.Keep;
import dji.sdk.keyvalue.value.flightassistant.SpotlightZoomStatusTipAndExitReason;
import dji.sdk.keyvalue.value.flightassistant.SpotlightZoomSurroundState;
import dji.v5.manager.intelligent.spotlight.SportLightState;
import dji.v5.manager.intelligent.spotlight.SportLightSubMode;

@Keep
public class SpotLightInfo {
    SportLightState state;
    SportLightSubMode mode;
    boolean isHandlingCommand;
    boolean isControllingDrone;
    boolean isControllingPayload0;
    boolean isControllingPayload1;
    boolean isControllingPayload2;
    int maxEquivalentFocalLength;
    int minEquivalentFocalLength;
    double desiredCircleRadius;
    double maxCircleRadius;
    double minCircleRadius;
    double desiredCircleVelocity;
    double maxCircleVelocity;
    double stickCircleVelocity;
    SpotlightZoomStatusTipAndExitReason exitReason;
    SpotlightZoomSurroundState surroundState;
    boolean isRollStick;
    boolean isGimbalPitchLocked;

    public SportLightState getState() {
        return null;
    }

    public void setState(SportLightState sportLightState) {
    }

    public SportLightSubMode getMode() {
        return null;
    }

    public void setMode(SportLightSubMode sportLightSubMode) {
    }

    public boolean isHandlingCommand() {
        return false;
    }

    public void setHandlingCommand(boolean bl) {
    }

    public boolean isControllingDrone() {
        return false;
    }

    public void setControllingDrone(boolean bl) {
    }

    public boolean isControllingPayload0() {
        return false;
    }

    public void setControllingPayload0(boolean bl) {
    }

    public boolean isControllingPayload1() {
        return false;
    }

    public void setControllingPayload1(boolean bl) {
    }

    public boolean isControllingPayload2() {
        return false;
    }

    public void setControllingPayload2(boolean bl) {
    }

    public int getMaxEquivalentFocalLength() {
        return 0;
    }

    public void setMaxEquivalentFocalLength(int n) {
    }

    public int getMinEquivalentFocalLength() {
        return 0;
    }

    public void setMinEquivalentFocalLength(int n) {
    }

    public double getDesiredCircleRadius() {
        return 0.0;
    }

    public void setDesiredCircleRadius(double d2) {
    }

    public double getMaxCircleRadius() {
        return 0.0;
    }

    public void setMaxCircleRadius(double d2) {
    }

    public double getMinCircleRadius() {
        return 0.0;
    }

    public void setMinCircleRadius(double d2) {
    }

    public double getDesiredCircleVelocity() {
        return 0.0;
    }

    public void setDesiredCircleVelocity(double d2) {
    }

    public double getMaxCircleVelocity() {
        return 0.0;
    }

    public void setMaxCircleVelocity(double d2) {
    }

    public double getStickCircleVelocity() {
        return 0.0;
    }

    public void setStickCircleVelocity(double d2) {
    }

    public SpotlightZoomStatusTipAndExitReason getExitReason() {
        return null;
    }

    public void setExitReason(SpotlightZoomStatusTipAndExitReason spotlightZoomStatusTipAndExitReason) {
    }

    public SpotlightZoomSurroundState getSurroundState() {
        return null;
    }

    public void setSurroundState(SpotlightZoomSurroundState spotlightZoomSurroundState) {
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

    public String toString() {
        return null;
    }
}

