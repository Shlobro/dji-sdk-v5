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
import dji.sdk.keyvalue.value.camera.CameraFlatMode;
import org.json.JSONObject;

public class QuickCameraModeValue
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CameraFlatMode value;

    public QuickCameraModeValue() {
    }

    public QuickCameraModeValue(CameraFlatMode cameraFlatMode) {
    }

    public static QuickCameraModeValue fromJson(String string) {
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

    public CameraFlatMode getValue() {
        return null;
    }

    public void setValue(CameraFlatMode cameraFlatMode) {
    }

    public String toString() {
        return null;
    }
}

