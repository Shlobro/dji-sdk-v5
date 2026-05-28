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
import dji.sdk.keyvalue.value.logexport.LogExportSender;
import org.json.JSONObject;

public class LogExportSenderMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LogExportSender value;

    public LogExportSenderMsg() {
    }

    public LogExportSenderMsg(LogExportSender logExportSender) {
    }

    public static LogExportSenderMsg fromJson(String string) {
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

    public LogExportSender getValue() {
        return null;
    }

    public void setValue(LogExportSender logExportSender) {
    }

    public String toString() {
        return null;
    }
}

