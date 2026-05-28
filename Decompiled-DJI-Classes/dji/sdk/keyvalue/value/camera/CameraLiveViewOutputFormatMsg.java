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
import dji.sdk.keyvalue.value.camera.CameraLiveViewOutputFormat;
import org.json.JSONObject;

public class CameraLiveViewOutputFormatMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CameraLiveViewOutputFormat value;

    public CameraLiveViewOutputFormatMsg() {
    }

    public CameraLiveViewOutputFormatMsg(CameraLiveViewOutputFormat cameraLiveViewOutputFormat) {
    }

    public static CameraLiveViewOutputFormatMsg fromJson(String string) {
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

    public CameraLiveViewOutputFormat getValue() {
        return null;
    }

    public void setValue(CameraLiveViewOutputFormat cameraLiveViewOutputFormat) {
    }

    public String toString() {
        return null;
    }
}

