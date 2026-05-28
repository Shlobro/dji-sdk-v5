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

public class RcCheckStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean stickState;
    Boolean fpgaInitState;
    Boolean transmitInitState;
    Boolean batteryInitState;
    Boolean gpsInitState;
    Boolean encryptionState;
    Boolean rcResetState;
    Boolean rcPowerState;
    Boolean rcOperationTimeout;
    Boolean rcTooHot;

    public RcCheckStatusMsg() {
    }

    public RcCheckStatusMsg(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, Boolean bl7, Boolean bl8, Boolean bl9, Boolean bl10) {
    }

    public static RcCheckStatusMsg fromJson(String string) {
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

    public Boolean getStickState() {
        return null;
    }

    public void setStickState(Boolean bl) {
    }

    public Boolean getFpgaInitState() {
        return null;
    }

    public void setFpgaInitState(Boolean bl) {
    }

    public Boolean getTransmitInitState() {
        return null;
    }

    public void setTransmitInitState(Boolean bl) {
    }

    public Boolean getBatteryInitState() {
        return null;
    }

    public void setBatteryInitState(Boolean bl) {
    }

    public Boolean getGpsInitState() {
        return null;
    }

    public void setGpsInitState(Boolean bl) {
    }

    public Boolean getEncryptionState() {
        return null;
    }

    public void setEncryptionState(Boolean bl) {
    }

    public Boolean getRcResetState() {
        return null;
    }

    public void setRcResetState(Boolean bl) {
    }

    public Boolean getRcPowerState() {
        return null;
    }

    public void setRcPowerState(Boolean bl) {
    }

    public Boolean getRcOperationTimeout() {
        return null;
    }

    public void setRcOperationTimeout(Boolean bl) {
    }

    public Boolean getRcTooHot() {
        return null;
    }

    public void setRcTooHot(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

