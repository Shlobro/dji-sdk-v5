/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.accessory;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.accessory.AudioStorageLocation;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class PlayingAudioFileInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isPlaying;
    Integer index;
    AudioStorageLocation location;

    public PlayingAudioFileInfo() {
    }

    public PlayingAudioFileInfo(Boolean bl, Integer n, AudioStorageLocation audioStorageLocation) {
    }

    public static PlayingAudioFileInfo fromJson(String string) {
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

    public Boolean getIsPlaying() {
        return null;
    }

    public void setIsPlaying(Boolean bl) {
    }

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public AudioStorageLocation getLocation() {
        return null;
    }

    public void setLocation(AudioStorageLocation audioStorageLocation) {
    }

    public String toString() {
        return null;
    }
}

