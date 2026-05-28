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
import dji.sdk.keyvalue.value.camera.VideoFrameRate;
import dji.sdk.keyvalue.value.camera.VideoResolution;
import org.json.JSONObject;

public class VideoRecordingInformation
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer dirNumber;
    Integer fileNumber;
    Long fileGuid;
    VideoResolution videoResolution;
    VideoFrameRate videoFrame;
    Integer videoSplitId;

    public VideoRecordingInformation() {
    }

    public VideoRecordingInformation(Integer n, Integer n2, Long l2, VideoResolution videoResolution, VideoFrameRate videoFrameRate, Integer n3) {
    }

    public static VideoRecordingInformation fromJson(String string) {
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

    public Integer getDirNumber() {
        return null;
    }

    public void setDirNumber(Integer n) {
    }

    public Integer getFileNumber() {
        return null;
    }

    public void setFileNumber(Integer n) {
    }

    public Long getFileGuid() {
        return null;
    }

    public void setFileGuid(Long l2) {
    }

    public VideoResolution getVideoResolution() {
        return null;
    }

    public void setVideoResolution(VideoResolution videoResolution) {
    }

    public VideoFrameRate getVideoFrame() {
        return null;
    }

    public void setVideoFrame(VideoFrameRate videoFrameRate) {
    }

    public Integer getVideoSplitId() {
        return null;
    }

    public void setVideoSplitId(Integer n) {
    }

    public String toString() {
        return null;
    }
}

