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

public class GimbalPathMissionExecutionSettings
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer curPointNum;
    Integer timeout;

    public GimbalPathMissionExecutionSettings() {
    }

    public GimbalPathMissionExecutionSettings(Integer n, Integer n2) {
    }

    public static GimbalPathMissionExecutionSettings fromJson(String string) {
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

    public Integer getCurPointNum() {
        return null;
    }

    public void setCurPointNum(Integer n) {
    }

    public Integer getTimeout() {
        return null;
    }

    public void setTimeout(Integer n) {
    }

    public String toString() {
        return null;
    }
}

