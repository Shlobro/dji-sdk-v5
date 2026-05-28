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
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.flightcontroller.CurrentTaskStageCode;
import dji.sdk.keyvalue.value.flightcontroller.CurrentTaskStatusCode;
import dji.sdk.keyvalue.value.flightcontroller.GnssEnvironmentAssessResultFailCode;
import org.json.JSONObject;

public class CurrentGnssAssessInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String taskId;
    String taskName;
    CurrentTaskStageCode taskStage;
    LocationCoordinate3D taskLocation;
    Integer taskHour;
    Integer taskMinute;
    Integer taskSecond;
    CurrentTaskStatusCode taskStatus;
    GnssEnvironmentAssessResultFailCode assessFailCode;

    public CurrentGnssAssessInfoMsg() {
    }

    public CurrentGnssAssessInfoMsg(String string, String string2, CurrentTaskStageCode currentTaskStageCode, LocationCoordinate3D locationCoordinate3D, Integer n, Integer n2, Integer n3, CurrentTaskStatusCode currentTaskStatusCode, GnssEnvironmentAssessResultFailCode gnssEnvironmentAssessResultFailCode) {
    }

    public static CurrentGnssAssessInfoMsg fromJson(String string) {
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

    public String getTaskId() {
        return null;
    }

    public void setTaskId(String string) {
    }

    public String getTaskName() {
        return null;
    }

    public void setTaskName(String string) {
    }

    public CurrentTaskStageCode getTaskStage() {
        return null;
    }

    public void setTaskStage(CurrentTaskStageCode currentTaskStageCode) {
    }

    public LocationCoordinate3D getTaskLocation() {
        return null;
    }

    public void setTaskLocation(LocationCoordinate3D locationCoordinate3D) {
    }

    public Integer getTaskHour() {
        return null;
    }

    public void setTaskHour(Integer n) {
    }

    public Integer getTaskMinute() {
        return null;
    }

    public void setTaskMinute(Integer n) {
    }

    public Integer getTaskSecond() {
        return null;
    }

    public void setTaskSecond(Integer n) {
    }

    public CurrentTaskStatusCode getTaskStatus() {
        return null;
    }

    public void setTaskStatus(CurrentTaskStatusCode currentTaskStatusCode) {
    }

    public GnssEnvironmentAssessResultFailCode getAssessFailCode() {
        return null;
    }

    public void setAssessFailCode(GnssEnvironmentAssessResultFailCode gnssEnvironmentAssessResultFailCode) {
    }

    public String toString() {
        return null;
    }
}

