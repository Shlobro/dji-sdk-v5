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
import dji.sdk.keyvalue.value.payload.PayloadCameraType;
import org.json.JSONObject;

public class PayloadCameraTypeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    PayloadCameraType value;

    public PayloadCameraTypeMsg() {
    }

    public PayloadCameraTypeMsg(PayloadCameraType payloadCameraType) {
    }

    public static PayloadCameraTypeMsg fromJson(String string) {
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

    public PayloadCameraType getValue() {
        return null;
    }

    public void setValue(PayloadCameraType payloadCameraType) {
    }

    public String toString() {
        return null;
    }
}

