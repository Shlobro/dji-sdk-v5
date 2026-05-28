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
import dji.sdk.keyvalue.value.remotecontroller.MGMultiDevicesConnectState;
import org.json.JSONObject;

public class MGMultiDevicesConnectStatusInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer index;
    MGMultiDevicesConnectState status;
    Integer signalLevel;
    Integer reservedU16;
    Integer reservedU8;

    public MGMultiDevicesConnectStatusInfo() {
    }

    public MGMultiDevicesConnectStatusInfo(Integer n, MGMultiDevicesConnectState mGMultiDevicesConnectState, Integer n2, Integer n3, Integer n4) {
    }

    public static MGMultiDevicesConnectStatusInfo fromJson(String string) {
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

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public MGMultiDevicesConnectState getStatus() {
        return null;
    }

    public void setStatus(MGMultiDevicesConnectState mGMultiDevicesConnectState) {
    }

    public Integer getSignalLevel() {
        return null;
    }

    public void setSignalLevel(Integer n) {
    }

    public Integer getReservedU16() {
        return null;
    }

    public void setReservedU16(Integer n) {
    }

    public Integer getReservedU8() {
        return null;
    }

    public void setReservedU8(Integer n) {
    }

    public String toString() {
        return null;
    }
}

