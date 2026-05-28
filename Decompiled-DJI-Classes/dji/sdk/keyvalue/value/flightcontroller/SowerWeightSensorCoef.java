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

public class SowerWeightSensorCoef
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer sensorId;
    Double sensorCoef;

    public SowerWeightSensorCoef() {
    }

    public SowerWeightSensorCoef(Integer n, Double d2) {
    }

    public static SowerWeightSensorCoef fromJson(String string) {
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

    public Integer getSensorId() {
        return null;
    }

    public void setSensorId(Integer n) {
    }

    public Double getSensorCoef() {
        return null;
    }

    public void setSensorCoef(Double d2) {
    }

    public String toString() {
        return null;
    }
}

