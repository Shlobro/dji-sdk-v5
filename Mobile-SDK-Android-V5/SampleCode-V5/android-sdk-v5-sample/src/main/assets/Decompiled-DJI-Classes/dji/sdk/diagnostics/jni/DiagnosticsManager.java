/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.diagnostics.jni;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.common.BoolCallback;
import dji.sdk.diagnostics.DiagnosticsUpdateCallback;
import dji.sdk.diagnostics.HMSDiagnosticsUpdateCallback;
import dji.sdk.keyvalue.value.diagnostic.Diagnostic;
import dji.sdk.keyvalue.value.diagnostic.HMSDiagnostic;
import dji.sdk.keyvalue.value.hms.HMSDiagnosticSenderType;
import dji.sdk.log_export.RetCodeStringCallback;
import java.util.List;

public class DiagnosticsManager
implements JNIProguardKeepTag {
    public static long addDiagnosticUpdateCallback(int n, int n2, DiagnosticsUpdateCallback diagnosticsUpdateCallback) {
        return 0L;
    }

    public static void removeDiagnosticUpdateCallback(int n, int n2, long l2) {
    }

    public static List<Diagnostic> getCurrentDiagnostics(int n, int n2) {
        return null;
    }

    public static long addHMSDiagnosticUpdateCallback(int n, int n2, HMSDiagnosticsUpdateCallback hMSDiagnosticsUpdateCallback) {
        return 0L;
    }

    public static long addHMSDiagnosticUpdateCallback(int n, int n2, HMSDiagnosticSenderType hMSDiagnosticSenderType, HMSDiagnosticsUpdateCallback hMSDiagnosticsUpdateCallback) {
        return 0L;
    }

    public static void removeHMSDiagnosticUpdateCallback(int n, int n2, long l2) {
    }

    public static List<HMSDiagnostic> getCurrentHMSDiagnostics(int n, int n2) {
        return null;
    }

    public static void subscribeHMSMsg(int n, int n2, BoolCallback boolCallback) {
    }

    public static void unsubscribeHMSMsg(int n, int n2, BoolCallback boolCallback) {
    }

    public static void startExportHistoryHMSError(int n, int n2, RetCodeStringCallback retCodeStringCallback) {
    }

    public static void stopExportHistoryHMSError(int n, int n2, BoolCallback boolCallback) {
    }

    private static native long native_AddDiagnosticUpdateCallback(int var0, int var1, DiagnosticsUpdateCallback var2);

    private static native void native_RemoveDiagnosticUpdateCallback(int var0, int var1, long var2);

    private static native List<byte[]> native_GetCurrentDiagnostics(int var0, int var1);

    private static native long native_AddHMSDiagnosticUpdateCallback(int var0, int var1, HMSDiagnosticsUpdateCallback var2);

    private static native long native_AddHMSDiagnosticUpdateCallback(int var0, int var1, int var2, HMSDiagnosticsUpdateCallback var3);

    private static native void native_RemoveHMSDiagnosticUpdateCallback(int var0, int var1, long var2);

    private static native List<byte[]> native_GetCurrentHMSDiagnostics(int var0, int var1);

    private static native void native_SubscribeHMSMsg(int var0, int var1, BoolCallback var2);

    private static native void native_UnsubscribeHMSMsg(int var0, int var1, BoolCallback var2);

    private static native void native_StartExportHistoryHMSError(int var0, int var1, RetCodeStringCallback var2);

    private static native void native_StopExportHistoryHMSError(int var0, int var1, BoolCallback var2);
}

