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
import dji.sdk.keyvalue.value.camera.VideoMimeType;
import java.util.List;
import org.json.JSONObject;

public class VideoFileCompressionStandardRangeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<VideoMimeType> value;

    public VideoFileCompressionStandardRangeMsg() {
    }

    public VideoFileCompressionStandardRangeMsg(List<VideoMimeType> list) {
    }

    public static VideoFileCompressionStandardRangeMsg fromJson(String string) {
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

    public List<VideoMimeType> getValue() {
        return null;
    }

    public void setValue(List<VideoMimeType> list) {
    }

    public String toString() {
        return null;
    }
}

