/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.CareSNsMsg;
import dji.sdk.keyvalue.value.product.BindDeviceType;
import org.json.JSONObject;

public class CommonCareStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isProtectedByCare;
    BindDeviceType bindDeviceType;
    CareSNsMsg snsInfo;

    public CommonCareStatusMsg() {
    }

    public CommonCareStatusMsg(Boolean bl, BindDeviceType bindDeviceType, CareSNsMsg careSNsMsg) {
    }

    public static CommonCareStatusMsg fromJson(String string) {
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

    public Boolean getIsProtectedByCare() {
        return null;
    }

    public void setIsProtectedByCare(Boolean bl) {
    }

    public BindDeviceType getBindDeviceType() {
        return null;
    }

    public void setBindDeviceType(BindDeviceType bindDeviceType) {
    }

    public CareSNsMsg getSnsInfo() {
        return null;
    }

    public void setSnsInfo(CareSNsMsg careSNsMsg) {
    }

    public String toString() {
        return null;
    }
}

