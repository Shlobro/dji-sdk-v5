/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.mission.CameraTrackingMissionStopReason;
import dji.sdk.keyvalue.value.mission.TrackingRect;
import dji.sdk.keyvalue.value.mission.TrackingTarget;
import org.json.JSONObject;

public class TrackingMissionState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isTracking;
    TrackingTarget target;
    TrackingRect targetRect;
    Double confidenceLevel;
    CameraTrackingMissionStopReason reason;

    public TrackingMissionState() {
    }

    public TrackingMissionState(Boolean bl, TrackingTarget trackingTarget, TrackingRect trackingRect, Double d2, CameraTrackingMissionStopReason cameraTrackingMissionStopReason) {
    }

    public static TrackingMissionState fromJson(String string) {
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

    public Boolean getIsTracking() {
        return null;
    }

    public void setIsTracking(Boolean bl) {
    }

    public TrackingTarget getTarget() {
        return null;
    }

    public void setTarget(TrackingTarget trackingTarget) {
    }

    public TrackingRect getTargetRect() {
        return null;
    }

    public void setTargetRect(TrackingRect trackingRect) {
    }

    public Double getConfidenceLevel() {
        return null;
    }

    public void setConfidenceLevel(Double d2) {
    }

    public CameraTrackingMissionStopReason getReason() {
        return null;
    }

    public void setReason(CameraTrackingMissionStopReason cameraTrackingMissionStopReason) {
    }

    public String toString() {
        return null;
    }
}

