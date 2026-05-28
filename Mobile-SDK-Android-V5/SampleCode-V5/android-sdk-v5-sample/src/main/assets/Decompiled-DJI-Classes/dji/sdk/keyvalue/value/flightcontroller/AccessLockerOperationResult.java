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
import dji.sdk.keyvalue.value.flightcontroller.AccessLockerOperationType;
import dji.sdk.keyvalue.value.flightcontroller.AccessLockerStorageType;
import org.json.JSONObject;

public class AccessLockerOperationResult
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    AccessLockerOperationType operationType;
    AccessLockerDeviceType deviceType;
    AccessLockerStorageType storageType;
    Integer retCode;

    public AccessLockerOperationResult() {
    }

    public AccessLockerOperationResult(AccessLockerOperationType accessLockerOperationType, AccessLockerDeviceType accessLockerDeviceType, AccessLockerStorageType accessLockerStorageType, Integer n) {
    }

    public static AccessLockerOperationResult fromJson(String string) {
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

    public AccessLockerOperationType getOperationType() {
        return null;
    }

    public void setOperationType(AccessLockerOperationType accessLockerOperationType) {
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

    public Integer getRetCode() {
        return null;
    }

    public void setRetCode(Integer n) {
    }

    public String toString() {
        return null;
    }
}

