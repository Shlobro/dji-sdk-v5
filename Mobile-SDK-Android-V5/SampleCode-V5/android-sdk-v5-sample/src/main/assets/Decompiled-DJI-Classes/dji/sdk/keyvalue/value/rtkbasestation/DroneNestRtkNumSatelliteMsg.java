/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class DroneNestRtkNumSatelliteMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer gpsNum;
    Integer gloNum;
    Integer bdsNum;
    Integer galNum;

    public DroneNestRtkNumSatelliteMsg() {
    }

    public DroneNestRtkNumSatelliteMsg(Integer n, Integer n2, Integer n3, Integer n4) {
    }

    public static DroneNestRtkNumSatelliteMsg fromJson(String string) {
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

    public Integer getGpsNum() {
        return null;
    }

    public void setGpsNum(Integer n) {
    }

    public Integer getGloNum() {
        return null;
    }

    public void setGloNum(Integer n) {
    }

    public Integer getBdsNum() {
        return null;
    }

    public void setBdsNum(Integer n) {
    }

    public Integer getGalNum() {
        return null;
    }

    public void setGalNum(Integer n) {
    }

    public String toString() {
        return null;
    }
}

