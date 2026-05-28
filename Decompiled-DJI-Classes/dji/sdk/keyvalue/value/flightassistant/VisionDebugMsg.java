/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class VisionDebugMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer type;
    Double value;

    public VisionDebugMsg() {
    }

    public VisionDebugMsg(Integer n, Double d2) {
    }

    public static VisionDebugMsg fromJson(String string) {
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

    public Integer getType() {
        return null;
    }

    public void setType(Integer n) {
    }

    public Double getValue() {
        return null;
    }

    public void setValue(Double d2) {
    }

    public String toString() {
        return null;
    }
}

