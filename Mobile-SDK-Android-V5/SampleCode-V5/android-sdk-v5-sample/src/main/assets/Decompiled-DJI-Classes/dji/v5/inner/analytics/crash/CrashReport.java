/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.Keep
 *  androidx.annotation.NonNull
 */
package dji.v5.inner.analytics.crash;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.Map;
import xcrash.ICrashCallback;

@Keep
public class CrashReport {
    private static final String KEY_AIB = "ABI";
    private static final String KEY_ROOT = "ROOT";
    private static final String KEY_CRASH_TYPE = "CrashType";
    private static final String KEY_CRASH_TIME = "CrashTime";
    private static final String KEY_PROCESS_NAME = "ProcessName";
    private static final String KEY_THREAD_NAME = "ThreadName";
    private static final String KEY_JAVA_STACKTRACE = "JavaStacktrace";
    private static final String KEY_NATIVE_STACKTRACE = "NativeStacktrace";
    private static final String KEY_STACKTRACE = "Stacktrace";
    private static final String KEY_NATIVE_MESSAGE = "NativeMessage";
    private static final String KEY_NATIVE_SIGNAL = "NativeSignal";
    private static final String KEY_NATIVE_CODE = "NativeCode";
    private static final String KEY_ACCURATE = "Accurate";
    private static final String KEY_SDK_BUILD_VERSION = "SDKBuildVersion";
    private static final String KEY_MD5 = "MD5";
    private static final String CRASH_FILTER_VERSION = "LOCAL";
    private static final String CRASH_FILTER_DJI_PACKAGE = "dji.";
    private static final String CRASH_FILTER_JAVA_DJI_PACKAGE = "dji.v5.";
    private static final String CRASH_FILTER_JAVA_DJI_CALLBACK = "callback";
    private static final String CRASH_FILTER_JAVA_DJI_LISTENER = "listener";
    private static final String CRASH_FILTER_NATIVE_DJI_SO = "libdji";
    private static final String CRASH_FILTER_NATIVE_SYSTEM_SO = "libart.so";
    private static final String[] CRASH_WHITE_LIST = new String[]{"DJICheckException", "dji.v5.common.utils.CallbackUtils", "xcrash.XCrash.testJavaCrash", ".onDeviceHealthInfoUpdate"};
    private static boolean isAlreadyInit;
    private static final ICrashCallback sCrashCallback;

    private CrashReport() {
    }

    public static synchronized void init(@NonNull Context context) {
    }

    public static void testJavaCrash(boolean bl) {
    }

    public static void testNativeCrash(boolean bl) {
    }

    private static boolean isNeedReport(String string, String string2) {
        return false;
    }

    private static boolean isAccurateDJIError(String string, String string2) {
        return false;
    }

    private static void report(Map<String, Object> map) {
    }

    private static String prueCrashLog(String string) {
        return null;
    }

    static {
        sCrashCallback = (string, string2) -> {};
    }
}

