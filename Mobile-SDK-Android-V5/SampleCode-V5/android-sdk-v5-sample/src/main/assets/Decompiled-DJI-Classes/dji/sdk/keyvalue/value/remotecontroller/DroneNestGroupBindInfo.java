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
import dji.sdk.keyvalue.value.remotecontroller.DroneNestDataStorageArea;
import java.util.List;
import org.json.JSONObject;

public class DroneNestGroupBindInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DroneNestDataStorageArea area;
    String bindCode;
    String groupID;
    List<DroneNestBindDeviceInfo> devices;

    public DroneNestGroupBindInfo() {
    }

    public DroneNestGroupBindInfo(DroneNestDataStorageArea droneNestDataStorageArea, String string, String string2, List<DroneNestBindDeviceInfo> list) {
    }

    public static DroneNestGroupBindInfo fromJson(String string) {
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

    public DroneNestDataStorageArea getArea() {
        return null;
    }

    public void setArea(DroneNestDataStorageArea droneNestDataStorageArea) {
    }

    public String getBindCode() {
        return null;
    }

    public void setBindCode(String string) {
    }

    public String getGroupID() {
        return null;
    }

    public void setGroupID(String string) {
    }

    public List<DroneNestBindDeviceInfo> getDevices() {
        return null;
    }

    public void setDevices(List<DroneNestBindDeviceInfo> list) {
    }

    public String toString() {
        return null;
    }
}

