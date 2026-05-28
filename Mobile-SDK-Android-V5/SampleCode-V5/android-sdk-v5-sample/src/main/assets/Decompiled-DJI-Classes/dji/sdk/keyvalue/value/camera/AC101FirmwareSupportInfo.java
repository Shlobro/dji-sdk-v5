/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class AC101FirmwareSupportInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean hyperlapseSupported;
    Boolean rocksteadySupprted;
    Boolean intervalUpdated;
    Boolean minimumIntervalSupported;
    Boolean fileListGroupFetchSupported;
    Boolean underwaterWhiteBalanceSupported;
    Boolean evAdjustSupported;
    Boolean loopRecordSupported;
    Boolean liveStreamingSupported;
    Boolean liveStreamingDewarpSupported;
    Boolean liveStreamingPlatformKwaiSupported;

    public AC101FirmwareSupportInfo() {
    }

    public AC101FirmwareSupportInfo(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, Boolean bl7, Boolean bl8, Boolean bl9, Boolean bl10, Boolean bl11) {
    }

    public static AC101FirmwareSupportInfo fromJson(String string) {
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

    public Boolean getHyperlapseSupported() {
        return null;
    }

    public void setHyperlapseSupported(Boolean bl) {
    }

    public Boolean getRocksteadySupprted() {
        return null;
    }

    public void setRocksteadySupprted(Boolean bl) {
    }

    public Boolean getIntervalUpdated() {
        return null;
    }

    public void setIntervalUpdated(Boolean bl) {
    }

    public Boolean getMinimumIntervalSupported() {
        return null;
    }

    public void setMinimumIntervalSupported(Boolean bl) {
    }

    public Boolean getFileListGroupFetchSupported() {
        return null;
    }

    public void setFileListGroupFetchSupported(Boolean bl) {
    }

    public Boolean getUnderwaterWhiteBalanceSupported() {
        return null;
    }

    public void setUnderwaterWhiteBalanceSupported(Boolean bl) {
    }

    public Boolean getEvAdjustSupported() {
        return null;
    }

    public void setEvAdjustSupported(Boolean bl) {
    }

    public Boolean getLoopRecordSupported() {
        return null;
    }

    public void setLoopRecordSupported(Boolean bl) {
    }

    public Boolean getLiveStreamingSupported() {
        return null;
    }

    public void setLiveStreamingSupported(Boolean bl) {
    }

    public Boolean getLiveStreamingDewarpSupported() {
        return null;
    }

    public void setLiveStreamingDewarpSupported(Boolean bl) {
    }

    public Boolean getLiveStreamingPlatformKwaiSupported() {
        return null;
    }

    public void setLiveStreamingPlatformKwaiSupported(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

