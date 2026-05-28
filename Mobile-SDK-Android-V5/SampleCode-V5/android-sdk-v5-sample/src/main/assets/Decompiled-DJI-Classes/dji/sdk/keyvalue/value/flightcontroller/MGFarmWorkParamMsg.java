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
import dji.sdk.keyvalue.value.flightcontroller.MGFarmWorkMode;
import org.json.JSONObject;

public class MGFarmWorkParamMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer version;
    MGFarmWorkMode mode;
    Double workParam;
    Double turnSpeed;

    public MGFarmWorkParamMsg() {
    }

    public MGFarmWorkParamMsg(Integer n, MGFarmWorkMode mGFarmWorkMode, Double d2, Double d3) {
    }

    public static MGFarmWorkParamMsg fromJson(String string) {
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

    public MGFarmWorkMode getMode() {
        return null;
    }

    public void setMode(MGFarmWorkMode mGFarmWorkMode) {
    }

    public Double getWorkParam() {
        return null;
    }

    public void setWorkParam(Double d2) {
    }

    public Double getTurnSpeed() {
        return null;
    }

    public void setTurnSpeed(Double d2) {
    }

    public String toString() {
        return null;
    }
}

