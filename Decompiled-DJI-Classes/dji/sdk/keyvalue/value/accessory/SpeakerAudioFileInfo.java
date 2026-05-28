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

public class SpeakerAudioFileInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String fileName;
    Integer fileSize;
    Integer fileIndex;
    AudioStorageLocation storageLocation;

    public SpeakerAudioFileInfo() {
    }

    public SpeakerAudioFileInfo(String string, Integer n, Integer n2, AudioStorageLocation audioStorageLocation) {
    }

    public static SpeakerAudioFileInfo fromJson(String string) {
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

    public String getFileName() {
        return null;
    }

    public void setFileName(String string) {
    }

    public Integer getFileSize() {
        return null;
    }

    public void setFileSize(Integer n) {
    }

    public Integer getFileIndex() {
        return null;
    }

    public void setFileIndex(Integer n) {
    }

    public AudioStorageLocation getStorageLocation() {
        return null;
    }

    public void setStorageLocation(AudioStorageLocation audioStorageLocation) {
    }

    public String toString() {
        return null;
    }
}

