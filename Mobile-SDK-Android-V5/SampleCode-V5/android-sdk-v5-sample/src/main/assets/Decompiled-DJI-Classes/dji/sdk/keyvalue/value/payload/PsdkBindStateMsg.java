/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.payload.PsdkBindState;
import dji.sdk.keyvalue.value.payload.PsdkMpState;
import org.json.JSONObject;

public class PsdkBindStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    PsdkBindState bindState;
    PsdkMpState mpState;

    public PsdkBindStateMsg() {
    }

    public PsdkBindStateMsg(PsdkBindState psdkBindState, PsdkMpState psdkMpState) {
    }

    public static PsdkBindStateMsg fromJson(String string) {
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

    public PsdkBindState getBindState() {
        return null;
    }

    public void setBindState(PsdkBindState psdkBindState) {
    }

    public PsdkMpState getMpState() {
        return null;
    }

    public void setMpState(PsdkMpState psdkMpState) {
    }

    public String toString() {
        return null;
    }
}

