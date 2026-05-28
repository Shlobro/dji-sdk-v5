/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class FrequencyInterferenceInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double frequencyFrom;
    Double frequencyTo;
    Integer rssi;

    public FrequencyInterferenceInfo() {
    }

    public FrequencyInterferenceInfo(Double d2, Double d3, Integer n) {
    }

    public static FrequencyInterferenceInfo fromJson(String string) {
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

    public Double getFrequencyFrom() {
        return null;
    }

    public void setFrequencyFrom(Double d2) {
    }

    public Double getFrequencyTo() {
        return null;
    }

    public void setFrequencyTo(Double d2) {
    }

    public Integer getRssi() {
        return null;
    }

    public void setRssi(Integer n) {
    }

    public String toString() {
        return null;
    }
}

