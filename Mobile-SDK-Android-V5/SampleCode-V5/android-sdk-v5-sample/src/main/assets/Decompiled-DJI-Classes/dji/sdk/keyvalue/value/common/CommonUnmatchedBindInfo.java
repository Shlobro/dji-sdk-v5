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
import org.json.JSONObject;

public class CommonUnmatchedBindInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer availableUseCount;
    CareSNsMsg snsInfo;
    Boolean bindDeviceConnected;

    public CommonUnmatchedBindInfo() {
    }

    public CommonUnmatchedBindInfo(Integer n, CareSNsMsg careSNsMsg, Boolean bl) {
    }

    public static CommonUnmatchedBindInfo fromJson(String string) {
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

    public Integer getAvailableUseCount() {
        return null;
    }

    public void setAvailableUseCount(Integer n) {
    }

    public CareSNsMsg getSnsInfo() {
        return null;
    }

    public void setSnsInfo(CareSNsMsg careSNsMsg) {
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

