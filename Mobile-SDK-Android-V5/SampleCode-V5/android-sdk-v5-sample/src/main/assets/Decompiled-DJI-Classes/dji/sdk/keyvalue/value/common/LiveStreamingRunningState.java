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
import dji.sdk.keyvalue.value.common.LiveStreamingPushState;
import dji.sdk.keyvalue.value.common.LiveStreamingQuitReason;
import dji.sdk.keyvalue.value.common.LiveStreamingWiFiState;
import org.json.JSONObject;

public class LiveStreamingRunningState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isInStreamingMode;
    LiveStreamingWiFiState wifiState;
    LiveStreamingPushState pushState;
    Integer liveTime;
    Integer bitRate;
    LiveStreamingQuitReason quitReason;

    public LiveStreamingRunningState() {
    }

    public LiveStreamingRunningState(Boolean bl, LiveStreamingWiFiState liveStreamingWiFiState, LiveStreamingPushState liveStreamingPushState, Integer n, Integer n2, LiveStreamingQuitReason liveStreamingQuitReason) {
    }

    public static LiveStreamingRunningState fromJson(String string) {
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

    public Boolean getIsInStreamingMode() {
        return null;
    }

    public void setIsInStreamingMode(Boolean bl) {
    }

    public LiveStreamingWiFiState getWifiState() {
        return null;
    }

    public void setWifiState(LiveStreamingWiFiState liveStreamingWiFiState) {
    }

    public LiveStreamingPushState getPushState() {
        return null;
    }

    public void setPushState(LiveStreamingPushState liveStreamingPushState) {
    }

    public Integer getLiveTime() {
        return null;
    }

    public void setLiveTime(Integer n) {
    }

    public Integer getBitRate() {
        return null;
    }

    public void setBitRate(Integer n) {
    }

    public LiveStreamingQuitReason getQuitReason() {
        return null;
    }

    public void setQuitReason(LiveStreamingQuitReason liveStreamingQuitReason) {
    }

    public String toString() {
        return null;
    }
}

