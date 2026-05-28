/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flighttaskreplay;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flighttaskreplay.FlightTaskRecordState;
import org.json.JSONObject;

public class FlightTaskRecordFileMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FlightTaskRecordState state;
    String file_path;
    String flight_id;

    public FlightTaskRecordFileMsg() {
    }

    public FlightTaskRecordFileMsg(FlightTaskRecordState flightTaskRecordState, String string, String string2) {
    }

    public static FlightTaskRecordFileMsg fromJson(String string) {
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

    public FlightTaskRecordState getState() {
        return null;
    }

    public void setState(FlightTaskRecordState flightTaskRecordState) {
    }

    public String getFile_path() {
        return null;
    }

    public void setFile_path(String string) {
    }

    public String getFlight_id() {
        return null;
    }

    public void setFlight_id(String string) {
    }

    public String toString() {
        return null;
    }
}

