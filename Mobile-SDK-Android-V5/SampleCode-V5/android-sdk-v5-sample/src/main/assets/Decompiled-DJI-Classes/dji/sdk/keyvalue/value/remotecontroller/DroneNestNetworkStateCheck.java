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
import dji.sdk.keyvalue.value.remotecontroller.DroneNestNetworkServerTypeMsg;
import org.json.JSONObject;

public class DroneNestNetworkStateCheck
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DroneNestNetworkServerTypeMsg type;
    Integer countryCode;
    String networkAddress;

    public DroneNestNetworkStateCheck() {
    }

    public DroneNestNetworkStateCheck(DroneNestNetworkServerTypeMsg droneNestNetworkServerTypeMsg, Integer n, String string) {
    }

    public static DroneNestNetworkStateCheck fromJson(String string) {
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

    public DroneNestNetworkServerTypeMsg getType() {
        return null;
    }

    public void setType(DroneNestNetworkServerTypeMsg droneNestNetworkServerTypeMsg) {
    }

    public Integer getCountryCode() {
        return null;
    }

    public void setCountryCode(Integer n) {
    }

    public String getNetworkAddress() {
        return null;
    }

    public void setNetworkAddress(String string) {
    }

    public String toString() {
        return null;
    }
}

