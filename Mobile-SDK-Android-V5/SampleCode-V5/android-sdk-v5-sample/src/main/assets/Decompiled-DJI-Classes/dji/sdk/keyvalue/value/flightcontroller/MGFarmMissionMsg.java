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
import dji.sdk.keyvalue.value.flightcontroller.MGFarmTaskType;
import org.json.JSONObject;

public class MGFarmMissionMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer result;
    MGFarmTaskType taskType;
    Double taskTime;
    Integer taskDistanceTotal;
    Integer taskAreaTotal;
    Integer taskAreaOneFlight;
    String userName;
    Integer sprayVolumeTotal;
    Integer sprayVolumeOneFlight;
    Integer sprayWidth;
    Integer sprayVolumeOneType;
    Integer sowWeightTotal;
    Integer sowWeightOneFlight;
    Integer sowWeightOneType;

    public MGFarmMissionMsg() {
    }

    public MGFarmMissionMsg(Integer n, MGFarmTaskType mGFarmTaskType, Double d2, Integer n2, Integer n3, Integer n4, String string, Integer n5, Integer n6, Integer n7, Integer n8, Integer n9, Integer n10, Integer n11) {
    }

    public static MGFarmMissionMsg fromJson(String string) {
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

    public Integer getResult() {
        return null;
    }

    public void setResult(Integer n) {
    }

    public MGFarmTaskType getTaskType() {
        return null;
    }

    public void setTaskType(MGFarmTaskType mGFarmTaskType) {
    }

    public Double getTaskTime() {
        return null;
    }

    public void setTaskTime(Double d2) {
    }

    public Integer getTaskDistanceTotal() {
        return null;
    }

    public void setTaskDistanceTotal(Integer n) {
    }

    public Integer getTaskAreaTotal() {
        return null;
    }

    public void setTaskAreaTotal(Integer n) {
    }

    public Integer getTaskAreaOneFlight() {
        return null;
    }

    public void setTaskAreaOneFlight(Integer n) {
    }

    public String getUserName() {
        return null;
    }

    public void setUserName(String string) {
    }

    public Integer getSprayVolumeTotal() {
        return null;
    }

    public void setSprayVolumeTotal(Integer n) {
    }

    public Integer getSprayVolumeOneFlight() {
        return null;
    }

    public void setSprayVolumeOneFlight(Integer n) {
    }

    public Integer getSprayWidth() {
        return null;
    }

    public void setSprayWidth(Integer n) {
    }

    public Integer getSprayVolumeOneType() {
        return null;
    }

    public void setSprayVolumeOneType(Integer n) {
    }

    public Integer getSowWeightTotal() {
        return null;
    }

    public void setSowWeightTotal(Integer n) {
    }

    public Integer getSowWeightOneFlight() {
        return null;
    }

    public void setSowWeightOneFlight(Integer n) {
    }

    public Integer getSowWeightOneType() {
        return null;
    }

    public void setSowWeightOneType(Integer n) {
    }

    public String toString() {
        return null;
    }
}

