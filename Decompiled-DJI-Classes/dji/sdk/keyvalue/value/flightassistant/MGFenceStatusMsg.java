/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class MGFenceStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer status;
    Integer error;

    public MGFenceStatusMsg() {
    }

    public MGFenceStatusMsg(Integer n, Integer n2) {
    }

    public static MGFenceStatusMsg fromJson(String string) {
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

    public Integer getStatus() {
        return null;
    }

    public void setStatus(Integer n) {
    }

    public Integer getError() {
        return null;
    }

    public void setError(Integer n) {
    }

    public String toString() {
        return null;
    }
}

