/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.camera.H1CurrentChangingParam;
import org.json.JSONObject;

public class H1CurrentChangingParamMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    H1CurrentChangingParam type;
    Integer rcWheelValue;

    public H1CurrentChangingParamMsg() {
    }

    public H1CurrentChangingParamMsg(H1CurrentChangingParam h1CurrentChangingParam, Integer n) {
    }

    public static H1CurrentChangingParamMsg fromJson(String string) {
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

    public H1CurrentChangingParam getType() {
        return null;
    }

    public void setType(H1CurrentChangingParam h1CurrentChangingParam) {
    }

    public Integer getRcWheelValue() {
        return null;
    }

    public void setRcWheelValue(Integer n) {
    }

    public String toString() {
        return null;
    }
}

