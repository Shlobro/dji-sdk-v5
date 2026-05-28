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
import dji.sdk.keyvalue.value.common.RCAuthorityModeError;
import org.json.JSONObject;

public class RCAuthorityModeErrorMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RCAuthorityModeError value;

    public RCAuthorityModeErrorMsg() {
    }

    public RCAuthorityModeErrorMsg(RCAuthorityModeError rCAuthorityModeError) {
    }

    public static RCAuthorityModeErrorMsg fromJson(String string) {
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

    public RCAuthorityModeError getValue() {
        return null;
    }

    public void setValue(RCAuthorityModeError rCAuthorityModeError) {
    }

    public String toString() {
        return null;
    }
}

