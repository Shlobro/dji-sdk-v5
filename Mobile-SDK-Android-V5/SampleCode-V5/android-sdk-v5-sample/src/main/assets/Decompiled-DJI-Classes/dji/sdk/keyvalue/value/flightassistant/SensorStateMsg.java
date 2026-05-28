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
import dji.sdk.keyvalue.value.flightassistant.SensorState;
import dji.sdk.keyvalue.value.flightassistant.SensorType;
import org.json.JSONObject;

public class SensorStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    SensorType type;
    SensorState downStatus;
    SensorState frontStatus;
    SensorState backStatus;
    SensorState rightStatus;
    SensorState leftStatus;
    SensorState upStatus;

    public SensorStateMsg() {
    }

    public SensorStateMsg(SensorType sensorType, SensorState sensorState, SensorState sensorState2, SensorState sensorState3, SensorState sensorState4, SensorState sensorState5, SensorState sensorState6) {
    }

    public static SensorStateMsg fromJson(String string) {
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

    public SensorType getType() {
        return null;
    }

    public void setType(SensorType sensorType) {
    }

    public SensorState getDownStatus() {
        return null;
    }

    public void setDownStatus(SensorState sensorState) {
    }

    public SensorState getFrontStatus() {
        return null;
    }

    public void setFrontStatus(SensorState sensorState) {
    }

    public SensorState getBackStatus() {
        return null;
    }

    public void setBackStatus(SensorState sensorState) {
    }

    public SensorState getRightStatus() {
        return null;
    }

    public void setRightStatus(SensorState sensorState) {
    }

    public SensorState getLeftStatus() {
        return null;
    }

    public void setLeftStatus(SensorState sensorState) {
    }

    public SensorState getUpStatus() {
        return null;
    }

    public void setUpStatus(SensorState sensorState) {
    }

    public String toString() {
        return null;
    }
}

