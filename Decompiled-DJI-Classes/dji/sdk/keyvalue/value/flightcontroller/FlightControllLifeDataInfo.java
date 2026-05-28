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
import dji.sdk.keyvalue.value.flightcontroller.LifeDataBasicInfo;
import org.json.JSONObject;

public class FlightControllLifeDataInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LifeDataBasicInfo value;
    Integer bootTimes;
    Integer takeOffTimes;
    Integer flightMileages;
    Integer flightTimes;

    public FlightControllLifeDataInfo() {
    }

    public FlightControllLifeDataInfo(LifeDataBasicInfo lifeDataBasicInfo, Integer n, Integer n2, Integer n3, Integer n4) {
    }

    public static FlightControllLifeDataInfo fromJson(String string) {
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

    public LifeDataBasicInfo getValue() {
        return null;
    }

    public void setValue(LifeDataBasicInfo lifeDataBasicInfo) {
    }

    public Integer getBootTimes() {
        return null;
    }

    public void setBootTimes(Integer n) {
    }

    public Integer getTakeOffTimes() {
        return null;
    }

    public void setTakeOffTimes(Integer n) {
    }

    public Integer getFlightMileages() {
        return null;
    }

    public void setFlightMileages(Integer n) {
    }

    public Integer getFlightTimes() {
        return null;
    }

    public void setFlightTimes(Integer n) {
    }

    public String toString() {
        return null;
    }
}

