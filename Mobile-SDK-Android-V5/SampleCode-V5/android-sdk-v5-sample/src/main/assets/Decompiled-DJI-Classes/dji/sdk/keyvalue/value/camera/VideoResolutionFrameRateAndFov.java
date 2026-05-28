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
import dji.sdk.keyvalue.value.camera.VideoFovType;
import dji.sdk.keyvalue.value.camera.VideoResolutionFrameRate;
import org.json.JSONObject;

public class VideoResolutionFrameRateAndFov
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    VideoResolutionFrameRate frameRateAndResolution;
    VideoFovType fov;

    public VideoResolutionFrameRateAndFov() {
    }

    public VideoResolutionFrameRateAndFov(VideoResolutionFrameRate videoResolutionFrameRate, VideoFovType videoFovType) {
    }

    public static VideoResolutionFrameRateAndFov fromJson(String string) {
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

    public VideoFovType getFov() {
        return null;
    }

    public void setFov(VideoFovType videoFovType) {
    }

    public String toString() {
        return null;
    }
}

