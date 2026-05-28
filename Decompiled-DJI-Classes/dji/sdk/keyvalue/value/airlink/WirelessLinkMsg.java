/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.WlmLinkMode;
import dji.sdk.keyvalue.value.airlink.WlmLinkQualityLevel;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class WirelessLinkMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WlmLinkMode link_workmode;
    Boolean sdr_link_state;
    Boolean lte_link_state;
    WlmLinkQualityLevel sdr_quality;
    WlmLinkQualityLevel lte_quality;
    WlmLinkQualityLevel lte_uav_quality;
    WlmLinkQualityLevel lte_gnd_quality;

    public WirelessLinkMsg() {
    }

    public WirelessLinkMsg(WlmLinkMode wlmLinkMode, Boolean bl, Boolean bl2, WlmLinkQualityLevel wlmLinkQualityLevel, WlmLinkQualityLevel wlmLinkQualityLevel2, WlmLinkQualityLevel wlmLinkQualityLevel3, WlmLinkQualityLevel wlmLinkQualityLevel4) {
    }

    public static WirelessLinkMsg fromJson(String string) {
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

    public WlmLinkMode getLink_workmode() {
        return null;
    }

    public void setLink_workmode(WlmLinkMode wlmLinkMode) {
    }

    public Boolean getSdr_link_state() {
        return null;
    }

    public void setSdr_link_state(Boolean bl) {
    }

    public Boolean getLte_link_state() {
        return null;
    }

    public void setLte_link_state(Boolean bl) {
    }

    public WlmLinkQualityLevel getSdr_quality() {
        return null;
    }

    public void setSdr_quality(WlmLinkQualityLevel wlmLinkQualityLevel) {
    }

    public WlmLinkQualityLevel getLte_quality() {
        return null;
    }

    public void setLte_quality(WlmLinkQualityLevel wlmLinkQualityLevel) {
    }

    public WlmLinkQualityLevel getLte_uav_quality() {
        return null;
    }

    public void setLte_uav_quality(WlmLinkQualityLevel wlmLinkQualityLevel) {
    }

    public WlmLinkQualityLevel getLte_gnd_quality() {
        return null;
    }

    public void setLte_gnd_quality(WlmLinkQualityLevel wlmLinkQualityLevel) {
    }

    public String toString() {
        return null;
    }
}

