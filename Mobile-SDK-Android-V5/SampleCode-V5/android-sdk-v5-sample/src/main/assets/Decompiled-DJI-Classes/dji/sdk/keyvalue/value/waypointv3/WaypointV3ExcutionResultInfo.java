/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.waypointv3;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.waypointv3.Waypoint3ErrorCode;
import dji.sdk.keyvalue.value.waypointv3.WaypointV3ExcutionResult;
import org.json.JSONObject;

public class WaypointV3ExcutionResultInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isExcuting;
    String missionID;
    Boolean hasLastMissionBreakPoint;
    WaypointV3ExcutionResult lastMissionExcuteResult;
    Waypoint3ErrorCode errorCode;

    public WaypointV3ExcutionResultInfo() {
    }

    public WaypointV3ExcutionResultInfo(Boolean bl, String string, Boolean bl2, WaypointV3ExcutionResult waypointV3ExcutionResult, Waypoint3ErrorCode waypoint3ErrorCode) {
    }

    public static WaypointV3ExcutionResultInfo fromJson(String string) {
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

    public Boolean getIsExcuting() {
        return null;
    }

    public void setIsExcuting(Boolean bl) {
    }

    public String getMissionID() {
        return null;
    }

    public void setMissionID(String string) {
    }

    public Boolean getHasLastMissionBreakPoint() {
        return null;
    }

    public void setHasLastMissionBreakPoint(Boolean bl) {
    }

    public WaypointV3ExcutionResult getLastMissionExcuteResult() {
        return null;
    }

    public void setLastMissionExcuteResult(WaypointV3ExcutionResult waypointV3ExcutionResult) {
    }

    public Waypoint3ErrorCode getErrorCode() {
        return null;
    }

    public void setErrorCode(Waypoint3ErrorCode waypoint3ErrorCode) {
    }

    public String toString() {
        return null;
    }
}

