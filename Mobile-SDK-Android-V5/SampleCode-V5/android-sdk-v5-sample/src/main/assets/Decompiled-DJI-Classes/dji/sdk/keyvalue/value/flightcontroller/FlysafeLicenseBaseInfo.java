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
import dji.sdk.keyvalue.value.flightcontroller.FlysafeLicenseType;
import org.json.JSONObject;

public class FlysafeLicenseBaseInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean enable;
    Boolean valid;
    Integer inValidDate;
    Long licenseId;
    String description;
    Long startTime;
    Long endTime;
    FlysafeLicenseType type;

    public FlysafeLicenseBaseInfo() {
    }

    public FlysafeLicenseBaseInfo(Boolean bl, Boolean bl2, Integer n, Long l2, String string, Long l3, Long l4, FlysafeLicenseType flysafeLicenseType) {
    }

    public static FlysafeLicenseBaseInfo fromJson(String string) {
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

    public Boolean getEnable() {
        return null;
    }

    public void setEnable(Boolean bl) {
    }

    public Boolean getValid() {
        return null;
    }

    public void setValid(Boolean bl) {
    }

    public Integer getInValidDate() {
        return null;
    }

    public void setInValidDate(Integer n) {
    }

    public Long getLicenseId() {
        return null;
    }

    public void setLicenseId(Long l2) {
    }

    public String getDescription() {
        return null;
    }

    public void setDescription(String string) {
    }

    public Long getStartTime() {
        return null;
    }

    public void setStartTime(Long l2) {
    }

    public Long getEndTime() {
        return null;
    }

    public void setEndTime(Long l2) {
    }

    public FlysafeLicenseType getType() {
        return null;
    }

    public void setType(FlysafeLicenseType flysafeLicenseType) {
    }

    public String toString() {
        return null;
    }
}

