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
import dji.sdk.keyvalue.value.flightcontroller.MGNozzleSystem;
import dji.sdk.keyvalue.value.flightcontroller.MGNozzleType;
import org.json.JSONObject;

public class MGNozzleInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MGNozzleSystem system;
    MGNozzleType nozzleID;
    Integer minFlow;
    Integer maxFlow;
    Integer caliMinSpeed;
    Integer caliMaxSpeed;
    Integer maxSpeedLimit;

    public MGNozzleInfo() {
    }

    public MGNozzleInfo(MGNozzleSystem mGNozzleSystem, MGNozzleType mGNozzleType, Integer n, Integer n2, Integer n3, Integer n4, Integer n5) {
    }

    public static MGNozzleInfo fromJson(String string) {
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

    public MGNozzleSystem getSystem() {
        return null;
    }

    public void setSystem(MGNozzleSystem mGNozzleSystem) {
    }

    public MGNozzleType getNozzleID() {
        return null;
    }

    public void setNozzleID(MGNozzleType mGNozzleType) {
    }

    public Integer getMinFlow() {
        return null;
    }

    public void setMinFlow(Integer n) {
    }

    public Integer getMaxFlow() {
        return null;
    }

    public void setMaxFlow(Integer n) {
    }

    public Integer getCaliMinSpeed() {
        return null;
    }

    public void setCaliMinSpeed(Integer n) {
    }

    public Integer getCaliMaxSpeed() {
        return null;
    }

    public void setCaliMaxSpeed(Integer n) {
    }

    public Integer getMaxSpeedLimit() {
        return null;
    }

    public void setMaxSpeedLimit(Integer n) {
    }

    public String toString() {
        return null;
    }
}

