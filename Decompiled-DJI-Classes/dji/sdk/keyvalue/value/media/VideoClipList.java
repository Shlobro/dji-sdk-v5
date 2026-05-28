/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.media.VideoClipState;
import java.util.List;
import org.json.JSONObject;

public class VideoClipList
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<VideoClipState> states;

    public VideoClipList() {
    }

    public VideoClipList(List<VideoClipState> list) {
    }

    public static VideoClipList fromJson(String string) {
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

    public List<VideoClipState> getStates() {
        return null;
    }

    public void setStates(List<VideoClipState> list) {
    }

    public String toString() {
        return null;
    }
}

