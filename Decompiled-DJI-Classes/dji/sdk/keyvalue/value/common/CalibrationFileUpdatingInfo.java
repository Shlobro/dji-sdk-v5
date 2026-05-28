/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.CalibrationFileUpdateState;
import org.json.JSONObject;

public class CalibrationFileUpdatingInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CalibrationFileUpdateState state;
    Integer progress;

    public CalibrationFileUpdatingInfo() {
    }

    public CalibrationFileUpdatingInfo(CalibrationFileUpdateState calibrationFileUpdateState, Integer n) {
    }

    public static CalibrationFileUpdatingInfo fromJson(String string) {
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

    public CalibrationFileUpdateState getState() {
        return null;
    }

    public void setState(CalibrationFileUpdateState calibrationFileUpdateState) {
    }

    public Integer getProgress() {
        return null;
    }

    public void setProgress(Integer n) {
    }

    public String toString() {
        return null;
    }
}

