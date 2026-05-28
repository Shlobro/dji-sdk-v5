/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class GimbalPinInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double quaternionW;
    Double quaternionX;
    Double quaternionY;
    Double quaternionZ;
    Boolean isPosValid;
    Double lng;
    Double lat;
    Double alt;

    public GimbalPinInfo() {
    }

    public GimbalPinInfo(Double d2, Double d3, Double d4, Double d5, Boolean bl, Double d6, Double d7, Double d8) {
    }

    public static GimbalPinInfo fromJson(String string) {
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

    public Double getQuaternionW() {
        return null;
    }

    public void setQuaternionW(Double d2) {
    }

    public Double getQuaternionX() {
        return null;
    }

    public void setQuaternionX(Double d2) {
    }

    public Double getQuaternionY() {
        return null;
    }

    public void setQuaternionY(Double d2) {
    }

    public Double getQuaternionZ() {
        return null;
    }

    public void setQuaternionZ(Double d2) {
    }

    public Boolean getIsPosValid() {
        return null;
    }

    public void setIsPosValid(Boolean bl) {
    }

    public Double getLng() {
        return null;
    }

    public void setLng(Double d2) {
    }

    public Double getLat() {
        return null;
    }

    public void setLat(Double d2) {
    }

    public Double getAlt() {
        return null;
    }

    public void setAlt(Double d2) {
    }

    public String toString() {
        return null;
    }
}

