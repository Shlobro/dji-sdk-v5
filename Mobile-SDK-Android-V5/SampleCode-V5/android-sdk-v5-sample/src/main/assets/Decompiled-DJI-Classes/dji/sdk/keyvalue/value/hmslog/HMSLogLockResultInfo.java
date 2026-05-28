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

public class HMSLogLockResultInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer lockError;
    Integer remainingLockedCount;

    public HMSLogLockResultInfo() {
    }

    public HMSLogLockResultInfo(Integer n, Integer n2) {
    }

    public static HMSLogLockResultInfo fromJson(String string) {
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

    public Integer getLockError() {
        return null;
    }

    public void setLockError(Integer n) {
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

