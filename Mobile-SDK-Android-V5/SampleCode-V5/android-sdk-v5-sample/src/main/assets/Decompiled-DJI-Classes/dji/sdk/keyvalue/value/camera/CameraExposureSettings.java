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
import dji.sdk.keyvalue.value.camera.CameraAperture;
import dji.sdk.keyvalue.value.camera.CameraExposureCompensation;
import dji.sdk.keyvalue.value.camera.CameraShutterSpeed;
import org.json.JSONObject;

public class CameraExposureSettings
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CameraAperture aperture;
    CameraShutterSpeed shutterSpeed;
    Integer iso;
    CameraExposureCompensation exposureCompensation;

    public CameraExposureSettings() {
    }

    public CameraExposureSettings(CameraAperture cameraAperture, CameraShutterSpeed cameraShutterSpeed, Integer n, CameraExposureCompensation cameraExposureCompensation) {
    }

    public static CameraExposureSettings fromJson(String string) {
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

    public CameraAperture getAperture() {
        return null;
    }

    public void setAperture(CameraAperture cameraAperture) {
    }

    public CameraShutterSpeed getShutterSpeed() {
        return null;
    }

    public void setShutterSpeed(CameraShutterSpeed cameraShutterSpeed) {
    }

    public Integer getIso() {
        return null;
    }

    public void setIso(Integer n) {
    }

    public CameraExposureCompensation getExposureCompensation() {
        return null;
    }

    public void setExposureCompensation(CameraExposureCompensation cameraExposureCompensation) {
    }

    public String toString() {
        return null;
    }
}

