/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.diagnostics;

import dji.sdk.common.BoolCallback;
import dji.sdk.diagnostics.DiagnosticsUpdateCallback;
import dji.sdk.diagnostics.HMSDiagnosticsUpdateCallback;
import dji.sdk.keyvalue.value.diagnostic.Diagnostic;
import dji.sdk.keyvalue.value.diagnostic.HMSDiagnostic;
import dji.sdk.keyvalue.value.hms.HMSDiagnosticSenderType;
import dji.sdk.log_export.RetCodeStringCallback;
import dji.sdk.statuscode.jni.StatusCodeUpdateCallback;
import java.util.List;

public class DJIDiagnosticsManager {
    private int mDeviceID;
    private int mProductID;
    private static DJIDiagnosticsManager instance = null;

    private DJIDiagnosticsManager(int n, int n2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static DJIDiagnosticsManager getInstance() {
        return null;
    }

    public static DJIDiagnosticsManager getInstance(int n, int n2) {
        return null;
    }

    public long addDiagnosticUpdateCallback(DiagnosticsUpdateCallback diagnosticsUpdateCallback) {
        return 0L;
    }

    public void removeDiagnosticUpdateCallback(long l2) {
    }

    public List<Diagnostic> getCurrentDiagnostics() {
        return null;
    }

    public long addHMSDiagnosticUpdateCallback(HMSDiagnosticsUpdateCallback hMSDiagnosticsUpdateCallback) {
        return 0L;
    }

    public long addHMSDiagnosticUpdateCallback(HMSDiagnosticSenderType hMSDiagnosticSenderType, HMSDiagnosticsUpdateCallback hMSDiagnosticsUpdateCallback) {
        return 0L;
    }

    public void removeHMSDiagnosticUpdateCallback(long l2) {
    }

    public List<HMSDiagnostic> getCurrentHMSDiagnostics() {
        return null;
    }

    public void subscribeHMSMsg(BoolCallback boolCallback) {
    }

    public void unsubscribeHMSMsg(BoolCallback boolCallback) {
    }

    public long addStatusCodeUpdateCallback(StatusCodeUpdateCallback statusCodeUpdateCallback) {
        return 0L;
    }

    public long getCurrentStatusCode() {
        return 0L;
    }

    public void removeStatusCodeListener(long l2) {
    }

    public void startExportHistoryHMSError(RetCodeStringCallback retCodeStringCallback) {
    }

    public void stopExportHistoryHMSError(BoolCallback boolCallback) {
    }

    private static /* synthetic */ void lambda$stopExportHistoryHMSError$15(BoolCallback boolCallback, boolean bl) {
    }

    private static /* synthetic */ void lambda$stopExportHistoryHMSError$14(BoolCallback boolCallback, boolean bl) {
    }

    private static /* synthetic */ void lambda$startExportHistoryHMSError$13(RetCodeStringCallback retCodeStringCallback, int n, String string) {
    }

    private static /* synthetic */ void lambda$startExportHistoryHMSError$12(RetCodeStringCallback retCodeStringCallback, int n, String string) {
    }

    private static /* synthetic */ void lambda$addStatusCodeUpdateCallback$11(StatusCodeUpdateCallback statusCodeUpdateCallback, int n, int n2, long l2) {
    }

    private static /* synthetic */ void lambda$addStatusCodeUpdateCallback$10(StatusCodeUpdateCallback statusCodeUpdateCallback, int n, int n2, long l2) {
    }

    private static /* synthetic */ void lambda$unsubscribeHMSMsg$9(BoolCallback boolCallback, boolean bl) {
    }

    private static /* synthetic */ void lambda$unsubscribeHMSMsg$8(BoolCallback boolCallback, boolean bl) {
    }

    private static /* synthetic */ void lambda$subscribeHMSMsg$7(BoolCallback boolCallback, boolean bl) {
    }

    private static /* synthetic */ void lambda$subscribeHMSMsg$6(BoolCallback boolCallback, boolean bl) {
    }

    private static /* synthetic */ void lambda$addHMSDiagnosticUpdateCallback$5(HMSDiagnosticsUpdateCallback hMSDiagnosticsUpdateCallback, int n, int n2, List list) {
    }

    private static /* synthetic */ void lambda$addHMSDiagnosticUpdateCallback$4(HMSDiagnosticsUpdateCallback hMSDiagnosticsUpdateCallback, int n, int n2, List list) {
    }

    private static /* synthetic */ void lambda$addHMSDiagnosticUpdateCallback$3(HMSDiagnosticsUpdateCallback hMSDiagnosticsUpdateCallback, int n, int n2, List list) {
    }

    private static /* synthetic */ void lambda$addHMSDiagnosticUpdateCallback$2(HMSDiagnosticsUpdateCallback hMSDiagnosticsUpdateCallback, int n, int n2, List list) {
    }

    private static /* synthetic */ void lambda$addDiagnosticUpdateCallback$1(DiagnosticsUpdateCallback diagnosticsUpdateCallback, int n, int n2, List list) {
    }

    private static /* synthetic */ void lambda$addDiagnosticUpdateCallback$0(DiagnosticsUpdateCallback diagnosticsUpdateCallback, int n, int n2, List list) {
    }
}

