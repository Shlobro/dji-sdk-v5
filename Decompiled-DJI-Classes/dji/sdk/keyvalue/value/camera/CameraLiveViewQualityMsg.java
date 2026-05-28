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
import dji.sdk.keyvalue.value.camera.CameraLiveViewQuality;
import org.json.JSONObject;

public class CameraLiveViewQualityMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CameraLiveViewQuality value;

    public CameraLiveViewQualityMsg() {
    }

    public CameraLiveViewQualityMsg(CameraLiveViewQuality cameraLiveViewQuality) {
    }

    public static CameraLiveViewQualityMsg fromJson(String string) {
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

    public CameraLiveViewQuality getValue() {
        return null;
    }

    public void setValue(CameraLiveViewQuality cameraLiveViewQuality) {
    }

    public String toString() {
        return null;
    }
}

