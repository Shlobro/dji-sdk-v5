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
import dji.sdk.keyvalue.value.gimbal.GimbalComponentType;
import org.json.JSONObject;

public class GimbalComponentTypeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    GimbalComponentType value;

    public GimbalComponentTypeMsg() {
    }

    public GimbalComponentTypeMsg(GimbalComponentType gimbalComponentType) {
    }

    public static GimbalComponentTypeMsg fromJson(String string) {
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

    public GimbalComponentType getValue() {
        return null;
    }

    public void setValue(GimbalComponentType gimbalComponentType) {
    }

    public String toString() {
        return null;
    }
}

