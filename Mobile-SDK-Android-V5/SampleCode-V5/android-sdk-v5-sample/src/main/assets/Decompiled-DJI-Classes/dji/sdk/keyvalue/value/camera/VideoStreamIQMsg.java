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
import dji.sdk.keyvalue.value.camera.VideoStreamIQType;
import org.json.JSONObject;

public class VideoStreamIQMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    VideoStreamIQType value;

    public VideoStreamIQMsg() {
    }

    public VideoStreamIQMsg(VideoStreamIQType videoStreamIQType) {
    }

    public static VideoStreamIQMsg fromJson(String string) {
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

    public VideoStreamIQType getValue() {
        return null;
    }

    public void setValue(VideoStreamIQType videoStreamIQType) {
    }

    public String toString() {
        return null;
    }
}

