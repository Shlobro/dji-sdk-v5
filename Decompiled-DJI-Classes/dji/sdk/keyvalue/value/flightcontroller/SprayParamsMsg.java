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

public class SprayParamsMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer cmdId;
    Integer sprayCmd;
    Double sprayTime;

    public SprayParamsMsg() {
    }

    public SprayParamsMsg(Integer n, Integer n2, Double d2) {
    }

    public static SprayParamsMsg fromJson(String string) {
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

    public Integer getCmdId() {
        return null;
    }

    public void setCmdId(Integer n) {
    }

    public Integer getSprayCmd() {
        return null;
    }

    public void setSprayCmd(Integer n) {
    }

    public Double getSprayTime() {
        return null;
    }

    public void setSprayTime(Double d2) {
    }

    public String toString() {
        return null;
    }
}

