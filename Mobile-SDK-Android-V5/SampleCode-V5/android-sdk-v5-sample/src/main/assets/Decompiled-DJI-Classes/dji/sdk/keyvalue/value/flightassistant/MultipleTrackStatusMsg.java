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
import dji.sdk.keyvalue.value.flightassistant.MultipleTrackStatusState;
import dji.sdk.keyvalue.value.flightassistant.NavigationTrackingMode;
import dji.sdk.keyvalue.value.flightassistant.TrackingExceptionCode;
import org.json.JSONObject;

public class MultipleTrackStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer detectCount;
    MultipleTrackStatusState trackingState;
    NavigationTrackingMode trackMode;
    Integer trackingMaxSpeed;
    Integer trackingThresholdSpeed;
    TrackingExceptionCode excepCode;
    Boolean isGPSAssistant;
    Integer takeCtrlError;
    Boolean isHighSpeedTrackingOn;

    public MultipleTrackStatusMsg() {
    }

    public MultipleTrackStatusMsg(Integer n, MultipleTrackStatusState multipleTrackStatusState, NavigationTrackingMode navigationTrackingMode, Integer n2, Integer n3, TrackingExceptionCode trackingExceptionCode, Boolean bl, Integer n4, Boolean bl2) {
    }

    public static MultipleTrackStatusMsg fromJson(String string) {
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

    public Integer getDetectCount() {
        return null;
    }

    public void setDetectCount(Integer n) {
    }

    public MultipleTrackStatusState getTrackingState() {
        return null;
    }

    public void setTrackingState(MultipleTrackStatusState multipleTrackStatusState) {
    }

    public NavigationTrackingMode getTrackMode() {
        return null;
    }

    public void setTrackMode(NavigationTrackingMode navigationTrackingMode) {
    }

    public Integer getTrackingMaxSpeed() {
        return null;
    }

    public void setTrackingMaxSpeed(Integer n) {
    }

    public Integer getTrackingThresholdSpeed() {
        return null;
    }

    public void setTrackingThresholdSpeed(Integer n) {
    }

    public TrackingExceptionCode getExcepCode() {
        return null;
    }

    public void setExcepCode(TrackingExceptionCode trackingExceptionCode) {
    }

    public Boolean getIsGPSAssistant() {
        return null;
    }

    public void setIsGPSAssistant(Boolean bl) {
    }

    public Integer getTakeCtrlError() {
        return null;
    }

    public void setTakeCtrlError(Integer n) {
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

