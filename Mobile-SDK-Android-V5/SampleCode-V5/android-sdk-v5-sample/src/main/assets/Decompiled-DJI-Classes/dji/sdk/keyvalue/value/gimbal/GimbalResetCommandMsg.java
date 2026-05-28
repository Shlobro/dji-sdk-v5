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
import dji.sdk.keyvalue.value.gimbal.GimbalResetType;
import org.json.JSONObject;

public class GimbalResetCommandMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    GimbalResetType value;

    public GimbalResetCommandMsg() {
    }

    public GimbalResetCommandMsg(GimbalResetType gimbalResetType) {
    }

    public static GimbalResetCommandMsg fromJson(String string) {
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

    public GimbalResetType getValue() {
        return null;
    }

    public void setValue(GimbalResetType gimbalResetType) {
    }

    public String toString() {
        return null;
    }
}

