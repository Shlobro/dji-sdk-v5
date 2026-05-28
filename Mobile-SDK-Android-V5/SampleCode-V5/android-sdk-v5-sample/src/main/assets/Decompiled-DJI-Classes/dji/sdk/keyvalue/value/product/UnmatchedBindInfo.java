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
import dji.sdk.keyvalue.value.product.SNsMsg;
import org.json.JSONObject;

public class UnmatchedBindInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer availableFlightCount;
    SNsMsg snsInfo;
    Boolean bindDeviceConnected;

    public UnmatchedBindInfo() {
    }

    public UnmatchedBindInfo(Integer n, SNsMsg sNsMsg, Boolean bl) {
    }

    public static UnmatchedBindInfo fromJson(String string) {
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

    public Integer getAvailableFlightCount() {
        return null;
    }

    public void setAvailableFlightCount(Integer n) {
    }

    public SNsMsg getSnsInfo() {
        return null;
    }

    public void setSnsInfo(SNsMsg sNsMsg) {
    }

    public Boolean getBindDeviceConnected() {
        return null;
    }

    public void setBindDeviceConnected(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

