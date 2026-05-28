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
import dji.sdk.keyvalue.value.flightcontroller.FlightRecordFileState;
import org.json.JSONObject;

public class FlightRecordFileInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FlightRecordFileState state;
    String path;

    public FlightRecordFileInfo() {
    }

    public FlightRecordFileInfo(FlightRecordFileState flightRecordFileState, String string) {
    }

    public static FlightRecordFileInfo fromJson(String string) {
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

    public FlightRecordFileState getState() {
        return null;
    }

    public void setState(FlightRecordFileState flightRecordFileState) {
    }

    public String getPath() {
        return null;
    }

    public void setPath(String string) {
    }

    public String toString() {
        return null;
    }
}

