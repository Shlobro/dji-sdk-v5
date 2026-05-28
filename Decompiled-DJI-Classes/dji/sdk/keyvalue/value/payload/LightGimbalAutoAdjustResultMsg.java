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
import dji.sdk.keyvalue.value.payload.LightGimbalAutoAdjustResult;
import org.json.JSONObject;

public class LightGimbalAutoAdjustResultMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LightGimbalAutoAdjustResult value;

    public LightGimbalAutoAdjustResultMsg() {
    }

    public LightGimbalAutoAdjustResultMsg(LightGimbalAutoAdjustResult lightGimbalAutoAdjustResult) {
    }

    public static LightGimbalAutoAdjustResultMsg fromJson(String string) {
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

    public LightGimbalAutoAdjustResult getValue() {
        return null;
    }

    public void setValue(LightGimbalAutoAdjustResult lightGimbalAutoAdjustResult) {
    }

    public String toString() {
        return null;
    }
}

