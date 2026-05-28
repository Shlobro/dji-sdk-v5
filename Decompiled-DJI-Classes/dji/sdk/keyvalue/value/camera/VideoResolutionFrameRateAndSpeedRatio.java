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
import dji.sdk.keyvalue.value.camera.VideoResolutionFrameRate;
import org.json.JSONObject;

public class VideoResolutionFrameRateAndSpeedRatio
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    VideoResolutionFrameRate frameRateAndResolution;
    Integer speedRatio;

    public VideoResolutionFrameRateAndSpeedRatio() {
    }

    public VideoResolutionFrameRateAndSpeedRatio(VideoResolutionFrameRate videoResolutionFrameRate, Integer n) {
    }

    public static VideoResolutionFrameRateAndSpeedRatio fromJson(String string) {
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

    public VideoResolutionFrameRate getFrameRateAndResolution() {
        return null;
    }

    public void setFrameRateAndResolution(VideoResolutionFrameRate videoResolutionFrameRate) {
    }

    public Integer getSpeedRatio() {
        return null;
    }

    public void setSpeedRatio(Integer n) {
    }

    public String toString() {
        return null;
    }
}

