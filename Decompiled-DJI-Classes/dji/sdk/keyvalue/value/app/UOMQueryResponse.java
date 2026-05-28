/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.app;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.app.UOMRealNameAppStatus;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class UOMQueryResponse
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String sn;
    UOMRealNameAppStatus status;

    public UOMQueryResponse() {
    }

    public UOMQueryResponse(String string, UOMRealNameAppStatus uOMRealNameAppStatus) {
    }

    public static UOMQueryResponse fromJson(String string) {
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

    public String getSn() {
        return null;
    }

    public void setSn(String string) {
    }

    public UOMRealNameAppStatus getStatus() {
        return null;
    }

    public void setStatus(UOMRealNameAppStatus uOMRealNameAppStatus) {
    }

    public String toString() {
        return null;
    }
}

