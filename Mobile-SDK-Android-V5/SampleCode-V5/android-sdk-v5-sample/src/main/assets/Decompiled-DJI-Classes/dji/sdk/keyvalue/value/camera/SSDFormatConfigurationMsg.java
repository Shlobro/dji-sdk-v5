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
import dji.sdk.keyvalue.value.camera.SSDFormatConfigMode;
import dji.sdk.keyvalue.value.camera.VideoResolutionFrameRate;
import org.json.JSONObject;

public class SSDFormatConfigurationMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    VideoResolutionFrameRate sdConfig;
    VideoResolutionFrameRate ssdConfig;
    SSDFormatConfigMode mode;

    public SSDFormatConfigurationMsg() {
    }

    public SSDFormatConfigurationMsg(VideoResolutionFrameRate videoResolutionFrameRate, VideoResolutionFrameRate videoResolutionFrameRate2, SSDFormatConfigMode sSDFormatConfigMode) {
    }

    public static SSDFormatConfigurationMsg fromJson(String string) {
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

    public VideoResolutionFrameRate getSdConfig() {
        return null;
    }

    public void setSdConfig(VideoResolutionFrameRate videoResolutionFrameRate) {
    }

    public VideoResolutionFrameRate getSsdConfig() {
        return null;
    }

    public void setSsdConfig(VideoResolutionFrameRate videoResolutionFrameRate) {
    }

    public SSDFormatConfigMode getMode() {
        return null;
    }

    public void setMode(SSDFormatConfigMode sSDFormatConfigMode) {
    }

    public String toString() {
        return null;
    }
}

