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

public class CameraPreviewOSDSettings
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean dateDisplay;
    Boolean apertureDisplay;
    Boolean shutterDisplay;
    Boolean isoDisplay;
    Boolean exposureCompensationDisplayed;
    Boolean sharpnessDisplayed;
    Boolean contrastDisplayed;
    Boolean saturationDisplayed;
    Boolean shootPhotoModeDisplayed;
    Boolean photoResolutionDisplayed;
    Boolean qualityDisplayed;
    Boolean histogramDisplayed;
    Boolean batteryDisplayed;

    public CameraPreviewOSDSettings() {
    }

    public CameraPreviewOSDSettings(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, Boolean bl7, Boolean bl8, Boolean bl9, Boolean bl10, Boolean bl11, Boolean bl12, Boolean bl13) {
    }

    public static CameraPreviewOSDSettings fromJson(String string) {
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

    public Boolean getDateDisplay() {
        return null;
    }

    public void setDateDisplay(Boolean bl) {
    }

    public Boolean getApertureDisplay() {
        return null;
    }

    public void setApertureDisplay(Boolean bl) {
    }

    public Boolean getShutterDisplay() {
        return null;
    }

    public void setShutterDisplay(Boolean bl) {
    }

    public Boolean getIsoDisplay() {
        return null;
    }

    public void setIsoDisplay(Boolean bl) {
    }

    public Boolean getExposureCompensationDisplayed() {
        return null;
    }

    public void setExposureCompensationDisplayed(Boolean bl) {
    }

    public Boolean getSharpnessDisplayed() {
        return null;
    }

    public void setSharpnessDisplayed(Boolean bl) {
    }

    public Boolean getContrastDisplayed() {
        return null;
    }

    public void setContrastDisplayed(Boolean bl) {
    }

    public Boolean getSaturationDisplayed() {
        return null;
    }

    public void setSaturationDisplayed(Boolean bl) {
    }

    public Boolean getShootPhotoModeDisplayed() {
        return null;
    }

    public void setShootPhotoModeDisplayed(Boolean bl) {
    }

    public Boolean getPhotoResolutionDisplayed() {
        return null;
    }

    public void setPhotoResolutionDisplayed(Boolean bl) {
    }

    public Boolean getQualityDisplayed() {
        return null;
    }

    public void setQualityDisplayed(Boolean bl) {
    }

    public Boolean getHistogramDisplayed() {
        return null;
    }

    public void setHistogramDisplayed(Boolean bl) {
    }

    public Boolean getBatteryDisplayed() {
        return null;
    }

    public void setBatteryDisplayed(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

