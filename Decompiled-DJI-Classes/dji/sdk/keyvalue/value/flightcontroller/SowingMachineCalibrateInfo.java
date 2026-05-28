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

public class SowingMachineCalibrateInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer version;
    Integer maxFlow;
    Integer minFlow;
    Double coef1;
    Double coef2;
    Double coef3;

    public SowingMachineCalibrateInfo() {
    }

    public SowingMachineCalibrateInfo(Integer n, Integer n2, Integer n3, Double d2, Double d3, Double d4) {
    }

    public static SowingMachineCalibrateInfo fromJson(String string) {
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

    public Integer getVersion() {
        return null;
    }

    public void setVersion(Integer n) {
    }

    public Integer getMaxFlow() {
        return null;
    }

    public void setMaxFlow(Integer n) {
    }

    public Integer getMinFlow() {
        return null;
    }

    public void setMinFlow(Integer n) {
    }

    public Double getCoef1() {
        return null;
    }

    public void setCoef1(Double d2) {
    }

    public Double getCoef2() {
        return null;
    }

    public void setCoef2(Double d2) {
    }

    public Double getCoef3() {
        return null;
    }

    public void setCoef3(Double d2) {
    }

    public String toString() {
        return null;
    }
}

