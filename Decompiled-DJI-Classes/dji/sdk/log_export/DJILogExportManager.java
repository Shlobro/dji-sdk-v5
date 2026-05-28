/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.log_export;

import dji.sdk.common.DJIErrorCodeCallback;
import dji.sdk.keyvalue.value.logexport.LogExportCompressProgress;
import dji.sdk.keyvalue.value.logexport.LogExportFileSelectInfo;
import dji.sdk.keyvalue.value.logexport.LogExportFileSelectRsp;
import dji.sdk.keyvalue.value.logexport.LogExportFtpControlRsp;
import dji.sdk.keyvalue.value.logexport.LogExportSendLogPathInfo;
import dji.sdk.keyvalue.value.logexport.LogExportSender;
import dji.sdk.log_export.LogExportCompressProgressCallback;
import dji.sdk.log_export.LogExportFileSelectCallback;
import dji.sdk.log_export.LogExportFtpControlCallback;

public class DJILogExportManager {
    private int mDeviceID;
    private int mProductID;
    private static DJILogExportManager instance = null;

    private DJILogExportManager(int n, int n2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static DJILogExportManager getInstance() {
        return null;
    }

    public static DJILogExportManager getInstance(int n, int n2) {
        return null;
    }

    public void openReceiverTcp(LogExportSender logExportSender, LogExportFtpControlCallback logExportFtpControlCallback) {
    }

    public void closeReceiverTcp(LogExportSender logExportSender, LogExportFtpControlCallback logExportFtpControlCallback) {
    }

    public void cancelCurrentTcpTransport(LogExportSender logExportSender, LogExportFtpControlCallback logExportFtpControlCallback) {
    }

    public void fileSelect(LogExportFileSelectInfo logExportFileSelectInfo, LogExportFileSelectCallback logExportFileSelectCallback) {
    }

    public void setCompressProgressListener(LogExportCompressProgressCallback logExportCompressProgressCallback) {
    }

    public void sendLogPath(LogExportSender logExportSender, LogExportSendLogPathInfo logExportSendLogPathInfo, DJIErrorCodeCallback dJIErrorCodeCallback) {
    }

    private static /* synthetic */ void lambda$sendLogPath$11(DJIErrorCodeCallback dJIErrorCodeCallback, int n) {
    }

    private static /* synthetic */ void lambda$sendLogPath$10(DJIErrorCodeCallback dJIErrorCodeCallback, int n) {
    }

    private static /* synthetic */ void lambda$setCompressProgressListener$9(LogExportCompressProgressCallback logExportCompressProgressCallback, int n, int n2, LogExportCompressProgress logExportCompressProgress) {
    }

    private static /* synthetic */ void lambda$setCompressProgressListener$8(LogExportCompressProgressCallback logExportCompressProgressCallback, int n, int n2, LogExportCompressProgress logExportCompressProgress) {
    }

    private static /* synthetic */ void lambda$fileSelect$7(LogExportFileSelectCallback logExportFileSelectCallback, int n, int n2, LogExportFileSelectRsp logExportFileSelectRsp) {
    }

    private static /* synthetic */ void lambda$fileSelect$6(LogExportFileSelectCallback logExportFileSelectCallback, int n, int n2, LogExportFileSelectRsp logExportFileSelectRsp) {
    }

    private static /* synthetic */ void lambda$cancelCurrentTcpTransport$5(LogExportFtpControlCallback logExportFtpControlCallback, int n, int n2, LogExportFtpControlRsp logExportFtpControlRsp) {
    }

    private static /* synthetic */ void lambda$cancelCurrentTcpTransport$4(LogExportFtpControlCallback logExportFtpControlCallback, int n, int n2, LogExportFtpControlRsp logExportFtpControlRsp) {
    }

    private static /* synthetic */ void lambda$closeReceiverTcp$3(LogExportFtpControlCallback logExportFtpControlCallback, int n, int n2, LogExportFtpControlRsp logExportFtpControlRsp) {
    }

    private static /* synthetic */ void lambda$closeReceiverTcp$2(LogExportFtpControlCallback logExportFtpControlCallback, int n, int n2, LogExportFtpControlRsp logExportFtpControlRsp) {
    }

    private static /* synthetic */ void lambda$openReceiverTcp$1(LogExportFtpControlCallback logExportFtpControlCallback, int n, int n2, LogExportFtpControlRsp logExportFtpControlRsp) {
    }

    private static /* synthetic */ void lambda$openReceiverTcp$0(LogExportFtpControlCallback logExportFtpControlCallback, int n, int n2, LogExportFtpControlRsp logExportFtpControlRsp) {
    }
}

