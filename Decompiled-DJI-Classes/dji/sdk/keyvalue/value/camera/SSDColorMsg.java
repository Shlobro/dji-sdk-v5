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
import dji.sdk.keyvalue.value.camera.SSDColor;
import org.json.JSONObject;

public class SSDColorMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    SSDColor value;

    public SSDColorMsg() {
    }

    public SSDColorMsg(SSDColor sSDColor) {
    }

    public static SSDColorMsg fromJson(String string) {
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

    public SSDColor getValue() {
        return null;
    }

    public void setValue(SSDColor sSDColor) {
    }

    public String toString() {
        return null;
    }
}

