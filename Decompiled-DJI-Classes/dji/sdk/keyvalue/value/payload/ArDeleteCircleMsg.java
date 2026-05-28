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

public class ArDeleteCircleMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Long group_id;
    Long uuid;

    public ArDeleteCircleMsg() {
    }

    public ArDeleteCircleMsg(Long l2, Long l3) {
    }

    public static ArDeleteCircleMsg fromJson(String string) {
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

    public Long getGroup_id() {
        return null;
    }

    public void setGroup_id(Long l2) {
    }

    public Long getUuid() {
        return null;
    }

    public void setUuid(Long l2) {
    }

    public String toString() {
        return null;
    }
}

