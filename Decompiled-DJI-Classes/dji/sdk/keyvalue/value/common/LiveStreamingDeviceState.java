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
import dji.sdk.keyvalue.value.camera.CameraSDCardState;
import org.json.JSONObject;

public class LiveStreamingDeviceState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CameraSDCardState sdCardState;
    Boolean isHeatTurningOffWiFi;
    Integer batteryPercentage;

    public LiveStreamingDeviceState() {
    }

    public LiveStreamingDeviceState(CameraSDCardState cameraSDCardState, Boolean bl, Integer n) {
    }

    public static LiveStreamingDeviceState fromJson(String string) {
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

    public CameraSDCardState getSdCardState() {
        return null;
    }

    public void setSdCardState(CameraSDCardState cameraSDCardState) {
    }

    public Boolean getIsHeatTurningOffWiFi() {
        return null;
    }

    public void setIsHeatTurningOffWiFi(Boolean bl) {
    }

    public Integer getBatteryPercentage() {
        return null;
    }

    public void setBatteryPercentage(Integer n) {
    }

    public String toString() {
        return null;
    }
}

