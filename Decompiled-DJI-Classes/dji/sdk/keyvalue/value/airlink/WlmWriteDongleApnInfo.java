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
import dji.sdk.keyvalue.value.airlink.WlmDongleApnInfo;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class WlmWriteDongleApnInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WlmDeviceType belongDevice;
    String dongleSn;
    Integer networkType;
    WlmDongleApnInfo apnInfo;

    public WlmWriteDongleApnInfo() {
    }

    public WlmWriteDongleApnInfo(WlmDeviceType wlmDeviceType, String string, Integer n, WlmDongleApnInfo wlmDongleApnInfo) {
    }

    public static WlmWriteDongleApnInfo fromJson(String string) {
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

    public WlmDeviceType getBelongDevice() {
        return null;
    }

    public void setBelongDevice(WlmDeviceType wlmDeviceType) {
    }

    public String getDongleSn() {
        return null;
    }

    public void setDongleSn(String string) {
    }

    public Integer getNetworkType() {
        return null;
    }

    public void setNetworkType(Integer n) {
    }

    public WlmDongleApnInfo getApnInfo() {
        return null;
    }

    public void setApnInfo(WlmDongleApnInfo wlmDongleApnInfo) {
    }

    public String toString() {
        return null;
    }
}

