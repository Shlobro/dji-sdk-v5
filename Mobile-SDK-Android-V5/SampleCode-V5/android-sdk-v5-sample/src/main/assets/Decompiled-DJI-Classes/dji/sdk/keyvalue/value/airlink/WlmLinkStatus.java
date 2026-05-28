/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.WlmDownloadServiceMode;
import dji.sdk.keyvalue.value.airlink.WlmLinkFrequenceBand;
import dji.sdk.keyvalue.value.airlink.WlmLinkMode;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class WlmLinkStatus
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isOcuSyncLinkConnected;
    Boolean isLteLinkConnected;
    Boolean isWifiLinkConnected;
    WlmLinkFrequenceBand SdrFrequenceBand;
    WlmLinkFrequenceBand LteFrequenceBand;
    WlmLinkFrequenceBand WifiFrequenceBand;
    WlmLinkMode peerCmdChannelLinkMode;
    WlmLinkMode localCmdChannelLinkMode;
    WlmLinkMode peerLiveViewChannelLinkMode;
    WlmLinkMode localLiveViewChannelLinkMode;
    WlmLinkMode peerDownloadChannelLinkMode;
    WlmLinkMode localDownloadChannelLinkMode;
    WlmDownloadServiceMode peerDownloadMode;
    WlmDownloadServiceMode localDownloadMode;

    public WlmLinkStatus() {
    }

    public WlmLinkStatus(Boolean bl, Boolean bl2, Boolean bl3, WlmLinkFrequenceBand wlmLinkFrequenceBand, WlmLinkFrequenceBand wlmLinkFrequenceBand2, WlmLinkFrequenceBand wlmLinkFrequenceBand3, WlmLinkMode wlmLinkMode, WlmLinkMode wlmLinkMode2, WlmLinkMode wlmLinkMode3, WlmLinkMode wlmLinkMode4, WlmLinkMode wlmLinkMode5, WlmLinkMode wlmLinkMode6, WlmDownloadServiceMode wlmDownloadServiceMode, WlmDownloadServiceMode wlmDownloadServiceMode2) {
    }

    public static WlmLinkStatus fromJson(String string) {
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

    public Boolean getIsOcuSyncLinkConnected() {
        return null;
    }

    public void setIsOcuSyncLinkConnected(Boolean bl) {
    }

    public Boolean getIsLteLinkConnected() {
        return null;
    }

    public void setIsLteLinkConnected(Boolean bl) {
    }

    public Boolean getIsWifiLinkConnected() {
        return null;
    }

    public void setIsWifiLinkConnected(Boolean bl) {
    }

    public WlmLinkFrequenceBand getSdrFrequenceBand() {
        return null;
    }

    public void setSdrFrequenceBand(WlmLinkFrequenceBand wlmLinkFrequenceBand) {
    }

    public WlmLinkFrequenceBand getLteFrequenceBand() {
        return null;
    }

    public void setLteFrequenceBand(WlmLinkFrequenceBand wlmLinkFrequenceBand) {
    }

    public WlmLinkFrequenceBand getWifiFrequenceBand() {
        return null;
    }

    public void setWifiFrequenceBand(WlmLinkFrequenceBand wlmLinkFrequenceBand) {
    }

    public WlmLinkMode getPeerCmdChannelLinkMode() {
        return null;
    }

    public void setPeerCmdChannelLinkMode(WlmLinkMode wlmLinkMode) {
    }

    public WlmLinkMode getLocalCmdChannelLinkMode() {
        return null;
    }

    public void setLocalCmdChannelLinkMode(WlmLinkMode wlmLinkMode) {
    }

    public WlmLinkMode getPeerLiveViewChannelLinkMode() {
        return null;
    }

    public void setPeerLiveViewChannelLinkMode(WlmLinkMode wlmLinkMode) {
    }

    public WlmLinkMode getLocalLiveViewChannelLinkMode() {
        return null;
    }

    public void setLocalLiveViewChannelLinkMode(WlmLinkMode wlmLinkMode) {
    }

    public WlmLinkMode getPeerDownloadChannelLinkMode() {
        return null;
    }

    public void setPeerDownloadChannelLinkMode(WlmLinkMode wlmLinkMode) {
    }

    public WlmLinkMode getLocalDownloadChannelLinkMode() {
        return null;
    }

    public void setLocalDownloadChannelLinkMode(WlmLinkMode wlmLinkMode) {
    }

    public WlmDownloadServiceMode getPeerDownloadMode() {
        return null;
    }

    public void setPeerDownloadMode(WlmDownloadServiceMode wlmDownloadServiceMode) {
    }

    public WlmDownloadServiceMode getLocalDownloadMode() {
        return null;
    }

    public void setLocalDownloadMode(WlmDownloadServiceMode wlmDownloadServiceMode) {
    }

    public String toString() {
        return null;
    }
}

