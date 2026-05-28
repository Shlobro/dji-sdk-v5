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
import dji.sdk.keyvalue.value.mission.WaypointMissionExecuteState;
import org.json.JSONObject;

public class WaypointMissionExecutionState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer targetWaypointIndex;
    Integer totalWaypointCount;
    Boolean isWaypointReached;
    Boolean isExecutionFinish;
    WaypointMissionExecuteState state;
    Integer errorCode;

    public WaypointMissionExecutionState() {
    }

    public WaypointMissionExecutionState(Integer n, Integer n2, Boolean bl, Boolean bl2, WaypointMissionExecuteState waypointMissionExecuteState, Integer n3) {
    }

    public static WaypointMissionExecutionState fromJson(String string) {
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

    public Integer getTargetWaypointIndex() {
        return null;
    }

    public void setTargetWaypointIndex(Integer n) {
    }

    public Integer getTotalWaypointCount() {
        return null;
    }

    public void setTotalWaypointCount(Integer n) {
    }

    public Boolean getIsWaypointReached() {
        return null;
    }

    public void setIsWaypointReached(Boolean bl) {
    }

    public Boolean getIsExecutionFinish() {
        return null;
    }

    public void setIsExecutionFinish(Boolean bl) {
    }

    public WaypointMissionExecuteState getState() {
        return null;
    }

    public void setState(WaypointMissionExecuteState waypointMissionExecuteState) {
    }

    public Integer getErrorCode() {
        return null;
    }

    public void setErrorCode(Integer n) {
    }

    public String toString() {
        return null;
    }
}

