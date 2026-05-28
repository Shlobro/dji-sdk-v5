/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.LocationCoordinate2D;
import dji.sdk.keyvalue.value.mission.WaypointTurnMode;
import dji.sdk.keyvalue.value.mission.WaypointV2Type;
import dji.sdk.keyvalue.value.mission.WaypointV2YawMode;
import org.json.JSONObject;

public class WaypointV2
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LocationCoordinate2D location;
    Double altitude;
    WaypointV2Type type;
    Double dampingDistance;
    WaypointV2YawMode yawMode;
    Double yawTurnAngle;
    WaypointTurnMode yawTurnMode;
    LocationCoordinate2D poiLocation;
    Double poiAltitude;
    Long localCruiseSpeed;
    Long localMaxSpeed;

    public WaypointV2() {
    }

    public WaypointV2(LocationCoordinate2D locationCoordinate2D, Double d2, WaypointV2Type waypointV2Type, Double d3, WaypointV2YawMode waypointV2YawMode, Double d4, WaypointTurnMode waypointTurnMode, LocationCoordinate2D locationCoordinate2D2, Double d5, Long l2, Long l3) {
    }

    public static WaypointV2 fromJson(String string) {
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

    public LocationCoordinate2D getLocation() {
        return null;
    }

    public void setLocation(LocationCoordinate2D locationCoordinate2D) {
    }

    public Double getAltitude() {
        return null;
    }

    public void setAltitude(Double d2) {
    }

    public WaypointV2Type getType() {
        return null;
    }

    public void setType(WaypointV2Type waypointV2Type) {
    }

    public Double getDampingDistance() {
        return null;
    }

    public void setDampingDistance(Double d2) {
    }

    public WaypointV2YawMode getYawMode() {
        return null;
    }

    public void setYawMode(WaypointV2YawMode waypointV2YawMode) {
    }

    public Double getYawTurnAngle() {
        return null;
    }

    public void setYawTurnAngle(Double d2) {
    }

    public WaypointTurnMode getYawTurnMode() {
        return null;
    }

    public void setYawTurnMode(WaypointTurnMode waypointTurnMode) {
    }

    public LocationCoordinate2D getPoiLocation() {
        return null;
    }

    public void setPoiLocation(LocationCoordinate2D locationCoordinate2D) {
    }

    public Double getPoiAltitude() {
        return null;
    }

    public void setPoiAltitude(Double d2) {
    }

    public Long getLocalCruiseSpeed() {
        return null;
    }

    public void setLocalCruiseSpeed(Long l2) {
    }

    public Long getLocalMaxSpeed() {
        return null;
    }

    public void setLocalMaxSpeed(Long l2) {
    }

    public String toString() {
        return null;
    }
}

