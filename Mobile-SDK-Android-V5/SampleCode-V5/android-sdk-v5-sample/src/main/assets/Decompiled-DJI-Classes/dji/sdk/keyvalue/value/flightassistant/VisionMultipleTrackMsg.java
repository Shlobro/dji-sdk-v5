/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightassistant.NavigationTrackingMode;
import dji.sdk.keyvalue.value.flightassistant.VisionMultipleTrackException;
import dji.sdk.keyvalue.value.flightassistant.VisionMultipleTrackState;
import org.json.JSONObject;

public class VisionMultipleTrackMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    VisionMultipleTrackState state;
    Integer detectNum;
    Integer trackingState;
    NavigationTrackingMode trackMode;
    Integer maxSpeed;
    Integer maxThresholdSpeed;
    VisionMultipleTrackException exception;
    Boolean isGPSAssistant;
    Integer take_ctrl_error;
    Boolean isHighSpeedTrackingOn;

    public VisionMultipleTrackMsg() {
    }

    public VisionMultipleTrackMsg(VisionMultipleTrackState visionMultipleTrackState, Integer n, Integer n2, NavigationTrackingMode navigationTrackingMode, Integer n3, Integer n4, VisionMultipleTrackException visionMultipleTrackException, Boolean bl, Integer n5, Boolean bl2) {
    }

    public static VisionMultipleTrackMsg fromJson(String string) {
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

    public VisionMultipleTrackState getState() {
        return null;
    }

    public void setState(VisionMultipleTrackState visionMultipleTrackState) {
    }

    public Integer getDetectNum() {
        return null;
    }

    public void setDetectNum(Integer n) {
    }

    public Integer getTrackingState() {
        return null;
    }

    public void setTrackingState(Integer n) {
    }

    public NavigationTrackingMode getTrackMode() {
        return null;
    }

    public void setTrackMode(NavigationTrackingMode navigationTrackingMode) {
    }

    public Integer getMaxSpeed() {
        return null;
    }

    public void setMaxSpeed(Integer n) {
    }

    public Integer getMaxThresholdSpeed() {
        return null;
    }

    public void setMaxThresholdSpeed(Integer n) {
    }

    public VisionMultipleTrackException getException() {
        return null;
    }

    public void setException(VisionMultipleTrackException visionMultipleTrackException) {
    }

    public Boolean getIsGPSAssistant() {
        return null;
    }

    public void setIsGPSAssistant(Boolean bl) {
    }

    public Integer getTake_ctrl_error() {
        return null;
    }

    public void setTake_ctrl_error(Integer n) {
    }

    public Boolean getIsHighSpeedTrackingOn() {
        return null;
    }

    public void setIsHighSpeedTrackingOn(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

