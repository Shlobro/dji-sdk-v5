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
import dji.sdk.keyvalue.value.flightcontroller.EmergencyBrakeDirection;
import dji.sdk.keyvalue.value.flightcontroller.EmergencyBrakeEndReason;
import org.json.JSONObject;

public class HorizontalMovingFailedEventMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    EmergencyBrakeEndReason reason;
    EmergencyBrakeDirection direction;

    public HorizontalMovingFailedEventMsg() {
    }

    public HorizontalMovingFailedEventMsg(EmergencyBrakeEndReason emergencyBrakeEndReason, EmergencyBrakeDirection emergencyBrakeDirection) {
    }

    public static HorizontalMovingFailedEventMsg fromJson(String string) {
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

    public EmergencyBrakeEndReason getReason() {
        return null;
    }

    public void setReason(EmergencyBrakeEndReason emergencyBrakeEndReason) {
    }

    public EmergencyBrakeDirection getDirection() {
        return null;
    }

    public void setDirection(EmergencyBrakeDirection emergencyBrakeDirection) {
    }

    public String toString() {
        return null;
    }
}

