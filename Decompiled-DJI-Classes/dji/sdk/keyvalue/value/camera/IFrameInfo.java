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
import dji.sdk.keyvalue.value.common.VideoStreamType;
import org.json.JSONObject;

public class IFrameInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    VideoStreamType streamType;
    Integer width;
    Integer height;

    public IFrameInfo() {
    }

    public IFrameInfo(VideoStreamType videoStreamType, Integer n, Integer n2) {
    }

    public static IFrameInfo fromJson(String string) {
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

    public VideoStreamType getStreamType() {
        return null;
    }

    public void setStreamType(VideoStreamType videoStreamType) {
    }

    public Integer getWidth() {
        return null;
    }

    public void setWidth(Integer n) {
    }

    public Integer getHeight() {
        return null;
    }

    public void setHeight(Integer n) {
    }

    public String toString() {
        return null;
    }
}

