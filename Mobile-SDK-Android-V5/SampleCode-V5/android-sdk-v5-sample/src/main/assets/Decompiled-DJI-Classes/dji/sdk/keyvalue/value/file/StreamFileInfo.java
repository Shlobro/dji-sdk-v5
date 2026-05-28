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
import dji.sdk.keyvalue.value.file.FrameRoundType;
import org.json.JSONObject;

public class StreamFileInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Long fileSize;
    FrameRoundType startTimeRoundType;
    Integer startTime;

    public StreamFileInfo() {
    }

    public StreamFileInfo(Long l2, FrameRoundType frameRoundType, Integer n) {
    }

    public static StreamFileInfo fromJson(String string) {
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

    public Long getFileSize() {
        return null;
    }

    public void setFileSize(Long l2) {
    }

    public FrameRoundType getStartTimeRoundType() {
        return null;
    }

    public void setStartTimeRoundType(FrameRoundType frameRoundType) {
    }

    public Integer getStartTime() {
        return null;
    }

    public void setStartTime(Integer n) {
    }

    public String toString() {
        return null;
    }
}

