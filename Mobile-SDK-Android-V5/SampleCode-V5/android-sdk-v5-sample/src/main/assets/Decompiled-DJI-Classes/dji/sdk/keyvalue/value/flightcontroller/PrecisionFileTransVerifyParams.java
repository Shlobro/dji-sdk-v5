/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightcontroller.PrecisionFileType;
import org.json.JSONObject;

public class PrecisionFileTransVerifyParams
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String uuid;
    String md5;
    PrecisionFileType fileType;

    public PrecisionFileTransVerifyParams() {
    }

    public PrecisionFileTransVerifyParams(String string, String string2, PrecisionFileType precisionFileType) {
    }

    public static PrecisionFileTransVerifyParams fromJson(String string) {
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

    public String getUuid() {
        return null;
    }

    public void setUuid(String string) {
    }

    public String getMd5() {
        return null;
    }

    public void setMd5(String string) {
    }

    public PrecisionFileType getFileType() {
        return null;
    }

    public void setFileType(PrecisionFileType precisionFileType) {
    }

    public String toString() {
        return null;
    }
}

