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
import java.util.List;
import org.json.JSONObject;

public class FlightCapabilityBaseMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double value;
    Double min;
    Double max;
    List<Integer> range_enum_vec;

    public FlightCapabilityBaseMsg() {
    }

    public FlightCapabilityBaseMsg(Double d2, Double d3, Double d4, List<Integer> list) {
    }

    public static FlightCapabilityBaseMsg fromJson(String string) {
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

    public Double getValue() {
        return null;
    }

    public void setValue(Double d2) {
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

    public List<Integer> getRange_enum_vec() {
        return null;
    }

    public void setRange_enum_vec(List<Integer> list) {
    }

    public String toString() {
        return null;
    }
}

