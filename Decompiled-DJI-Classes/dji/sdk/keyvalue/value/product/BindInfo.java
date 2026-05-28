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
import dji.sdk.keyvalue.value.common.StringMsg;
import dji.sdk.keyvalue.value.product.BindDeviceType;
import dji.sdk.keyvalue.value.product.SNsMsg;
import org.json.JSONObject;

public class BindInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    SNsMsg snsInfo;
    Integer droneType;
    BindDeviceType bindDeviceType;
    StringMsg droneName;

    public BindInfo() {
    }

    public BindInfo(SNsMsg sNsMsg, Integer n, BindDeviceType bindDeviceType, StringMsg stringMsg) {
    }

    public static BindInfo fromJson(String string) {
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

    public SNsMsg getSnsInfo() {
        return null;
    }

    public void setSnsInfo(SNsMsg sNsMsg) {
    }

    public Integer getDroneType() {
        return null;
    }

    public void setDroneType(Integer n) {
    }

    public BindDeviceType getBindDeviceType() {
        return null;
    }

    public void setBindDeviceType(BindDeviceType bindDeviceType) {
    }

    public StringMsg getDroneName() {
        return null;
    }

    public void setDroneName(StringMsg stringMsg) {
    }

    public String toString() {
        return null;
    }
}

