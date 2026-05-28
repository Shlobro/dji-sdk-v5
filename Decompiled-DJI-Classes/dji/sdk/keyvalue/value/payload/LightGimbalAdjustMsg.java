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
import dji.sdk.keyvalue.value.payload.LightGimbal;
import org.json.JSONObject;

public class LightGimbalAdjustMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer value;
    LightGimbal type;
    Boolean is_save;

    public LightGimbalAdjustMsg() {
    }

    public LightGimbalAdjustMsg(Integer n, LightGimbal lightGimbal, Boolean bl) {
    }

    public static LightGimbalAdjustMsg fromJson(String string) {
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

    public Integer getValue() {
        return null;
    }

    public void setValue(Integer n) {
    }

    public LightGimbal getType() {
        return null;
    }

    public void setType(LightGimbal lightGimbal) {
    }

    public Boolean getIs_save() {
        return null;
    }

    public void setIs_save(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

