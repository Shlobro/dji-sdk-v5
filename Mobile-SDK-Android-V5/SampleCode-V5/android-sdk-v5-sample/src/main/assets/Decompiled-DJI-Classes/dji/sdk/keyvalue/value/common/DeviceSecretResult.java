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
import org.json.JSONObject;

public class DeviceSecretResult
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String sn;
    String nonce;
    String deviceSecret;

    public DeviceSecretResult() {
    }

    public DeviceSecretResult(String string, String string2, String string3) {
    }

    public static DeviceSecretResult fromJson(String string) {
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

    public String getSn() {
        return null;
    }

    public void setSn(String string) {
    }

    public String getNonce() {
        return null;
    }

    public void setNonce(String string) {
    }

    public String getDeviceSecret() {
        return null;
    }

    public void setDeviceSecret(String string) {
    }

    public String toString() {
        return null;
    }
}

