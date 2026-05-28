/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.accessory;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import java.util.List;
import org.json.JSONObject;

public class SpeakerAudioDataPack
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isFirstPack;
    Boolean isLastPack;
    List<Integer> audioData;

    public SpeakerAudioDataPack() {
    }

    public SpeakerAudioDataPack(Boolean bl, Boolean bl2, List<Integer> list) {
    }

    public static SpeakerAudioDataPack fromJson(String string) {
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

    public Boolean getIsFirstPack() {
        return null;
    }

    public void setIsFirstPack(Boolean bl) {
    }

    public Boolean getIsLastPack() {
        return null;
    }

    public void setIsLastPack(Boolean bl) {
    }

    public List<Integer> getAudioData() {
        return null;
    }

    public void setAudioData(List<Integer> list) {
    }

    public String toString() {
        return null;
    }
}

