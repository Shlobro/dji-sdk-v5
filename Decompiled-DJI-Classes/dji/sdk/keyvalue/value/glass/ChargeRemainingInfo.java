/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.glass;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class ChargeRemainingInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer batteryPower;
    Integer batteryPercent;
    Boolean isIdentifying;
    Boolean isDjiBattery;

    public ChargeRemainingInfo() {
    }

    public ChargeRemainingInfo(Integer n, Integer n2, Boolean bl, Boolean bl2) {
    }

    public static ChargeRemainingInfo fromJson(String string) {
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

    public Integer getBatteryPower() {
        return null;
    }

    public void setBatteryPower(Integer n) {
    }

    public Integer getBatteryPercent() {
        return null;
    }

    public void setBatteryPercent(Integer n) {
    }

    public Boolean getIsIdentifying() {
        return null;
    }

    public void setIsIdentifying(Boolean bl) {
    }

    public Boolean getIsDjiBattery() {
        return null;
    }

    public void setIsDjiBattery(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

