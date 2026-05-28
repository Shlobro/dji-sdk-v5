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
import dji.sdk.keyvalue.value.remotecontroller.LtePrivatizationAddressInfo;
import org.json.JSONObject;

public class LtePrivatizationDroneAndNestAddressInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LtePrivatizationAddressInfo droneAddress;
    LtePrivatizationAddressInfo nestAddress;

    public LtePrivatizationDroneAndNestAddressInfo() {
    }

    public LtePrivatizationDroneAndNestAddressInfo(LtePrivatizationAddressInfo ltePrivatizationAddressInfo, LtePrivatizationAddressInfo ltePrivatizationAddressInfo2) {
    }

    public static LtePrivatizationDroneAndNestAddressInfo fromJson(String string) {
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

    public LtePrivatizationAddressInfo getDroneAddress() {
        return null;
    }

    public void setDroneAddress(LtePrivatizationAddressInfo ltePrivatizationAddressInfo) {
    }

    public LtePrivatizationAddressInfo getNestAddress() {
        return null;
    }

    public void setNestAddress(LtePrivatizationAddressInfo ltePrivatizationAddressInfo) {
    }

    public String toString() {
        return null;
    }
}

