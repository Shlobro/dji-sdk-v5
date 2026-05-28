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
import dji.sdk.keyvalue.value.gimbal.GimbalRecenterProgress;
import org.json.JSONObject;

public class GimbalRecenterProgressMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    GimbalRecenterProgress value;

    public GimbalRecenterProgressMsg() {
    }

    public GimbalRecenterProgressMsg(GimbalRecenterProgress gimbalRecenterProgress) {
    }

    public static GimbalRecenterProgressMsg fromJson(String string) {
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

    public GimbalRecenterProgress getValue() {
        return null;
    }

    public void setValue(GimbalRecenterProgress gimbalRecenterProgress) {
    }

    public String toString() {
        return null;
    }
}

