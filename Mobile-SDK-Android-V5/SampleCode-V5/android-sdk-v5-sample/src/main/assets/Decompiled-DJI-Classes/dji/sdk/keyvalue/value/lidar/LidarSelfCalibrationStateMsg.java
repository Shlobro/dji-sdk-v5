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
import dji.sdk.keyvalue.value.lidar.LidarSelfCaliResult;
import dji.sdk.keyvalue.value.lidar.LidarSelfCaliStage;
import org.json.JSONObject;

public class LidarSelfCalibrationStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LidarSelfCaliStage stage;
    Integer progress;
    LidarSelfCaliResult result;

    public LidarSelfCalibrationStateMsg() {
    }

    public LidarSelfCalibrationStateMsg(LidarSelfCaliStage lidarSelfCaliStage, Integer n, LidarSelfCaliResult lidarSelfCaliResult) {
    }

    public static LidarSelfCalibrationStateMsg fromJson(String string) {
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

    public LidarSelfCaliStage getStage() {
        return null;
    }

    public void setStage(LidarSelfCaliStage lidarSelfCaliStage) {
    }

    public Integer getProgress() {
        return null;
    }

    public void setProgress(Integer n) {
    }

    public LidarSelfCaliResult getResult() {
        return null;
    }

    public void setResult(LidarSelfCaliResult lidarSelfCaliResult) {
    }

    public String toString() {
        return null;
    }
}

