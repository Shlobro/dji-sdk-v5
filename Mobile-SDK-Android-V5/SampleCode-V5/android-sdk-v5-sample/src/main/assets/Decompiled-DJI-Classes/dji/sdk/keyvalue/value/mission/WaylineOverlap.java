/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class WaylineOverlap
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer orthoLidarOverlapH;
    Integer orthoLidarOverlapW;
    Integer orthoCameraOverlapH;
    Integer orthoCameraOverlapW;
    Integer inclinedLidarOverlapH;
    Integer inclinedLidarOverlapW;
    Integer inclinedCameraOverlapH;
    Integer inclinedCameraOverlapW;

    public WaylineOverlap() {
    }

    public WaylineOverlap(Integer n, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6, Integer n7, Integer n8) {
    }

    public static WaylineOverlap fromJson(String string) {
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

    public Integer getOrthoLidarOverlapH() {
        return null;
    }

    public void setOrthoLidarOverlapH(Integer n) {
    }

    public Integer getOrthoLidarOverlapW() {
        return null;
    }

    public void setOrthoLidarOverlapW(Integer n) {
    }

    public Integer getOrthoCameraOverlapH() {
        return null;
    }

    public void setOrthoCameraOverlapH(Integer n) {
    }

    public Integer getOrthoCameraOverlapW() {
        return null;
    }

    public void setOrthoCameraOverlapW(Integer n) {
    }

    public Integer getInclinedLidarOverlapH() {
        return null;
    }

    public void setInclinedLidarOverlapH(Integer n) {
    }

    public Integer getInclinedLidarOverlapW() {
        return null;
    }

    public void setInclinedLidarOverlapW(Integer n) {
    }

    public Integer getInclinedCameraOverlapH() {
        return null;
    }

    public void setInclinedCameraOverlapH(Integer n) {
    }

    public Integer getInclinedCameraOverlapW() {
        return null;
    }

    public void setInclinedCameraOverlapW(Integer n) {
    }

    public String toString() {
        return null;
    }
}

