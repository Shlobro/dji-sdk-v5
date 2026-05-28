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
import dji.sdk.keyvalue.value.flightcontroller.FlysafeLicenseBaseInfo;
import org.json.JSONObject;

public class FlysafePowerLicenseInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FlysafeLicenseBaseInfo baseInfo;
    Integer levelLimit;

    public FlysafePowerLicenseInfo() {
    }

    public FlysafePowerLicenseInfo(FlysafeLicenseBaseInfo flysafeLicenseBaseInfo, Integer n) {
    }

    public static FlysafePowerLicenseInfo fromJson(String string) {
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

    public FlysafeLicenseBaseInfo getBaseInfo() {
        return null;
    }

    public void setBaseInfo(FlysafeLicenseBaseInfo flysafeLicenseBaseInfo) {
    }

    public Integer getLevelLimit() {
        return null;
    }

    public void setLevelLimit(Integer n) {
    }

    public String toString() {
        return null;
    }
}

