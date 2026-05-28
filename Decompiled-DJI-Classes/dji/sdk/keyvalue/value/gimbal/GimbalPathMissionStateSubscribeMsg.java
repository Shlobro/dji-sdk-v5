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

public class GimbalPathMissionStateSubscribeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean requestOnce;
    Integer frequency;

    public GimbalPathMissionStateSubscribeMsg() {
    }

    public GimbalPathMissionStateSubscribeMsg(Boolean bl, Integer n) {
    }

    public static GimbalPathMissionStateSubscribeMsg fromJson(String string) {
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

    public Boolean getRequestOnce() {
        return null;
    }

    public void setRequestOnce(Boolean bl) {
    }

    public Integer getFrequency() {
        return null;
    }

    public void setFrequency(Integer n) {
    }

    public String toString() {
        return null;
    }
}

