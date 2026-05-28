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

public class SpeakerAudioFileUploadingInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String fileNameOrPath;
    AudioStorageLocation storageLocation;

    public SpeakerAudioFileUploadingInfo() {
    }

    public SpeakerAudioFileUploadingInfo(String string, AudioStorageLocation audioStorageLocation) {
    }

    public static SpeakerAudioFileUploadingInfo fromJson(String string) {
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

    public String getFileNameOrPath() {
        return null;
    }

    public void setFileNameOrPath(String string) {
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

