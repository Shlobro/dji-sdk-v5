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
import dji.sdk.keyvalue.value.camera.VisionStabilizationPauseReason;
import org.json.JSONObject;

public class VisionStabilizationStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isEnabled;
    Boolean isPaused;
    VisionStabilizationPauseReason pauseReason;

    public VisionStabilizationStateMsg() {
    }

    public VisionStabilizationStateMsg(Boolean bl, Boolean bl2, VisionStabilizationPauseReason visionStabilizationPauseReason) {
    }

    public static VisionStabilizationStateMsg fromJson(String string) {
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

    public Boolean getIsEnabled() {
        return null;
    }

    public void setIsEnabled(Boolean bl) {
    }

    public Boolean getIsPaused() {
        return null;
    }

    public void setIsPaused(Boolean bl) {
    }

    public VisionStabilizationPauseReason getPauseReason() {
        return null;
    }

    public void setPauseReason(VisionStabilizationPauseReason visionStabilizationPauseReason) {
    }

    public String toString() {
        return null;
    }
}

