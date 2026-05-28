/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package xcrash;

import android.content.Context;
import xcrash.DefaultLogger;
import xcrash.ICrashCallback;
import xcrash.ILibLoader;
import xcrash.ILogger;

public final class XCrash {
    private static boolean initialized = false;
    private static String appId = null;
    private static String appVersion = null;
    private static String logDir = null;
    private static ILogger logger = new DefaultLogger();
    public static String nativeLibDir = null;

    private XCrash() {
    }

    public static int init(Context context) {
        return 0;
    }

    public static synchronized int init(Context context, InitParameters initParameters) {
        return 0;
    }

    static String getAppId() {
        return null;
    }

    static String getAppVersion() {
        return null;
    }

    public static String getLogDir() {
        return null;
    }

    static ILogger getLogger() {
        return null;
    }

    public static void testJavaCrash(boolean bl) throws RuntimeException {
    }

    public static void testNativeCrash(boolean bl) {
    }

    public static class InitParameters {
        String appVersion;
        String logDir;
        int logFileMaintainDelayMs;
        ILogger logger;
        ILibLoader libLoader;
        int placeholderCountMax;
        int placeholderSizeKb;
        boolean enableJavaCrashHandler;
        boolean javaRethrow;
        int javaLogCountMax;
        int javaLogcatSystemLines;
        int javaLogcatEventsLines;
        int javaLogcatMainLines;
        boolean javaDumpFds;
        boolean javaDumpNetworkInfo;
        boolean javaDumpAllThreads;
        int javaDumpAllThreadsCountMax;
        String[] javaDumpAllThreadsWhiteList;
        ICrashCallback javaCallback;
        boolean enableNativeCrashHandler;
        boolean nativeRethrow;
        int nativeLogCountMax;
        int nativeLogcatSystemLines;
        int nativeLogcatEventsLines;
        int nativeLogcatMainLines;
        boolean nativeDumpElfHash;
        boolean nativeDumpMap;
        boolean nativeDumpFds;
        boolean nativeDumpNetworkInfo;
        boolean nativeDumpAllThreads;
        int nativeDumpAllThreadsCountMax;
        String[] nativeDumpAllThreadsWhiteList;
        ICrashCallback nativeCallback;
        boolean enableAnrHandler;
        boolean anrRethrow;
        boolean anrCheckProcessState;
        int anrLogCountMax;
        int anrLogcatSystemLines;
        int anrLogcatEventsLines;
        int anrLogcatMainLines;
        boolean anrDumpFds;
        boolean anrDumpNetworkInfo;
        ICrashCallback anrCallback;
        ICrashCallback anrFastCallback;

        public InitParameters setAppVersion(String string) {
            return null;
        }

        public InitParameters setLogDir(String string) {
            return null;
        }

        public InitParameters setLogFileMaintainDelayMs(int n) {
            return null;
        }

        public InitParameters setLogger(ILogger iLogger) {
            return null;
        }

        public InitParameters setLibLoader(ILibLoader iLibLoader) {
            return null;
        }

        public InitParameters setPlaceholderCountMax(int n) {
            return null;
        }

        public InitParameters setPlaceholderSizeKb(int n) {
            return null;
        }

        public InitParameters enableJavaCrashHandler() {
            return null;
        }

        public InitParameters disableJavaCrashHandler() {
            return null;
        }

        public InitParameters setJavaRethrow(boolean bl) {
            return null;
        }

        public InitParameters setJavaLogCountMax(int n) {
            return null;
        }

        public InitParameters setJavaLogcatSystemLines(int n) {
            return null;
        }

        public InitParameters setJavaLogcatEventsLines(int n) {
            return null;
        }

        public InitParameters setJavaLogcatMainLines(int n) {
            return null;
        }

        public InitParameters setJavaDumpFds(boolean bl) {
            return null;
        }

        public InitParameters setJavaDumpNetworkInfo(boolean bl) {
            return null;
        }

        public InitParameters setJavaDumpAllThreads(boolean bl) {
            return null;
        }

        public InitParameters setJavaDumpAllThreadsCountMax(int n) {
            return null;
        }

        public InitParameters setJavaDumpAllThreadsWhiteList(String[] stringArray) {
            return null;
        }

        public InitParameters setJavaCallback(ICrashCallback iCrashCallback) {
            return null;
        }

        public InitParameters enableNativeCrashHandler() {
            return null;
        }

        public InitParameters disableNativeCrashHandler() {
            return null;
        }

        public InitParameters setNativeRethrow(boolean bl) {
            return null;
        }

        public InitParameters setNativeLogCountMax(int n) {
            return null;
        }

        public InitParameters setNativeLogcatSystemLines(int n) {
            return null;
        }

        public InitParameters setNativeLogcatEventsLines(int n) {
            return null;
        }

        public InitParameters setNativeLogcatMainLines(int n) {
            return null;
        }

        public InitParameters setNativeDumpElfHash(boolean bl) {
            return null;
        }

        public InitParameters setNativeDumpMap(boolean bl) {
            return null;
        }

        public InitParameters setNativeDumpFds(boolean bl) {
            return null;
        }

        public InitParameters setNativeDumpNetwork(boolean bl) {
            return null;
        }

        public InitParameters setNativeDumpAllThreads(boolean bl) {
            return null;
        }

        public InitParameters setNativeDumpAllThreadsCountMax(int n) {
            return null;
        }

        public InitParameters setNativeDumpAllThreadsWhiteList(String[] stringArray) {
            return null;
        }

        public InitParameters setNativeCallback(ICrashCallback iCrashCallback) {
            return null;
        }

        public InitParameters enableAnrCrashHandler() {
            return null;
        }

        public InitParameters disableAnrCrashHandler() {
            return null;
        }

        public InitParameters setAnrRethrow(boolean bl) {
            return null;
        }

        public InitParameters setAnrCheckProcessState(boolean bl) {
            return null;
        }

        public InitParameters setAnrLogCountMax(int n) {
            return null;
        }

        public InitParameters setAnrLogcatSystemLines(int n) {
            return null;
        }

        public InitParameters setAnrLogcatEventsLines(int n) {
            return null;
        }

        public InitParameters setAnrLogcatMainLines(int n) {
            return null;
        }

        public InitParameters setAnrDumpFds(boolean bl) {
            return null;
        }

        public InitParameters setAnrDumpNetwork(boolean bl) {
            return null;
        }

        public InitParameters setAnrCallback(ICrashCallback iCrashCallback) {
            return null;
        }

        public InitParameters setAnrFastCallback(ICrashCallback iCrashCallback) {
            return null;
        }
    }
}

