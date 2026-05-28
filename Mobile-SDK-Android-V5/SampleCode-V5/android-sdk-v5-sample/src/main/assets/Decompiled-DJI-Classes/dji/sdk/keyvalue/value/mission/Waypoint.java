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
import dji.sdk.keyvalue.value.mission.MissionBreakPointcameraActionType;
import dji.sdk.keyvalue.value.mission.WaypointAction;
import dji.sdk.keyvalue.value.mission.WaypointTurnMode;
import java.util.List;
import org.json.JSONObject;

public class Waypoint
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer pointType;
    LocationCoordinate2D location;
    Double altitude;
    WaypointTurnMode turnMode;
    Integer heading;
    Double gimbalPitch;
    Integer actionRepeatTimes;
    MissionBreakPointcameraActionType cameraActionType;
    Integer actionTimeoutInSeconds;
    Double cornerRadiusInMeters;
    Double speed;
    Double shootPhotoTimeInterval;
    Double shootPhotoDistanceInterval;
    List<WaypointAction> waypointActions;

    public Waypoint() {
    }

    public Waypoint(Integer n, LocationCoordinate2D locationCoordinate2D, Double d2, WaypointTurnMode waypointTurnMode, Integer n2, Double d3, Integer n3, MissionBreakPointcameraActionType missionBreakPointcameraActionType, Integer n4, Double d4, Double d5, Double d6, Double d7, List<WaypointAction> list) {
    }

    public static Waypoint fromJson(String string) {
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

    public Integer getPointType() {
        return null;
    }

    public void setPointType(Integer n) {
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

    public WaypointTurnMode getTurnMode() {
        return null;
    }

    public void setTurnMode(WaypointTurnMode waypointTurnMode) {
    }

    public Integer getHeading() {
        return null;
    }

    public void setHeading(Integer n) {
    }

    public Double getGimbalPitch() {
        return null;
    }

    public void setGimbalPitch(Double d2) {
    }

    public Integer getActionRepeatTimes() {
        return null;
    }

    public void setActionRepeatTimes(Integer n) {
    }

    public MissionBreakPointcameraActionType getCameraActionType() {
        return null;
    }

    public void setCameraActionType(MissionBreakPointcameraActionType missionBreakPointcameraActionType) {
    }

    public Integer getActionTimeoutInSeconds() {
        return null;
    }

    public void setActionTimeoutInSeconds(Integer n) {
    }

    public Double getCornerRadiusInMeters() {
        return null;
    }

    public void setCornerRadiusInMeters(Double d2) {
    }

    public Double getSpeed() {
        return null;
    }

    public void setSpeed(Double d2) {
    }

    public Double getShootPhotoTimeInterval() {
        return null;
    }

    public void setShootPhotoTimeInterval(Double d2) {
    }

    public Double getShootPhotoDistanceInterval() {
        return null;
    }

    public void setShootPhotoDistanceInterval(Double d2) {
    }

    public List<WaypointAction> getWaypointActions() {
        return null;
    }

    public void setWaypointActions(List<WaypointAction> list) {
    }

    public String toString() {
        return null;
    }
}

