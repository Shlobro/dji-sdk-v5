/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.zipfile;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.zipfile.ZipStatus;
import org.json.JSONObject;

public class BatchZipCallBackStatus
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ZipStatus status;
    Long value;

    public BatchZipCallBackStatus() {
    }

    public BatchZipCallBackStatus(ZipStatus zipStatus, Long l2) {
    }

    public static BatchZipCallBackStatus fromJson(String string) {
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

    public ZipStatus getStatus() {
        return null;
    }

    public void setStatus(ZipStatus zipStatus) {
    }

    public Long getValue() {
        return null;
    }

    public void setValue(Long l2) {
    }

    public String toString() {
        return null;
    }
}

