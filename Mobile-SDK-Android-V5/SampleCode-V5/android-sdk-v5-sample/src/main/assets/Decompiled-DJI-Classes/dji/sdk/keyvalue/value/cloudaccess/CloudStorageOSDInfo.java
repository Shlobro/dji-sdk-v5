/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class CloudStorageOSDInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer total;
    Integer used;

    public CloudStorageOSDInfo() {
    }

    public CloudStorageOSDInfo(Integer n, Integer n2) {
    }

    public static CloudStorageOSDInfo fromJson(String string) {
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

    public Integer getTotal() {
        return null;
    }

    public void setTotal(Integer n) {
    }

    public Integer getUsed() {
        return null;
    }

    public void setUsed(Integer n) {
    }

    public String toString() {
        return null;
    }
}

