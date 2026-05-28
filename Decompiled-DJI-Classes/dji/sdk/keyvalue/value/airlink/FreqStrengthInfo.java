/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.FreqStrength;
import dji.sdk.keyvalue.value.base.DJIValue;
import java.util.List;
import org.json.JSONObject;

public class FreqStrengthInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<FreqStrength> data;

    public FreqStrengthInfo() {
    }

    public FreqStrengthInfo(List<FreqStrength> list) {
    }

    public static FreqStrengthInfo fromJson(String string) {
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

    public List<FreqStrength> getData() {
        return null;
    }

    public void setData(List<FreqStrength> list) {
    }

    public String toString() {
        return null;
    }
}

