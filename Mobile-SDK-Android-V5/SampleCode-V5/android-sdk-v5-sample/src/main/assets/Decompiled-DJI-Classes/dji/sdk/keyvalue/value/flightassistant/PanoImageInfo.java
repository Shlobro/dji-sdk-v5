/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class PanoImageInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer imageId;
    Integer yaw;
    Integer pitch;
    Integer roll;

    public PanoImageInfo() {
    }

    public PanoImageInfo(Integer n, Integer n2, Integer n3, Integer n4) {
    }

    public static PanoImageInfo fromJson(String string) {
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

    public Integer getImageId() {
        return null;
    }

    public void setImageId(Integer n) {
    }

    public Integer getYaw() {
        return null;
    }

    public void setYaw(Integer n) {
    }

    public Integer getPitch() {
        return null;
    }

    public void setPitch(Integer n) {
    }

    public Integer getRoll() {
        return null;
    }

    public void setRoll(Integer n) {
    }

    public String toString() {
        return null;
    }
}

