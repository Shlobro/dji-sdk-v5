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
import dji.sdk.keyvalue.value.camera.AudioFocusMode;
import org.json.JSONObject;

public class MicrophoneAudioFocusInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean enable;
    AudioFocusMode mode;

    public MicrophoneAudioFocusInfo() {
    }

    public MicrophoneAudioFocusInfo(Boolean bl, AudioFocusMode audioFocusMode) {
    }

    public static MicrophoneAudioFocusInfo fromJson(String string) {
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

    public Boolean getEnable() {
        return null;
    }

    public void setEnable(Boolean bl) {
    }

    public AudioFocusMode getMode() {
        return null;
    }

    public void setMode(AudioFocusMode audioFocusMode) {
    }

    public String toString() {
        return null;
    }
}

