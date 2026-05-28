/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.camera.CameraFOV;
import dji.sdk.keyvalue.value.camera.VideoResolution;
import org.json.JSONObject;

public class LiveStreamingParams
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    VideoResolution videoResolution;
    Integer bitRate;
    Boolean copyToSD;
    Boolean bitrateAdaptive;
    String rtmpAddress;
    CameraFOV dewarpMode;

    public LiveStreamingParams() {
    }

    public LiveStreamingParams(VideoResolution videoResolution, Integer n, Boolean bl, Boolean bl2, String string, CameraFOV cameraFOV) {
    }

    public static LiveStreamingParams fromJson(String string) {
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

    public VideoResolution getVideoResolution() {
        return null;
    }

    public void setVideoResolution(VideoResolution videoResolution) {
    }

    public Integer getBitRate() {
        return null;
    }

    public void setBitRate(Integer n) {
    }

    public Boolean getCopyToSD() {
        return null;
    }

    public void setCopyToSD(Boolean bl) {
    }

    public Boolean getBitrateAdaptive() {
        return null;
    }

    public void setBitrateAdaptive(Boolean bl) {
    }

    public String getRtmpAddress() {
        return null;
    }

    public void setRtmpAddress(String string) {
    }

    public CameraFOV getDewarpMode() {
        return null;
    }

    public void setDewarpMode(CameraFOV cameraFOV) {
    }

    public String toString() {
        return null;
    }
}

