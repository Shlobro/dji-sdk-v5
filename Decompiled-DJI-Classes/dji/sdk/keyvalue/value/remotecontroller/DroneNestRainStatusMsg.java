/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.remotecontroller.DroneNestRainLevel;
import org.json.JSONObject;

public class DroneNestRainStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DroneNestRainLevel level;
    Double intensity;
    Double accumulateQuantity;

    public DroneNestRainStatusMsg() {
    }

    public DroneNestRainStatusMsg(DroneNestRainLevel droneNestRainLevel, Double d2, Double d3) {
    }

    public static DroneNestRainStatusMsg fromJson(String string) {
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

    public DroneNestRainLevel getLevel() {
        return null;
    }

    public void setLevel(DroneNestRainLevel droneNestRainLevel) {
    }

    public Double getIntensity() {
        return null;
    }

    public void setIntensity(Double d2) {
    }

    public Double getAccumulateQuantity() {
        return null;
    }

    public void setAccumulateQuantity(Double d2) {
    }

    public String toString() {
        return null;
    }
}

