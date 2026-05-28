/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.hmslog;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class HMSLogDownloadErrorInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer errorCode;
    String errorMsg;

    public HMSLogDownloadErrorInfo() {
    }

    public HMSLogDownloadErrorInfo(Integer n, String string) {
    }

    public static HMSLogDownloadErrorInfo fromJson(String string) {
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

    public Integer getErrorCode() {
        return null;
    }

    public void setErrorCode(Integer n) {
    }

    public String getErrorMsg() {
        return null;
    }

    public void setErrorMsg(String string) {
    }

    public String toString() {
        return null;
    }
}

