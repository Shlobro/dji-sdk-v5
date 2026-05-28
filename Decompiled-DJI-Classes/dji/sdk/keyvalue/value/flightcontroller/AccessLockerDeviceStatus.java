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
import dji.sdk.keyvalue.value.flightcontroller.AccessLockerEncryptionStatus;
import org.json.JSONObject;

public class AccessLockerDeviceStatus
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    AccessLockerDeviceType deviceType;
    AccessLockerEncryptionStatus ssdEncryption;
    AccessLockerEncryptionStatus emmcEncryption;
    AccessLockerEncryptionStatus sdCardEncryption;
    AccessLockerEncryptionStatus red33Encryption;

    public AccessLockerDeviceStatus() {
    }

    public AccessLockerDeviceStatus(AccessLockerDeviceType accessLockerDeviceType, AccessLockerEncryptionStatus accessLockerEncryptionStatus, AccessLockerEncryptionStatus accessLockerEncryptionStatus2, AccessLockerEncryptionStatus accessLockerEncryptionStatus3, AccessLockerEncryptionStatus accessLockerEncryptionStatus4) {
    }

    public static AccessLockerDeviceStatus fromJson(String string) {
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

    public AccessLockerDeviceType getDeviceType() {
        return null;
    }

    public void setDeviceType(AccessLockerDeviceType accessLockerDeviceType) {
    }

    public AccessLockerEncryptionStatus getSsdEncryption() {
        return null;
    }

    public void setSsdEncryption(AccessLockerEncryptionStatus accessLockerEncryptionStatus) {
    }

    public AccessLockerEncryptionStatus getEmmcEncryption() {
        return null;
    }

    public void setEmmcEncryption(AccessLockerEncryptionStatus accessLockerEncryptionStatus) {
    }

    public AccessLockerEncryptionStatus getSdCardEncryption() {
        return null;
    }

    public void setSdCardEncryption(AccessLockerEncryptionStatus accessLockerEncryptionStatus) {
    }

    public AccessLockerEncryptionStatus getRed33Encryption() {
        return null;
    }

    public void setRed33Encryption(AccessLockerEncryptionStatus accessLockerEncryptionStatus) {
    }

    public String toString() {
        return null;
    }
}

