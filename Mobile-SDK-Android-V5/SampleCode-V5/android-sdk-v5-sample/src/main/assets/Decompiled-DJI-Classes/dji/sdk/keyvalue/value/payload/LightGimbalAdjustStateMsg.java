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

public class LightGimbalAdjustStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer left_val;
    Integer right_val;
    Integer both_val;

    public LightGimbalAdjustStateMsg() {
    }

    public LightGimbalAdjustStateMsg(Integer n, Integer n2, Integer n3) {
    }

    public static LightGimbalAdjustStateMsg fromJson(String string) {
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

    public Integer getLeft_val() {
        return null;
    }

    public void setLeft_val(Integer n) {
    }

    public Integer getRight_val() {
        return null;
    }

    public void setRight_val(Integer n) {
    }

    public Integer getBoth_val() {
        return null;
    }

    public void setBoth_val(Integer n) {
    }

    public String toString() {
        return null;
    }
}

