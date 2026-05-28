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
import dji.sdk.keyvalue.value.flightcontroller.FlightExceptionCode;
import dji.sdk.keyvalue.value.flightcontroller.LogBatchType;
import org.json.JSONObject;

public class CrashPush
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer index;
    FlightExceptionCode cause;
    LogBatchType batch;
    Integer snapshotSize;

    public CrashPush() {
    }

    public CrashPush(Integer n, FlightExceptionCode flightExceptionCode, LogBatchType logBatchType, Integer n2) {
    }

    public static CrashPush fromJson(String string) {
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

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public FlightExceptionCode getCause() {
        return null;
    }

    public void setCause(FlightExceptionCode flightExceptionCode) {
    }

    public LogBatchType getBatch() {
        return null;
    }

    public void setBatch(LogBatchType logBatchType) {
    }

    public Integer getSnapshotSize() {
        return null;
    }

    public void setSnapshotSize(Integer n) {
    }

    public String toString() {
        return null;
    }
}

