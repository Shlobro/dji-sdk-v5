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
import org.json.JSONObject;

public class TimeLapseTimeState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer totalDuration;
    Integer estimatedVideoLength;
    Integer recordedDuration;

    public TimeLapseTimeState() {
    }

    public TimeLapseTimeState(Integer n, Integer n2, Integer n3) {
    }

    public static TimeLapseTimeState fromJson(String string) {
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

    public Integer getTotalDuration() {
        return null;
    }

    public void setTotalDuration(Integer n) {
    }

    public Integer getEstimatedVideoLength() {
        return null;
    }

    public void setEstimatedVideoLength(Integer n) {
    }

    public Integer getRecordedDuration() {
        return null;
    }

    public void setRecordedDuration(Integer n) {
    }

    public String toString() {
        return null;
    }
}

