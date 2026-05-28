/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.battery;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class BatteryTemperatureException
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean dischargeOverHeatingLevelOne;
    Boolean dischargeOverHeatingLevelTwo;
    Boolean dischargeLowTemperatureLevelOne;
    Boolean dischargeLowTemperatureLevelTwo;
    Boolean chargeOverHeatingLevelOne;
    Boolean chargeLowTemperatureLevelOne;

    public BatteryTemperatureException() {
    }

    public BatteryTemperatureException(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6) {
    }

    public static BatteryTemperatureException fromJson(String string) {
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

    public Boolean getDischargeOverHeatingLevelOne() {
        return null;
    }

    public void setDischargeOverHeatingLevelOne(Boolean bl) {
    }

    public Boolean getDischargeOverHeatingLevelTwo() {
        return null;
    }

    public void setDischargeOverHeatingLevelTwo(Boolean bl) {
    }

    public Boolean getDischargeLowTemperatureLevelOne() {
        return null;
    }

    public void setDischargeLowTemperatureLevelOne(Boolean bl) {
    }

    public Boolean getDischargeLowTemperatureLevelTwo() {
        return null;
    }

    public void setDischargeLowTemperatureLevelTwo(Boolean bl) {
    }

    public Boolean getChargeOverHeatingLevelOne() {
        return null;
    }

    public void setChargeOverHeatingLevelOne(Boolean bl) {
    }

    public Boolean getChargeLowTemperatureLevelOne() {
        return null;
    }

    public void setChargeLowTemperatureLevelOne(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

