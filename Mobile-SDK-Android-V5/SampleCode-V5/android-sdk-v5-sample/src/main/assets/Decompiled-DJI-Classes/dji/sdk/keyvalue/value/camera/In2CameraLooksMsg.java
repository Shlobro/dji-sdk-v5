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
import dji.sdk.keyvalue.value.camera.In2CameraLooksColor;
import dji.sdk.keyvalue.value.camera.In2CameraLooksType;
import org.json.JSONObject;

public class In2CameraLooksMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    In2CameraLooksType type;
    In2CameraLooksColor color;

    public In2CameraLooksMsg() {
    }

    public In2CameraLooksMsg(In2CameraLooksType in2CameraLooksType, In2CameraLooksColor in2CameraLooksColor) {
    }

    public static In2CameraLooksMsg fromJson(String string) {
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

    public In2CameraLooksType getType() {
        return null;
    }

    public void setType(In2CameraLooksType in2CameraLooksType) {
    }

    public In2CameraLooksColor getColor() {
        return null;
    }

    public void setColor(In2CameraLooksColor in2CameraLooksColor) {
    }

    public String toString() {
        return null;
    }
}

