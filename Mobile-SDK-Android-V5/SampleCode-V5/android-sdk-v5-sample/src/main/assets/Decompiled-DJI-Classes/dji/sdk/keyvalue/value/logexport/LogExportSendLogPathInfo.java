/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.logexport;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class LogExportSendLogPathInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String ip;
    String domain;
    String key;
    Integer valueLen;
    String value;

    public LogExportSendLogPathInfo() {
    }

    public LogExportSendLogPathInfo(String string, String string2, String string3, Integer n, String string4) {
    }

    public static LogExportSendLogPathInfo fromJson(String string) {
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

    public String getIp() {
        return null;
    }

    public void setIp(String string) {
    }

    public String getDomain() {
        return null;
    }

    public void setDomain(String string) {
    }

    public String getKey() {
        return null;
    }

    public void setKey(String string) {
    }

    public Integer getValueLen() {
        return null;
    }

    public void setValueLen(Integer n) {
    }

    public String getValue() {
        return null;
    }

    public void setValue(String string) {
    }

    public String toString() {
        return null;
    }
}

