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
import dji.sdk.keyvalue.value.media.MediaFileListState;
import org.json.JSONObject;

public class MediaFileListStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MediaFileListState value;

    public MediaFileListStateMsg() {
    }

    public MediaFileListStateMsg(MediaFileListState mediaFileListState) {
    }

    public static MediaFileListStateMsg fromJson(String string) {
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

    public MediaFileListState getValue() {
        return null;
    }

    public void setValue(MediaFileListState mediaFileListState) {
    }

    public String toString() {
        return null;
    }
}

