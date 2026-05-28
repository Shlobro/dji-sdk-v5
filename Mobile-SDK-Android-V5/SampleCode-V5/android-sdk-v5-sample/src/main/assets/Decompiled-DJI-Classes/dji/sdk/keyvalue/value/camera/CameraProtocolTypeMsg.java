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
import dji.sdk.keyvalue.value.camera.CameraProtocolType;
import org.json.JSONObject;

public class CameraProtocolTypeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CameraProtocolType value;

    public CameraProtocolTypeMsg() {
    }

    public CameraProtocolTypeMsg(CameraProtocolType cameraProtocolType) {
    }

    public static CameraProtocolTypeMsg fromJson(String string) {
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

    public CameraProtocolType getValue() {
        return null;
    }

    public void setValue(CameraProtocolType cameraProtocolType) {
    }

    public String toString() {
        return null;
    }
}

