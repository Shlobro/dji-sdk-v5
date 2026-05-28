/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.hms;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.hms.HMSMaintainRecordState;
import org.json.JSONObject;

public class HMSCameraLensMaintainInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    HMSMaintainRecordState state;
    Long maintainUtcTime;
    Integer shutterUsedCount;

    public HMSCameraLensMaintainInfo() {
    }

    public HMSCameraLensMaintainInfo(HMSMaintainRecordState hMSMaintainRecordState, Long l2, Integer n) {
    }

    public static HMSCameraLensMaintainInfo fromJson(String string) {
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

    public HMSMaintainRecordState getState() {
        return null;
    }

    public void setState(HMSMaintainRecordState hMSMaintainRecordState) {
    }

    public Long getMaintainUtcTime() {
        return null;
    }

    public void setMaintainUtcTime(Long l2) {
    }

    public Integer getShutterUsedCount() {
        return null;
    }

    public void setShutterUsedCount(Integer n) {
    }

    public String toString() {
        return null;
    }
}

