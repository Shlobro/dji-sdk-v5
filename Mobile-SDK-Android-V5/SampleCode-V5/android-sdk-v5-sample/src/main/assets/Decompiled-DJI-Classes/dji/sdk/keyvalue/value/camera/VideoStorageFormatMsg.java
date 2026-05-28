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
import dji.sdk.keyvalue.value.camera.VideoFileFormat;
import org.json.JSONObject;

public class VideoStorageFormatMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    VideoFileFormat value;

    public VideoStorageFormatMsg() {
    }

    public VideoStorageFormatMsg(VideoFileFormat videoFileFormat) {
    }

    public static VideoStorageFormatMsg fromJson(String string) {
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

    public VideoFileFormat getValue() {
        return null;
    }

    public void setValue(VideoFileFormat videoFileFormat) {
    }

    public String toString() {
        return null;
    }
}

