/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.RCAuthorityLockError;
import org.json.JSONObject;

public class RCAuthorityLockErrorMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RCAuthorityLockError value;

    public RCAuthorityLockErrorMsg() {
    }

    public RCAuthorityLockErrorMsg(RCAuthorityLockError rCAuthorityLockError) {
    }

    public static RCAuthorityLockErrorMsg fromJson(String string) {
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

    public RCAuthorityLockError getValue() {
        return null;
    }

    public void setValue(RCAuthorityLockError rCAuthorityLockError) {
    }

    public String toString() {
        return null;
    }
}

