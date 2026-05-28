/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.gimbal.GimbalPathMissionException;
import dji.sdk.keyvalue.value.gimbal.GimbalPathMissionState;
import dji.sdk.keyvalue.value.gimbal.GimbalPathMissionType;
import org.json.JSONObject;

public class GimbalPathMissionProgress
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    GimbalPathMissionType missionType;
    GimbalPathMissionState missionState;
    Boolean reachedTargetPoint;
    GimbalPathMissionException executeException;
    Integer curPointNum;
    Integer totalPointNum;
    Integer taskID;

    public GimbalPathMissionProgress() {
    }

    public GimbalPathMissionProgress(GimbalPathMissionType gimbalPathMissionType, GimbalPathMissionState gimbalPathMissionState, Boolean bl, GimbalPathMissionException gimbalPathMissionException, Integer n, Integer n2, Integer n3) {
    }

    public static GimbalPathMissionProgress fromJson(String string) {
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

    public GimbalPathMissionType getMissionType() {
        return null;
    }

    public void setMissionType(GimbalPathMissionType gimbalPathMissionType) {
    }

    public GimbalPathMissionState getMissionState() {
        return null;
    }

    public void setMissionState(GimbalPathMissionState gimbalPathMissionState) {
    }

    public Boolean getReachedTargetPoint() {
        return null;
    }

    public void setReachedTargetPoint(Boolean bl) {
    }

    public GimbalPathMissionException getExecuteException() {
        return null;
    }

    public void setExecuteException(GimbalPathMissionException gimbalPathMissionException) {
    }

    public Integer getCurPointNum() {
        return null;
    }

    public void setCurPointNum(Integer n) {
    }

    public Integer getTotalPointNum() {
        return null;
    }

    public void setTotalPointNum(Integer n) {
    }

    public Integer getTaskID() {
        return null;
    }

    public void setTaskID(Integer n) {
    }

    public String toString() {
        return null;
    }
}

