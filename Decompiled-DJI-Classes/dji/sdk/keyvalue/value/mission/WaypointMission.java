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
import dji.sdk.keyvalue.value.mission.CameraAction;
import dji.sdk.keyvalue.value.mission.GimbalPitchMode;
import dji.sdk.keyvalue.value.mission.SubWaypointMissionType;
import dji.sdk.keyvalue.value.mission.Waypoint;
import dji.sdk.keyvalue.value.mission.WaypointMissionFinishedAction;
import dji.sdk.keyvalue.value.mission.WaypointMissionFlightPathMode;
import dji.sdk.keyvalue.value.mission.WaypointMissionGotoFirstWaypointMode;
import dji.sdk.keyvalue.value.mission.WaypointMissionHeadingMode;
import dji.sdk.keyvalue.value.mission.WaypointMissionType;
import java.util.List;
import org.json.JSONObject;

public class WaypointMission
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer waypointCount;
    Double maxFlightSpeed;
    Double autoFlightSpeed;
    WaypointMissionFinishedAction finishedAction;
    WaypointMissionHeadingMode headingMode;
    WaypointMissionFlightPathMode flightPathMode;
    WaypointMissionGotoFirstWaypointMode gotoFirstWaypointMode;
    Boolean exitMissionOnRCSignalLostEnabled;
    LocationCoordinate2D pointOfInterest;
    GimbalPitchMode gimbalPitchRotationMode;
    Integer repeatTimes;
    CameraAction cameraAction;
    Integer cameraActionParam;
    Integer missionID;
    WaypointMissionType missionType;
    SubWaypointMissionType subMissionType;
    List<Waypoint> waypoints;

    public WaypointMission() {
    }

    public WaypointMission(Integer n, Double d2, Double d3, WaypointMissionFinishedAction waypointMissionFinishedAction, WaypointMissionHeadingMode waypointMissionHeadingMode, WaypointMissionFlightPathMode waypointMissionFlightPathMode, WaypointMissionGotoFirstWaypointMode waypointMissionGotoFirstWaypointMode, Boolean bl, LocationCoordinate2D locationCoordinate2D, GimbalPitchMode gimbalPitchMode, Integer n2, CameraAction cameraAction, Integer n3, Integer n4, WaypointMissionType waypointMissionType, SubWaypointMissionType subWaypointMissionType, List<Waypoint> list) {
    }

    public static WaypointMission fromJson(String string) {
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

    public Integer getWaypointCount() {
        return null;
    }

    public void setWaypointCount(Integer n) {
    }

    public Double getMaxFlightSpeed() {
        return null;
    }

    public void setMaxFlightSpeed(Double d2) {
    }

    public Double getAutoFlightSpeed() {
        return null;
    }

    public void setAutoFlightSpeed(Double d2) {
    }

    public WaypointMissionFinishedAction getFinishedAction() {
        return null;
    }

    public void setFinishedAction(WaypointMissionFinishedAction waypointMissionFinishedAction) {
    }

    public WaypointMissionHeadingMode getHeadingMode() {
        return null;
    }

    public void setHeadingMode(WaypointMissionHeadingMode waypointMissionHeadingMode) {
    }

    public WaypointMissionFlightPathMode getFlightPathMode() {
        return null;
    }

    public void setFlightPathMode(WaypointMissionFlightPathMode waypointMissionFlightPathMode) {
    }

    public WaypointMissionGotoFirstWaypointMode getGotoFirstWaypointMode() {
        return null;
    }

    public void setGotoFirstWaypointMode(WaypointMissionGotoFirstWaypointMode waypointMissionGotoFirstWaypointMode) {
    }

    public Boolean getExitMissionOnRCSignalLostEnabled() {
        return null;
    }

    public void setExitMissionOnRCSignalLostEnabled(Boolean bl) {
    }

    public LocationCoordinate2D getPointOfInterest() {
        return null;
    }

    public void setPointOfInterest(LocationCoordinate2D locationCoordinate2D) {
    }

    public GimbalPitchMode getGimbalPitchRotationMode() {
        return null;
    }

    public void setGimbalPitchRotationMode(GimbalPitchMode gimbalPitchMode) {
    }

    public Integer getRepeatTimes() {
        return null;
    }

    public void setRepeatTimes(Integer n) {
    }

    public CameraAction getCameraAction() {
        return null;
    }

    public void setCameraAction(CameraAction cameraAction) {
    }

    public Integer getCameraActionParam() {
        return null;
    }

    public void setCameraActionParam(Integer n) {
    }

    public Integer getMissionID() {
        return null;
    }

    public void setMissionID(Integer n) {
    }

    public WaypointMissionType getMissionType() {
        return null;
    }

    public void setMissionType(WaypointMissionType waypointMissionType) {
    }

    public SubWaypointMissionType getSubMissionType() {
        return null;
    }

    public void setSubMissionType(SubWaypointMissionType subWaypointMissionType) {
    }

    public List<Waypoint> getWaypoints() {
        return null;
    }

    public void setWaypoints(List<Waypoint> list) {
    }

    public String toString() {
        return null;
    }
}

