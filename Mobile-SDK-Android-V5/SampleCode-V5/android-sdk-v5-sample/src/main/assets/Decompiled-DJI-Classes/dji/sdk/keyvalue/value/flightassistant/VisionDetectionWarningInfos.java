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
import dji.sdk.keyvalue.value.flightassistant.VisionDetectionWarningInfo;
import org.json.JSONObject;

public class VisionDetectionWarningInfos
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    VisionDetectionWarningInfo frontDetect;
    VisionDetectionWarningInfo rightDetect;
    VisionDetectionWarningInfo backDetect;
    VisionDetectionWarningInfo leftDetect;

    public VisionDetectionWarningInfos() {
    }

    public VisionDetectionWarningInfos(VisionDetectionWarningInfo visionDetectionWarningInfo, VisionDetectionWarningInfo visionDetectionWarningInfo2, VisionDetectionWarningInfo visionDetectionWarningInfo3, VisionDetectionWarningInfo visionDetectionWarningInfo4) {
    }

    public static VisionDetectionWarningInfos fromJson(String string) {
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

    public VisionDetectionWarningInfo getFrontDetect() {
        return null;
    }

    public void setFrontDetect(VisionDetectionWarningInfo visionDetectionWarningInfo) {
    }

    public VisionDetectionWarningInfo getRightDetect() {
        return null;
    }

    public void setRightDetect(VisionDetectionWarningInfo visionDetectionWarningInfo) {
    }

    public VisionDetectionWarningInfo getBackDetect() {
        return null;
    }

    public void setBackDetect(VisionDetectionWarningInfo visionDetectionWarningInfo) {
    }

    public VisionDetectionWarningInfo getLeftDetect() {
        return null;
    }

    public void setLeftDetect(VisionDetectionWarningInfo visionDetectionWarningInfo) {
    }

    public String toString() {
        return null;
    }
}

