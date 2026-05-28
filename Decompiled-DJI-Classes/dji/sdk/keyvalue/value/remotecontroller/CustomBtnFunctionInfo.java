/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class CustomBtnFunctionInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer c1Fun;
    Integer c2Fun;

    public CustomBtnFunctionInfo() {
    }

    public CustomBtnFunctionInfo(Integer n, Integer n2) {
    }

    public static CustomBtnFunctionInfo fromJson(String string) {
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

    public Integer getC1Fun() {
        return null;
    }

    public void setC1Fun(Integer n) {
    }

    public Integer getC2Fun() {
        return null;
    }

    public void setC2Fun(Integer n) {
    }

    public String toString() {
        return null;
    }
}

