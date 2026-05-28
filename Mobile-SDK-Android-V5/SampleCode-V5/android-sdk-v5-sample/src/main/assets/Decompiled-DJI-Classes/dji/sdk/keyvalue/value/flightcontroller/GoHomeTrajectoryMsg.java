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
import dji.sdk.keyvalue.value.flightcontroller.LastPointTypeCode;
import java.util.List;
import org.json.JSONObject;

public class GoHomeTrajectoryMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer num;
    List<LocationCoordinate3D> trackPoints;
    Integer lowBatteryLandPointIndex;
    LastPointTypeCode lastPointType;

    public GoHomeTrajectoryMsg() {
    }

    public GoHomeTrajectoryMsg(Integer n, List<LocationCoordinate3D> list, Integer n2, LastPointTypeCode lastPointTypeCode) {
    }

    public static GoHomeTrajectoryMsg fromJson(String string) {
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

    public Integer getNum() {
        return null;
    }

    public void setNum(Integer n) {
    }

    public List<LocationCoordinate3D> getTrackPoints() {
        return null;
    }

    public void setTrackPoints(List<LocationCoordinate3D> list) {
    }

    public Integer getLowBatteryLandPointIndex() {
        return null;
    }

    public void setLowBatteryLandPointIndex(Integer n) {
    }

    public LastPointTypeCode getLastPointType() {
        return null;
    }

    public void setLastPointType(LastPointTypeCode lastPointTypeCode) {
    }

    public String toString() {
        return null;
    }
}

