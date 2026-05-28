/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.DoubleMinMax;
import dji.sdk.keyvalue.value.common.IntMinMax;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import org.json.JSONObject;

public class PointCloudInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Long durationSeconds;
    IntMinMax reflectivityRange;
    LocationCoordinate3D originLocation;
    DoubleMinMax xRangeM;
    DoubleMinMax yRangeM;
    DoubleMinMax zRangeM;

    public PointCloudInfo() {
    }

    public PointCloudInfo(Long l2, IntMinMax intMinMax, LocationCoordinate3D locationCoordinate3D, DoubleMinMax doubleMinMax, DoubleMinMax doubleMinMax2, DoubleMinMax doubleMinMax3) {
    }

    public static PointCloudInfo fromJson(String string) {
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

    public Long getDurationSeconds() {
        return null;
    }

    public void setDurationSeconds(Long l2) {
    }

    public IntMinMax getReflectivityRange() {
        return null;
    }

    public void setReflectivityRange(IntMinMax intMinMax) {
    }

    public LocationCoordinate3D getOriginLocation() {
        return null;
    }

    public void setOriginLocation(LocationCoordinate3D locationCoordinate3D) {
    }

    public DoubleMinMax getXRangeM() {
        return null;
    }

    public void setXRangeM(DoubleMinMax doubleMinMax) {
    }

    public DoubleMinMax getYRangeM() {
        return null;
    }

    public void setYRangeM(DoubleMinMax doubleMinMax) {
    }

    public DoubleMinMax getZRangeM() {
        return null;
    }

    public void setZRangeM(DoubleMinMax doubleMinMax) {
    }

    public String toString() {
        return null;
    }
}

