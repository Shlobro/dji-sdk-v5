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
import dji.sdk.keyvalue.value.flightcontroller.BatteryProtectType;
import org.json.JSONObject;

public class BatteryProtectParamMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer version;
    BatteryProtectType protectType;
    Integer takeoffCurrentThreshold;
    Integer oneLevelCurrentProtectThreshold;
    Integer batteryPowerProtectCoefficient;
    Integer batteryPowerProtectInhibitTakeoffThreshold;

    public BatteryProtectParamMsg() {
    }

    public BatteryProtectParamMsg(Integer n, BatteryProtectType batteryProtectType, Integer n2, Integer n3, Integer n4, Integer n5) {
    }

    public static BatteryProtectParamMsg fromJson(String string) {
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

    public BatteryProtectType getProtectType() {
        return null;
    }

    public void setProtectType(BatteryProtectType batteryProtectType) {
    }

    public Integer getTakeoffCurrentThreshold() {
        return null;
    }

    public void setTakeoffCurrentThreshold(Integer n) {
    }

    public Integer getOneLevelCurrentProtectThreshold() {
        return null;
    }

    public void setOneLevelCurrentProtectThreshold(Integer n) {
    }

    public Integer getBatteryPowerProtectCoefficient() {
        return null;
    }

    public void setBatteryPowerProtectCoefficient(Integer n) {
    }

    public Integer getBatteryPowerProtectInhibitTakeoffThreshold() {
        return null;
    }

    public void setBatteryPowerProtectInhibitTakeoffThreshold(Integer n) {
    }

    public String toString() {
        return null;
    }
}

