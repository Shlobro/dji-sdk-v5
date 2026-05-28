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
import dji.sdk.keyvalue.value.remotecontroller.RcMutilDeviceState;
import org.json.JSONObject;

public class RcMultiDeviceBsAircraftState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer index;
    RcMutilDeviceState lteConnectState;
    RcMutilDeviceState sdrConnectState;
    Integer drone_signal;

    public RcMultiDeviceBsAircraftState() {
    }

    public RcMultiDeviceBsAircraftState(Integer n, RcMutilDeviceState rcMutilDeviceState, RcMutilDeviceState rcMutilDeviceState2, Integer n2) {
    }

    public static RcMultiDeviceBsAircraftState fromJson(String string) {
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

    public RcMutilDeviceState getLteConnectState() {
        return null;
    }

    public void setLteConnectState(RcMutilDeviceState rcMutilDeviceState) {
    }

    public RcMutilDeviceState getSdrConnectState() {
        return null;
    }

    public void setSdrConnectState(RcMutilDeviceState rcMutilDeviceState) {
    }

    public Integer getDrone_signal() {
        return null;
    }

    public void setDrone_signal(Integer n) {
    }

    public String toString() {
        return null;
    }
}

