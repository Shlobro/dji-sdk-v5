/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class ThermalGainModeTemperatureRange
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double lowGainMin;
    Double lowGainMax;
    Double highGainMin;
    Double highGainMax;

    public ThermalGainModeTemperatureRange() {
    }

    public ThermalGainModeTemperatureRange(Double d2, Double d3, Double d4, Double d5) {
    }

    public static ThermalGainModeTemperatureRange fromJson(String string) {
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

    public Double getLowGainMin() {
        return null;
    }

    public void setLowGainMin(Double d2) {
    }

    public Double getLowGainMax() {
        return null;
    }

    public void setLowGainMax(Double d2) {
    }

    public Double getHighGainMin() {
        return null;
    }

    public void setHighGainMin(Double d2) {
    }

    public Double getHighGainMax() {
        return null;
    }

    public void setHighGainMax(Double d2) {
    }

    public String toString() {
        return null;
    }
}

