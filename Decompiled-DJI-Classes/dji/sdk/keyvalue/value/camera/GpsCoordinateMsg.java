/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class GpsCoordinateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double longitude;
    Double latitude;
    Integer altitude;

    public GpsCoordinateMsg() {
    }

    public GpsCoordinateMsg(Double d2, Double d3, Integer n) {
    }

    public static GpsCoordinateMsg fromJson(String string) {
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

    public Integer getAltitude() {
        return null;
    }

    public void setAltitude(Integer n) {
    }

    public String toString() {
        return null;
    }
}

