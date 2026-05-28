/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.media.ClipTimeTag;
import dji.sdk.keyvalue.value.media.VideoClipFrameRate;
import dji.sdk.keyvalue.value.media.VideoClipInfoControl;
import dji.sdk.keyvalue.value.media.VideoClipSize;
import java.util.List;
import org.json.JSONObject;

public class SetVideoRecordingInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    VideoClipInfoControl clipContorl;
    Integer dirNumber;
    Integer fileNumber;
    Integer sourceGuid;
    Integer commitNumber;
    Integer packNumber;
    VideoClipSize clipSize;
    VideoClipFrameRate videoFps;
    Integer bitRate;
    Integer clipNumber;
    List<ClipTimeTag> videoClipTimeTag;

    public SetVideoRecordingInfoMsg() {
    }

    public SetVideoRecordingInfoMsg(VideoClipInfoControl videoClipInfoControl, Integer n, Integer n2, Integer n3, Integer n4, Integer n5, VideoClipSize videoClipSize, VideoClipFrameRate videoClipFrameRate, Integer n6, Integer n7, List<ClipTimeTag> list) {
    }

    public static SetVideoRecordingInfoMsg fromJson(String string) {
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

    public VideoClipInfoControl getClipContorl() {
        return null;
    }

    public void setClipContorl(VideoClipInfoControl videoClipInfoControl) {
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

    public Integer getSourceGuid() {
        return null;
    }

    public void setSourceGuid(Integer n) {
    }

    public Integer getCommitNumber() {
        return null;
    }

    public void setCommitNumber(Integer n) {
    }

    public Integer getPackNumber() {
        return null;
    }

    public void setPackNumber(Integer n) {
    }

    public VideoClipSize getClipSize() {
        return null;
    }

    public void setClipSize(VideoClipSize videoClipSize) {
    }

    public VideoClipFrameRate getVideoFps() {
        return null;
    }

    public void setVideoFps(VideoClipFrameRate videoClipFrameRate) {
    }

    public Integer getBitRate() {
        return null;
    }

    public void setBitRate(Integer n) {
    }

    public Integer getClipNumber() {
        return null;
    }

    public void setClipNumber(Integer n) {
    }

    public List<ClipTimeTag> getVideoClipTimeTag() {
        return null;
    }

    public void setVideoClipTimeTag(List<ClipTimeTag> list) {
    }

    public String toString() {
        return null;
    }
}

