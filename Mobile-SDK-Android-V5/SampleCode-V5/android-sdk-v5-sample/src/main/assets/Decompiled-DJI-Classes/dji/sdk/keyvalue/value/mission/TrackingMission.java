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
import dji.sdk.keyvalue.value.mission.TrackingMode;
import dji.sdk.keyvalue.value.mission.TrackingRect;
import org.json.JSONObject;

public class TrackingMission
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    TrackingRect targetRect;
    TrackingMode mode;

    public TrackingMission() {
    }

    public TrackingMission(TrackingRect trackingRect, TrackingMode trackingMode) {
    }

    public static TrackingMission fromJson(String string) {
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

    public TrackingRect getTargetRect() {
        return null;
    }

    public void setTargetRect(TrackingRect trackingRect) {
    }

    public TrackingMode getMode() {
        return null;
    }

    public void setMode(TrackingMode trackingMode) {
    }

    public String toString() {
        return null;
    }
}

