/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.app;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.app.UOMCancelType;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class UOMCancelRegisterReqMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String sn;
    UOMCancelType cancelType;
    String cancelMsg;

    public UOMCancelRegisterReqMsg() {
    }

    public UOMCancelRegisterReqMsg(String string, UOMCancelType uOMCancelType, String string2) {
    }

    public static UOMCancelRegisterReqMsg fromJson(String string) {
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

    public String getSn() {
        return null;
    }

    public void setSn(String string) {
    }

    public UOMCancelType getCancelType() {
        return null;
    }

    public void setCancelType(UOMCancelType uOMCancelType) {
    }

    public String getCancelMsg() {
        return null;
    }

    public void setCancelMsg(String string) {
    }

    public String toString() {
        return null;
    }
}

