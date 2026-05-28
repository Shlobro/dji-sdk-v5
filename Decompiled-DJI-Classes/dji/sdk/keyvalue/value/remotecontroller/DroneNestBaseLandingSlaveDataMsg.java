/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class DroneNestBaseLandingSlaveDataMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Long firewareNumber;
    Double torsError;
    Integer rtkVaild;
    Double rtkPosOffsetX;
    Double rtkPosOffsetY;
    Integer markerValid;
    Double markerPosOffsetX;
    Double markerPosOffsetY;
    Double lcPosOffsetX;
    Double lcPosOffsetY;
    Double lcValidRtkOffsetX;
    Double lcValidRtkOffsetY;
    Double lcValidPressHeight;
    Double lcValidTofHeight;
    Double markerRms;
    Long lcSuccessTimes;
    Double lcMeanMatchNumber;
    Double lcMeanInlierNumber;
    Integer rtkFixResult;

    public DroneNestBaseLandingSlaveDataMsg() {
    }

    public DroneNestBaseLandingSlaveDataMsg(Long l2, Double d2, Integer n, Double d3, Double d4, Integer n2, Double d5, Double d6, Double d7, Double d8, Double d9, Double d10, Double d11, Double d12, Double d13, Long l3, Double d14, Double d15, Integer n3) {
    }

    public static DroneNestBaseLandingSlaveDataMsg fromJson(String string) {
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

    public Long getFirewareNumber() {
        return null;
    }

    public void setFirewareNumber(Long l2) {
    }

    public Double getTorsError() {
        return null;
    }

    public void setTorsError(Double d2) {
    }

    public Integer getRtkVaild() {
        return null;
    }

    public void setRtkVaild(Integer n) {
    }

    public Double getRtkPosOffsetX() {
        return null;
    }

    public void setRtkPosOffsetX(Double d2) {
    }

    public Double getRtkPosOffsetY() {
        return null;
    }

    public void setRtkPosOffsetY(Double d2) {
    }

    public Integer getMarkerValid() {
        return null;
    }

    public void setMarkerValid(Integer n) {
    }

    public Double getMarkerPosOffsetX() {
        return null;
    }

    public void setMarkerPosOffsetX(Double d2) {
    }

    public Double getMarkerPosOffsetY() {
        return null;
    }

    public void setMarkerPosOffsetY(Double d2) {
    }

    public Double getLcPosOffsetX() {
        return null;
    }

    public void setLcPosOffsetX(Double d2) {
    }

    public Double getLcPosOffsetY() {
        return null;
    }

    public void setLcPosOffsetY(Double d2) {
    }

    public Double getLcValidRtkOffsetX() {
        return null;
    }

    public void setLcValidRtkOffsetX(Double d2) {
    }

    public Double getLcValidRtkOffsetY() {
        return null;
    }

    public void setLcValidRtkOffsetY(Double d2) {
    }

    public Double getLcValidPressHeight() {
        return null;
    }

    public void setLcValidPressHeight(Double d2) {
    }

    public Double getLcValidTofHeight() {
        return null;
    }

    public void setLcValidTofHeight(Double d2) {
    }

    public Double getMarkerRms() {
        return null;
    }

    public void setMarkerRms(Double d2) {
    }

    public Long getLcSuccessTimes() {
        return null;
    }

    public void setLcSuccessTimes(Long l2) {
    }

    public Double getLcMeanMatchNumber() {
        return null;
    }

    public void setLcMeanMatchNumber(Double d2) {
    }

    public Double getLcMeanInlierNumber() {
        return null;
    }

    public void setLcMeanInlierNumber(Double d2) {
    }

    public Integer getRtkFixResult() {
        return null;
    }

    public void setRtkFixResult(Integer n) {
    }

    public String toString() {
        return null;
    }
}

