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
import dji.sdk.keyvalue.value.logexport.LogExportEncryptType;
import dji.sdk.keyvalue.value.logexport.LogExportFtpControlRetCode;
import org.json.JSONObject;

public class LogExportFtpControlRsp
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LogExportFtpControlRetCode code;
    LogExportEncryptType encrypt;
    String logPath;

    public LogExportFtpControlRsp() {
    }

    public LogExportFtpControlRsp(LogExportFtpControlRetCode logExportFtpControlRetCode, LogExportEncryptType logExportEncryptType, String string) {
    }

    public static LogExportFtpControlRsp fromJson(String string) {
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

    public LogExportFtpControlRetCode getCode() {
        return null;
    }

    public void setCode(LogExportFtpControlRetCode logExportFtpControlRetCode) {
    }

    public LogExportEncryptType getEncrypt() {
        return null;
    }

    public void setEncrypt(LogExportEncryptType logExportEncryptType) {
    }

    public String getLogPath() {
        return null;
    }

    public void setLogPath(String string) {
    }

    public String toString() {
        return null;
    }
}

