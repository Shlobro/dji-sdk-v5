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
import dji.sdk.keyvalue.value.camera.SmartCaptureStatus;
import org.json.JSONObject;

public class SmartCaptureStatusInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer sessionId;
    SmartCaptureStatus status;
    Integer shotCount;
    Integer storingCount;
    Boolean remainTimeValid;
    Integer remainTime;

    public SmartCaptureStatusInfo() {
    }

    public SmartCaptureStatusInfo(Integer n, SmartCaptureStatus smartCaptureStatus, Integer n2, Integer n3, Boolean bl, Integer n4) {
    }

    public static SmartCaptureStatusInfo fromJson(String string) {
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

    public Integer getSessionId() {
        return null;
    }

    public void setSessionId(Integer n) {
    }

    public SmartCaptureStatus getStatus() {
        return null;
    }

    public void setStatus(SmartCaptureStatus smartCaptureStatus) {
    }

    public Integer getShotCount() {
        return null;
    }

    public void setShotCount(Integer n) {
    }

    public Integer getStoringCount() {
        return null;
    }

    public void setStoringCount(Integer n) {
    }

    public Boolean getRemainTimeValid() {
        return null;
    }

    public void setRemainTimeValid(Boolean bl) {
    }

    public Integer getRemainTime() {
        return null;
    }

    public void setRemainTime(Integer n) {
    }

    public String toString() {
        return null;
    }
}

