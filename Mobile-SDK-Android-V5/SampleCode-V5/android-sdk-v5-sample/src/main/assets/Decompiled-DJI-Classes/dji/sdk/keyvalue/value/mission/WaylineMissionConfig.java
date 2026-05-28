/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.mission.WaylineFinishedAction;
import dji.sdk.keyvalue.value.mission.WaylineFlyToWaylineMode;
import org.json.JSONObject;

public class WaylineMissionConfig
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineFlyToWaylineMode flyToWaylineMode;
    WaylineFinishedAction finishAction;
    Boolean exitOnRCLost;
    Double transitionalSpeed;

    public WaylineMissionConfig() {
    }

    public WaylineMissionConfig(WaylineFlyToWaylineMode waylineFlyToWaylineMode, WaylineFinishedAction waylineFinishedAction, Boolean bl, Double d2) {
    }

    public static WaylineMissionConfig fromJson(String string) {
        return null;
    }

    @Override
    public JSONObject toJson() {
        return null;
    }

    @Override
    public int serializedLength() {
        return 0;
    }

    @Override
    public int toBytes(byte[] byArray, int n) {
        return 0;
    }

    @Override
    public byte[] toBytes() {
        return null;
    }

    @Override
    public int fromBytes(byte[] byArray, int n) {
        return 0;
    }

    public WaylineFlyToWaylineMode getFlyToWaylineMode() {
        return null;
    }

    public void setFlyToWaylineMode(WaylineFlyToWaylineMode waylineFlyToWaylineMode) {
    }

    public WaylineFinishedAction getFinishAction() {
        return null;
    }

    public void setFinishAction(WaylineFinishedAction waylineFinishedAction) {
    }

    public Boolean getExitOnRCLost() {
        return null;
    }

    public void setExitOnRCLost(Boolean bl) {
    }

    public Double getTransitionalSpeed() {
        return null;
    }

    public void setTransitionalSpeed(Double d2) {
    }

    public String toString() {
        return null;
    }
}

