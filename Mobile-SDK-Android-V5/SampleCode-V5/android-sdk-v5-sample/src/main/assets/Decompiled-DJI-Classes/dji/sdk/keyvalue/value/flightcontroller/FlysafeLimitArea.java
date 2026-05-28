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
import dji.sdk.keyvalue.value.common.LocationCoordinate2D;
import java.util.List;
import org.json.JSONObject;

public class FlysafeLimitArea
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<FlysafeLimitArea> subShapes;
    List<LocationCoordinate2D> polygonPoints;
    String phoneNumber;
    String pointDesc;
    String polygonShape;
    String city;
    String name;
    Long areaId;
    Double searchRadius;
    Integer source;
    Integer shape;
    Integer type;
    Double latitude;
    Double longitude;
    Integer radius;
    Integer outerRadius;
    Integer level;
    Boolean isTower;
    Boolean isWarning;
    Boolean isDisable;
    Long subAreaId;
    Integer limitHeight;
    Integer internalHash;
    Long updatedTime;
    Long beginTime;
    Long endTime;
    Integer country;

    public FlysafeLimitArea() {
    }

    public FlysafeLimitArea(List<FlysafeLimitArea> list, List<LocationCoordinate2D> list2, String string, String string2, String string3, String string4, String string5, Long l2, Double d2, Integer n, Integer n2, Integer n3, Double d3, Double d4, Integer n4, Integer n5, Integer n6, Boolean bl, Boolean bl2, Boolean bl3, Long l3, Integer n7, Integer n8, Long l4, Long l5, Long l6, Integer n9) {
    }

    public static FlysafeLimitArea fromJson(String string) {
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

    public List<FlysafeLimitArea> getSubShapes() {
        return null;
    }

    public void setSubShapes(List<FlysafeLimitArea> list) {
    }

    public List<LocationCoordinate2D> getPolygonPoints() {
        return null;
    }

    public void setPolygonPoints(List<LocationCoordinate2D> list) {
    }

    public String getPhoneNumber() {
        return null;
    }

    public void setPhoneNumber(String string) {
    }

    public String getPointDesc() {
        return null;
    }

    public void setPointDesc(String string) {
    }

    public String getPolygonShape() {
        return null;
    }

    public void setPolygonShape(String string) {
    }

    public String getCity() {
        return null;
    }

    public void setCity(String string) {
    }

    public String getName() {
        return null;
    }

    public void setName(String string) {
    }

    public Long getAreaId() {
        return null;
    }

    public void setAreaId(Long l2) {
    }

    public Double getSearchRadius() {
        return null;
    }

    public void setSearchRadius(Double d2) {
    }

    public Integer getSource() {
        return null;
    }

    public void setSource(Integer n) {
    }

    public Integer getShape() {
        return null;
    }

    public void setShape(Integer n) {
    }

    public Integer getType() {
        return null;
    }

    public void setType(Integer n) {
    }

    public Double getLatitude() {
        return null;
    }

    public void setLatitude(Double d2) {
    }

    public Double getLongitude() {
        return null;
    }

    public void setLongitude(Double d2) {
    }

    public Integer getRadius() {
        return null;
    }

    public void setRadius(Integer n) {
    }

    public Integer getOuterRadius() {
        return null;
    }

    public void setOuterRadius(Integer n) {
    }

    public Integer getLevel() {
        return null;
    }

    public void setLevel(Integer n) {
    }

    public Boolean getIsTower() {
        return null;
    }

    public void setIsTower(Boolean bl) {
    }

    public Boolean getIsWarning() {
        return null;
    }

    public void setIsWarning(Boolean bl) {
    }

    public Boolean getIsDisable() {
        return null;
    }

    public void setIsDisable(Boolean bl) {
    }

    public Long getSubAreaId() {
        return null;
    }

    public void setSubAreaId(Long l2) {
    }

    public Integer getLimitHeight() {
        return null;
    }

    public void setLimitHeight(Integer n) {
    }

    public Integer getInternalHash() {
        return null;
    }

    public void setInternalHash(Integer n) {
    }

    public Long getUpdatedTime() {
        return null;
    }

    public void setUpdatedTime(Long l2) {
    }

    public Long getBeginTime() {
        return null;
    }

    public void setBeginTime(Long l2) {
    }

    public Long getEndTime() {
        return null;
    }

    public void setEndTime(Long l2) {
    }

    public Integer getCountry() {
        return null;
    }

    public void setCountry(Integer n) {
    }

    public String toString() {
        return null;
    }
}

