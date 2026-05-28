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
import org.json.JSONObject;

public class RIDRegistedInfoRsp
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String registedCode;
    String sharedKey;
    String nonceInfo;

    public RIDRegistedInfoRsp() {
    }

    public RIDRegistedInfoRsp(String string, String string2, String string3) {
    }

    public static RIDRegistedInfoRsp fromJson(String string) {
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

    public String getRegistedCode() {
        return null;
    }

    public void setRegistedCode(String string) {
    }

    public String getSharedKey() {
        return null;
    }

    public void setSharedKey(String string) {
    }

    public String getNonceInfo() {
        return null;
    }

    public void setNonceInfo(String string) {
    }

    public String toString() {
        return null;
    }
}

