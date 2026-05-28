/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.file;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.camera.VideoResolution;
import dji.sdk.keyvalue.value.file.FrameRoundType;
import dji.sdk.keyvalue.value.file.StreamFileDataType;
import org.json.JSONObject;

public class StreamFileDataRequest
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer index;
    StreamFileDataType type;
    Integer offset;
    Integer duration;
    VideoResolution resolution;
    FrameRoundType startFrameRoundType;
    FrameRoundType endFrameRoundType;

    public StreamFileDataRequest() {
    }

    public StreamFileDataRequest(Integer n, StreamFileDataType streamFileDataType, Integer n2, Integer n3, VideoResolution videoResolution, FrameRoundType frameRoundType, FrameRoundType frameRoundType2) {
    }

    public static StreamFileDataRequest fromJson(String string) {
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

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public StreamFileDataType getType() {
        return null;
    }

    public void setType(StreamFileDataType streamFileDataType) {
    }

    public Integer getOffset() {
        return null;
    }

    public void setOffset(Integer n) {
    }

    public Integer getDuration() {
        return null;
    }

    public void setDuration(Integer n) {
    }

    public VideoResolution getResolution() {
        return null;
    }

    public void setResolution(VideoResolution videoResolution) {
    }

    public FrameRoundType getStartFrameRoundType() {
        return null;
    }

    public void setStartFrameRoundType(FrameRoundType frameRoundType) {
    }

    public FrameRoundType getEndFrameRoundType() {
        return null;
    }

    public void setEndFrameRoundType(FrameRoundType frameRoundType) {
    }

    public String toString() {
        return null;
    }
}

