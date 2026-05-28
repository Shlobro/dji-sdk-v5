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
import dji.sdk.keyvalue.value.mission.WaylineLocationCoordinate3D;
import dji.sdk.keyvalue.value.mission.WaylineWaypointTurnParam;
import dji.sdk.keyvalue.value.mission.WaylineWaypointYawParam;
import org.json.JSONObject;

public class WaylineWaypoint
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer waypointIndex;
    Boolean useGlobalHeight;
    Boolean useGlobalSpeed;
    Boolean useGlobalYawMode;
    Boolean useGlobalTurnMode;
    WaylineLocationCoordinate3D location;
    WaylineWaypointYawParam yawParam;
    WaylineWaypointTurnParam turnParam;
    Double speed;
    Boolean useStraightLine;

    public WaylineWaypoint() {
    }

    public WaylineWaypoint(Integer n, Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, WaylineLocationCoordinate3D waylineLocationCoordinate3D, WaylineWaypointYawParam waylineWaypointYawParam, WaylineWaypointTurnParam waylineWaypointTurnParam, Double d2, Boolean bl5) {
    }

    public static WaylineWaypoint fromJson(String string) {
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

    public Integer getWaypointIndex() {
        return null;
    }

    public void setWaypointIndex(Integer n) {
    }

    public Boolean getUseGlobalHeight() {
        return null;
    }

    public void setUseGlobalHeight(Boolean bl) {
    }

    public Boolean getUseGlobalSpeed() {
        return null;
    }

    public void setUseGlobalSpeed(Boolean bl) {
    }

    public Boolean getUseGlobalYawMode() {
        return null;
    }

    public void setUseGlobalYawMode(Boolean bl) {
    }

    public Boolean getUseGlobalTurnMode() {
        return null;
    }

    public void setUseGlobalTurnMode(Boolean bl) {
    }

    public WaylineLocationCoordinate3D getLocation() {
        return null;
    }

    public void setLocation(WaylineLocationCoordinate3D waylineLocationCoordinate3D) {
    }

    public WaylineWaypointYawParam getYawParam() {
        return null;
    }

    public void setYawParam(WaylineWaypointYawParam waylineWaypointYawParam) {
    }

    public WaylineWaypointTurnParam getTurnParam() {
        return null;
    }

    public void setTurnParam(WaylineWaypointTurnParam waylineWaypointTurnParam) {
    }

    public Double getSpeed() {
        return null;
    }

    public void setSpeed(Double d2) {
    }

    public Boolean getUseStraightLine() {
        return null;
    }

    public void setUseStraightLine(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

