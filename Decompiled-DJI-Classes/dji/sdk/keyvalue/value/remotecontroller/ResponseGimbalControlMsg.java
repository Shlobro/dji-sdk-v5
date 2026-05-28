/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class ResponseGimbalControlMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer requestId;
    Boolean agree;

    public ResponseGimbalControlMsg() {
    }

    public ResponseGimbalControlMsg(Integer n, Boolean bl) {
    }

    public static ResponseGimbalControlMsg fromJson(String string) {
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

    public Integer getRequestId() {
        return null;
    }

    public void setRequestId(Integer n) {
    }

    public Boolean getAgree() {
        return null;
    }

    public void setAgree(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

