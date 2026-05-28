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

public class FlightTaskDeviceState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FlightTaskDeviceType device;
    Integer index;
    String module;
    Integer module_index;
    String key;

    public FlightTaskDeviceState() {
    }

    public FlightTaskDeviceState(FlightTaskDeviceType flightTaskDeviceType, Integer n, String string, Integer n2, String string2) {
    }

    public static FlightTaskDeviceState fromJson(String string) {
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

    public String getKey() {
        return null;
    }

    public void setKey(String string) {
    }

    public String toString() {
        return null;
    }
}

