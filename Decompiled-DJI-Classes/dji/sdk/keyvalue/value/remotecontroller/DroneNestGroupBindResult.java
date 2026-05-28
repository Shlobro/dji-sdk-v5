/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.remotecontroller.DroneNestBindDeviceInfo;
import org.json.JSONObject;

public class DroneNestGroupBindResult
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DroneNestBindDeviceInfo device;
    Integer result;

    public DroneNestGroupBindResult() {
    }

    public DroneNestGroupBindResult(DroneNestBindDeviceInfo droneNestBindDeviceInfo, Integer n) {
    }

    public static DroneNestGroupBindResult fromJson(String string) {
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

    public DroneNestBindDeviceInfo getDevice() {
        return null;
    }

    public void setDevice(DroneNestBindDeviceInfo droneNestBindDeviceInfo) {
    }

    public Integer getResult() {
        return null;
    }

    public void setResult(Integer n) {
    }

    public String toString() {
        return null;
    }
}

