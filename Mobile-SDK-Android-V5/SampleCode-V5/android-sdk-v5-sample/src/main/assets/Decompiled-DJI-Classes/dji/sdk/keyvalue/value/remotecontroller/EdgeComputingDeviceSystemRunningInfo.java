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
import org.json.JSONObject;

public class EdgeComputingDeviceSystemRunningInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer cpuLoading;
    Long ramTotal;
    Long ramUsed;
    Long storageTotal;
    Long storageUsed;
    Long netReceiveBytesTotal;
    Long netTransmitBytesTotal;
    Long elapsedTime;

    public EdgeComputingDeviceSystemRunningInfo() {
    }

    public EdgeComputingDeviceSystemRunningInfo(Integer n, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8) {
    }

    public static EdgeComputingDeviceSystemRunningInfo fromJson(String string) {
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

    public Integer getCpuLoading() {
        return null;
    }

    public void setCpuLoading(Integer n) {
    }

    public Long getRamTotal() {
        return null;
    }

    public void setRamTotal(Long l2) {
    }

    public Long getRamUsed() {
        return null;
    }

    public void setRamUsed(Long l2) {
    }

    public Long getStorageTotal() {
        return null;
    }

    public void setStorageTotal(Long l2) {
    }

    public Long getStorageUsed() {
        return null;
    }

    public void setStorageUsed(Long l2) {
    }

    public Long getNetReceiveBytesTotal() {
        return null;
    }

    public void setNetReceiveBytesTotal(Long l2) {
    }

    public Long getNetTransmitBytesTotal() {
        return null;
    }

    public void setNetTransmitBytesTotal(Long l2) {
    }

    public Long getElapsedTime() {
        return null;
    }

    public void setElapsedTime(Long l2) {
    }

    public String toString() {
        return null;
    }
}

