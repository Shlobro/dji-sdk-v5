/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightcontroller.AiAlarmTargetType;
import org.json.JSONObject;

public class AiAlarmTargetInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    AiAlarmTargetType target_type;
    Double target_value;
    Boolean use_max_threshold;
    Boolean use_min_threshold;
    Double target_max_threshold;
    Double target_min_threshold;

    public AiAlarmTargetInfo() {
    }

    public AiAlarmTargetInfo(AiAlarmTargetType aiAlarmTargetType, Double d2, Boolean bl, Boolean bl2, Double d3, Double d4) {
    }

    public static AiAlarmTargetInfo fromJson(String string) {
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

    public AiAlarmTargetType getTarget_type() {
        return null;
    }

    public void setTarget_type(AiAlarmTargetType aiAlarmTargetType) {
    }

    public Double getTarget_value() {
        return null;
    }

    public void setTarget_value(Double d2) {
    }

    public Boolean getUse_max_threshold() {
        return null;
    }

    public void setUse_max_threshold(Boolean bl) {
    }

    public Boolean getUse_min_threshold() {
        return null;
    }

    public void setUse_min_threshold(Boolean bl) {
    }

    public Double getTarget_max_threshold() {
        return null;
    }

    public void setTarget_max_threshold(Double d2) {
    }

    public Double getTarget_min_threshold() {
        return null;
    }

    public void setTarget_min_threshold(Double d2) {
    }

    public String toString() {
        return null;
    }
}

