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

public class GimbalExceptionFlags
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean handleFree;
    Boolean motorProtect;
    Boolean recenterErrInStartUp;
    Boolean sleepStatus;
    Boolean stuck;
    Boolean motorLowTemperature;
    Boolean motorHighTemperature;
    Boolean cellPhoneNotOnGimbal;
    Boolean gimbalNotSteady;
    Boolean isPhoneLossen;

    public GimbalExceptionFlags() {
    }

    public GimbalExceptionFlags(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, Boolean bl7, Boolean bl8, Boolean bl9, Boolean bl10) {
    }

    public static GimbalExceptionFlags fromJson(String string) {
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

    public Boolean getHandleFree() {
        return null;
    }

    public void setHandleFree(Boolean bl) {
    }

    public Boolean getMotorProtect() {
        return null;
    }

    public void setMotorProtect(Boolean bl) {
    }

    public Boolean getRecenterErrInStartUp() {
        return null;
    }

    public void setRecenterErrInStartUp(Boolean bl) {
    }

    public Boolean getSleepStatus() {
        return null;
    }

    public void setSleepStatus(Boolean bl) {
    }

    public Boolean getStuck() {
        return null;
    }

    public void setStuck(Boolean bl) {
    }

    public Boolean getMotorLowTemperature() {
        return null;
    }

    public void setMotorLowTemperature(Boolean bl) {
    }

    public Boolean getMotorHighTemperature() {
        return null;
    }

    public void setMotorHighTemperature(Boolean bl) {
    }

    public Boolean getCellPhoneNotOnGimbal() {
        return null;
    }

    public void setCellPhoneNotOnGimbal(Boolean bl) {
    }

    public Boolean getGimbalNotSteady() {
        return null;
    }

    public void setGimbalNotSteady(Boolean bl) {
    }

    public Boolean getIsPhoneLossen() {
        return null;
    }

    public void setIsPhoneLossen(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

