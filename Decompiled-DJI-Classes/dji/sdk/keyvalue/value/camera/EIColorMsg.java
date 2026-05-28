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
import dji.sdk.keyvalue.value.camera.EIColor;
import org.json.JSONObject;

public class EIColorMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    EIColor value;

    public EIColorMsg() {
    }

    public EIColorMsg(EIColor eIColor) {
    }

    public static EIColorMsg fromJson(String string) {
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

    public EIColor getValue() {
        return null;
    }

    public void setValue(EIColor eIColor) {
    }

    public String toString() {
        return null;
    }
}

