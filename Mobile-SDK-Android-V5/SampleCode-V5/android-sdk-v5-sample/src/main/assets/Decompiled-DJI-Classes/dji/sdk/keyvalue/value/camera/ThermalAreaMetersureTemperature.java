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
import dji.sdk.keyvalue.value.common.DoublePoint2D;
import org.json.JSONObject;

public class ThermalAreaMetersureTemperature
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double averageAreaTemperature;
    Double minAreaTemperature;
    Double maxAreaTemperature;
    DoublePoint2D minTemperaturePoint;
    DoublePoint2D maxTemperaturePoint;

    public ThermalAreaMetersureTemperature() {
    }

    public ThermalAreaMetersureTemperature(Double d2, Double d3, Double d4, DoublePoint2D doublePoint2D, DoublePoint2D doublePoint2D2) {
    }

    public static ThermalAreaMetersureTemperature fromJson(String string) {
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

    public Double getAverageAreaTemperature() {
        return null;
    }

    public void setAverageAreaTemperature(Double d2) {
    }

    public Double getMinAreaTemperature() {
        return null;
    }

    public void setMinAreaTemperature(Double d2) {
    }

    public Double getMaxAreaTemperature() {
        return null;
    }

    public void setMaxAreaTemperature(Double d2) {
    }

    public DoublePoint2D getMinTemperaturePoint() {
        return null;
    }

    public void setMinTemperaturePoint(DoublePoint2D doublePoint2D) {
    }

    public DoublePoint2D getMaxTemperaturePoint() {
        return null;
    }

    public void setMaxTemperaturePoint(DoublePoint2D doublePoint2D) {
    }

    public String toString() {
        return null;
    }
}

