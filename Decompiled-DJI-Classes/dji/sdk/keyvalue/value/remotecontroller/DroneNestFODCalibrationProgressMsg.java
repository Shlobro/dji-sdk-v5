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
import dji.sdk.keyvalue.value.remotecontroller.DroneNestCommonErrorCode;
import dji.sdk.keyvalue.value.remotecontroller.FODCalibrationStep;
import dji.sdk.keyvalue.value.remotecontroller.FODCalibrationSubStep;
import org.json.JSONObject;

public class DroneNestFODCalibrationProgressMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FODCalibrationStep step;
    DroneNestCommonErrorCode errCode;
    Integer precent;
    FODCalibrationSubStep subStep;

    public DroneNestFODCalibrationProgressMsg() {
    }

    public DroneNestFODCalibrationProgressMsg(FODCalibrationStep fODCalibrationStep, DroneNestCommonErrorCode droneNestCommonErrorCode, Integer n, FODCalibrationSubStep fODCalibrationSubStep) {
    }

    public static DroneNestFODCalibrationProgressMsg fromJson(String string) {
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

    public FODCalibrationStep getStep() {
        return null;
    }

    public void setStep(FODCalibrationStep fODCalibrationStep) {
    }

    public DroneNestCommonErrorCode getErrCode() {
        return null;
    }

    public void setErrCode(DroneNestCommonErrorCode droneNestCommonErrorCode) {
    }

    public Integer getPrecent() {
        return null;
    }

    public void setPrecent(Integer n) {
    }

    public FODCalibrationSubStep getSubStep() {
        return null;
    }

    public void setSubStep(FODCalibrationSubStep fODCalibrationSubStep) {
    }

    public String toString() {
        return null;
    }
}

