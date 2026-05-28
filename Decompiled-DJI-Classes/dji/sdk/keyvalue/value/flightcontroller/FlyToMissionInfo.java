/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightcontroller.FlyToMissionState;
import dji.sdk.keyvalue.value.flightcontroller.FlyToMode;
import org.json.JSONObject;

public class FlyToMissionInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FlyToMissionState missionState;
    Integer goalIndex;
    FlyToMode mode;
    Double distanceRemaining;
    Double timeRemaining;
    Integer soeRemaining;
    Integer progress;
    Integer successRate;

    public FlyToMissionInfo() {
    }

    public FlyToMissionInfo(FlyToMissionState flyToMissionState, Integer n, FlyToMode flyToMode, Double d2, Double d3, Integer n2, Integer n3, Integer n4) {
    }

    public static FlyToMissionInfo fromJson(String string) {
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

    public FlyToMissionState getMissionState() {
        return null;
    }

    public void setMissionState(FlyToMissionState flyToMissionState) {
    }

    public Integer getGoalIndex() {
        return null;
    }

    public void setGoalIndex(Integer n) {
    }

    public FlyToMode getMode() {
        return null;
    }

    public void setMode(FlyToMode flyToMode) {
    }

    public Double getDistanceRemaining() {
        return null;
    }

    public void setDistanceRemaining(Double d2) {
    }

    public Double getTimeRemaining() {
        return null;
    }

    public void setTimeRemaining(Double d2) {
    }

    public Integer getSoeRemaining() {
        return null;
    }

    public void setSoeRemaining(Integer n) {
    }

    public Integer getProgress() {
        return null;
    }

    public void setProgress(Integer n) {
    }

    public Integer getSuccessRate() {
        return null;
    }

    public void setSuccessRate(Integer n) {
    }

    public String toString() {
        return null;
    }
}

