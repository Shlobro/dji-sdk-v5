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
import dji.sdk.keyvalue.value.lidar.LidarDataSampleRateMode;
import org.json.JSONObject;

public class LidarDataSampleRateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LidarDataSampleRateMode value;

    public LidarDataSampleRateMsg() {
    }

    public LidarDataSampleRateMsg(LidarDataSampleRateMode lidarDataSampleRateMode) {
    }

    public static LidarDataSampleRateMsg fromJson(String string) {
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

    public LidarDataSampleRateMode getValue() {
        return null;
    }

    public void setValue(LidarDataSampleRateMode lidarDataSampleRateMode) {
    }

    public String toString() {
        return null;
    }
}

