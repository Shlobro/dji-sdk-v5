/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.rtkmobilestation;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.rtkmobilestation.RTKPositioningSolution;
import org.json.JSONObject;

public class RTKLocation
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LocationCoordinate3D baseStationLocation;
    RTKPositioningSolution positioningSolution;
    LocationCoordinate3D mobileStationLocation;
    Double stdLatitude;
    Double stdLongitude;
    Double stdAltitude;

    public RTKLocation() {
    }

    public RTKLocation(LocationCoordinate3D locationCoordinate3D, RTKPositioningSolution rTKPositioningSolution, LocationCoordinate3D locationCoordinate3D2, Double d2, Double d3, Double d4) {
    }

    public static RTKLocation fromJson(String string) {
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

    public LocationCoordinate3D getBaseStationLocation() {
        return null;
    }

    public void setBaseStationLocation(LocationCoordinate3D locationCoordinate3D) {
    }

    public RTKPositioningSolution getPositioningSolution() {
        return null;
    }

    public void setPositioningSolution(RTKPositioningSolution rTKPositioningSolution) {
    }

    public LocationCoordinate3D getMobileStationLocation() {
        return null;
    }

    public void setMobileStationLocation(LocationCoordinate3D locationCoordinate3D) {
    }

    public Double getStdLatitude() {
        return null;
    }

    public void setStdLatitude(Double d2) {
    }

    public Double getStdLongitude() {
        return null;
    }

    public void setStdLongitude(Double d2) {
    }

    public Double getStdAltitude() {
        return null;
    }

    public void setStdAltitude(Double d2) {
    }

    public String toString() {
        return null;
    }
}

