/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.LocationCoordinate2D;
import dji.sdk.keyvalue.value.remotecontroller.RcGPSTime;
import org.json.JSONObject;

public class RcGPSInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RcGPSTime time;
    LocationCoordinate2D location;
    Double eastSpeed;
    Double northSpeed;
    Integer satelliteCount;
    Double accuracy;
    Boolean isValid;

    public RcGPSInfo() {
    }

    public RcGPSInfo(RcGPSTime rcGPSTime, LocationCoordinate2D locationCoordinate2D, Double d2, Double d3, Integer n, Double d4, Boolean bl) {
    }

    public static RcGPSInfo fromJson(String string) {
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

    public RcGPSTime getTime() {
        return null;
    }

    public void setTime(RcGPSTime rcGPSTime) {
    }

    public LocationCoordinate2D getLocation() {
        return null;
    }

    public void setLocation(LocationCoordinate2D locationCoordinate2D) {
    }

    public Double getEastSpeed() {
        return null;
    }

    public void setEastSpeed(Double d2) {
    }

    public Double getNorthSpeed() {
        return null;
    }

    public void setNorthSpeed(Double d2) {
    }

    public Integer getSatelliteCount() {
        return null;
    }

    public void setSatelliteCount(Integer n) {
    }

    public Double getAccuracy() {
        return null;
    }

    public void setAccuracy(Double d2) {
    }

    public Boolean getIsValid() {
        return null;
    }

    public void setIsValid(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

