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
import dji.sdk.keyvalue.value.mission.WaylineAltitudeMode;
import dji.sdk.keyvalue.value.mission.WaylineCoordinateMode;
import dji.sdk.keyvalue.value.mission.WaylinePositioningType;
import java.util.List;
import org.json.JSONObject;

public class WaylineCoordinateParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineCoordinateMode coordinateMode;
    WaylineAltitudeMode altitudeMode;
    Double height;
    Boolean surfaceFollowModeEnable;
    Integer surfaceRelativeHeight;
    List<String> dsmFiles;
    WaylinePositioningType positioningType;

    public WaylineCoordinateParam() {
    }

    public WaylineCoordinateParam(WaylineCoordinateMode waylineCoordinateMode, WaylineAltitudeMode waylineAltitudeMode, Double d2, Boolean bl, Integer n, List<String> list, WaylinePositioningType waylinePositioningType) {
    }

    public static WaylineCoordinateParam fromJson(String string) {
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

    public WaylineCoordinateMode getCoordinateMode() {
        return null;
    }

    public void setCoordinateMode(WaylineCoordinateMode waylineCoordinateMode) {
    }

    public WaylineAltitudeMode getAltitudeMode() {
        return null;
    }

    public void setAltitudeMode(WaylineAltitudeMode waylineAltitudeMode) {
    }

    public Double getHeight() {
        return null;
    }

    public void setHeight(Double d2) {
    }

    public Boolean getSurfaceFollowModeEnable() {
        return null;
    }

    public void setSurfaceFollowModeEnable(Boolean bl) {
    }

    public Integer getSurfaceRelativeHeight() {
        return null;
    }

    public void setSurfaceRelativeHeight(Integer n) {
    }

    public List<String> getDsmFiles() {
        return null;
    }

    public void setDsmFiles(List<String> list) {
    }

    public WaylinePositioningType getPositioningType() {
        return null;
    }

    public void setPositioningType(WaylinePositioningType waylinePositioningType) {
    }

    public String toString() {
        return null;
    }
}

