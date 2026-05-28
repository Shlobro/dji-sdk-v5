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

public class GeoCagingInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double fg_latitude;
    Double fg_longitude;
    Integer fg_radius;
    Integer fg_height;
    Double cv_latitude;
    Double cv_longitude;
    Integer cv_radius;
    Integer cv_height;

    public GeoCagingInfo() {
    }

    public GeoCagingInfo(Double d2, Double d3, Integer n, Integer n2, Double d4, Double d5, Integer n3, Integer n4) {
    }

    public static GeoCagingInfo fromJson(String string) {
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

    public Double getFg_latitude() {
        return null;
    }

    public void setFg_latitude(Double d2) {
    }

    public Double getFg_longitude() {
        return null;
    }

    public void setFg_longitude(Double d2) {
    }

    public Integer getFg_radius() {
        return null;
    }

    public void setFg_radius(Integer n) {
    }

    public Integer getFg_height() {
        return null;
    }

    public void setFg_height(Integer n) {
    }

    public Double getCv_latitude() {
        return null;
    }

    public void setCv_latitude(Double d2) {
    }

    public Double getCv_longitude() {
        return null;
    }

    public void setCv_longitude(Double d2) {
    }

    public Integer getCv_radius() {
        return null;
    }

    public void setCv_radius(Integer n) {
    }

    public Integer getCv_height() {
        return null;
    }

    public void setCv_height(Integer n) {
    }

    public String toString() {
        return null;
    }
}

