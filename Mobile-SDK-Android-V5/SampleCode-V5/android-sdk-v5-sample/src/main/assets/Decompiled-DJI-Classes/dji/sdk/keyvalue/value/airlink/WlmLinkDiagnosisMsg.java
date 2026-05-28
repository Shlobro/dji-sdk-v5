/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.WlmLinkDiagnosisFailReason;
import dji.sdk.keyvalue.value.airlink.WlmLinkQualityLevel;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class WlmLinkDiagnosisMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WlmLinkQualityLevel deviceNetworkQuality;
    WlmLinkQualityLevel deviceServerQuality;
    WlmLinkDiagnosisFailReason failReason;

    public WlmLinkDiagnosisMsg() {
    }

    public WlmLinkDiagnosisMsg(WlmLinkQualityLevel wlmLinkQualityLevel, WlmLinkQualityLevel wlmLinkQualityLevel2, WlmLinkDiagnosisFailReason wlmLinkDiagnosisFailReason) {
    }

    public static WlmLinkDiagnosisMsg fromJson(String string) {
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

    public WlmLinkQualityLevel getDeviceNetworkQuality() {
        return null;
    }

    public void setDeviceNetworkQuality(WlmLinkQualityLevel wlmLinkQualityLevel) {
    }

    public WlmLinkQualityLevel getDeviceServerQuality() {
        return null;
    }

    public void setDeviceServerQuality(WlmLinkQualityLevel wlmLinkQualityLevel) {
    }

    public WlmLinkDiagnosisFailReason getFailReason() {
        return null;
    }

    public void setFailReason(WlmLinkDiagnosisFailReason wlmLinkDiagnosisFailReason) {
    }

    public String toString() {
        return null;
    }
}

