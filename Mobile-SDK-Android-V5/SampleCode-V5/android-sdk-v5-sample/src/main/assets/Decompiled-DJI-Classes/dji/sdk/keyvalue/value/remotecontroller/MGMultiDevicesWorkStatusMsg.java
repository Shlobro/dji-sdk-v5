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
import dji.sdk.keyvalue.value.remotecontroller.MGMultiDevicesWorkModeType;
import org.json.JSONObject;

public class MGMultiDevicesWorkStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MGMultiDevicesWorkModeType mode;
    Integer index;
    MGMultiDevicesConnectState status;
    Integer fpvFlag;
    Integer reserved;

    public MGMultiDevicesWorkStatusMsg() {
    }

    public MGMultiDevicesWorkStatusMsg(MGMultiDevicesWorkModeType mGMultiDevicesWorkModeType, Integer n, MGMultiDevicesConnectState mGMultiDevicesConnectState, Integer n2, Integer n3) {
    }

    public static MGMultiDevicesWorkStatusMsg fromJson(String string) {
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

    public Integer getFpvFlag() {
        return null;
    }

    public void setFpvFlag(Integer n) {
    }

    public Integer getReserved() {
        return null;
    }

    public void setReserved(Integer n) {
    }

    public String toString() {
        return null;
    }
}

