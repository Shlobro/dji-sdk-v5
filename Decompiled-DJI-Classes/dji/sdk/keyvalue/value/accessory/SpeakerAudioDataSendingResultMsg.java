/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.accessory;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.accessory.SpeakerAudioDataSendingResult;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class SpeakerAudioDataSendingResultMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    SpeakerAudioDataSendingResult value;

    public SpeakerAudioDataSendingResultMsg() {
    }

    public SpeakerAudioDataSendingResultMsg(SpeakerAudioDataSendingResult speakerAudioDataSendingResult) {
    }

    public static SpeakerAudioDataSendingResultMsg fromJson(String string) {
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

    public SpeakerAudioDataSendingResult getValue() {
        return null;
    }

    public void setValue(SpeakerAudioDataSendingResult speakerAudioDataSendingResult) {
    }

    public String toString() {
        return null;
    }
}

