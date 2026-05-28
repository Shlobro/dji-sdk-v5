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
import dji.sdk.keyvalue.value.gimbal.GimbalButtonExecutionType;
import org.json.JSONObject;

public class GimbalButtonExecutionMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    GimbalButtonExecutionType value;

    public GimbalButtonExecutionMsg() {
    }

    public GimbalButtonExecutionMsg(GimbalButtonExecutionType gimbalButtonExecutionType) {
    }

    public static GimbalButtonExecutionMsg fromJson(String string) {
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

    public GimbalButtonExecutionType getValue() {
        return null;
    }

    public void setValue(GimbalButtonExecutionType gimbalButtonExecutionType) {
    }

    public String toString() {
        return null;
    }
}

