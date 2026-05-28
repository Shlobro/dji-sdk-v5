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
import dji.sdk.keyvalue.value.mission.AppAssistedTrackingMissionStopReason;
import org.json.JSONObject;

public class AppAssistedTrackingMissionState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isTracking;
    AppAssistedTrackingMissionStopReason reason;

    public AppAssistedTrackingMissionState() {
    }

    public AppAssistedTrackingMissionState(Boolean bl, AppAssistedTrackingMissionStopReason appAssistedTrackingMissionStopReason) {
    }

    public static AppAssistedTrackingMissionState fromJson(String string) {
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

    public AppAssistedTrackingMissionStopReason getReason() {
        return null;
    }

    public void setReason(AppAssistedTrackingMissionStopReason appAssistedTrackingMissionStopReason) {
    }

    public String toString() {
        return null;
    }
}

