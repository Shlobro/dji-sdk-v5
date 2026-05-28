/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.HdvtMode;
import org.json.JSONObject;

public class HdvtModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    HdvtMode value;

    public HdvtModeMsg() {
    }

    public HdvtModeMsg(HdvtMode hdvtMode) {
    }

    public static HdvtModeMsg fromJson(String string) {
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

    public HdvtMode getValue() {
        return null;
    }

    public void setValue(HdvtMode hdvtMode) {
    }

    public String toString() {
        return null;
    }
}

