/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class CargoStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double weightKg;
    Integer weightBiasXmm;
    Integer weightBiasYmm;

    public CargoStateMsg() {
    }

    public CargoStateMsg(Double d2, Integer n, Integer n2) {
    }

    public static CargoStateMsg fromJson(String string) {
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

    public Double getWeightKg() {
        return null;
    }

    public void setWeightKg(Double d2) {
    }

    public Integer getWeightBiasXmm() {
        return null;
    }

    public void setWeightBiasXmm(Integer n) {
    }

    public Integer getWeightBiasYmm() {
        return null;
    }

    public void setWeightBiasYmm(Integer n) {
    }

    public String toString() {
        return null;
    }
}

