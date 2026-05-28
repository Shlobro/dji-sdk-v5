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

public class CommonNetworkPrivateKeyCheckMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    byte[] n;
    byte[] e;

    public CommonNetworkPrivateKeyCheckMsg() {
    }

    public CommonNetworkPrivateKeyCheckMsg(byte[] byArray, byte[] byArray2) {
    }

    public static CommonNetworkPrivateKeyCheckMsg fromJson(String string) {
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

    public byte[] getN() {
        return null;
    }

    public void setN(byte[] byArray) {
    }

    public byte[] getE() {
        return null;
    }

    public void setE(byte[] byArray) {
    }

    public String toString() {
        return null;
    }
}

