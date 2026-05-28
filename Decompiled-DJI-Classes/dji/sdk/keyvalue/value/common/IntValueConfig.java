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

public class IntValueConfig
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer min;
    Integer max;
    Integer defaultValue;

    public IntValueConfig() {
    }

    public IntValueConfig(Integer n, Integer n2, Integer n3) {
    }

    public static IntValueConfig fromJson(String string) {
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

    public Integer getMin() {
        return null;
    }

    public void setMin(Integer n) {
    }

    public Integer getMax() {
        return null;
    }

    public void setMax(Integer n) {
    }

    public Integer getDefaultValue() {
        return null;
    }

    public void setDefaultValue(Integer n) {
    }

    public String toString() {
        return null;
    }
}

