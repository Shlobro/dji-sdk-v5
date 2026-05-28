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
import dji.sdk.keyvalue.value.flightcontroller.SowerFlowCalibrateStatus;
import org.json.JSONObject;

public class SowerFlowCalibrateProgressMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    SowerFlowCalibrateStatus status;
    Integer percent;

    public SowerFlowCalibrateProgressMsg() {
    }

    public SowerFlowCalibrateProgressMsg(SowerFlowCalibrateStatus sowerFlowCalibrateStatus, Integer n) {
    }

    public static SowerFlowCalibrateProgressMsg fromJson(String string) {
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

    public SowerFlowCalibrateStatus getStatus() {
        return null;
    }

    public void setStatus(SowerFlowCalibrateStatus sowerFlowCalibrateStatus) {
    }

    public Integer getPercent() {
        return null;
    }

    public void setPercent(Integer n) {
    }

    public String toString() {
        return null;
    }
}

