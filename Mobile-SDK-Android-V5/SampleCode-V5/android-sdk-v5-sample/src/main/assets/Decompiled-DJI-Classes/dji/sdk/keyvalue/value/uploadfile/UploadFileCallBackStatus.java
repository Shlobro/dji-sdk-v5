/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.uploadfile;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.uploadfile.UploadFileStatus;
import org.json.JSONObject;

public class UploadFileCallBackStatus
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    UploadFileStatus status;
    Integer value;
    String msg;

    public UploadFileCallBackStatus() {
    }

    public UploadFileCallBackStatus(UploadFileStatus uploadFileStatus, Integer n, String string) {
    }

    public static UploadFileCallBackStatus fromJson(String string) {
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

    public UploadFileStatus getStatus() {
        return null;
    }

    public void setStatus(UploadFileStatus uploadFileStatus) {
    }

    public Integer getValue() {
        return null;
    }

    public void setValue(Integer n) {
    }

    public String getMsg() {
        return null;
    }

    public void setMsg(String string) {
    }

    public String toString() {
        return null;
    }
}

