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
import org.json.JSONObject;

public class SmartTrackVelocityInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double east;
    Double north;
    Double up;

    public SmartTrackVelocityInfo() {
    }

    public SmartTrackVelocityInfo(Double d2, Double d3, Double d4) {
    }

    public static SmartTrackVelocityInfo fromJson(String string) {
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

    public Double getEast() {
        return null;
    }

    public void setEast(Double d2) {
    }

    public Double getNorth() {
        return null;
    }

    public void setNorth(Double d2) {
    }

    public Double getUp() {
        return null;
    }

    public void setUp(Double d2) {
    }

    public String toString() {
        return null;
    }
}

