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

public class OSMOPocketFirmwareSupportInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean fpvModeSupportTracking;
    Boolean flashlightModeSupportReversal;
    Boolean slowMotionSupport4Ratio;
    Boolean slowMotionSupport8Ratio;
    Boolean cinelikeSupport;
    Boolean frameRate25And50Support;
    Boolean liveViewSupportAutoReversal;
    Boolean normalModeSupportAF;
    Boolean supportHyperLapse;
    Boolean fileListGroupFetchSupported;
    Boolean videoSupport2Dot7k;
    Boolean appResumeDownloadSupported;
    Boolean supportListBuriedData;

    public OSMOPocketFirmwareSupportInfo() {
    }

    public OSMOPocketFirmwareSupportInfo(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, Boolean bl7, Boolean bl8, Boolean bl9, Boolean bl10, Boolean bl11, Boolean bl12, Boolean bl13) {
    }

    public static OSMOPocketFirmwareSupportInfo fromJson(String string) {
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

    public Boolean getFpvModeSupportTracking() {
        return null;
    }

    public void setFpvModeSupportTracking(Boolean bl) {
    }

    public Boolean getFlashlightModeSupportReversal() {
        return null;
    }

    public void setFlashlightModeSupportReversal(Boolean bl) {
    }

    public Boolean getSlowMotionSupport4Ratio() {
        return null;
    }

    public void setSlowMotionSupport4Ratio(Boolean bl) {
    }

    public Boolean getSlowMotionSupport8Ratio() {
        return null;
    }

    public void setSlowMotionSupport8Ratio(Boolean bl) {
    }

    public Boolean getCinelikeSupport() {
        return null;
    }

    public void setCinelikeSupport(Boolean bl) {
    }

    public Boolean getFrameRate25And50Support() {
        return null;
    }

    public void setFrameRate25And50Support(Boolean bl) {
    }

    public Boolean getLiveViewSupportAutoReversal() {
        return null;
    }

    public void setLiveViewSupportAutoReversal(Boolean bl) {
    }

    public Boolean getNormalModeSupportAF() {
        return null;
    }

    public void setNormalModeSupportAF(Boolean bl) {
    }

    public Boolean getSupportHyperLapse() {
        return null;
    }

    public void setSupportHyperLapse(Boolean bl) {
    }

    public Boolean getFileListGroupFetchSupported() {
        return null;
    }

    public void setFileListGroupFetchSupported(Boolean bl) {
    }

    public Boolean getVideoSupport2Dot7k() {
        return null;
    }

    public void setVideoSupport2Dot7k(Boolean bl) {
    }

    public Boolean getAppResumeDownloadSupported() {
        return null;
    }

    public void setAppResumeDownloadSupported(Boolean bl) {
    }

    public Boolean getSupportListBuriedData() {
        return null;
    }

    public void setSupportListBuriedData(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

