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
import org.json.JSONObject;

public class FCCheckStatus
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean advancedIMUCalibrationNeeded;
    Boolean basicIMUCalibrationNeeded;
    Boolean horizontalIMUCalibrateNeeded;
    Boolean calibrteVersionMatch;
    Boolean iMUDirectionParamError;
    Boolean iMUInitError;
    Boolean barometerInitError;
    Boolean accelarateDataError;
    Boolean gyroscopeError;
    Boolean barometerError;
    Boolean attitudeTiltTooMuch;
    Boolean iMUDataError;
    Boolean dataRecoderError;
    Boolean advanceCalibrationNotFinished;
    Boolean basicCalibrationNotFinished;
    Boolean inSDCardMode;

    public FCCheckStatus() {
    }

    public FCCheckStatus(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, Boolean bl7, Boolean bl8, Boolean bl9, Boolean bl10, Boolean bl11, Boolean bl12, Boolean bl13, Boolean bl14, Boolean bl15, Boolean bl16) {
    }

    public static FCCheckStatus fromJson(String string) {
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

    public Boolean getAdvancedIMUCalibrationNeeded() {
        return null;
    }

    public void setAdvancedIMUCalibrationNeeded(Boolean bl) {
    }

    public Boolean getBasicIMUCalibrationNeeded() {
        return null;
    }

    public void setBasicIMUCalibrationNeeded(Boolean bl) {
    }

    public Boolean getHorizontalIMUCalibrateNeeded() {
        return null;
    }

    public void setHorizontalIMUCalibrateNeeded(Boolean bl) {
    }

    public Boolean getCalibrteVersionMatch() {
        return null;
    }

    public void setCalibrteVersionMatch(Boolean bl) {
    }

    public Boolean getIMUDirectionParamError() {
        return null;
    }

    public void setIMUDirectionParamError(Boolean bl) {
    }

    public Boolean getIMUInitError() {
        return null;
    }

    public void setIMUInitError(Boolean bl) {
    }

    public Boolean getBarometerInitError() {
        return null;
    }

    public void setBarometerInitError(Boolean bl) {
    }

    public Boolean getAccelarateDataError() {
        return null;
    }

    public void setAccelarateDataError(Boolean bl) {
    }

    public Boolean getGyroscopeError() {
        return null;
    }

    public void setGyroscopeError(Boolean bl) {
    }

    public Boolean getBarometerError() {
        return null;
    }

    public void setBarometerError(Boolean bl) {
    }

    public Boolean getAttitudeTiltTooMuch() {
        return null;
    }

    public void setAttitudeTiltTooMuch(Boolean bl) {
    }

    public Boolean getIMUDataError() {
        return null;
    }

    public void setIMUDataError(Boolean bl) {
    }

    public Boolean getDataRecoderError() {
        return null;
    }

    public void setDataRecoderError(Boolean bl) {
    }

    public Boolean getAdvanceCalibrationNotFinished() {
        return null;
    }

    public void setAdvanceCalibrationNotFinished(Boolean bl) {
    }

    public Boolean getBasicCalibrationNotFinished() {
        return null;
    }

    public void setBasicCalibrationNotFinished(Boolean bl) {
    }

    public Boolean getInSDCardMode() {
        return null;
    }

    public void setInSDCardMode(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

