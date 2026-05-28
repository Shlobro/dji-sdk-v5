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
import dji.sdk.keyvalue.value.flightcontroller.CompassSensorState;
import org.json.JSONObject;

public class CompassState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer index;
    CompassSensorState compassSensorState;
    Integer compassSensorValue;

    public CompassState() {
    }

    public CompassState(Integer n, CompassSensorState compassSensorState, Integer n2) {
    }

    public static CompassState fromJson(String string) {
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

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public CompassSensorState getCompassSensorState() {
        return null;
    }

    public void setCompassSensorState(CompassSensorState compassSensorState) {
    }

    public Integer getCompassSensorValue() {
        return null;
    }

    public void setCompassSensorValue(Integer n) {
    }

    public String toString() {
        return null;
    }
}

