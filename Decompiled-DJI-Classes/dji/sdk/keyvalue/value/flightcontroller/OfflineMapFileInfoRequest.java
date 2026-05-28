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

public class OfflineMapFileInfoRequest
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String file_name;
    String checksum;
    String signature;

    public OfflineMapFileInfoRequest() {
    }

    public OfflineMapFileInfoRequest(String string, String string2, String string3) {
    }

    public static OfflineMapFileInfoRequest fromJson(String string) {
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

    public String getFile_name() {
        return null;
    }

    public void setFile_name(String string) {
    }

    public String getChecksum() {
        return null;
    }

    public void setChecksum(String string) {
    }

    public String getSignature() {
        return null;
    }

    public void setSignature(String string) {
    }

    public String toString() {
        return null;
    }
}

