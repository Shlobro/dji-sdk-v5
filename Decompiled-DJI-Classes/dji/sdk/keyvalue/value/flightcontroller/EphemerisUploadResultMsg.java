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
import dji.sdk.keyvalue.value.flightcontroller.EphemerisUploadResultCode;
import org.json.JSONObject;

public class EphemerisUploadResultMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    EphemerisUploadResultCode value;

    public EphemerisUploadResultMsg() {
    }

    public EphemerisUploadResultMsg(EphemerisUploadResultCode ephemerisUploadResultCode) {
    }

    public static EphemerisUploadResultMsg fromJson(String string) {
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

    public EphemerisUploadResultCode getValue() {
        return null;
    }

    public void setValue(EphemerisUploadResultCode ephemerisUploadResultCode) {
    }

    public String toString() {
        return null;
    }
}

