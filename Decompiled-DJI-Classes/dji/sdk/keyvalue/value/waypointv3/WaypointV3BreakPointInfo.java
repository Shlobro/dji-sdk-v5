/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.waypointv3;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.waypointv3.PointInfo;
import dji.sdk.keyvalue.value.waypointv3.Waypoint3ErrorCode;
import org.json.JSONObject;

public class WaypointV3BreakPointInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Waypoint3ErrorCode breakReason;
    Integer waylineID;
    PointInfo positionInfo;
    LocationCoordinate3D location;
    Double headingAngle;

    public WaypointV3BreakPointInfo() {
    }

    public WaypointV3BreakPointInfo(Waypoint3ErrorCode waypoint3ErrorCode, Integer n, PointInfo pointInfo, LocationCoordinate3D locationCoordinate3D, Double d2) {
    }

    public static WaypointV3BreakPointInfo fromJson(String string) {
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

    public Waypoint3ErrorCode getBreakReason() {
        return null;
    }

    public void setBreakReason(Waypoint3ErrorCode waypoint3ErrorCode) {
    }

    public Integer getWaylineID() {
        return null;
    }

    public void setWaylineID(Integer n) {
    }

    public PointInfo getPositionInfo() {
        return null;
    }

    public void setPositionInfo(PointInfo pointInfo) {
    }

    public LocationCoordinate3D getLocation() {
        return null;
    }

    public void setLocation(LocationCoordinate3D locationCoordinate3D) {
    }

    public Double getHeadingAngle() {
        return null;
    }

    public void setHeadingAngle(Double d2) {
    }

    public String toString() {
        return null;
    }
}

