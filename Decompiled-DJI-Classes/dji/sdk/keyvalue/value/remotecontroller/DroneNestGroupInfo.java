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
import dji.sdk.keyvalue.value.remotecontroller.DroneNestDataStorageArea;
import org.json.JSONObject;

public class DroneNestGroupInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isBind;
    DroneNestDataStorageArea area;
    String name;
    String groupID;
    String callsign;

    public DroneNestGroupInfo() {
    }

    public DroneNestGroupInfo(Boolean bl, DroneNestDataStorageArea droneNestDataStorageArea, String string, String string2, String string3) {
    }

    public static DroneNestGroupInfo fromJson(String string) {
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

    public Boolean getIsBind() {
        return null;
    }

    public void setIsBind(Boolean bl) {
    }

    public DroneNestDataStorageArea getArea() {
        return null;
    }

    public void setArea(DroneNestDataStorageArea droneNestDataStorageArea) {
    }

    public String getName() {
        return null;
    }

    public void setName(String string) {
    }

    public String getGroupID() {
        return null;
    }

    public void setGroupID(String string) {
    }

    public String getCallsign() {
        return null;
    }

    public void setCallsign(String string) {
    }

    public String toString() {
        return null;
    }
}

