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
import dji.sdk.keyvalue.value.flightcontroller.FlightControlAdvancedParameterType;
import java.util.List;
import org.json.JSONObject;

public class FlightControlAdvancedParameterRangeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<FlightControlAdvancedParameterType> value;

    public FlightControlAdvancedParameterRangeMsg() {
    }

    public FlightControlAdvancedParameterRangeMsg(List<FlightControlAdvancedParameterType> list) {
    }

    public static FlightControlAdvancedParameterRangeMsg fromJson(String string) {
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

    public List<FlightControlAdvancedParameterType> getValue() {
        return null;
    }

    public void setValue(List<FlightControlAdvancedParameterType> list) {
    }

    public String toString() {
        return null;
    }
}

