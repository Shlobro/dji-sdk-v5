/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.UtmissUploadStatus;
import org.json.JSONObject;

public class UtmissUploadStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    UtmissUploadStatus value;

    public UtmissUploadStatusMsg() {
    }

    public UtmissUploadStatusMsg(UtmissUploadStatus utmissUploadStatus) {
    }

    public static UtmissUploadStatusMsg fromJson(String string) {
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

    public UtmissUploadStatus getValue() {
        return null;
    }

    public void setValue(UtmissUploadStatus utmissUploadStatus) {
    }

    public String toString() {
        return null;
    }
}

