/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 */
package dji.v5.utils.common;

import android.content.Context;
import androidx.annotation.NonNull;
import dji.v5.utils.common.LogPath;

public class LogUtils {
    private static final String LOG_MSDK_TAG = "DJIV5";
    private static boolean enableLog = false;
    private static final String IS_LOG_ENABLED = "IS_LOG_ENABLED";

    public static void initLog(Context context) {
    }

    public static void enableLog(boolean bl) {
    }

    public static boolean isLogEnabled() {
        return false;
    }

    public static String getLogPath() {
        return null;
    }

    public static String getCrashLogPath() {
        return null;
    }

    public static boolean clearLog() {
        return false;
    }

    public static void d(String string2, LogPath logPath, Object ... objectArray) {
    }

    public static void i(String string2, LogPath logPath, Object ... objectArray) {
    }

    public static void w(String string2, LogPath logPath, Object ... objectArray) {
    }

    public static void e(String string2, LogPath logPath, Object ... objectArray) {
    }

    public static void d(LogPath logPath, Object ... objectArray) {
    }

    public static void i(LogPath logPath, Object ... objectArray) {
    }

    public static void w(LogPath logPath, Object ... objectArray) {
    }

    public static void e(LogPath logPath, Object ... objectArray) {
    }

    public static void d(String string2, Object ... objectArray) {
    }

    public static void i(String string2, Object ... objectArray) {
    }

    public static void w(String string2, Object ... objectArray) {
    }

    public static void e(String string2, Object ... objectArray) {
    }

    public static void flush() {
    }

    public static void log(LogType logType, String string2, LogPath logPath, Object ... objectArray) {
    }

    public static String getTag(Object object) {
        return null;
    }

    public static String getTag(String string2) {
        return null;
    }

    public static String getExceptionMsg(Throwable throwable) {
        return null;
    }

    private static String getLogStr(Object ... objectArray) {
        return null;
    }

    private static String getLogStrWithMethodInfo(String string2, String string3, String string4) {
        return null;
    }

    private static StackTraceElement getStackTraceElement(int n) {
        return null;
    }

    public static String getTrace(StackTraceElement[] stackTraceElementArray) {
        return null;
    }

    public static String getExceptionTrace(Exception exception) {
        return null;
    }

    public static String getTrace() {
        return null;
    }

    private static boolean canLog(LogType logType) {
        return false;
    }

    public static void zipAndExportLog(String string2, @NonNull OnExportLogProgressCallback onExportLogProgressCallback) {
    }

    public static final class LogType
    extends Enum<LogType> {
        public static final /* enum */ LogType DEBUG = new LogType(3);
        public static final /* enum */ LogType INFO = new LogType(4);
        public static final /* enum */ LogType WARNING = new LogType(5);
        public static final /* enum */ LogType ERROR = new LogType(6);
        private final int value;
        private static LogType[] values;
        private static final /* synthetic */ LogType[] $VALUES;

        public static LogType[] values() {
            return null;
        }

        public static LogType valueOf(String string2) {
            return null;
        }

        private LogType(int n2) {
        }

        public int value() {
            return 0;
        }

        private boolean _equals(int n) {
            return false;
        }

        public static LogType[] getValues() {
            return null;
        }

        public static LogType find(int n) {
            return null;
        }

        private static /* synthetic */ LogType[] $values() {
            return null;
        }

        static {
            $VALUES = LogType.$values();
        }
    }

    public static interface OnExportLogProgressCallback {
        public void onExportBegin();

        public void onExportProgress(int var1);

        public void onExportFailed(String var1);

        public void onExportSuccess(String var1);
    }
}

