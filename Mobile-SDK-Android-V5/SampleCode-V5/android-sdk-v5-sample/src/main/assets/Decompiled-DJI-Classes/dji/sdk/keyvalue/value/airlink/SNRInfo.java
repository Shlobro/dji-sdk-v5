/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.FrequencyBand;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class SNRInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FrequencyBand frequency;
    Integer channel;
    Integer snr;

    public SNRInfo() {
    }

    public SNRInfo(FrequencyBand frequencyBand, Integer n, Integer n2) {
    }

    public static SNRInfo fromJson(String string) {
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

    public FrequencyBand getFrequency() {
        return null;
    }

    public void setFrequency(FrequencyBand frequencyBand) {
    }

    public Integer getChannel() {
        return null;
    }

    public void setChannel(Integer n) {
    }

    public Integer getSnr() {
        return null;
    }

    public void setSnr(Integer n) {
    }

    public String toString() {
        return null;
    }
}

