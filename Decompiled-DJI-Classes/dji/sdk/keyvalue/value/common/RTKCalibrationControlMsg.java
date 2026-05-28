/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.rtkbasestation.RTKCalibrationControlType;
import dji.sdk.keyvalue.value.rtkbasestation.RTKDeviceType;
import org.json.JSONObject;

public class RTKCalibrationControlMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RTKDeviceType target;
    RTKCalibrationControlType value;
    Integer accuracy;

    public RTKCalibrationControlMsg() {
    }

    public RTKCalibrationControlMsg(RTKDeviceType rTKDeviceType, RTKCalibrationControlType rTKCalibrationControlType, Integer n) {
    }

    public static RTKCalibrationControlMsg fromJson(String string) {
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

    public RTKDeviceType getTarget() {
        return null;
    }

    public void setTarget(RTKDeviceType rTKDeviceType) {
    }

    public RTKCalibrationControlType getValue() {
        return null;
    }

    public void setValue(RTKCalibrationControlType rTKCalibrationControlType) {
    }

    public Integer getAccuracy() {
        return null;
    }

    public void setAccuracy(Integer n) {
    }

    public String toString() {
        return null;
    }
}

