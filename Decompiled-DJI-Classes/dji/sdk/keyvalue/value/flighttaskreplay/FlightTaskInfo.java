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
import org.json.JSONObject;

public class FlightTaskInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String flightId;
    String waylineId;

    public FlightTaskInfo() {
    }

    public FlightTaskInfo(String string, String string2) {
    }

    public static FlightTaskInfo fromJson(String string) {
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

    public String getFlightId() {
        return null;
    }

    public void setFlightId(String string) {
    }

    public String getWaylineId() {
        return null;
    }

    public void setWaylineId(String string) {
    }

    public String toString() {
        return null;
    }
}

