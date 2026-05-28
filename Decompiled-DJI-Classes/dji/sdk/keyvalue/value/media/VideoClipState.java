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
import dji.sdk.keyvalue.value.media.VideoClipActionState;
import org.json.JSONObject;

public class VideoClipState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer commitID;
    Integer clipID;
    VideoClipActionState actionState;

    public VideoClipState() {
    }

    public VideoClipState(Integer n, Integer n2, VideoClipActionState videoClipActionState) {
    }

    public static VideoClipState fromJson(String string) {
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

    public Integer getCommitID() {
        return null;
    }

    public void setCommitID(Integer n) {
    }

    public Integer getClipID() {
        return null;
    }

    public void setClipID(Integer n) {
    }

    public VideoClipActionState getActionState() {
        return null;
    }

    public void setActionState(VideoClipActionState videoClipActionState) {
    }

    public String toString() {
        return null;
    }
}

