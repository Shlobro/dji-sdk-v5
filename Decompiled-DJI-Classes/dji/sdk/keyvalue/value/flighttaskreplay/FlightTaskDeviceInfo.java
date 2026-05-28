/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flighttaskreplay;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flighttaskreplay.FlightTaskDeviceType;
import org.json.JSONObject;

public class FlightTaskDeviceInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FlightTaskDeviceType device;
    Integer index;
    String module;
    Integer module_index;
    String firmwareVersion;
    String serialNumber;
    String device_model_key;

    public FlightTaskDeviceInfo() {
    }

    public FlightTaskDeviceInfo(FlightTaskDeviceType flightTaskDeviceType, Integer n, String string, Integer n2, String string2, String string3, String string4) {
    }

    public static FlightTaskDeviceInfo fromJson(String string) {
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

    public FlightTaskDeviceType getDevice() {
        return null;
    }

    public void setDevice(FlightTaskDeviceType flightTaskDeviceType) {
    }

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public String getModule() {
        return null;
    }

    public void setModule(String string) {
    }

    public Integer getModule_index() {
        return null;
    }

    public void setModule_index(Integer n) {
    }

    public String getFirmwareVersion() {
        return null;
    }

    public void setFirmwareVersion(String string) {
    }

    public String getSerialNumber() {
        return null;
    }

    public void setSerialNumber(String string) {
    }

    public String getDevice_model_key() {
        return null;
    }

    public void setDevice_model_key(String string) {
    }

    public String toString() {
        return null;
    }
}

