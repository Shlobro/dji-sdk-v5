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
import dji.sdk.keyvalue.value.camera.CameraWhiteBalanceMode;
import org.json.JSONObject;

public class CameraWhiteBalanceInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CameraWhiteBalanceMode whiteBalanceMode;
    Integer colorTemperature;

    public CameraWhiteBalanceInfo() {
    }

    public CameraWhiteBalanceInfo(CameraWhiteBalanceMode cameraWhiteBalanceMode, Integer n) {
    }

    public static CameraWhiteBalanceInfo fromJson(String string) {
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

    public CameraWhiteBalanceMode getWhiteBalanceMode() {
        return null;
    }

    public void setWhiteBalanceMode(CameraWhiteBalanceMode cameraWhiteBalanceMode) {
    }

    public Integer getColorTemperature() {
        return null;
    }

    public void setColorTemperature(Integer n) {
    }

    public String toString() {
        return null;
    }
}

