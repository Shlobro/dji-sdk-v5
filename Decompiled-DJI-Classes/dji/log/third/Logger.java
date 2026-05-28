/*
 * Decompiled with CFR 0.152.
 */
package dji.log.third;

import dji.log.third.LoggerPrinter;
import dji.log.third.Printer;
import dji.log.third.Settings;

public final class Logger {
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int ASSERT = 7;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private static final String DEFAULT_TAG = "PRETTYLOGGER";
    private static LoggerPrinter printer = new LoggerPrinter();

    private Logger() {
    }

    public static Settings init() {
        return null;
    }

    public static Settings init(String string) {
        return null;
    }

    public static void resetSettings() {
    }

    public static Printer t(String string) {
        return null;
    }

    public static Printer t(int n) {
        return null;
    }

    public static Printer t(String string, int n) {
        return null;
    }

    public static void log(int n, String string, String string2, Throwable throwable) {
    }

    public static void d(String string, Object ... objectArray) {
    }

    public static void d(Object object) {
    }

    public static void e(String string, Object ... objectArray) {
    }

    public static void e(Throwable throwable, String string, Object ... objectArray) {
    }

    public static void i(String string, Object ... objectArray) {
    }

    public static void v(String string, Object ... objectArray) {
    }

    public static void w(String string, Object ... objectArray) {
    }

    public static void wtf(String string, Object ... objectArray) {
    }

    public static void json(String string) {
    }

    public static void xml(String string) {
    }
}

