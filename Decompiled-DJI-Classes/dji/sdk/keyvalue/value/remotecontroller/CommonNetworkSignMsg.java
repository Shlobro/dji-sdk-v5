/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class CommonNetworkSignMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer hashType;
    Integer paddingType;
    byte[] tbs;

    public CommonNetworkSignMsg() {
    }

    public CommonNetworkSignMsg(Integer n, Integer n2, byte[] byArray) {
    }

    public static CommonNetworkSignMsg fromJson(String string) {
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

    public Integer getHashType() {
        return null;
    }

    public void setHashType(Integer n) {
    }

    public Integer getPaddingType() {
        return null;
    }

    public void setPaddingType(Integer n) {
    }

    public byte[] getTbs() {
        return null;
    }

    public void setTbs(byte[] byArray) {
    }

    public String toString() {
        return null;
    }
}

