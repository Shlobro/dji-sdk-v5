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
import dji.sdk.keyvalue.value.payload.FetchePayloadConfigResult;
import org.json.JSONObject;

public class FetchePayloadConfigResultMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FetchePayloadConfigResult value;

    public FetchePayloadConfigResultMsg() {
    }

    public FetchePayloadConfigResultMsg(FetchePayloadConfigResult fetchePayloadConfigResult) {
    }

    public static FetchePayloadConfigResultMsg fromJson(String string) {
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

    public FetchePayloadConfigResult getValue() {
        return null;
    }

    public void setValue(FetchePayloadConfigResult fetchePayloadConfigResult) {
    }

    public String toString() {
        return null;
    }
}

