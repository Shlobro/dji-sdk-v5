/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.gimbal.GimbalMode;
import org.json.JSONObject;

public class GimbalModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    GimbalMode value;

    public GimbalModeMsg() {
    }

    public GimbalModeMsg(GimbalMode gimbalMode) {
    }

    public static GimbalModeMsg fromJson(String string) {
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

    public GimbalMode getValue() {
        return null;
    }

    public void setValue(GimbalMode gimbalMode) {
    }

    public String toString() {
        return null;
    }
}

