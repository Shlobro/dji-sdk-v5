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
import dji.sdk.keyvalue.value.camera.VideoStandard;
import org.json.JSONObject;

public class VideoStandardMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    VideoStandard value;

    public VideoStandardMsg() {
    }

    public VideoStandardMsg(VideoStandard videoStandard) {
    }

    public static VideoStandardMsg fromJson(String string) {
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

    public VideoStandard getValue() {
        return null;
    }

    public void setValue(VideoStandard videoStandard) {
    }

    public String toString() {
        return null;
    }
}

