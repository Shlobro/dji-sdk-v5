/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import org.json.JSONObject;

public class ClearLogQueryPayloadHistoryParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer queryIndex;
    ComponentIndexType payloadIndex;

    public ClearLogQueryPayloadHistoryParam() {
    }

    public ClearLogQueryPayloadHistoryParam(Integer n, ComponentIndexType componentIndexType) {
    }

    public static ClearLogQueryPayloadHistoryParam fromJson(String string) {
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

    public Integer getQueryIndex() {
        return null;
    }

    public void setQueryIndex(Integer n) {
    }

    public ComponentIndexType getPayloadIndex() {
        return null;
    }

    public void setPayloadIndex(ComponentIndexType componentIndexType) {
    }

    public String toString() {
        return null;
    }
}

