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
import dji.sdk.keyvalue.value.payload.MegaphoneUploadState;
import org.json.JSONObject;

public class MegaphoneUploadProgressMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer alreadySentBytes;
    Integer totalBytes;
    Integer retrySentBytes;
    MegaphoneUploadState state;

    public MegaphoneUploadProgressMsg() {
    }

    public MegaphoneUploadProgressMsg(Integer n, Integer n2, Integer n3, MegaphoneUploadState megaphoneUploadState) {
    }

    public static MegaphoneUploadProgressMsg fromJson(String string) {
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

    public Integer getAlreadySentBytes() {
        return null;
    }

    public void setAlreadySentBytes(Integer n) {
    }

    public Integer getTotalBytes() {
        return null;
    }

    public void setTotalBytes(Integer n) {
    }

    public Integer getRetrySentBytes() {
        return null;
    }

    public void setRetrySentBytes(Integer n) {
    }

    public MegaphoneUploadState getState() {
        return null;
    }

    public void setState(MegaphoneUploadState megaphoneUploadState) {
    }

    public String toString() {
        return null;
    }
}

