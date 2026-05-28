/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class CloudPositionState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer is_fixed;
    Integer quality;
    Integer gps_number;
    Integer rtk_number;

    public CloudPositionState() {
    }

    public CloudPositionState(Integer n, Integer n2, Integer n3, Integer n4) {
    }

    public static CloudPositionState fromJson(String string) {
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

    public Integer getIs_fixed() {
        return null;
    }

    public void setIs_fixed(Integer n) {
    }

    public Integer getQuality() {
        return null;
    }

    public void setQuality(Integer n) {
    }

    public Integer getGps_number() {
        return null;
    }

    public void setGps_number(Integer n) {
    }

    public Integer getRtk_number() {
        return null;
    }

    public void setRtk_number(Integer n) {
    }

    public String toString() {
        return null;
    }
}

