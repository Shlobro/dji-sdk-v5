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
import dji.sdk.keyvalue.value.logexport.LogExportCompressLog;
import dji.sdk.keyvalue.value.logexport.LogExportSender;
import java.util.List;
import org.json.JSONObject;

public class LogExportCompressProgress
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LogExportSender sender;
    String logDir;
    Integer totalProgress;
    List<LogExportCompressLog> logs;

    public LogExportCompressProgress() {
    }

    public LogExportCompressProgress(LogExportSender logExportSender, String string, Integer n, List<LogExportCompressLog> list) {
    }

    public static LogExportCompressProgress fromJson(String string) {
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

    public LogExportSender getSender() {
        return null;
    }

    public void setSender(LogExportSender logExportSender) {
    }

    public String getLogDir() {
        return null;
    }

    public void setLogDir(String string) {
    }

    public Integer getTotalProgress() {
        return null;
    }

    public void setTotalProgress(Integer n) {
    }

    public List<LogExportCompressLog> getLogs() {
        return null;
    }

    public void setLogs(List<LogExportCompressLog> list) {
    }

    public String toString() {
        return null;
    }
}

