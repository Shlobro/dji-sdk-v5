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

public class DynamicSystemLifeData
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer sector;
    Integer bootTimes;
    Integer motorRunTimes;
    Integer escRunTimes;

    public DynamicSystemLifeData() {
    }

    public DynamicSystemLifeData(Integer n, Integer n2, Integer n3, Integer n4) {
    }

    public static DynamicSystemLifeData fromJson(String string) {
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

    public Integer getSector() {
        return null;
    }

    public void setSector(Integer n) {
    }

    public Integer getBootTimes() {
        return null;
    }

    public void setBootTimes(Integer n) {
    }

    public Integer getMotorRunTimes() {
        return null;
    }

    public void setMotorRunTimes(Integer n) {
    }

    public Integer getEscRunTimes() {
        return null;
    }

    public void setEscRunTimes(Integer n) {
    }

    public String toString() {
        return null;
    }
}

