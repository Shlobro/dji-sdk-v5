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
import dji.sdk.keyvalue.value.flightcontroller.LowBatteryRTHState;
import org.json.JSONObject;

public class LowBatteryRTHInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer batteryPercentNeededToGoHome;
    Integer batteryPercentNeededToLand;
    Double maxRadiusCanFlyAndGoHome;
    Integer smartRTHCountdown;
    Integer remainingFlightTime;
    Integer timeNeededToGoHome;
    Integer timeNeededToLand;
    LowBatteryRTHState lowBatteryRTHStatus;

    public LowBatteryRTHInfo() {
    }

    public LowBatteryRTHInfo(Integer n, Integer n2, Double d2, Integer n3, Integer n4, Integer n5, Integer n6, LowBatteryRTHState lowBatteryRTHState) {
    }

    public static LowBatteryRTHInfo fromJson(String string) {
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

    public Integer getBatteryPercentNeededToGoHome() {
        return null;
    }

    public void setBatteryPercentNeededToGoHome(Integer n) {
    }

    public Integer getBatteryPercentNeededToLand() {
        return null;
    }

    public void setBatteryPercentNeededToLand(Integer n) {
    }

    public Double getMaxRadiusCanFlyAndGoHome() {
        return null;
    }

    public void setMaxRadiusCanFlyAndGoHome(Double d2) {
    }

    public Integer getSmartRTHCountdown() {
        return null;
    }

    public void setSmartRTHCountdown(Integer n) {
    }

    public Integer getRemainingFlightTime() {
        return null;
    }

    public void setRemainingFlightTime(Integer n) {
    }

    public Integer getTimeNeededToGoHome() {
        return null;
    }

    public void setTimeNeededToGoHome(Integer n) {
    }

    public Integer getTimeNeededToLand() {
        return null;
    }

    public void setTimeNeededToLand(Integer n) {
    }

    public LowBatteryRTHState getLowBatteryRTHStatus() {
        return null;
    }

    public void setLowBatteryRTHStatus(LowBatteryRTHState lowBatteryRTHState) {
    }

    public String toString() {
        return null;
    }
}

