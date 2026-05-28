/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.UploadMcsType;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class UploadMcsTypeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    UploadMcsType value;

    public UploadMcsTypeMsg() {
    }

    public UploadMcsTypeMsg(UploadMcsType uploadMcsType) {
    }

    public static UploadMcsTypeMsg fromJson(String string) {
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

    public UploadMcsType getValue() {
        return null;
    }

    public void setValue(UploadMcsType uploadMcsType) {
    }

    public String toString() {
        return null;
    }
}

