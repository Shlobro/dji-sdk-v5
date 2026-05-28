/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class DoubleValueConfig
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double min;
    Double max;
    Double defaultValue;

    public DoubleValueConfig() {
    }

    public DoubleValueConfig(Double d2, Double d3, Double d4) {
    }

    public static DoubleValueConfig fromJson(String string) {
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

    public Double getMin() {
        return null;
    }

    public void setMin(Double d2) {
    }

    public Double getMax() {
        return null;
    }

    public void setMax(Double d2) {
    }

    public Double getDefaultValue() {
        return null;
    }

    public void setDefaultValue(Double d2) {
    }

    public String toString() {
        return null;
    }
}

