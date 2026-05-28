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
import org.json.JSONObject;

public class ClearLogQueryHistoryParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer queryIndex;

    public ClearLogQueryHistoryParam() {
    }

    public ClearLogQueryHistoryParam(Integer n) {
    }

    public static ClearLogQueryHistoryParam fromJson(String string) {
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

    public String toString() {
        return null;
    }
}

