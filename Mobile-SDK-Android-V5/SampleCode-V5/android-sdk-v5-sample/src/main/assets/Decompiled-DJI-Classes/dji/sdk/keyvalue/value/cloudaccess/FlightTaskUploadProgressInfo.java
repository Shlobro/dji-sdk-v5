/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.cloudaccess.FlightTaskOneRecordUploadProgressInfo;
import dji.sdk.keyvalue.value.cloudaccess.FlightTaskUploadState;
import java.util.List;
import org.json.JSONObject;

public class FlightTaskUploadProgressInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer task_id;
    Double total_progress;
    FlightTaskUploadState total_state;
    List<FlightTaskOneRecordUploadProgressInfo> record_progress;

    public FlightTaskUploadProgressInfo() {
    }

    public FlightTaskUploadProgressInfo(Integer n, Double d2, FlightTaskUploadState flightTaskUploadState, List<FlightTaskOneRecordUploadProgressInfo> list) {
    }

    public static FlightTaskUploadProgressInfo fromJson(String string) {
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

    public Integer getTask_id() {
        return null;
    }

    public void setTask_id(Integer n) {
    }

    public Double getTotal_progress() {
        return null;
    }

    public void setTotal_progress(Double d2) {
    }

    public FlightTaskUploadState getTotal_state() {
        return null;
    }

    public void setTotal_state(FlightTaskUploadState flightTaskUploadState) {
    }

    public List<FlightTaskOneRecordUploadProgressInfo> getRecord_progress() {
        return null;
    }

    public void setRecord_progress(List<FlightTaskOneRecordUploadProgressInfo> list) {
    }

    public String toString() {
        return null;
    }
}

