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
import dji.sdk.keyvalue.value.flightcontroller.CalibrateStatus;
import org.json.JSONObject;

public class SowerRotmotorCalibrateProgressMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CalibrateStatus status;
    Integer percent;

    public SowerRotmotorCalibrateProgressMsg() {
    }

    public SowerRotmotorCalibrateProgressMsg(CalibrateStatus calibrateStatus, Integer n) {
    }

    public static SowerRotmotorCalibrateProgressMsg fromJson(String string) {
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

    public CalibrateStatus getStatus() {
        return null;
    }

    public void setStatus(CalibrateStatus calibrateStatus) {
    }

    public Integer getPercent() {
        return null;
    }

    public void setPercent(Integer n) {
    }

    public String toString() {
        return null;
    }
}

