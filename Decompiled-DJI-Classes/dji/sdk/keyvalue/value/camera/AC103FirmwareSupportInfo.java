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

public class AC103FirmwareSupportInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean loopRecordSupporteded;
    Boolean slowMotion4kSupported;
    Boolean slowMotion8xSupported;
    Boolean video1080p200fps240fpsSupported;
    Boolean video4k100fps120fpsSupported;
    Boolean hyperlapse1080PLowPowerSupported;
    Boolean isoMax12800Supported;
    Boolean disableAppTranscodeRotateSupported;
    Boolean isEISSupportSteady;
    Boolean isEISSupportHorizontalSteady;

    public AC103FirmwareSupportInfo() {
    }

    public AC103FirmwareSupportInfo(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, Boolean bl7, Boolean bl8, Boolean bl9, Boolean bl10) {
    }

    public static AC103FirmwareSupportInfo fromJson(String string) {
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

    public Boolean getLoopRecordSupporteded() {
        return null;
    }

    public void setLoopRecordSupporteded(Boolean bl) {
    }

    public Boolean getSlowMotion4kSupported() {
        return null;
    }

    public void setSlowMotion4kSupported(Boolean bl) {
    }

    public Boolean getSlowMotion8xSupported() {
        return null;
    }

    public void setSlowMotion8xSupported(Boolean bl) {
    }

    public Boolean getVideo1080p200fps240fpsSupported() {
        return null;
    }

    public void setVideo1080p200fps240fpsSupported(Boolean bl) {
    }

    public Boolean getVideo4k100fps120fpsSupported() {
        return null;
    }

    public void setVideo4k100fps120fpsSupported(Boolean bl) {
    }

    public Boolean getHyperlapse1080PLowPowerSupported() {
        return null;
    }

    public void setHyperlapse1080PLowPowerSupported(Boolean bl) {
    }

    public Boolean getIsoMax12800Supported() {
        return null;
    }

    public void setIsoMax12800Supported(Boolean bl) {
    }

    public Boolean getDisableAppTranscodeRotateSupported() {
        return null;
    }

    public void setDisableAppTranscodeRotateSupported(Boolean bl) {
    }

    public Boolean getIsEISSupportSteady() {
        return null;
    }

    public void setIsEISSupportSteady(Boolean bl) {
    }

    public Boolean getIsEISSupportHorizontalSteady() {
        return null;
    }

    public void setIsEISSupportHorizontalSteady(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

