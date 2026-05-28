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
import dji.sdk.keyvalue.value.flighttaskreplay.FlightTaskTriggerAction;
import org.json.JSONObject;

public class FlightTaskTriggerState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String bid;
    FlightTaskTriggerAction action;
    Long timestamp_ms;

    public FlightTaskTriggerState() {
    }

    public FlightTaskTriggerState(String string, FlightTaskTriggerAction flightTaskTriggerAction, Long l2) {
    }

    public static FlightTaskTriggerState fromJson(String string) {
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

    public String getBid() {
        return null;
    }

    public void setBid(String string) {
    }

    public FlightTaskTriggerAction getAction() {
        return null;
    }

    public void setAction(FlightTaskTriggerAction flightTaskTriggerAction) {
    }

    public Long getTimestamp_ms() {
        return null;
    }

    public void setTimestamp_ms(Long l2) {
    }

    public String toString() {
        return null;
    }
}

