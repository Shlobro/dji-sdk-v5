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

public class CameraWhiteBalanceWithTint
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CameraWhiteBalanceMode mode;
    Integer colorTemperature;
    Integer tint;

    public CameraWhiteBalanceWithTint() {
    }

    public CameraWhiteBalanceWithTint(CameraWhiteBalanceMode cameraWhiteBalanceMode, Integer n, Integer n2) {
    }

    public static CameraWhiteBalanceWithTint fromJson(String string) {
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

    public CameraWhiteBalanceMode getMode() {
        return null;
    }

    public void setMode(CameraWhiteBalanceMode cameraWhiteBalanceMode) {
    }

    public Integer getColorTemperature() {
        return null;
    }

    public void setColorTemperature(Integer n) {
    }

    public Integer getTint() {
        return null;
    }

    public void setTint(Integer n) {
    }

    public String toString() {
        return null;
    }
}

