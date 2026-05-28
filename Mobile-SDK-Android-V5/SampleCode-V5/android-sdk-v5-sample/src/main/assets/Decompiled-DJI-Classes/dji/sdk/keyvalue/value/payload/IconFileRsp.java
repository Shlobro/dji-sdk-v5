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
import dji.sdk.keyvalue.value.common.BufferMsg;
import org.json.JSONObject;

public class IconFileRsp
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer retCode;
    BufferMsg icon;

    public IconFileRsp() {
    }

    public IconFileRsp(Integer n, BufferMsg bufferMsg) {
    }

    public static IconFileRsp fromJson(String string) {
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

    public Integer getRetCode() {
        return null;
    }

    public void setRetCode(Integer n) {
    }

    public BufferMsg getIcon() {
        return null;
    }

    public void setIcon(BufferMsg bufferMsg) {
    }

    public String toString() {
        return null;
    }
}

