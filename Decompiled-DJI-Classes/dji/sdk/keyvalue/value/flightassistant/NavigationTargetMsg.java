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
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.flightassistant.SmartTrackSubMode;
import org.json.JSONObject;

public class NavigationTargetMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    SmartTrackSubMode subMode;
    LocationCoordinate3D location3D;
    Integer camPosition;

    public NavigationTargetMsg() {
    }

    public NavigationTargetMsg(SmartTrackSubMode smartTrackSubMode, LocationCoordinate3D locationCoordinate3D, Integer n) {
    }

    public static NavigationTargetMsg fromJson(String string) {
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

    public SmartTrackSubMode getSubMode() {
        return null;
    }

    public void setSubMode(SmartTrackSubMode smartTrackSubMode) {
    }

    public LocationCoordinate3D getLocation3D() {
        return null;
    }

    public void setLocation3D(LocationCoordinate3D locationCoordinate3D) {
    }

    public Integer getCamPosition() {
        return null;
    }

    public void setCamPosition(Integer n) {
    }

    public String toString() {
        return null;
    }
}

