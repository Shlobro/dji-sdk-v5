/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.DongleSubscribeInfoSource;
import dji.sdk.keyvalue.value.airlink.WlmDeviceType;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class WlmDongleSubscribeInfoReqMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WlmDeviceType belongDevice;
    DongleSubscribeInfoSource infoSource;

    public WlmDongleSubscribeInfoReqMsg() {
    }

    public WlmDongleSubscribeInfoReqMsg(WlmDeviceType wlmDeviceType, DongleSubscribeInfoSource dongleSubscribeInfoSource) {
    }

    public static WlmDongleSubscribeInfoReqMsg fromJson(String string) {
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

    public DongleSubscribeInfoSource getInfoSource() {
        return null;
    }

    public void setInfoSource(DongleSubscribeInfoSource dongleSubscribeInfoSource) {
    }

    public String toString() {
        return null;
    }
}

