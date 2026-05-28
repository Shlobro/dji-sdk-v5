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
import dji.sdk.keyvalue.value.flightcontroller.FlysafeAreaLicenseInfo;
import dji.sdk.keyvalue.value.flightcontroller.FlysafeCircleLicenseInfo;
import dji.sdk.keyvalue.value.flightcontroller.FlysafeCountryLicenseInfo;
import dji.sdk.keyvalue.value.flightcontroller.FlysafeHeightLicenseInfo;
import dji.sdk.keyvalue.value.flightcontroller.FlysafePolygonLicenseInfo;
import dji.sdk.keyvalue.value.flightcontroller.FlysafePowerLicenseInfo;
import dji.sdk.keyvalue.value.flightcontroller.FlysafeRIDLicenseInfo;
import java.util.List;
import org.json.JSONObject;

public class FlysafeLicenseGroup
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer version;
    Long createdAt;
    String sn;
    Long groupID;
    Integer licenseCount;
    Long userID;
    Long timestamp;
    List<FlysafeAreaLicenseInfo> areaLicenses;
    List<FlysafeCircleLicenseInfo> circleLicenses;
    List<FlysafeCountryLicenseInfo> countryLicenses;
    List<FlysafeHeightLicenseInfo> heightLicenses;
    List<FlysafePolygonLicenseInfo> polygonLicenses;
    List<FlysafePowerLicenseInfo> powerLicenses;
    List<FlysafeRIDLicenseInfo> ridLicenses;

    public FlysafeLicenseGroup() {
    }

    public FlysafeLicenseGroup(Integer n, Long l2, String string, Long l3, Integer n2, Long l4, Long l5, List<FlysafeAreaLicenseInfo> list, List<FlysafeCircleLicenseInfo> list2, List<FlysafeCountryLicenseInfo> list3, List<FlysafeHeightLicenseInfo> list4, List<FlysafePolygonLicenseInfo> list5, List<FlysafePowerLicenseInfo> list6, List<FlysafeRIDLicenseInfo> list7) {
    }

    public static FlysafeLicenseGroup fromJson(String string) {
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

    public Integer getVersion() {
        return null;
    }

    public void setVersion(Integer n) {
    }

    public Long getCreatedAt() {
        return null;
    }

    public void setCreatedAt(Long l2) {
    }

    public String getSn() {
        return null;
    }

    public void setSn(String string) {
    }

    public Long getGroupID() {
        return null;
    }

    public void setGroupID(Long l2) {
    }

    public Integer getLicenseCount() {
        return null;
    }

    public void setLicenseCount(Integer n) {
    }

    public Long getUserID() {
        return null;
    }

    public void setUserID(Long l2) {
    }

    public Long getTimestamp() {
        return null;
    }

    public void setTimestamp(Long l2) {
    }

    public List<FlysafeAreaLicenseInfo> getAreaLicenses() {
        return null;
    }

    public void setAreaLicenses(List<FlysafeAreaLicenseInfo> list) {
    }

    public List<FlysafeCircleLicenseInfo> getCircleLicenses() {
        return null;
    }

    public void setCircleLicenses(List<FlysafeCircleLicenseInfo> list) {
    }

    public List<FlysafeCountryLicenseInfo> getCountryLicenses() {
        return null;
    }

    public void setCountryLicenses(List<FlysafeCountryLicenseInfo> list) {
    }

    public List<FlysafeHeightLicenseInfo> getHeightLicenses() {
        return null;
    }

    public void setHeightLicenses(List<FlysafeHeightLicenseInfo> list) {
    }

    public List<FlysafePolygonLicenseInfo> getPolygonLicenses() {
        return null;
    }

    public void setPolygonLicenses(List<FlysafePolygonLicenseInfo> list) {
    }

    public List<FlysafePowerLicenseInfo> getPowerLicenses() {
        return null;
    }

    public void setPowerLicenses(List<FlysafePowerLicenseInfo> list) {
    }

    public List<FlysafeRIDLicenseInfo> getRidLicenses() {
        return null;
    }

    public void setRidLicenses(List<FlysafeRIDLicenseInfo> list) {
    }

    public String toString() {
        return null;
    }
}

