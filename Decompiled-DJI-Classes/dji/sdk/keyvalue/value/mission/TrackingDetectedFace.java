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
import dji.sdk.keyvalue.value.mission.TrackingRect;
import org.json.JSONObject;

public class TrackingDetectedFace
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double smilingLevel;
    Double confidenceLevel;
    TrackingRect faceRect;

    public TrackingDetectedFace() {
    }

    public TrackingDetectedFace(Double d2, Double d3, TrackingRect trackingRect) {
    }

    public static TrackingDetectedFace fromJson(String string) {
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

    public Double getSmilingLevel() {
        return null;
    }

    public void setSmilingLevel(Double d2) {
    }

    public Double getConfidenceLevel() {
        return null;
    }

    public void setConfidenceLevel(Double d2) {
    }

    public TrackingRect getFaceRect() {
        return null;
    }

    public void setFaceRect(TrackingRect trackingRect) {
    }

    public String toString() {
        return null;
    }
}

