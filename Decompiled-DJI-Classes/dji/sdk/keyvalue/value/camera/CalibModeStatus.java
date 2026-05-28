/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.camera.CalibResult;
import dji.sdk.keyvalue.value.camera.CalibStatus;
import org.json.JSONObject;

public class CalibModeStatus
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CalibStatus status;
    CalibResult result;

    public CalibModeStatus() {
    }

    public CalibModeStatus(CalibStatus calibStatus, CalibResult calibResult) {
    }

    public static CalibModeStatus fromJson(String string) {
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

    public CalibStatus getStatus() {
        return null;
    }

    public void setStatus(CalibStatus calibStatus) {
    }

    public CalibResult getResult() {
        return null;
    }

    public void setResult(CalibResult calibResult) {
    }

    public String toString() {
        return null;
    }
}

