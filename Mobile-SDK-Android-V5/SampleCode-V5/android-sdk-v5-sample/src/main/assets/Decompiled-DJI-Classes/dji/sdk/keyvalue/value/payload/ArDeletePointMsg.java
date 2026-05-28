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
import org.json.JSONObject;

public class ArDeletePointMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Long uuid;
    Long res_id;

    public ArDeletePointMsg() {
    }

    public ArDeletePointMsg(Long l2, Long l3) {
    }

    public static ArDeletePointMsg fromJson(String string) {
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

    public Long getUuid() {
        return null;
    }

    public void setUuid(Long l2) {
    }

    public Long getRes_id() {
        return null;
    }

    public void setRes_id(Long l2) {
    }

    public String toString() {
        return null;
    }
}

