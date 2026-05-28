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

public class WaylineTemplateMappingStripInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineOverlap overlap;
    Boolean singleLineEnable;
    Boolean caliFlightEnable;
    Boolean elevationOptimizeEnable;
    WaylineTemplateShootType shootType;
    Integer direction;
    Double margin;
    Double cuttingDistance;
    Boolean boundaryOptimEnable;
    Integer leftExtend;
    Integer rightExtend;
    Boolean includeCenterEnable;
    List<WaylineLocationCoordinate3D> coordinates;

    public WaylineTemplateMappingStripInfo() {
    }

    public WaylineTemplateMappingStripInfo(WaylineOverlap waylineOverlap, Boolean bl, Boolean bl2, Boolean bl3, WaylineTemplateShootType waylineTemplateShootType, Integer n, Double d2, Double d3, Boolean bl4, Integer n2, Integer n3, Boolean bl5, List<WaylineLocationCoordinate3D> list) {
    }

    public static WaylineTemplateMappingStripInfo fromJson(String string) {
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

    public Boolean getSingleLineEnable() {
        return null;
    }

    public void setSingleLineEnable(Boolean bl) {
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

    public Double getCuttingDistance() {
        return null;
    }

    public void setCuttingDistance(Double d2) {
    }

    public Boolean getBoundaryOptimEnable() {
        return null;
    }

    public void setBoundaryOptimEnable(Boolean bl) {
    }

    public Integer getLeftExtend() {
        return null;
    }

    public void setLeftExtend(Integer n) {
    }

    public Integer getRightExtend() {
        return null;
    }

    public void setRightExtend(Integer n) {
    }

    public Boolean getIncludeCenterEnable() {
        return null;
    }

    public void setIncludeCenterEnable(Boolean bl) {
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

