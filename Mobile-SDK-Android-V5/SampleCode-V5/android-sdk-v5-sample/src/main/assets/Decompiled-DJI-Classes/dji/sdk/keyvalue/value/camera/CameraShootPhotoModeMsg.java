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
import dji.sdk.keyvalue.value.camera.CameraShootPhotoMode;
import org.json.JSONObject;

public class CameraShootPhotoModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CameraShootPhotoMode value;

    public CameraShootPhotoModeMsg() {
    }

    public CameraShootPhotoModeMsg(CameraShootPhotoMode cameraShootPhotoMode) {
    }

    public static CameraShootPhotoModeMsg fromJson(String string) {
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

    public CameraShootPhotoMode getValue() {
        return null;
    }

    public void setValue(CameraShootPhotoMode cameraShootPhotoMode) {
    }

    public String toString() {
        return null;
    }
}

