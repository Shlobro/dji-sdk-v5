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
import dji.sdk.keyvalue.value.flightcontroller.LogExportToSDCardErrorReason;
import dji.sdk.keyvalue.value.flightcontroller.LogExportToSDCardState;
import org.json.JSONObject;

public class LogExportToSDCardStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer progress;
    LogExportToSDCardState exportState;
    LogExportToSDCardErrorReason errorReason;

    public LogExportToSDCardStatusMsg() {
    }

    public LogExportToSDCardStatusMsg(Integer n, LogExportToSDCardState logExportToSDCardState, LogExportToSDCardErrorReason logExportToSDCardErrorReason) {
    }

    public static LogExportToSDCardStatusMsg fromJson(String string) {
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

    public Integer getProgress() {
        return null;
    }

    public void setProgress(Integer n) {
    }

    public LogExportToSDCardState getExportState() {
        return null;
    }

    public void setExportState(LogExportToSDCardState logExportToSDCardState) {
    }

    public LogExportToSDCardErrorReason getErrorReason() {
        return null;
    }

    public void setErrorReason(LogExportToSDCardErrorReason logExportToSDCardErrorReason) {
    }

    public String toString() {
        return null;
    }
}

