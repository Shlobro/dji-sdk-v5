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
import dji.sdk.keyvalue.value.logexport.LogExportLogInfo;
import org.json.JSONObject;

public class LogExportCompressLog
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LogExportLogInfo info;
    Integer compressProgress;

    public LogExportCompressLog() {
    }

    public LogExportCompressLog(LogExportLogInfo logExportLogInfo, Integer n) {
    }

    public static LogExportCompressLog fromJson(String string) {
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

    public LogExportLogInfo getInfo() {
        return null;
    }

    public void setInfo(LogExportLogInfo logExportLogInfo) {
    }

    public Integer getCompressProgress() {
        return null;
    }

    public void setCompressProgress(Integer n) {
    }

    public String toString() {
        return null;
    }
}

