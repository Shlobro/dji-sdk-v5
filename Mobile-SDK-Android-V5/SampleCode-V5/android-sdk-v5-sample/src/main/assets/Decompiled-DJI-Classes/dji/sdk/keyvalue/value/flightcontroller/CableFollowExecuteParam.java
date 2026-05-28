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

public class CableFollowExecuteParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer maxVel;
    Integer heightAboveCable;
    Integer gimbalPitch;
    Integer executionDirectionIndex;

    public CableFollowExecuteParam() {
    }

    public CableFollowExecuteParam(Integer n, Integer n2, Integer n3, Integer n4) {
    }

    public static CableFollowExecuteParam fromJson(String string) {
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

    public Integer getMaxVel() {
        return null;
    }

    public void setMaxVel(Integer n) {
    }

    public Integer getHeightAboveCable() {
        return null;
    }

    public void setHeightAboveCable(Integer n) {
    }

    public Integer getGimbalPitch() {
        return null;
    }

    public void setGimbalPitch(Integer n) {
    }

    public Integer getExecutionDirectionIndex() {
        return null;
    }

    public void setExecutionDirectionIndex(Integer n) {
    }

    public String toString() {
        return null;
    }
}

