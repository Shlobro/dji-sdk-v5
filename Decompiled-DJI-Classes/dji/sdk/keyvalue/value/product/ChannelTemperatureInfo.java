/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class ChannelTemperatureInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer channelId;
    Double temperature;

    public ChannelTemperatureInfo() {
    }

    public ChannelTemperatureInfo(Integer n, Double d2) {
    }

    public static ChannelTemperatureInfo fromJson(String string) {
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

    public Integer getChannelId() {
        return null;
    }

    public void setChannelId(Integer n) {
    }

    public Double getTemperature() {
        return null;
    }

    public void setTemperature(Double d2) {
    }

    public String toString() {
        return null;
    }
}

