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

public class FlyingOnShipHomePointMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Long timestamp;
    Double latitude;
    Double longitude;
    Double altitude;
    Double horizontal_speed;
    Double hacc;
    Double hdop;
    Integer satnum;

    public FlyingOnShipHomePointMsg() {
    }

    public FlyingOnShipHomePointMsg(Long l2, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, Integer n) {
    }

    public static FlyingOnShipHomePointMsg fromJson(String string) {
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

    public Long getTimestamp() {
        return null;
    }

    public void setTimestamp(Long l2) {
    }

    public Double getLatitude() {
        return null;
    }

    public void setLatitude(Double d2) {
    }

    public Double getLongitude() {
        return null;
    }

    public void setLongitude(Double d2) {
    }

    public Double getAltitude() {
        return null;
    }

    public void setAltitude(Double d2) {
    }

    public Double getHorizontal_speed() {
        return null;
    }

    public void setHorizontal_speed(Double d2) {
    }

    public Double getHacc() {
        return null;
    }

    public void setHacc(Double d2) {
    }

    public Double getHdop() {
        return null;
    }

    public void setHdop(Double d2) {
    }

    public Integer getSatnum() {
        return null;
    }

    public void setSatnum(Integer n) {
    }

    public String toString() {
        return null;
    }
}

