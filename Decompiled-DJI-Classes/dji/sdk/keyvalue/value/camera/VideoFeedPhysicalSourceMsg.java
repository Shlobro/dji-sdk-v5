/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.VideoFeedPhysicalSource;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class VideoFeedPhysicalSourceMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    VideoFeedPhysicalSource value;

    public VideoFeedPhysicalSourceMsg() {
    }

    public VideoFeedPhysicalSourceMsg(VideoFeedPhysicalSource videoFeedPhysicalSource) {
    }

    public static VideoFeedPhysicalSourceMsg fromJson(String string) {
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

    public VideoFeedPhysicalSource getValue() {
        return null;
    }

    public void setValue(VideoFeedPhysicalSource videoFeedPhysicalSource) {
    }

    public String toString() {
        return null;
    }
}

