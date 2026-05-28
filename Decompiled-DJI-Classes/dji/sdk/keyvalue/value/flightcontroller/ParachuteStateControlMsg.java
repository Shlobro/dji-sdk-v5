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
import dji.sdk.keyvalue.value.flightcontroller.ParachuteStateEnumDroneState;
import dji.sdk.keyvalue.value.flightcontroller.ParachuteStateEnumFire;
import dji.sdk.keyvalue.value.flightcontroller.ParachuteStateEnumMode;
import dji.sdk.keyvalue.value.flightcontroller.ParachuteStateEnumReqReason;
import org.json.JSONObject;

public class ParachuteStateControlMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ParachuteStateEnumDroneState droneState;
    ParachuteStateEnumFire fireState;
    ParachuteStateEnumMode mode;
    ParachuteStateEnumReqReason reqReason;

    public ParachuteStateControlMsg() {
    }

    public ParachuteStateControlMsg(ParachuteStateEnumDroneState parachuteStateEnumDroneState, ParachuteStateEnumFire parachuteStateEnumFire, ParachuteStateEnumMode parachuteStateEnumMode, ParachuteStateEnumReqReason parachuteStateEnumReqReason) {
    }

    public static ParachuteStateControlMsg fromJson(String string) {
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

    public ParachuteStateEnumDroneState getDroneState() {
        return null;
    }

    public void setDroneState(ParachuteStateEnumDroneState parachuteStateEnumDroneState) {
    }

    public ParachuteStateEnumFire getFireState() {
        return null;
    }

    public void setFireState(ParachuteStateEnumFire parachuteStateEnumFire) {
    }

    public ParachuteStateEnumMode getMode() {
        return null;
    }

    public void setMode(ParachuteStateEnumMode parachuteStateEnumMode) {
    }

    public ParachuteStateEnumReqReason getReqReason() {
        return null;
    }

    public void setReqReason(ParachuteStateEnumReqReason parachuteStateEnumReqReason) {
    }

    public String toString() {
        return null;
    }
}

