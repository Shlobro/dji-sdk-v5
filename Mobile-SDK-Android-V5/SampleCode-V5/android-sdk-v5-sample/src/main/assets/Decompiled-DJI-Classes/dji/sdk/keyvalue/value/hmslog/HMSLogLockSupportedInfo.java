/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.hmslog;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class HMSLogLockSupportedInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isSupported;
    Integer lockError;
    Integer maxLockedDuration;
    Integer totalLockedCount;
    Integer remainingLockedCount;

    public HMSLogLockSupportedInfo() {
    }

    public HMSLogLockSupportedInfo(Boolean bl, Integer n, Integer n2, Integer n3, Integer n4) {
    }

    public static HMSLogLockSupportedInfo fromJson(String string) {
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

    public Boolean getIsSupported() {
        return null;
    }

    public void setIsSupported(Boolean bl) {
    }

    public Integer getLockError() {
        return null;
    }

    public void setLockError(Integer n) {
    }

    public Integer getMaxLockedDuration() {
        return null;
    }

    public void setMaxLockedDuration(Integer n) {
    }

    public Integer getTotalLockedCount() {
        return null;
    }

    public void setTotalLockedCount(Integer n) {
    }

    public Integer getRemainingLockedCount() {
        return null;
    }

    public void setRemainingLockedCount(Integer n) {
    }

    public String toString() {
        return null;
    }
}

