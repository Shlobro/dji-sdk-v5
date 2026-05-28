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
import dji.sdk.keyvalue.value.flightcontroller.LLGCalibrationErrorCode;
import org.json.JSONObject;

public class LLGCalibrationStatusInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LLGCalibrationErrorCode error;
    CalibrateStatus status;
    Integer progress;

    public LLGCalibrationStatusInfo() {
    }

    public LLGCalibrationStatusInfo(LLGCalibrationErrorCode lLGCalibrationErrorCode, CalibrateStatus calibrateStatus, Integer n) {
    }

    public static LLGCalibrationStatusInfo fromJson(String string) {
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

    public LLGCalibrationErrorCode getError() {
        return null;
    }

    public void setError(LLGCalibrationErrorCode lLGCalibrationErrorCode) {
    }

    public CalibrateStatus getStatus() {
        return null;
    }

    public void setStatus(CalibrateStatus calibrateStatus) {
    }

    public Integer getProgress() {
        return null;
    }

    public void setProgress(Integer n) {
    }

    public String toString() {
        return null;
    }
}

