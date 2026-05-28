/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class LteTestRequestMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer testType;
    Integer testId;

    public LteTestRequestMsg() {
    }

    public LteTestRequestMsg(Integer n, Integer n2) {
    }

    public static LteTestRequestMsg fromJson(String string) {
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

    public Integer getTestType() {
        return null;
    }

    public void setTestType(Integer n) {
    }

    public Integer getTestId() {
        return null;
    }

    public void setTestId(Integer n) {
    }

    public String toString() {
        return null;
    }
}

