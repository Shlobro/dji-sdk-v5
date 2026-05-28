/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.CameraVideoStreamType;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class CameraVideoStreamTypeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CameraVideoStreamType value;

    public CameraVideoStreamTypeMsg() {
    }

    public CameraVideoStreamTypeMsg(CameraVideoStreamType cameraVideoStreamType) {
    }

    public static CameraVideoStreamTypeMsg fromJson(String string) {
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

    public CameraVideoStreamType getValue() {
        return null;
    }

    public void setValue(CameraVideoStreamType cameraVideoStreamType) {
    }

    public String toString() {
        return null;
    }
}

