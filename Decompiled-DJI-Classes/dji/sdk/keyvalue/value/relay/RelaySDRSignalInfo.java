/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.relay;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.WlmDeviceType;
import dji.sdk.keyvalue.value.airlink.WlmLinkQualityLevel;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class RelaySDRSignalInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WlmDeviceType deviceType;
    Integer deviceIndex;
    Integer deviceModel;
    WlmLinkQualityLevel signalLevel;

    public RelaySDRSignalInfo() {
    }

    public RelaySDRSignalInfo(WlmDeviceType wlmDeviceType, Integer n, Integer n2, WlmLinkQualityLevel wlmLinkQualityLevel) {
    }

    public static RelaySDRSignalInfo fromJson(String string) {
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

    public WlmDeviceType getDeviceType() {
        return null;
    }

    public void setDeviceType(WlmDeviceType wlmDeviceType) {
    }

    public Integer getDeviceIndex() {
        return null;
    }

    public void setDeviceIndex(Integer n) {
    }

    public Integer getDeviceModel() {
        return null;
    }

    public void setDeviceModel(Integer n) {
    }

    public WlmLinkQualityLevel getSignalLevel() {
        return null;
    }

    public void setSignalLevel(WlmLinkQualityLevel wlmLinkQualityLevel) {
    }

    public String toString() {
        return null;
    }
}

