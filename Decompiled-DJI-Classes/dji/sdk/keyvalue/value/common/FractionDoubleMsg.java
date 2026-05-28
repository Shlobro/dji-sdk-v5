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

public class FractionDoubleMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double numerator;
    Double denominator;

    public FractionDoubleMsg() {
    }

    public FractionDoubleMsg(Double d2, Double d3) {
    }

    public static FractionDoubleMsg fromJson(String string) {
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

    public Double getNumerator() {
        return null;
    }

    public void setNumerator(Double d2) {
    }

    public Double getDenominator() {
        return null;
    }

    public void setDenominator(Double d2) {
    }

    public String toString() {
        return null;
    }
}

