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
import dji.sdk.keyvalue.value.common.LocationCoordinate2D;
import org.json.JSONObject;

public class VisionPOIStartMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LocationCoordinate2D point;
    Double radius;
    Double height;
    Double speed;

    public VisionPOIStartMsg() {
    }

    public VisionPOIStartMsg(LocationCoordinate2D locationCoordinate2D, Double d2, Double d3, Double d4) {
    }

    public static VisionPOIStartMsg fromJson(String string) {
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

    public LocationCoordinate2D getPoint() {
        return null;
    }

    public void setPoint(LocationCoordinate2D locationCoordinate2D) {
    }

    public Double getRadius() {
        return null;
    }

    public void setRadius(Double d2) {
    }

    public Double getHeight() {
        return null;
    }

    public void setHeight(Double d2) {
    }

    public Double getSpeed() {
        return null;
    }

    public void setSpeed(Double d2) {
    }

    public String toString() {
        return null;
    }
}

