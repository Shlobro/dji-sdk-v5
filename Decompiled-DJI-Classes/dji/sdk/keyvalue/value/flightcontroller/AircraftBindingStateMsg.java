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
import dji.sdk.keyvalue.value.flightcontroller.AircraftBindingState;
import org.json.JSONObject;

public class AircraftBindingStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    AircraftBindingState status;
    String phoneNumber;

    public AircraftBindingStateMsg() {
    }

    public AircraftBindingStateMsg(AircraftBindingState aircraftBindingState, String string) {
    }

    public static AircraftBindingStateMsg fromJson(String string) {
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

    public AircraftBindingState getStatus() {
        return null;
    }

    public void setStatus(AircraftBindingState aircraftBindingState) {
    }

    public String getPhoneNumber() {
        return null;
    }

    public void setPhoneNumber(String string) {
    }

    public String toString() {
        return null;
    }
}

