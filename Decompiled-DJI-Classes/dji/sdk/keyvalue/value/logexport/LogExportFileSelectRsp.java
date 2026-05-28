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
import dji.sdk.keyvalue.value.logexport.LogExportFileSelectRetCode;
import dji.sdk.keyvalue.value.logexport.LogExportLogInfo;
import java.util.List;
import org.json.JSONObject;

public class LogExportFileSelectRsp
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LogExportFileSelectRetCode code;
    Integer srcSize;
    List<LogExportLogInfo> logs;
    Integer destSize;

    public LogExportFileSelectRsp() {
    }

    public LogExportFileSelectRsp(LogExportFileSelectRetCode logExportFileSelectRetCode, Integer n, List<LogExportLogInfo> list, Integer n2) {
    }

    public static LogExportFileSelectRsp fromJson(String string) {
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

    public LogExportFileSelectRetCode getCode() {
        return null;
    }

    public void setCode(LogExportFileSelectRetCode logExportFileSelectRetCode) {
    }

    public Integer getSrcSize() {
        return null;
    }

    public void setSrcSize(Integer n) {
    }

    public List<LogExportLogInfo> getLogs() {
        return null;
    }

    public void setLogs(List<LogExportLogInfo> list) {
    }

    public Integer getDestSize() {
        return null;
    }

    public void setDestSize(Integer n) {
    }

    public String toString() {
        return null;
    }
}

