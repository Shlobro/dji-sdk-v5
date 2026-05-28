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

public class CloudDistanceLimitStatusOSDInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer state;
    Integer distance_limit;
    Integer is_near_distance_limit;

    public CloudDistanceLimitStatusOSDInfo() {
    }

    public CloudDistanceLimitStatusOSDInfo(Integer n, Integer n2, Integer n3) {
    }

    public static CloudDistanceLimitStatusOSDInfo fromJson(String string) {
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

    public Integer getState() {
        return null;
    }

    public void setState(Integer n) {
    }

    public Integer getDistance_limit() {
        return null;
    }

    public void setDistance_limit(Integer n) {
    }

    public Integer getIs_near_distance_limit() {
        return null;
    }

    public void setIs_near_distance_limit(Integer n) {
    }

    public String toString() {
        return null;
    }
}

