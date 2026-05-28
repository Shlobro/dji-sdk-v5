/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightassistant.VisionDetectionDistanceLevel;
import dji.sdk.keyvalue.value.flightassistant.VisionDetectionWarningLevel;
import org.json.JSONObject;

public class VisionDetectionWarningInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    VisionDetectionDistanceLevel distanceLevel;
    VisionDetectionWarningLevel warningLevel;

    public VisionDetectionWarningInfo() {
    }

    public VisionDetectionWarningInfo(VisionDetectionDistanceLevel visionDetectionDistanceLevel, VisionDetectionWarningLevel visionDetectionWarningLevel) {
    }

    public static VisionDetectionWarningInfo fromJson(String string) {
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

    public VisionDetectionDistanceLevel getDistanceLevel() {
        return null;
    }

    public void setDistanceLevel(VisionDetectionDistanceLevel visionDetectionDistanceLevel) {
    }

    public VisionDetectionWarningLevel getWarningLevel() {
        return null;
    }

    public void setWarningLevel(VisionDetectionWarningLevel visionDetectionWarningLevel) {
    }

    public String toString() {
        return null;
    }
}

