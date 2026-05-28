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
import dji.sdk.keyvalue.value.lidar.LidarCurWorkState;
import org.json.JSONObject;

public class LidarCurWorkStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LidarCurWorkState curWorkState;

    public LidarCurWorkStateMsg() {
    }

    public LidarCurWorkStateMsg(LidarCurWorkState lidarCurWorkState) {
    }

    public static LidarCurWorkStateMsg fromJson(String string) {
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

    public LidarCurWorkState getCurWorkState() {
        return null;
    }

    public void setCurWorkState(LidarCurWorkState lidarCurWorkState) {
    }

    public String toString() {
        return null;
    }
}

