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

public class UserFlightInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer curTotalFlyTimes;
    Integer lastTotalFlyTimes;
    Double curTotalMotorStartTime;
    Double curTotalDistance;
    Double lastTotalMotorStartTime;
    Double lastTotalDistance;

    public UserFlightInfoMsg() {
    }

    public UserFlightInfoMsg(Integer n, Integer n2, Double d2, Double d3, Double d4, Double d5) {
    }

    public static UserFlightInfoMsg fromJson(String string) {
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

    public Integer getCurTotalFlyTimes() {
        return null;
    }

    public void setCurTotalFlyTimes(Integer n) {
    }

    public Integer getLastTotalFlyTimes() {
        return null;
    }

    public void setLastTotalFlyTimes(Integer n) {
    }

    public Double getCurTotalMotorStartTime() {
        return null;
    }

    public void setCurTotalMotorStartTime(Double d2) {
    }

    public Double getCurTotalDistance() {
        return null;
    }

    public void setCurTotalDistance(Double d2) {
    }

    public Double getLastTotalMotorStartTime() {
        return null;
    }

    public void setLastTotalMotorStartTime(Double d2) {
    }

    public Double getLastTotalDistance() {
        return null;
    }

    public void setLastTotalDistance(Double d2) {
    }

    public String toString() {
        return null;
    }
}

