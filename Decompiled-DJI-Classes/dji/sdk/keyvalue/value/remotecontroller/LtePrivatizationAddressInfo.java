/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class LtePrivatizationAddressInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String ipAddress;
    Integer port;

    public LtePrivatizationAddressInfo() {
    }

    public LtePrivatizationAddressInfo(String string, Integer n) {
    }

    public static LtePrivatizationAddressInfo fromJson(String string) {
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

    public String getIpAddress() {
        return null;
    }

    public void setIpAddress(String string) {
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

