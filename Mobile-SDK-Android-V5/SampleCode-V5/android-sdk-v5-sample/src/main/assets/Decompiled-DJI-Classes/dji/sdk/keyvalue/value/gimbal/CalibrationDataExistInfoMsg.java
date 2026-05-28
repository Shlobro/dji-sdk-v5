/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class CalibrationDataExistInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean motorFindLimit;
    Boolean motorRecordOffset;
    Boolean motorHallLinear;
    Boolean imuMisalignCali;
    Boolean imuTempCali;
    Boolean imuAutoCali;
    Boolean curr2HallCali;

    public CalibrationDataExistInfoMsg() {
    }

    public CalibrationDataExistInfoMsg(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, Boolean bl7) {
    }

    public static CalibrationDataExistInfoMsg fromJson(String string) {
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

    public Boolean getMotorFindLimit() {
        return null;
    }

    public void setMotorFindLimit(Boolean bl) {
    }

    public Boolean getMotorRecordOffset() {
        return null;
    }

    public void setMotorRecordOffset(Boolean bl) {
    }

    public Boolean getMotorHallLinear() {
        return null;
    }

    public void setMotorHallLinear(Boolean bl) {
    }

    public Boolean getImuMisalignCali() {
        return null;
    }

    public void setImuMisalignCali(Boolean bl) {
    }

    public Boolean getImuTempCali() {
        return null;
    }

    public void setImuTempCali(Boolean bl) {
    }

    public Boolean getImuAutoCali() {
        return null;
    }

    public void setImuAutoCali(Boolean bl) {
    }

    public Boolean getCurr2HallCali() {
        return null;
    }

    public void setCurr2HallCali(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

