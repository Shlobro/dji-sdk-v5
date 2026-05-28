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
import dji.sdk.keyvalue.value.camera.VideoPreProcessQuality;
import org.json.JSONObject;

public class VideoPreProcessQualityMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    VideoPreProcessQuality value;

    public VideoPreProcessQualityMsg() {
    }

    public VideoPreProcessQualityMsg(VideoPreProcessQuality videoPreProcessQuality) {
    }

    public static VideoPreProcessQualityMsg fromJson(String string) {
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

    public VideoPreProcessQuality getValue() {
        return null;
    }

    public void setValue(VideoPreProcessQuality videoPreProcessQuality) {
    }

    public String toString() {
        return null;
    }
}

