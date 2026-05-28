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
import dji.sdk.keyvalue.value.mission.WaylineWaypointYawMode;
import dji.sdk.keyvalue.value.mission.WaylineWaypointYawPathMode;
import org.json.JSONObject;

public class WaylineWaypointYawParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineWaypointYawMode yawMode;
    Boolean enableYawAngle;
    Double yawAngle;
    WaylineLocationCoordinate3D poiLocation;
    WaylineWaypointYawPathMode yawPathMode;

    public WaylineWaypointYawParam() {
    }

    public WaylineWaypointYawParam(WaylineWaypointYawMode waylineWaypointYawMode, Boolean bl, Double d2, WaylineLocationCoordinate3D waylineLocationCoordinate3D, WaylineWaypointYawPathMode waylineWaypointYawPathMode) {
    }

    public static WaylineWaypointYawParam fromJson(String string) {
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

    public WaylineWaypointYawMode getYawMode() {
        return null;
    }

    public void setYawMode(WaylineWaypointYawMode waylineWaypointYawMode) {
    }

    public Boolean getEnableYawAngle() {
        return null;
    }

    public void setEnableYawAngle(Boolean bl) {
    }

    public Double getYawAngle() {
        return null;
    }

    public void setYawAngle(Double d2) {
    }

    public WaylineLocationCoordinate3D getPoiLocation() {
        return null;
    }

    public void setPoiLocation(WaylineLocationCoordinate3D waylineLocationCoordinate3D) {
    }

    public WaylineWaypointYawPathMode getYawPathMode() {
        return null;
    }

    public void setYawPathMode(WaylineWaypointYawPathMode waylineWaypointYawPathMode) {
    }

    public String toString() {
        return null;
    }
}

