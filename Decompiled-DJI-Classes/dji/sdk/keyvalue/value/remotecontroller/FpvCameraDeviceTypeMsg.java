/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.remotecontroller.FpvCameraDeviceType;
import org.json.JSONObject;

public class FpvCameraDeviceTypeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FpvCameraDeviceType value;

    public FpvCameraDeviceTypeMsg() {
    }

    public FpvCameraDeviceTypeMsg(FpvCameraDeviceType fpvCameraDeviceType) {
    }

    public static FpvCameraDeviceTypeMsg fromJson(String string) {
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

    public FpvCameraDeviceType getValue() {
        return null;
    }

    public void setValue(FpvCameraDeviceType fpvCameraDeviceType) {
    }

    public String toString() {
        return null;
    }
}

