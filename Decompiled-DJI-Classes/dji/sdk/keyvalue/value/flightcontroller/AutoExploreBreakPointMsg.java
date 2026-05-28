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
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import org.json.JSONObject;

public class AutoExploreBreakPointMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String mission_id;
    Boolean is_valid;
    Integer error_code;
    LocationCoordinate3D point;
    Double angle;

    public AutoExploreBreakPointMsg() {
    }

    public AutoExploreBreakPointMsg(String string, Boolean bl, Integer n, LocationCoordinate3D locationCoordinate3D, Double d2) {
    }

    public static AutoExploreBreakPointMsg fromJson(String string) {
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

    public Boolean getIs_valid() {
        return null;
    }

    public void setIs_valid(Boolean bl) {
    }

    public Integer getError_code() {
        return null;
    }

    public void setError_code(Integer n) {
    }

    public LocationCoordinate3D getPoint() {
        return null;
    }

    public void setPoint(LocationCoordinate3D locationCoordinate3D) {
    }

    public Double getAngle() {
        return null;
    }

    public void setAngle(Double d2) {
    }

    public String toString() {
        return null;
    }
}

