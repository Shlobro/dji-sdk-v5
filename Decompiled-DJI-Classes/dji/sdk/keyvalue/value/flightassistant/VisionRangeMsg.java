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
import dji.sdk.keyvalue.value.flightassistant.VisionRangeException;
import org.json.JSONObject;

public class VisionRangeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double longitude;
    Double latitude;
    Double altitude;
    Integer distance;
    VisionRangeException exception;

    public VisionRangeMsg() {
    }

    public VisionRangeMsg(Double d2, Double d3, Double d4, Integer n, VisionRangeException visionRangeException) {
    }

    public static VisionRangeMsg fromJson(String string) {
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

    public Double getLongitude() {
        return null;
    }

    public void setLongitude(Double d2) {
    }

    public Double getLatitude() {
        return null;
    }

    public void setLatitude(Double d2) {
    }

    public Double getAltitude() {
        return null;
    }

    public void setAltitude(Double d2) {
    }

    public Integer getDistance() {
        return null;
    }

    public void setDistance(Integer n) {
    }

    public VisionRangeException getException() {
        return null;
    }

    public void setException(VisionRangeException visionRangeException) {
    }

    public String toString() {
        return null;
    }
}

