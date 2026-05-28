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

public class CameraOSDSettings
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean dateDisplayed;
    Boolean apertureDisplayed;
    Boolean shutterDisplayed;
    Boolean isoDisplayed;
    Boolean exposureCompensationDisplayed;
    Boolean sharpnessDisplayed;
    Boolean contrastDisplayed;
    Boolean saturationDisplayed;

    public CameraOSDSettings() {
    }

    public CameraOSDSettings(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, Boolean bl7, Boolean bl8) {
    }

    public static CameraOSDSettings fromJson(String string) {
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

    public Boolean getDateDisplayed() {
        return null;
    }

    public void setDateDisplayed(Boolean bl) {
    }

    public Boolean getApertureDisplayed() {
        return null;
    }

    public void setApertureDisplayed(Boolean bl) {
    }

    public Boolean getShutterDisplayed() {
        return null;
    }

    public void setShutterDisplayed(Boolean bl) {
    }

    public Boolean getIsoDisplayed() {
        return null;
    }

    public void setIsoDisplayed(Boolean bl) {
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

    public String toString() {
        return null;
    }
}

