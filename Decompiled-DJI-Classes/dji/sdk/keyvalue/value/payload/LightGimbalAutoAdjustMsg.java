/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.payload.LightGimbalAutoAdjustState;
import org.json.JSONObject;

public class LightGimbalAutoAdjustMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer progress;
    LightGimbalAutoAdjustState state;

    public LightGimbalAutoAdjustMsg() {
    }

    public LightGimbalAutoAdjustMsg(Integer n, LightGimbalAutoAdjustState lightGimbalAutoAdjustState) {
    }

    public static LightGimbalAutoAdjustMsg fromJson(String string) {
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

    public LightGimbalAutoAdjustState getState() {
        return null;
    }

    public void setState(LightGimbalAutoAdjustState lightGimbalAutoAdjustState) {
    }

    public String toString() {
        return null;
    }
}

