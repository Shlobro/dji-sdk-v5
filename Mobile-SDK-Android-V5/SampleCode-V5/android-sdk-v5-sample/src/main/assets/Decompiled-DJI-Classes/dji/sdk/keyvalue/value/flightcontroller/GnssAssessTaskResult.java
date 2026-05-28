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
import dji.sdk.keyvalue.value.camera.DateTime;
import dji.sdk.keyvalue.value.flightcontroller.GnssEnvironmentAssessLocationSuggestCode;
import dji.sdk.keyvalue.value.flightcontroller.GnssEnvironmentAssessResultFailCode;
import dji.sdk.keyvalue.value.flightcontroller.GnssEnvironmentTaskStageCode;
import org.json.JSONObject;

public class GnssAssessTaskResult
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DateTime taskStageOneStartTime;
    GnssEnvironmentTaskStageCode taskStageOneStatus;
    DateTime taskStageTwoEndTime;
    GnssEnvironmentTaskStageCode taskStageTwoStatus;
    Integer taskPoint;
    GnssEnvironmentAssessResultFailCode assessFailCode;
    GnssEnvironmentAssessLocationSuggestCode taskSuggestCode;

    public GnssAssessTaskResult() {
    }

    public GnssAssessTaskResult(DateTime dateTime, GnssEnvironmentTaskStageCode gnssEnvironmentTaskStageCode, DateTime dateTime2, GnssEnvironmentTaskStageCode gnssEnvironmentTaskStageCode2, Integer n, GnssEnvironmentAssessResultFailCode gnssEnvironmentAssessResultFailCode, GnssEnvironmentAssessLocationSuggestCode gnssEnvironmentAssessLocationSuggestCode) {
    }

    public static GnssAssessTaskResult fromJson(String string) {
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

    public DateTime getTaskStageOneStartTime() {
        return null;
    }

    public void setTaskStageOneStartTime(DateTime dateTime) {
    }

    public GnssEnvironmentTaskStageCode getTaskStageOneStatus() {
        return null;
    }

    public void setTaskStageOneStatus(GnssEnvironmentTaskStageCode gnssEnvironmentTaskStageCode) {
    }

    public DateTime getTaskStageTwoEndTime() {
        return null;
    }

    public void setTaskStageTwoEndTime(DateTime dateTime) {
    }

    public GnssEnvironmentTaskStageCode getTaskStageTwoStatus() {
        return null;
    }

    public void setTaskStageTwoStatus(GnssEnvironmentTaskStageCode gnssEnvironmentTaskStageCode) {
    }

    public Integer getTaskPoint() {
        return null;
    }

    public void setTaskPoint(Integer n) {
    }

    public GnssEnvironmentAssessResultFailCode getAssessFailCode() {
        return null;
    }

    public void setAssessFailCode(GnssEnvironmentAssessResultFailCode gnssEnvironmentAssessResultFailCode) {
    }

    public GnssEnvironmentAssessLocationSuggestCode getTaskSuggestCode() {
        return null;
    }

    public void setTaskSuggestCode(GnssEnvironmentAssessLocationSuggestCode gnssEnvironmentAssessLocationSuggestCode) {
    }

    public String toString() {
        return null;
    }
}

