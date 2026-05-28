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
import java.util.List;
import org.json.JSONObject;

public class AirlinkFrequencyBandRangeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<FrequencyBand> value;

    public AirlinkFrequencyBandRangeMsg() {
    }

    public AirlinkFrequencyBandRangeMsg(List<FrequencyBand> list) {
    }

    public static AirlinkFrequencyBandRangeMsg fromJson(String string) {
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

    public List<FrequencyBand> getValue() {
        return null;
    }

    public void setValue(List<FrequencyBand> list) {
    }

    public String toString() {
        return null;
    }
}

