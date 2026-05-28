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

public class LandingGearErrorMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean abnormal;
    Integer reason;

    public LandingGearErrorMsg() {
    }

    public LandingGearErrorMsg(Boolean bl, Integer n) {
    }

    public static LandingGearErrorMsg fromJson(String string) {
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

    public Boolean getAbnormal() {
        return null;
    }

    public void setAbnormal(Boolean bl) {
    }

    public Integer getReason() {
        return null;
    }

    public void setReason(Integer n) {
    }

    public String toString() {
        return null;
    }
}

