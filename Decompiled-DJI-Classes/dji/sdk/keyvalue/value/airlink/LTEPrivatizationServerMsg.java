/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.WlmDeviceType;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class LTEPrivatizationServerMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WlmDeviceType deviceType;
    Boolean enable;
    String ip;
    Integer port;

    public LTEPrivatizationServerMsg() {
    }

    public LTEPrivatizationServerMsg(WlmDeviceType wlmDeviceType, Boolean bl, String string, Integer n) {
    }

    public static LTEPrivatizationServerMsg fromJson(String string) {
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

    public WlmDeviceType getDeviceType() {
        return null;
    }

    public void setDeviceType(WlmDeviceType wlmDeviceType) {
    }

    public Boolean getEnable() {
        return null;
    }

    public void setEnable(Boolean bl) {
    }

    public String getIp() {
        return null;
    }

    public void setIp(String string) {
    }

    public Integer getPort() {
        return null;
    }

    public void setPort(Integer n) {
    }

    public String toString() {
        return null;
    }
}

