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
import dji.sdk.keyvalue.value.product.BindDeviceType;
import dji.sdk.keyvalue.value.product.SNsMsg;
import org.json.JSONObject;

public class CareStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isProtectedByCare;
    BindDeviceType bindDeviceType;
    SNsMsg snsInfo;

    public CareStatusMsg() {
    }

    public CareStatusMsg(Boolean bl, BindDeviceType bindDeviceType, SNsMsg sNsMsg) {
    }

    public static CareStatusMsg fromJson(String string) {
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

    public SNsMsg getSnsInfo() {
        return null;
    }

    public void setSnsInfo(SNsMsg sNsMsg) {
    }

    public String toString() {
        return null;
    }
}

