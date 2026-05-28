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
import dji.sdk.keyvalue.value.flightcontroller.MGFarmCmd;
import dji.sdk.keyvalue.value.flightcontroller.MGFarmFlyDirection;
import org.json.JSONObject;

public class MGFarmFlyParamMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer version;
    MGFarmCmd cmd;
    Boolean targetRelativeHeightEnable;
    Boolean yawLockEnable;
    Boolean maxSpeedEnable;
    Boolean distanceEnable;
    Boolean directionEnable;
    MGFarmFlyDirection direction;
    Double distance;
    Double maxSpeed;
    Double targetRelativeHeight;

    public MGFarmFlyParamMsg() {
    }

    public MGFarmFlyParamMsg(Integer n, MGFarmCmd mGFarmCmd, Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, MGFarmFlyDirection mGFarmFlyDirection, Double d2, Double d3, Double d4) {
    }

    public static MGFarmFlyParamMsg fromJson(String string) {
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

    public MGFarmCmd getCmd() {
        return null;
    }

    public void setCmd(MGFarmCmd mGFarmCmd) {
    }

    public Boolean getTargetRelativeHeightEnable() {
        return null;
    }

    public void setTargetRelativeHeightEnable(Boolean bl) {
    }

    public Boolean getYawLockEnable() {
        return null;
    }

    public void setYawLockEnable(Boolean bl) {
    }

    public Boolean getMaxSpeedEnable() {
        return null;
    }

    public void setMaxSpeedEnable(Boolean bl) {
    }

    public Boolean getDistanceEnable() {
        return null;
    }

    public void setDistanceEnable(Boolean bl) {
    }

    public Boolean getDirectionEnable() {
        return null;
    }

    public void setDirectionEnable(Boolean bl) {
    }

    public MGFarmFlyDirection getDirection() {
        return null;
    }

    public void setDirection(MGFarmFlyDirection mGFarmFlyDirection) {
    }

    public Double getDistance() {
        return null;
    }

    public void setDistance(Double d2) {
    }

    public Double getMaxSpeed() {
        return null;
    }

    public void setMaxSpeed(Double d2) {
    }

    public Double getTargetRelativeHeight() {
        return null;
    }

    public void setTargetRelativeHeight(Double d2) {
    }

    public String toString() {
        return null;
    }
}

