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

public class MGFarmMissionFlightMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer version;
    Integer workMode;
    Integer workState;
    Integer wpMissionType;
    Integer wpPointType;
    Integer breakReason;
    Boolean isExceedLimitDis;
    Boolean isActInSupplyPoint;
    Boolean isValidSupplyPoint;
    Boolean isLandingSafeRemind;
    Boolean isNoPesticideRemind;
    Boolean isLockYawRemain;
    Double noPesticidePointLati;
    Double noPesticidePointLong;
    Double supplyPointLati;
    Double supplyPointLong;

    public MGFarmMissionFlightMsg() {
    }

    public MGFarmMissionFlightMsg(Integer n, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6, Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, Double d2, Double d3, Double d4, Double d5) {
    }

    public static MGFarmMissionFlightMsg fromJson(String string) {
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

    public Integer getWorkMode() {
        return null;
    }

    public void setWorkMode(Integer n) {
    }

    public Integer getWorkState() {
        return null;
    }

    public void setWorkState(Integer n) {
    }

    public Integer getWpMissionType() {
        return null;
    }

    public void setWpMissionType(Integer n) {
    }

    public Integer getWpPointType() {
        return null;
    }

    public void setWpPointType(Integer n) {
    }

    public Integer getBreakReason() {
        return null;
    }

    public void setBreakReason(Integer n) {
    }

    public Boolean getIsExceedLimitDis() {
        return null;
    }

    public void setIsExceedLimitDis(Boolean bl) {
    }

    public Boolean getIsActInSupplyPoint() {
        return null;
    }

    public void setIsActInSupplyPoint(Boolean bl) {
    }

    public Boolean getIsValidSupplyPoint() {
        return null;
    }

    public void setIsValidSupplyPoint(Boolean bl) {
    }

    public Boolean getIsLandingSafeRemind() {
        return null;
    }

    public void setIsLandingSafeRemind(Boolean bl) {
    }

    public Boolean getIsNoPesticideRemind() {
        return null;
    }

    public void setIsNoPesticideRemind(Boolean bl) {
    }

    public Boolean getIsLockYawRemain() {
        return null;
    }

    public void setIsLockYawRemain(Boolean bl) {
    }

    public Double getNoPesticidePointLati() {
        return null;
    }

    public void setNoPesticidePointLati(Double d2) {
    }

    public Double getNoPesticidePointLong() {
        return null;
    }

    public void setNoPesticidePointLong(Double d2) {
    }

    public Double getSupplyPointLati() {
        return null;
    }

    public void setSupplyPointLati(Double d2) {
    }

    public Double getSupplyPointLong() {
        return null;
    }

    public void setSupplyPointLong(Double d2) {
    }

    public String toString() {
        return null;
    }
}

