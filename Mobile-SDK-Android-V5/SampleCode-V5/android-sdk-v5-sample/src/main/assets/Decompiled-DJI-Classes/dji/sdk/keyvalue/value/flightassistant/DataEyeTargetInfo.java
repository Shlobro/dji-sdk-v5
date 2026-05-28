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
import dji.sdk.keyvalue.value.common.DoubleRect;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.flightassistant.SmartTrackTargetMode;
import dji.sdk.keyvalue.value.flightassistant.SmartTrackVelocityInfo;
import org.json.JSONObject;

public class DataEyeTargetInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer trackId;
    SmartTrackTargetMode mode;
    Integer type;
    DoubleRect boundInfo;
    LocationCoordinate3D positionInfo;
    SmartTrackVelocityInfo velocityInfo;

    public DataEyeTargetInfo() {
    }

    public DataEyeTargetInfo(Integer n, SmartTrackTargetMode smartTrackTargetMode, Integer n2, DoubleRect doubleRect, LocationCoordinate3D locationCoordinate3D, SmartTrackVelocityInfo smartTrackVelocityInfo) {
    }

    public static DataEyeTargetInfo fromJson(String string) {
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

    public Integer getTrackId() {
        return null;
    }

    public void setTrackId(Integer n) {
    }

    public SmartTrackTargetMode getMode() {
        return null;
    }

    public void setMode(SmartTrackTargetMode smartTrackTargetMode) {
    }

    public Integer getType() {
        return null;
    }

    public void setType(Integer n) {
    }

    public DoubleRect getBoundInfo() {
        return null;
    }

    public void setBoundInfo(DoubleRect doubleRect) {
    }

    public LocationCoordinate3D getPositionInfo() {
        return null;
    }

    public void setPositionInfo(LocationCoordinate3D locationCoordinate3D) {
    }

    public SmartTrackVelocityInfo getVelocityInfo() {
        return null;
    }

    public void setVelocityInfo(SmartTrackVelocityInfo smartTrackVelocityInfo) {
    }

    public String toString() {
        return null;
    }
}

