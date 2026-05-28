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
import dji.sdk.keyvalue.value.flightassistant.CableInspectionErrCode;
import org.json.JSONObject;

public class CableInspectionErrCodeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CableInspectionErrCode err_code;

    public CableInspectionErrCodeMsg() {
    }

    public CableInspectionErrCodeMsg(CableInspectionErrCode cableInspectionErrCode) {
    }

    public static CableInspectionErrCodeMsg fromJson(String string) {
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

    public CableInspectionErrCode getErr_code() {
        return null;
    }

    public void setErr_code(CableInspectionErrCode cableInspectionErrCode) {
    }

    public String toString() {
        return null;
    }
}

