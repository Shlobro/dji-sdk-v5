/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.v5.manager.intelligent.flyto;

import androidx.annotation.Keep;
import dji.sdk.keyvalue.value.flightcontroller.FlyToMissionState;
import dji.sdk.keyvalue.value.flightcontroller.FlyToMode;
import dji.v5.manager.intelligent.flyto.FlyToErrorCodeEnum;

@Keep
public class FlyToInfo {
    private FlyToErrorCodeEnum exitReason;
    private FlyToMode flyToMode;
    private int flyToHeight;
    private FlyToMissionState state;

    public FlyToMode getFlyToMode() {
        return null;
    }

    public void setFlyToMode(FlyToMode flyToMode) {
    }

    public int getFlyToHeight() {
        return 0;
    }

    public void setFlyToHeight(int n) {
    }

    public FlyToErrorCodeEnum getExitReason() {
        return null;
    }

    public void setExitReason(FlyToErrorCodeEnum flyToErrorCodeEnum) {
    }

    public FlyToMissionState getState() {
        return null;
    }

    public void setState(FlyToMissionState flyToMissionState) {
    }

    public String toString() {
        return null;
    }
}

