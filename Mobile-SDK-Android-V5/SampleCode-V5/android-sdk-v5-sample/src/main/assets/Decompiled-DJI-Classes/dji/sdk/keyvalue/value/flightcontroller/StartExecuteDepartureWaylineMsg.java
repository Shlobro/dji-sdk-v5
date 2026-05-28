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
import org.json.JSONObject;

public class StartExecuteDepartureWaylineMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String taskId;
    String departureWaylineName;

    public StartExecuteDepartureWaylineMsg() {
    }

    public StartExecuteDepartureWaylineMsg(String string, String string2) {
    }

    public static StartExecuteDepartureWaylineMsg fromJson(String string) {
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

    public String getTaskId() {
        return null;
    }

    public void setTaskId(String string) {
    }

    public String getDepartureWaylineName() {
        return null;
    }

    public void setDepartureWaylineName(String string) {
    }

    public String toString() {
        return null;
    }
}

