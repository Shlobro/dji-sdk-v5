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

public class AirlinkFrequencyBandMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FrequencyBand value;

    public AirlinkFrequencyBandMsg() {
    }

    public AirlinkFrequencyBandMsg(FrequencyBand frequencyBand) {
    }

    public static AirlinkFrequencyBandMsg fromJson(String string) {
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

    public FrequencyBand getValue() {
        return null;
    }

    public void setValue(FrequencyBand frequencyBand) {
    }

    public String toString() {
        return null;
    }
}

