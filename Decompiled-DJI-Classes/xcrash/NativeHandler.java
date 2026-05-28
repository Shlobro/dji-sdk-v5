/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 */
package xcrash;

import android.annotation.SuppressLint;
import android.content.Context;
import xcrash.ICrashCallback;
import xcrash.ILibLoader;

@SuppressLint(value={"StaticFieldLeak"})
class NativeHandler {
    private static final String TAG = "xcrash";
    private static final NativeHandler instance = new NativeHandler();
    private long anrTimeoutMs;
    private Context ctx;
    private boolean crashRethrow;
    private ICrashCallback crashCallback;
    private boolean anrEnable;
    private boolean anrCheckProcessState;
    private ICrashCallback anrCallback;
    private ICrashCallback anrFastCallback;
    private boolean initNativeLibOk;

    private NativeHandler() {
    }

    static NativeHandler getInstance() {
        return null;
    }

    int initialize(Context context, ILibLoader iLibLoader, String string, String string2, String string3, boolean bl, boolean bl2, int n, int n2, int n3, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, int n4, String[] stringArray, ICrashCallback iCrashCallback, boolean bl8, boolean bl9, boolean bl10, int n5, int n6, int n7, boolean bl11, boolean bl12, ICrashCallback iCrashCallback2, ICrashCallback iCrashCallback3) {
        return 0;
    }

    void notifyJavaCrashed() {
    }

    void testNativeCrash(boolean bl) {
    }

    private static String getStacktraceByThreadName(boolean bl, String string) {
        return null;
    }

    private static void crashCallback(String string, String string2, boolean bl, boolean bl2, String string3) {
    }

    private static void traceCallbackBeforeDump() {
    }

    private static void traceCallback(String string, String string2) {
    }

    private static native int nativeInit(int var0, String var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8, String var9, String var10, boolean var11, boolean var12, int var13, int var14, int var15, boolean var16, boolean var17, boolean var18, boolean var19, boolean var20, int var21, String[] var22, boolean var23, boolean var24, int var25, int var26, int var27, boolean var28, boolean var29);

    private static native void nativeNotifyJavaCrashed();

    private static native void nativeTestCrash(int var0);
}

