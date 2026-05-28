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
import dji.sdk.keyvalue.value.camera.VideoRatio;
import org.json.JSONObject;

public class H1VideoWidthHeightRatioMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    VideoRatio value;

    public H1VideoWidthHeightRatioMsg() {
    }

    public H1VideoWidthHeightRatioMsg(VideoRatio videoRatio) {
    }

    public static H1VideoWidthHeightRatioMsg fromJson(String string) {
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

    public VideoRatio getValue() {
        return null;
    }

    public void setValue(VideoRatio videoRatio) {
    }

    public String toString() {
        return null;
    }
}

