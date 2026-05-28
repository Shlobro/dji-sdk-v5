/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.wifi;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.wifi.WiFiFrequencyBand;
import org.json.JSONObject;

public class WiFiFrequencyBandMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WiFiFrequencyBand value;

    public WiFiFrequencyBandMsg() {
    }

    public WiFiFrequencyBandMsg(WiFiFrequencyBand wiFiFrequencyBand) {
    }

    public static WiFiFrequencyBandMsg fromJson(String string) {
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

    public WiFiFrequencyBand getValue() {
        return null;
    }

    public void setValue(WiFiFrequencyBand wiFiFrequencyBand) {
    }

    public String toString() {
        return null;
    }
}

