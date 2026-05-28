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
import dji.sdk.keyvalue.value.common.CareDeviceType;
import dji.sdk.keyvalue.value.common.CareSNsMsg;
import dji.sdk.keyvalue.value.common.StringMsg;
import dji.sdk.keyvalue.value.product.BindDeviceType;
import org.json.JSONObject;

public class CareBindInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CareSNsMsg snsInfo;
    CareDeviceType careDeviceType;
    Integer careDeviceDetailType;
    BindDeviceType bindDeviceType;
    StringMsg careDeviceName;

    public CareBindInfo() {
    }

    public CareBindInfo(CareSNsMsg careSNsMsg, CareDeviceType careDeviceType, Integer n, BindDeviceType bindDeviceType, StringMsg stringMsg) {
    }

    public static CareBindInfo fromJson(String string) {
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

    public CareSNsMsg getSnsInfo() {
        return null;
    }

    public void setSnsInfo(CareSNsMsg careSNsMsg) {
    }

    public CareDeviceType getCareDeviceType() {
        return null;
    }

    public void setCareDeviceType(CareDeviceType careDeviceType) {
    }

    public Integer getCareDeviceDetailType() {
        return null;
    }

    public void setCareDeviceDetailType(Integer n) {
    }

    public BindDeviceType getBindDeviceType() {
        return null;
    }

    public void setBindDeviceType(BindDeviceType bindDeviceType) {
    }

    public StringMsg getCareDeviceName() {
        return null;
    }

    public void setCareDeviceName(StringMsg stringMsg) {
    }

    public String toString() {
        return null;
    }
}

