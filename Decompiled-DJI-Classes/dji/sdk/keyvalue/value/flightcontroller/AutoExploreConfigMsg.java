/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.Attitude;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.common.XYZ;
import dji.sdk.keyvalue.value.flightcontroller.LocationNED;
import java.util.List;
import org.json.JSONObject;

public class AutoExploreConfigMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String mission_id;
    Double safety_height;
    Boolean is_tilting_ascende;
    Boolean is_finish_gohome;
    Boolean is_losing_continue;
    LocationCoordinate3D origin_point;
    Attitude rotation_angle;
    Double height;
    List<LocationNED> bottom_points;
    List<XYZ> waypoints_vertices;

    public AutoExploreConfigMsg() {
    }

    public AutoExploreConfigMsg(String string, Double d2, Boolean bl, Boolean bl2, Boolean bl3, LocationCoordinate3D locationCoordinate3D, Attitude attitude, Double d3, List<LocationNED> list, List<XYZ> list2) {
    }

    public static AutoExploreConfigMsg fromJson(String string) {
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

    public String getMission_id() {
        return null;
    }

    public void setMission_id(String string) {
    }

    public Double getSafety_height() {
        return null;
    }

    public void setSafety_height(Double d2) {
    }

    public Boolean getIs_tilting_ascende() {
        return null;
    }

    public void setIs_tilting_ascende(Boolean bl) {
    }

    public Boolean getIs_finish_gohome() {
        return null;
    }

    public void setIs_finish_gohome(Boolean bl) {
    }

    public Boolean getIs_losing_continue() {
        return null;
    }

    public void setIs_losing_continue(Boolean bl) {
    }

    public LocationCoordinate3D getOrigin_point() {
        return null;
    }

    public void setOrigin_point(LocationCoordinate3D locationCoordinate3D) {
    }

    public Attitude getRotation_angle() {
        return null;
    }

    public void setRotation_angle(Attitude attitude) {
    }

    public Double getHeight() {
        return null;
    }

    public void setHeight(Double d2) {
    }

    public List<LocationNED> getBottom_points() {
        return null;
    }

    public void setBottom_points(List<LocationNED> list) {
    }

    public List<XYZ> getWaypoints_vertices() {
        return null;
    }

    public void setWaypoints_vertices(List<XYZ> list) {
    }

    public String toString() {
        return null;
    }
}

