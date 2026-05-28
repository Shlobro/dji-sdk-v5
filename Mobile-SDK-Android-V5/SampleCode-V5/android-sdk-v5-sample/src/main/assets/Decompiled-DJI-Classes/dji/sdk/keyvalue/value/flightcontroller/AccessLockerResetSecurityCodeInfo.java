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
import dji.sdk.keyvalue.value.flightcontroller.AccessLockerDeviceType;
import dji.sdk.keyvalue.value.flightcontroller.AccessLockerStorageType;
import org.json.JSONObject;

public class AccessLockerResetSecurityCodeInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String username;
    AccessLockerDeviceType deviceType;
    AccessLockerStorageType storageType;

    public AccessLockerResetSecurityCodeInfo() {
    }

    public AccessLockerResetSecurityCodeInfo(String string, AccessLockerDeviceType accessLockerDeviceType, AccessLockerStorageType accessLockerStorageType) {
    }

    public static AccessLockerResetSecurityCodeInfo fromJson(String string) {
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

    public String getUsername() {
        return null;
    }

    public void setUsername(String string) {
    }

    public AccessLockerDeviceType getDeviceType() {
        return null;
    }

    public void setDeviceType(AccessLockerDeviceType accessLockerDeviceType) {
    }

    public AccessLockerStorageType getStorageType() {
        return null;
    }

    public void setStorageType(AccessLockerStorageType accessLockerStorageType) {
    }

    public String toString() {
        return null;
    }
}

