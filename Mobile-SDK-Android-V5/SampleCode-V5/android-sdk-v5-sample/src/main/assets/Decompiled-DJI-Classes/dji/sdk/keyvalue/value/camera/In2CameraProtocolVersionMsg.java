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
import dji.sdk.keyvalue.value.camera.In2CameraProtocolVersion;
import org.json.JSONObject;

public class In2CameraProtocolVersionMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    In2CameraProtocolVersion value;

    public In2CameraProtocolVersionMsg() {
    }

    public In2CameraProtocolVersionMsg(In2CameraProtocolVersion in2CameraProtocolVersion) {
    }

    public static In2CameraProtocolVersionMsg fromJson(String string) {
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

    public In2CameraProtocolVersion getValue() {
        return null;
    }

    public void setValue(In2CameraProtocolVersion in2CameraProtocolVersion) {
    }

    public String toString() {
        return null;
    }
}

