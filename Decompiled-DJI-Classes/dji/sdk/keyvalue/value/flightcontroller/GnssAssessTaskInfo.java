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
import dji.sdk.keyvalue.value.flightcontroller.GnssAssessTaskResult;
import dji.sdk.keyvalue.value.flightcontroller.GnssEnvironmentTaskTotalStatusCode;
import org.json.JSONObject;

public class GnssAssessTaskInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String taskId;
    String taskName;
    GnssEnvironmentTaskTotalStatusCode taskStage;
    LocationCoordinate3D taskLocation;
    GnssAssessTaskResult taskResult;

    public GnssAssessTaskInfo() {
    }

    public GnssAssessTaskInfo(String string, String string2, GnssEnvironmentTaskTotalStatusCode gnssEnvironmentTaskTotalStatusCode, LocationCoordinate3D locationCoordinate3D, GnssAssessTaskResult gnssAssessTaskResult) {
    }

    public static GnssAssessTaskInfo fromJson(String string) {
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

    public GnssEnvironmentTaskTotalStatusCode getTaskStage() {
        return null;
    }

    public void setTaskStage(GnssEnvironmentTaskTotalStatusCode gnssEnvironmentTaskTotalStatusCode) {
    }

    public LocationCoordinate3D getTaskLocation() {
        return null;
    }

    public void setTaskLocation(LocationCoordinate3D locationCoordinate3D) {
    }

    public GnssAssessTaskResult getTaskResult() {
        return null;
    }

    public void setTaskResult(GnssAssessTaskResult gnssAssessTaskResult) {
    }

    public String toString() {
        return null;
    }
}

