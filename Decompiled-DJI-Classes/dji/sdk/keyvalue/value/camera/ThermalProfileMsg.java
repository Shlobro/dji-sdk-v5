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
import dji.sdk.keyvalue.value.camera.ThermalFrameRateUpperBound;
import dji.sdk.keyvalue.value.camera.ThermalLensFocalLength;
import dji.sdk.keyvalue.value.camera.ThermalResolution;
import dji.sdk.keyvalue.value.camera.ThermalVersion;
import org.json.JSONObject;

public class ThermalProfileMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ThermalResolution resolution;
    ThermalFrameRateUpperBound frameRateUpperBound;
    ThermalLensFocalLength focalLength;
    ThermalVersion version;

    public ThermalProfileMsg() {
    }

    public ThermalProfileMsg(ThermalResolution thermalResolution, ThermalFrameRateUpperBound thermalFrameRateUpperBound, ThermalLensFocalLength thermalLensFocalLength, ThermalVersion thermalVersion) {
    }

    public static ThermalProfileMsg fromJson(String string) {
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

    public ThermalResolution getResolution() {
        return null;
    }

    public void setResolution(ThermalResolution thermalResolution) {
    }

    public ThermalFrameRateUpperBound getFrameRateUpperBound() {
        return null;
    }

    public void setFrameRateUpperBound(ThermalFrameRateUpperBound thermalFrameRateUpperBound) {
    }

    public ThermalLensFocalLength getFocalLength() {
        return null;
    }

    public void setFocalLength(ThermalLensFocalLength thermalLensFocalLength) {
    }

    public ThermalVersion getVersion() {
        return null;
    }

    public void setVersion(ThermalVersion thermalVersion) {
    }

    public String toString() {
        return null;
    }
}

