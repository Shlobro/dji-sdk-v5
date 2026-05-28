/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.log_export.jni;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.common.RetCodeCallback;
import dji.sdk.keyvalue.value.logexport.LogExportFileSelectInfo;
import dji.sdk.keyvalue.value.logexport.LogExportSendLogPathInfo;
import dji.sdk.keyvalue.value.logexport.LogExportSenderMsg;
import dji.sdk.log_export.LogExportCompressProgressCallback;
import dji.sdk.log_export.LogExportFileSelectCallback;
import dji.sdk.log_export.LogExportFtpControlCallback;

public class LogExportManager
implements JNIProguardKeepTag {
    public static void logExportOpenTcp(int n, int n2, LogExportSenderMsg logExportSenderMsg, LogExportFtpControlCallback logExportFtpControlCallback) {
    }

    public static void logExportCloseTcp(int n, int n2, LogExportSenderMsg logExportSenderMsg, LogExportFtpControlCallback logExportFtpControlCallback) {
    }

    public static void logExportCancelCurrentTcpTransport(int n, int n2, LogExportSenderMsg logExportSenderMsg, LogExportFtpControlCallback logExportFtpControlCallback) {
    }

    public static void logExportFileSelect(int n, int n2, LogExportFileSelectInfo logExportFileSelectInfo, LogExportFileSelectCallback logExportFileSelectCallback) {
    }

    public static void logExportSetCompressProgressListener(int n, int n2, LogExportCompressProgressCallback logExportCompressProgressCallback) {
    }

    public static void logExportSendLogPath(int n, int n2, LogExportSenderMsg logExportSenderMsg, LogExportSendLogPathInfo logExportSendLogPathInfo, RetCodeCallback retCodeCallback) {
    }

    private static native void native_LogExportOpenTcp(int var0, int var1, byte[] var2, LogExportFtpControlCallback var3);

    private static native void native_LogExportCloseTcp(int var0, int var1, byte[] var2, LogExportFtpControlCallback var3);

    private static native void native_LogExportCancelCurrentTcpTransport(int var0, int var1, byte[] var2, LogExportFtpControlCallback var3);

    private static native void native_LogExportFileSelect(int var0, int var1, byte[] var2, LogExportFileSelectCallback var3);

    private static native void native_LogExportSetCompressProgressListener(int var0, int var1, LogExportCompressProgressCallback var2);

    private static native void native_LogExportSendLogPath(int var0, int var1, byte[] var2, byte[] var3, RetCodeCallback var4);
}

