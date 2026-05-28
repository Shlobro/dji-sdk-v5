/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.lidar;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class LidarPointCloudPredictionInputMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double reflectPercent;
    Double flightHigh;
    Double flightVelocity;
    Double lidarOverlapRate;
    Integer lidarFreqMode;
    Integer lidarPatternMode;

    public LidarPointCloudPredictionInputMsg() {
    }

    public LidarPointCloudPredictionInputMsg(Double d2, Double d3, Double d4, Double d5, Integer n, Integer n2) {
    }

    public static LidarPointCloudPredictionInputMsg fromJson(String string) {
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

    public Double getReflectPercent() {
        return null;
    }

    public void setReflectPercent(Double d2) {
    }

    public Double getFlightHigh() {
        return null;
    }

    public void setFlightHigh(Double d2) {
    }

    public Double getFlightVelocity() {
        return null;
    }

    public void setFlightVelocity(Double d2) {
    }

    public Double getLidarOverlapRate() {
        return null;
    }

    public void setLidarOverlapRate(Double d2) {
    }

    public Integer getLidarFreqMode() {
        return null;
    }

    public void setLidarFreqMode(Integer n) {
    }

    public Integer getLidarPatternMode() {
        return null;
    }

    public void setLidarPatternMode(Integer n) {
    }

    public String toString() {
        return null;
    }
}

