/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.innertool;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.innertool.SocketPackRecordAction;
import org.json.JSONObject;

public class SocketPackRecord
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    SocketPackRecordAction action;
    String ip;
    Integer port;

    public SocketPackRecord() {
    }

    public SocketPackRecord(SocketPackRecordAction socketPackRecordAction, String string, Integer n) {
    }

    public static SocketPackRecord fromJson(String string) {
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

    public SocketPackRecordAction getAction() {
        return null;
    }

    public void setAction(SocketPackRecordAction socketPackRecordAction) {
    }

    public String getIp() {
        return null;
    }

    public void setIp(String string) {
    }

    public Integer getPort() {
        return null;
    }

    public void setPort(Integer n) {
    }

    public String toString() {
        return null;
    }
}

