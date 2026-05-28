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
import dji.sdk.keyvalue.value.camera.CameraWatermarkSettings;
import dji.sdk.keyvalue.value.camera.WatermarkDisplayContentSettings;
import dji.sdk.keyvalue.value.common.StringMsg;
import org.json.JSONObject;

public class WatermarkSettingsAllInOnce
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CameraWatermarkSettings setting;
    WatermarkDisplayContentSettings content;
    StringMsg customInfo;

    public WatermarkSettingsAllInOnce() {
    }

    public WatermarkSettingsAllInOnce(CameraWatermarkSettings cameraWatermarkSettings, WatermarkDisplayContentSettings watermarkDisplayContentSettings, StringMsg stringMsg) {
    }

    public static WatermarkSettingsAllInOnce fromJson(String string) {
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

    public CameraWatermarkSettings getSetting() {
        return null;
    }

    public void setSetting(CameraWatermarkSettings cameraWatermarkSettings) {
    }

    public WatermarkDisplayContentSettings getContent() {
        return null;
    }

    public void setContent(WatermarkDisplayContentSettings watermarkDisplayContentSettings) {
    }

    public StringMsg getCustomInfo() {
        return null;
    }

    public void setCustomInfo(StringMsg stringMsg) {
    }

    public String toString() {
        return null;
    }
}

