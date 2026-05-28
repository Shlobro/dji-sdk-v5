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
import dji.sdk.keyvalue.value.rtkbasestation.BaseStationDeviceType;
import org.json.JSONObject;

public class RTKStationInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer stationId;
    Integer signalLevel;
    String stationName;
    BaseStationDeviceType type;

    public RTKStationInfo() {
    }

    public RTKStationInfo(Integer n, Integer n2, String string, BaseStationDeviceType baseStationDeviceType) {
    }

    public static RTKStationInfo fromJson(String string) {
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

    public Integer getStationId() {
        return null;
    }

    public void setStationId(Integer n) {
    }

    public Integer getSignalLevel() {
        return null;
    }

    public void setSignalLevel(Integer n) {
    }

    public String getStationName() {
        return null;
    }

    public void setStationName(String string) {
    }

    public BaseStationDeviceType getType() {
        return null;
    }

    public void setType(BaseStationDeviceType baseStationDeviceType) {
    }

    public String toString() {
        return null;
    }
}

