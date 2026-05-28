/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.rtkmobilestation;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class NtripNetworkRtkConfigInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String mountPoint;
    String port;
    String host;
    String rsv;

    public NtripNetworkRtkConfigInfo() {
    }

    public NtripNetworkRtkConfigInfo(String string, String string2, String string3, String string4) {
    }

    public static NtripNetworkRtkConfigInfo fromJson(String string) {
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

    public String getMountPoint() {
        return null;
    }

    public void setMountPoint(String string) {
    }

    public String getPort() {
        return null;
    }

    public void setPort(String string) {
    }

    public String getHost() {
        return null;
    }

    public void setHost(String string) {
    }

    public String getRsv() {
        return null;
    }

    public void setRsv(String string) {
    }

    public String toString() {
        return null;
    }
}

