/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightcontroller.PrecisionFileTransVerifyState;
import org.json.JSONObject;

public class PrecisionFileTransVerifyStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    PrecisionFileTransVerifyState value;

    public PrecisionFileTransVerifyStateMsg() {
    }

    public PrecisionFileTransVerifyStateMsg(PrecisionFileTransVerifyState precisionFileTransVerifyState) {
    }

    public static PrecisionFileTransVerifyStateMsg fromJson(String string) {
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

    public PrecisionFileTransVerifyState getValue() {
        return null;
    }

    public void setValue(PrecisionFileTransVerifyState precisionFileTransVerifyState) {
    }

    public String toString() {
        return null;
    }
}

