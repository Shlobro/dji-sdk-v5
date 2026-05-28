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
import org.json.JSONObject;

public class RidWorkingStatusPushMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isEidSupport;
    Boolean isRidSupport;
    Boolean isEidNormal;
    Boolean isRidNormal;
    String areaCode;
    Integer failResion;

    public RidWorkingStatusPushMsg() {
    }

    public RidWorkingStatusPushMsg(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, String string, Integer n) {
    }

    public static RidWorkingStatusPushMsg fromJson(String string) {
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

    public Boolean getIsEidSupport() {
        return null;
    }

    public void setIsEidSupport(Boolean bl) {
    }

    public Boolean getIsRidSupport() {
        return null;
    }

    public void setIsRidSupport(Boolean bl) {
    }

    public Boolean getIsEidNormal() {
        return null;
    }

    public void setIsEidNormal(Boolean bl) {
    }

    public Boolean getIsRidNormal() {
        return null;
    }

    public void setIsRidNormal(Boolean bl) {
    }

    public String getAreaCode() {
        return null;
    }

    public void setAreaCode(String string) {
    }

    public Integer getFailResion() {
        return null;
    }

    public void setFailResion(Integer n) {
    }

    public String toString() {
        return null;
    }
}

