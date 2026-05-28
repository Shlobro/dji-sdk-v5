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
import dji.sdk.keyvalue.value.cloudaccess.FlightTaskUploadErrorCode;
import dji.sdk.keyvalue.value.cloudaccess.FlightTaskUploadState;
import org.json.JSONObject;

public class FlightTaskOneRecordUploadProgressInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String path;
    Double progress;
    FlightTaskUploadState state;
    FlightTaskUploadErrorCode code;

    public FlightTaskOneRecordUploadProgressInfo() {
    }

    public FlightTaskOneRecordUploadProgressInfo(String string, Double d2, FlightTaskUploadState flightTaskUploadState, FlightTaskUploadErrorCode flightTaskUploadErrorCode) {
    }

    public static FlightTaskOneRecordUploadProgressInfo fromJson(String string) {
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

    public String getPath() {
        return null;
    }

    public void setPath(String string) {
    }

    public Double getProgress() {
        return null;
    }

    public void setProgress(Double d2) {
    }

    public FlightTaskUploadState getState() {
        return null;
    }

    public void setState(FlightTaskUploadState flightTaskUploadState) {
    }

    public FlightTaskUploadErrorCode getCode() {
        return null;
    }

    public void setCode(FlightTaskUploadErrorCode flightTaskUploadErrorCode) {
    }

    public String toString() {
        return null;
    }
}

