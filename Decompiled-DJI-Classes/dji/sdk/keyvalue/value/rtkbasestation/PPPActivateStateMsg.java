/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.rtkbasestation.CaliSatelliteSignal;
import dji.sdk.keyvalue.value.rtkbasestation.SatelliteSignal;
import org.json.JSONObject;

public class PPPActivateStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Long startTime;
    Long expirationTime;
    Long sdkSerialNumber;
    SatelliteSignal signalLevel;
    CaliSatelliteSignal caliSignalLevel;

    public PPPActivateStateMsg() {
    }

    public PPPActivateStateMsg(Long l2, Long l3, Long l4, SatelliteSignal satelliteSignal, CaliSatelliteSignal caliSatelliteSignal) {
    }

    public static PPPActivateStateMsg fromJson(String string) {
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

    public Long getStartTime() {
        return null;
    }

    public void setStartTime(Long l2) {
    }

    public Long getExpirationTime() {
        return null;
    }

    public void setExpirationTime(Long l2) {
    }

    public Long getSdkSerialNumber() {
        return null;
    }

    public void setSdkSerialNumber(Long l2) {
    }

    public SatelliteSignal getSignalLevel() {
        return null;
    }

    public void setSignalLevel(SatelliteSignal satelliteSignal) {
    }

    public CaliSatelliteSignal getCaliSignalLevel() {
        return null;
    }

    public void setCaliSignalLevel(CaliSatelliteSignal caliSatelliteSignal) {
    }

    public String toString() {
        return null;
    }
}

