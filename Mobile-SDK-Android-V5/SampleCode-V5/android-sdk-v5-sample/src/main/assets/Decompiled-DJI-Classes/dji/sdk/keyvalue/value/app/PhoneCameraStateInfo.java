/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.app;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class PhoneCameraStateInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer fovHorizontalAngle;
    Integer fovVerticalAngle;
    Double zoomFactor;
    Integer currentOrientation;
    Integer currentCameraMode;

    public PhoneCameraStateInfo() {
    }

    public PhoneCameraStateInfo(Integer n, Integer n2, Double d2, Integer n3, Integer n4) {
    }

    public static PhoneCameraStateInfo fromJson(String string) {
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

    public Integer getFovHorizontalAngle() {
        return null;
    }

    public void setFovHorizontalAngle(Integer n) {
    }

    public Integer getFovVerticalAngle() {
        return null;
    }

    public void setFovVerticalAngle(Integer n) {
    }

    public Double getZoomFactor() {
        return null;
    }

    public void setZoomFactor(Double d2) {
    }

    public Integer getCurrentOrientation() {
        return null;
    }

    public void setCurrentOrientation(Integer n) {
    }

    public Integer getCurrentCameraMode() {
        return null;
    }

    public void setCurrentCameraMode(Integer n) {
    }

    public String toString() {
        return null;
    }
}

