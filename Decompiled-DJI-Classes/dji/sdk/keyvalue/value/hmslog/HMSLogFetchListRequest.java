/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.hmslog;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.hmslog.HMSLogDevice;
import dji.sdk.keyvalue.value.hmslog.HMSLogFetchListType;
import dji.sdk.keyvalue.value.hmslog.HMSLogRequestDevice;
import org.json.JSONObject;

public class HMSLogFetchListRequest
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    HMSLogDevice device;
    HMSLogFetchListType type;
    HMSLogRequestDevice requestDevice;
    ComponentIndexType componentIndex;

    public HMSLogFetchListRequest() {
    }

    public HMSLogFetchListRequest(HMSLogDevice hMSLogDevice, HMSLogFetchListType hMSLogFetchListType, HMSLogRequestDevice hMSLogRequestDevice, ComponentIndexType componentIndexType) {
    }

    public static HMSLogFetchListRequest fromJson(String string) {
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

    public HMSLogDevice getDevice() {
        return null;
    }

    public void setDevice(HMSLogDevice hMSLogDevice) {
    }

    public HMSLogFetchListType getType() {
        return null;
    }

    public void setType(HMSLogFetchListType hMSLogFetchListType) {
    }

    public HMSLogRequestDevice getRequestDevice() {
        return null;
    }

    public void setRequestDevice(HMSLogRequestDevice hMSLogRequestDevice) {
    }

    public ComponentIndexType getComponentIndex() {
        return null;
    }

    public void setComponentIndex(ComponentIndexType componentIndexType) {
    }

    public String toString() {
        return null;
    }
}

