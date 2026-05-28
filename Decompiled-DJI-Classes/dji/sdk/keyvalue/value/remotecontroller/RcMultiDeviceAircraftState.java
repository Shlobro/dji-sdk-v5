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
import dji.sdk.keyvalue.value.remotecontroller.RcMultiDeviceBsAircraftState;
import dji.sdk.keyvalue.value.remotecontroller.RcMutilDeviceState;
import java.util.List;
import org.json.JSONObject;

public class RcMultiDeviceAircraftState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer rcIndex;
    Boolean useBs;
    RcMutilDeviceState sdrConnectState;
    RcMutilDeviceState lteConnectState;
    Integer bsSignal;
    Integer bsLostState;
    Integer target;
    Integer advTarget;
    List<RcMultiDeviceBsAircraftState> aircraftStates;

    public RcMultiDeviceAircraftState() {
    }

    public RcMultiDeviceAircraftState(Integer n, Boolean bl, RcMutilDeviceState rcMutilDeviceState, RcMutilDeviceState rcMutilDeviceState2, Integer n2, Integer n3, Integer n4, Integer n5, List<RcMultiDeviceBsAircraftState> list) {
    }

    public static RcMultiDeviceAircraftState fromJson(String string) {
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

    public Integer getRcIndex() {
        return null;
    }

    public void setRcIndex(Integer n) {
    }

    public Boolean getUseBs() {
        return null;
    }

    public void setUseBs(Boolean bl) {
    }

    public RcMutilDeviceState getSdrConnectState() {
        return null;
    }

    public void setSdrConnectState(RcMutilDeviceState rcMutilDeviceState) {
    }

    public RcMutilDeviceState getLteConnectState() {
        return null;
    }

    public void setLteConnectState(RcMutilDeviceState rcMutilDeviceState) {
    }

    public Integer getBsSignal() {
        return null;
    }

    public void setBsSignal(Integer n) {
    }

    public Integer getBsLostState() {
        return null;
    }

    public void setBsLostState(Integer n) {
    }

    public Integer getTarget() {
        return null;
    }

    public void setTarget(Integer n) {
    }

    public Integer getAdvTarget() {
        return null;
    }

    public void setAdvTarget(Integer n) {
    }

    public List<RcMultiDeviceBsAircraftState> getAircraftStates() {
        return null;
    }

    public void setAircraftStates(List<RcMultiDeviceBsAircraftState> list) {
    }

    public String toString() {
        return null;
    }
}

