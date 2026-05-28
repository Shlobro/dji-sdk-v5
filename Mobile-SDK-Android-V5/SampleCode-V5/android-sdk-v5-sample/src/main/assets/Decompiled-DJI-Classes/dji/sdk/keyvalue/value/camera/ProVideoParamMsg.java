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
import dji.sdk.keyvalue.value.camera.CodecProfileParam;
import dji.sdk.keyvalue.value.camera.VideoFrameRate;
import dji.sdk.keyvalue.value.camera.VideoPreProcessQuality;
import dji.sdk.keyvalue.value.camera.VideoResolutionFrameRateAndFov;
import org.json.JSONObject;

public class ProVideoParamMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    VideoResolutionFrameRateAndFov resolutionFpsFov;
    CodecProfileParam codecProfileParam;
    VideoPreProcessQuality videoQuality;
    VideoFrameRate videoStoreFps;

    public ProVideoParamMsg() {
    }

    public ProVideoParamMsg(VideoResolutionFrameRateAndFov videoResolutionFrameRateAndFov, CodecProfileParam codecProfileParam, VideoPreProcessQuality videoPreProcessQuality, VideoFrameRate videoFrameRate) {
    }

    public static ProVideoParamMsg fromJson(String string) {
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

    public VideoResolutionFrameRateAndFov getResolutionFpsFov() {
        return null;
    }

    public void setResolutionFpsFov(VideoResolutionFrameRateAndFov videoResolutionFrameRateAndFov) {
    }

    public CodecProfileParam getCodecProfileParam() {
        return null;
    }

    public void setCodecProfileParam(CodecProfileParam codecProfileParam) {
    }

    public VideoPreProcessQuality getVideoQuality() {
        return null;
    }

    public void setVideoQuality(VideoPreProcessQuality videoPreProcessQuality) {
    }

    public VideoFrameRate getVideoStoreFps() {
        return null;
    }

    public void setVideoStoreFps(VideoFrameRate videoFrameRate) {
    }

    public String toString() {
        return null;
    }
}

