/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.app;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class RequestInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String gimbalSN;
    String droneSN;

    public RequestInfoMsg() {
    }

    public RequestInfoMsg(String string, String string2) {
    }

    public static RequestInfoMsg fromJson(String string) {
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

    public String getGimbalSN() {
        return null;
    }

    public void setGimbalSN(String string) {
    }

    public String getDroneSN() {
        return null;
    }

    public void setDroneSN(String string) {
    }

    public String toString() {
        return null;
    }
}

