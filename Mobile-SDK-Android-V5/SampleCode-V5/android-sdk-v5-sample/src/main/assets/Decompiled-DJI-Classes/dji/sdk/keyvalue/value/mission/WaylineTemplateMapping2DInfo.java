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
import dji.sdk.keyvalue.value.mission.WaylineOverlap;
import dji.sdk.keyvalue.value.mission.WaylineTemplateShootType;
import java.util.List;
import org.json.JSONObject;

public class WaylineTemplateMapping2DInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineOverlap overlap;
    Boolean caliFlightEnable;
    Boolean elevationOptimizeEnable;
    Boolean smartObliqueEnable;
    Integer inclinedGimbalPitch;
    WaylineTemplateShootType shootType;
    Integer direction;
    Double margin;
    List<WaylineLocationCoordinate3D> coordinates;

    public WaylineTemplateMapping2DInfo() {
    }

    public WaylineTemplateMapping2DInfo(WaylineOverlap waylineOverlap, Boolean bl, Boolean bl2, Boolean bl3, Integer n, WaylineTemplateShootType waylineTemplateShootType, Integer n2, Double d2, List<WaylineLocationCoordinate3D> list) {
    }

    public static WaylineTemplateMapping2DInfo fromJson(String string) {
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

    public WaylineOverlap getOverlap() {
        return null;
    }

    public void setOverlap(WaylineOverlap waylineOverlap) {
    }

    public Boolean getCaliFlightEnable() {
        return null;
    }

    public void setCaliFlightEnable(Boolean bl) {
    }

    public Boolean getElevationOptimizeEnable() {
        return null;
    }

    public void setElevationOptimizeEnable(Boolean bl) {
    }

    public Boolean getSmartObliqueEnable() {
        return null;
    }

    public void setSmartObliqueEnable(Boolean bl) {
    }

    public Integer getInclinedGimbalPitch() {
        return null;
    }

    public void setInclinedGimbalPitch(Integer n) {
    }

    public WaylineTemplateShootType getShootType() {
        return null;
    }

    public void setShootType(WaylineTemplateShootType waylineTemplateShootType) {
    }

    public Integer getDirection() {
        return null;
    }

    public void setDirection(Integer n) {
    }

    public Double getMargin() {
        return null;
    }

    public void setMargin(Double d2) {
    }

    public List<WaylineLocationCoordinate3D> getCoordinates() {
        return null;
    }

    public void setCoordinates(List<WaylineLocationCoordinate3D> list) {
    }

    public String toString() {
        return null;
    }
}

