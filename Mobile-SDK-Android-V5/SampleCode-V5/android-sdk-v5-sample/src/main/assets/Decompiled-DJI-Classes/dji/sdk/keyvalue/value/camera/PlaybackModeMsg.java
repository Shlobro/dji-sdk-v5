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
import dji.sdk.keyvalue.value.camera.PlaybackMode;
import org.json.JSONObject;

public class PlaybackModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    PlaybackMode value;

    public PlaybackModeMsg() {
    }

    public PlaybackModeMsg(PlaybackMode playbackMode) {
    }

    public static PlaybackModeMsg fromJson(String string) {
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

    public PlaybackMode getValue() {
        return null;
    }

    public void setValue(PlaybackMode playbackMode) {
    }

    public String toString() {
        return null;
    }
}

