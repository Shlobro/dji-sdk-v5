/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.WlmLinkQualityLevel;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class WlmLinkQualityLevelInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WlmLinkQualityLevel ocuSyncLinkQualityLevel;
    WlmLinkQualityLevel lteLinkQualityLevel;
    WlmLinkQualityLevel wifiLinkQualityLevel;
    WlmLinkQualityLevel totalLinkQualityLevel;
    WlmLinkQualityLevel ocuSyncSignalQualityLevel;
    WlmLinkQualityLevel lteSignalQualityLevel;
    WlmLinkQualityLevel wifiSignalQualityLevel;
    WlmLinkQualityLevel totalSignalQualityLevel;
    Boolean bIsLteSignalSeparateSupport;
    WlmLinkQualityLevel lteUavSingalBar;
    WlmLinkQualityLevel lteGndSingalBar;

    public WlmLinkQualityLevelInfo() {
    }

    public WlmLinkQualityLevelInfo(WlmLinkQualityLevel wlmLinkQualityLevel, WlmLinkQualityLevel wlmLinkQualityLevel2, WlmLinkQualityLevel wlmLinkQualityLevel3, WlmLinkQualityLevel wlmLinkQualityLevel4, WlmLinkQualityLevel wlmLinkQualityLevel5, WlmLinkQualityLevel wlmLinkQualityLevel6, WlmLinkQualityLevel wlmLinkQualityLevel7, WlmLinkQualityLevel wlmLinkQualityLevel8, Boolean bl, WlmLinkQualityLevel wlmLinkQualityLevel9, WlmLinkQualityLevel wlmLinkQualityLevel10) {
    }

    public static WlmLinkQualityLevelInfo fromJson(String string) {
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

    public WlmLinkQualityLevel getOcuSyncLinkQualityLevel() {
        return null;
    }

    public void setOcuSyncLinkQualityLevel(WlmLinkQualityLevel wlmLinkQualityLevel) {
    }

    public WlmLinkQualityLevel getLteLinkQualityLevel() {
        return null;
    }

    public void setLteLinkQualityLevel(WlmLinkQualityLevel wlmLinkQualityLevel) {
    }

    public WlmLinkQualityLevel getWifiLinkQualityLevel() {
        return null;
    }

    public void setWifiLinkQualityLevel(WlmLinkQualityLevel wlmLinkQualityLevel) {
    }

    public WlmLinkQualityLevel getTotalLinkQualityLevel() {
        return null;
    }

    public void setTotalLinkQualityLevel(WlmLinkQualityLevel wlmLinkQualityLevel) {
    }

    public WlmLinkQualityLevel getOcuSyncSignalQualityLevel() {
        return null;
    }

    public void setOcuSyncSignalQualityLevel(WlmLinkQualityLevel wlmLinkQualityLevel) {
    }

    public WlmLinkQualityLevel getLteSignalQualityLevel() {
        return null;
    }

    public void setLteSignalQualityLevel(WlmLinkQualityLevel wlmLinkQualityLevel) {
    }

    public WlmLinkQualityLevel getWifiSignalQualityLevel() {
        return null;
    }

    public void setWifiSignalQualityLevel(WlmLinkQualityLevel wlmLinkQualityLevel) {
    }

    public WlmLinkQualityLevel getTotalSignalQualityLevel() {
        return null;
    }

    public void setTotalSignalQualityLevel(WlmLinkQualityLevel wlmLinkQualityLevel) {
    }

    public Boolean getBIsLteSignalSeparateSupport() {
        return null;
    }

    public void setBIsLteSignalSeparateSupport(Boolean bl) {
    }

    public WlmLinkQualityLevel getLteUavSingalBar() {
        return null;
    }

    public void setLteUavSingalBar(WlmLinkQualityLevel wlmLinkQualityLevel) {
    }

    public WlmLinkQualityLevel getLteGndSingalBar() {
        return null;
    }

    public void setLteGndSingalBar(WlmLinkQualityLevel wlmLinkQualityLevel) {
    }

    public String toString() {
        return null;
    }
}

