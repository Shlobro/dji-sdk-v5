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
import dji.sdk.keyvalue.value.remotecontroller.DroneNestAirConditionnerMode;
import org.json.JSONObject;

public class DroneNestAirConditionerInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DroneNestAirConditionnerMode value;
    Integer targetTemperature;
    Integer targetHumidity;

    public DroneNestAirConditionerInfo() {
    }

    public DroneNestAirConditionerInfo(DroneNestAirConditionnerMode droneNestAirConditionnerMode, Integer n, Integer n2) {
    }

    public static DroneNestAirConditionerInfo fromJson(String string) {
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

    public DroneNestAirConditionnerMode getValue() {
        return null;
    }

    public void setValue(DroneNestAirConditionnerMode droneNestAirConditionnerMode) {
    }

    public Integer getTargetTemperature() {
        return null;
    }

    public void setTargetTemperature(Integer n) {
    }

    public Integer getTargetHumidity() {
        return null;
    }

    public void setTargetHumidity(Integer n) {
    }

    public String toString() {
        return null;
    }
}

