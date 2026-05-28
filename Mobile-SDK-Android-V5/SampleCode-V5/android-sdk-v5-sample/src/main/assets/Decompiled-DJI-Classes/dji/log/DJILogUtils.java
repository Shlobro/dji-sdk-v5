/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.log;

import androidx.annotation.NonNull;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class DJILogUtils {
    public static final String FORMAT_1 = "yyyy-MM-dd";
    public static final String FORMAT_2 = "yyyy-MM-dd HH:mm:ss";
    private static final int JSON_INDENT = 2;
    private static final String JSON_INVALID = "Invalid Json";
    private static final String JSON_OBJECT_PREFIX = "{";
    private static final String JSON_ARRAY_PREFIX = "[";
    private static final String XMl_INVALID = "Invalid Xml";
    private static final int MAX_TAG_LENGTH = 23;
    private static final int CALL_STACK_INDEX = 3;
    private static final Pattern ANONYMOUS_CLASS = Pattern.compile("(\\$\\d+)+$");

    public static String formatNow() {
        return null;
    }

    public static String formatNow(String string) {
        return null;
    }

    public static String format(Date date) {
        return null;
    }

    public static String format(long l2) {
        return null;
    }

    public static String format(long l2, String string) {
        return null;
    }

    public static String format(Date date, String string) {
        return null;
    }

    public static Date parse(String string) {
        return null;
    }

    public static Date parse(String string, String string2) {
        return null;
    }

    private static SimpleDateFormat obtainDateFormat(String string) {
        return null;
    }

    static boolean isOfficial() {
        return false;
    }

    static String formatJson(String string) {
        return null;
    }

    static String formatXml(String string) {
        return null;
    }

    static String formatObject(Object object) {
        return null;
    }

    public static String getCurrentStack() {
        return null;
    }

    public static String getCurrentStack(int n) {
        return null;
    }

    public static String getThreadStack(Thread thread) {
        return null;
    }

    public static String getAllThreadStack() {
        return null;
    }

    static String getCurrentStack(int n, int n2) {
        return null;
    }

    public static String exceptionToString(Throwable throwable) {
        return null;
    }

    static String obtainStackElementTag() {
        return null;
    }

    static String obtainStackElementTag(int n) {
        return null;
    }

    static String getStackTraceString(Throwable throwable) {
        return null;
    }

    static String formatMessage(@NonNull String string, Object ... objectArray) {
        return null;
    }
}

