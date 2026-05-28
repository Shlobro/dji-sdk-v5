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
import dji.sdk.keyvalue.value.flightcontroller.LocationNED;
import org.json.JSONObject;

public class FlyingOnShipStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean is_identified;
    Boolean is_manual;
    Double center_x;
    Double center_y;
    Double box_width;
    Double box_height;
    Boolean is_fisheye;
    Integer cam_port;
    LocationNED marker_pos;

    public FlyingOnShipStateMsg() {
    }

    public FlyingOnShipStateMsg(Boolean bl, Boolean bl2, Double d2, Double d3, Double d4, Double d5, Boolean bl3, Integer n, LocationNED locationNED) {
    }

    public static FlyingOnShipStateMsg fromJson(String string) {
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

    public Boolean getIs_identified() {
        return null;
    }

    public void setIs_identified(Boolean bl) {
    }

    public Boolean getIs_manual() {
        return null;
    }

    public void setIs_manual(Boolean bl) {
    }

    public Double getCenter_x() {
        return null;
    }

    public void setCenter_x(Double d2) {
    }

    public Double getCenter_y() {
        return null;
    }

    public void setCenter_y(Double d2) {
    }

    public Double getBox_width() {
        return null;
    }

    public void setBox_width(Double d2) {
    }

    public Double getBox_height() {
        return null;
    }

    public void setBox_height(Double d2) {
    }

    public Boolean getIs_fisheye() {
        return null;
    }

    public void setIs_fisheye(Boolean bl) {
    }

    public Integer getCam_port() {
        return null;
    }

    public void setCam_port(Integer n) {
    }

    public LocationNED getMarker_pos() {
        return null;
    }

    public void setMarker_pos(LocationNED locationNED) {
    }

    public String toString() {
        return null;
    }
}

