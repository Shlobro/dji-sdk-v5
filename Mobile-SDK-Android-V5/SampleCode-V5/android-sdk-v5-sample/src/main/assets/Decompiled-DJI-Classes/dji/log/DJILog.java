/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.SparseArray
 */
package dji.log;

import android.content.Context;
import android.util.SparseArray;
import dji.log.Controller;
import dji.log.DJILogConsoleConfig;
import dji.log.DJILogFileConfig;
import dji.log.DJILogHelper;
import dji.log.Interceptor;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class DJILog {
    private static volatile boolean init;
    private static String rootName;
    private static final int DEFAULT_START_STACK = 2;
    private static final int DEFAULT_ALL_STACK = 100;
    private static SparseArray<Long> startTimes;
    private static int intervalIndex;

    private static DJILogHelper getLogHelper() {
        return null;
    }

    public static void init(Context context) {
    }

    public static void init(Context context, DJILogFileConfig dJILogFileConfig, DJILogConsoleConfig dJILogConsoleConfig) {
    }

    public static String getExternalCacheDirPath(Context context, String string) {
        return null;
    }

    public static boolean hasInit() {
        return false;
    }

    public static Controller controller() {
        return null;
    }

    public static void setController(Controller controller) {
    }

    public static Controller newController() {
        return null;
    }

    public static void v(String string, String string2, Object ... objectArray) {
    }

    public static void v(String string, String string2, Throwable throwable, Object ... objectArray) {
    }

    public static void d(String string, String string2, Object ... objectArray) {
    }

    public static void d(String string, String string2, Throwable throwable, Object ... objectArray) {
    }

    public static void i(String string, String string2, Object ... objectArray) {
    }

    public static void i(String string, String string2, Throwable throwable, Object ... objectArray) {
    }

    public static void w(String string, String string2, Object ... objectArray) {
    }

    public static void w(String string, String string2, Throwable throwable, Object ... objectArray) {
    }

    public static void e(String string, String string2, Object ... objectArray) {
    }

    public static void e(String string, String string2, Throwable throwable, Object ... objectArray) {
    }

    private static long[] getPriorityRatio() {
        return null;
    }

    public static void saveLog(String string) {
    }

    public static void saveLog(String string, String string2) {
    }

    private static void saveLog(String string, String string2, String string3) {
    }

    private static void saveLog(int n, String string, String string2, String string3) {
    }

    private static void saveAbsLog(int n, String string, String string2, String string3) {
    }

    @Deprecated
    public static void saveExtraLog(String string, String string2) {
    }

    private static void saveExtraLog(String string, String string2, String string3) {
    }

    public static void showView(String string) {
    }

    public static void flush() {
    }

    public static void addInterceptor(Interceptor interceptor) {
    }

    public static void removeInterceptor(Interceptor interceptor) {
    }

    public static String getRootDirectory() {
        return null;
    }

    public static void object(Object object) {
    }

    public static void object(String string, Object object) {
    }

    public static void object(int n, String string, Object object) {
    }

    public static void json(String string) {
    }

    public static void json(String string, String string2) {
    }

    public static void json(int n, String string, String string2) {
    }

    public static void xml(String string) {
    }

    public static void xml(String string, String string2) {
    }

    public static void xml(int n, String string, String string2) {
    }

    public static void logWriteV(String string, String string2) {
    }

    public static void logWriteV(String string, String string2, String string3) {
    }

    public static void logWriteAbsV(String string, String string2, String string3) {
    }

    public static void logWriteD(String string, String string2) {
    }

    public static void logWriteD(String string, String string2, String string3) {
    }

    public static void logWriteD(String string, String string2, String string3, Object ... objectArray) {
    }

    public static void logWriteAbsD(String string, String string2, String string3) {
    }

    public static void logWriteW(String string, String string2) {
    }

    public static void logWriteW(String string, String string2, String string3) {
    }

    public static void logWriteAbsW(String string, String string2, String string3) {
    }

    public static void logWriteI(String string, String string2) {
    }

    public static void logWriteI(String string, String string2, String string3) {
    }

    public static void logWriteAbsI(String string, String string2, String string3) {
    }

    public static void logWriteE(String string, String string2) {
    }

    public static void logWriteE(String string, String string2, Object ... objectArray) {
    }

    public static void logWriteE(String string, String string2, String string3) {
    }

    public static void logWriteE(String string, String string2, String string3, Object ... objectArray) {
    }

    public static void logWriteAbsE(String string, String string2, String string3) {
    }

    public static void logStack() {
    }

    public static void logStack(int n) {
    }

    public static void logStack(String string, int n) {
    }

    public static void saveStack(String string) {
    }

    public static void saveStack(String string, int n) {
    }

    private static void saveStack(String string, String string2, int n) {
    }

    public static void logSaveStack(String string, Thread thread, String string2) {
    }

    public static void logSaveAllThreadStack(String string, Thread thread, String string2) {
    }

    public static void countTime(String string, Callback callback) {
    }

    public static void startTime(int n) {
    }

    public static void endTimes(int n) {
    }

    public static void endTimesFilter(int n) {
    }

    public static void interval() {
    }

    public static void saveAsync(String string, String string2) {
    }

    public static void d(String string, String string2, boolean bl, boolean bl2) {
    }

    public static void e(String string, String string2, boolean bl, boolean bl2) {
    }

    public static void i(String string, String string2, boolean bl, boolean bl2) {
    }

    public static void save(String string, String string2) {
    }

    public static void saveConnectDebug(String string) {
    }

    public static String exceptionToString(Throwable throwable) {
        return null;
    }

    public static String getCurrentStack() {
        return null;
    }

    public static String formatObject(Object object) {
        return null;
    }

    private static /* synthetic */ String lambda$init$0(long l2, String string, String string2, String string3) {
        return null;
    }

    static {
        startTimes = new SparseArray(5);
        intervalIndex = 999;
    }

    public static interface Callback {
        public void doMethod();
    }

    @Retention(value=RetentionPolicy.SOURCE)
    public static @interface Level {
    }
}

