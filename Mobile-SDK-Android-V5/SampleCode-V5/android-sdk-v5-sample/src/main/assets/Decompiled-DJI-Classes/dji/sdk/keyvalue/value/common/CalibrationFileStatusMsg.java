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
import dji.sdk.keyvalue.value.common.CalibrationFileStatus;
import org.json.JSONObject;

public class CalibrationFileStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CalibrationFileStatus value;

    public CalibrationFileStatusMsg() {
    }

    public CalibrationFileStatusMsg(CalibrationFileStatus calibrationFileStatus) {
    }

    public static CalibrationFileStatusMsg fromJson(String string) {
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

    public CalibrationFileStatus getValue() {
        return null;
    }

    public void setValue(CalibrationFileStatus calibrationFileStatus) {
    }

    public String toString() {
        return null;
    }
}

