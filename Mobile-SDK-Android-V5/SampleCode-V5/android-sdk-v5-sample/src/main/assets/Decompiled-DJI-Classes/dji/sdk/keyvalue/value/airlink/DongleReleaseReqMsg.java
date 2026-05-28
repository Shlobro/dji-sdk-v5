/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.DongleLanguage;
import dji.sdk.keyvalue.value.airlink.WlmDeviceType;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class DongleReleaseReqMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WlmDeviceType type;
    DongleLanguage language;
    String dongleId;

    public DongleReleaseReqMsg() {
    }

    public DongleReleaseReqMsg(WlmDeviceType wlmDeviceType, DongleLanguage dongleLanguage, String string) {
    }

    public static DongleReleaseReqMsg fromJson(String string) {
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

    public WlmDeviceType getType() {
        return null;
    }

    public void setType(WlmDeviceType wlmDeviceType) {
    }

    public DongleLanguage getLanguage() {
        return null;
    }

    public void setLanguage(DongleLanguage dongleLanguage) {
    }

    public String getDongleId() {
        return null;
    }

    public void setDongleId(String string) {
    }

    public String toString() {
        return null;
    }
}

