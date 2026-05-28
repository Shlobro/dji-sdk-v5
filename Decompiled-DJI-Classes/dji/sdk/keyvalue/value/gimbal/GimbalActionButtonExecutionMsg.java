/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.gimbal.GimbalActionButtonExecutionType;
import org.json.JSONObject;

public class GimbalActionButtonExecutionMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    GimbalActionButtonExecutionType value;

    public GimbalActionButtonExecutionMsg() {
    }

    public GimbalActionButtonExecutionMsg(GimbalActionButtonExecutionType gimbalActionButtonExecutionType) {
    }

    public static GimbalActionButtonExecutionMsg fromJson(String string) {
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

    public GimbalActionButtonExecutionType getValue() {
        return null;
    }

    public void setValue(GimbalActionButtonExecutionType gimbalActionButtonExecutionType) {
    }

    public String toString() {
        return null;
    }
}

