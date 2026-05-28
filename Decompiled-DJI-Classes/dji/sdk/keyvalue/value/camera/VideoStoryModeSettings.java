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
import dji.sdk.keyvalue.value.camera.CameraStoryVideoEncodeType;
import dji.sdk.keyvalue.value.camera.VideoFrameRate;
import dji.sdk.keyvalue.value.camera.VideoResolution;
import org.json.JSONObject;

public class VideoStoryModeSettings
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    VideoResolution resolution;
    VideoFrameRate frameRate;
    Integer bitRate;
    CameraStoryVideoEncodeType encode;

    public VideoStoryModeSettings() {
    }

    public VideoStoryModeSettings(VideoResolution videoResolution, VideoFrameRate videoFrameRate, Integer n, CameraStoryVideoEncodeType cameraStoryVideoEncodeType) {
    }

    public static VideoStoryModeSettings fromJson(String string) {
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

    public VideoResolution getResolution() {
        return null;
    }

    public void setResolution(VideoResolution videoResolution) {
    }

    public VideoFrameRate getFrameRate() {
        return null;
    }

    public void setFrameRate(VideoFrameRate videoFrameRate) {
    }

    public Integer getBitRate() {
        return null;
    }

    public void setBitRate(Integer n) {
    }

    public CameraStoryVideoEncodeType getEncode() {
        return null;
    }

    public void setEncode(CameraStoryVideoEncodeType cameraStoryVideoEncodeType) {
    }

    public String toString() {
        return null;
    }
}

