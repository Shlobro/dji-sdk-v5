/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.WlmDeviceId;
import dji.sdk.keyvalue.value.airlink.WlmLinkMode;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class WlmDeviceInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WlmDeviceId deviceId;
    Boolean isSdrConnected;
    Boolean isLteConnected;
    Boolean isWifiConnected;
    Long sdrLinkUpdateTimeStamp;
    Long lteLinkUpdateTimeStamp;
    Long wifiLinkUpdateTimeStamp;
    WlmLinkMode downloadChannelLinkMode;
    Boolean isSelected;

    public WlmDeviceInfo() {
    }

    public WlmDeviceInfo(WlmDeviceId wlmDeviceId, Boolean bl, Boolean bl2, Boolean bl3, Long l2, Long l3, Long l4, WlmLinkMode wlmLinkMode, Boolean bl4) {
    }

    public static WlmDeviceInfo fromJson(String string) {
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

    public WlmDeviceId getDeviceId() {
        return null;
    }

    public void setDeviceId(WlmDeviceId wlmDeviceId) {
    }

    public Boolean getIsSdrConnected() {
        return null;
    }

    public void setIsSdrConnected(Boolean bl) {
    }

    public Boolean getIsLteConnected() {
        return null;
    }

    public void setIsLteConnected(Boolean bl) {
    }

    public Boolean getIsWifiConnected() {
        return null;
    }

    public void setIsWifiConnected(Boolean bl) {
    }

    public Long getSdrLinkUpdateTimeStamp() {
        return null;
    }

    public void setSdrLinkUpdateTimeStamp(Long l2) {
    }

    public Long getLteLinkUpdateTimeStamp() {
        return null;
    }

    public void setLteLinkUpdateTimeStamp(Long l2) {
    }

    public Long getWifiLinkUpdateTimeStamp() {
        return null;
    }

    public void setWifiLinkUpdateTimeStamp(Long l2) {
    }

    public WlmLinkMode getDownloadChannelLinkMode() {
        return null;
    }

    public void setDownloadChannelLinkMode(WlmLinkMode wlmLinkMode) {
    }

    public Boolean getIsSelected() {
        return null;
    }

    public void setIsSelected(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

