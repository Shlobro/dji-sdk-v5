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
import dji.sdk.keyvalue.value.remotecontroller.MGMultiDevicesConnectStatusInfo;
import dji.sdk.keyvalue.value.remotecontroller.MGMultiDevicesWorkModeType;
import java.util.List;
import org.json.JSONObject;

public class MGMultiDevicesConnectStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MGMultiDevicesWorkModeType mode;
    Integer maxSupportedDeviceCount;
    Integer currentFpvIndex;
    Integer pairedDeviceCount;
    Integer reserved;
    List<MGMultiDevicesConnectStatusInfo> multiDevicesConnectStatus;

    public MGMultiDevicesConnectStatusMsg() {
    }

    public MGMultiDevicesConnectStatusMsg(MGMultiDevicesWorkModeType mGMultiDevicesWorkModeType, Integer n, Integer n2, Integer n3, Integer n4, List<MGMultiDevicesConnectStatusInfo> list) {
    }

    public static MGMultiDevicesConnectStatusMsg fromJson(String string) {
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

    public MGMultiDevicesWorkModeType getMode() {
        return null;
    }

    public void setMode(MGMultiDevicesWorkModeType mGMultiDevicesWorkModeType) {
    }

    public Integer getMaxSupportedDeviceCount() {
        return null;
    }

    public void setMaxSupportedDeviceCount(Integer n) {
    }

    public Integer getCurrentFpvIndex() {
        return null;
    }

    public void setCurrentFpvIndex(Integer n) {
    }

    public Integer getPairedDeviceCount() {
        return null;
    }

    public void setPairedDeviceCount(Integer n) {
    }

    public Integer getReserved() {
        return null;
    }

    public void setReserved(Integer n) {
    }

    public List<MGMultiDevicesConnectStatusInfo> getMultiDevicesConnectStatus() {
        return null;
    }

    public void setMultiDevicesConnectStatus(List<MGMultiDevicesConnectStatusInfo> list) {
    }

    public String toString() {
        return null;
    }
}

