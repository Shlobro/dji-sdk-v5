/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package dji.v5.utils.common;

import android.content.Context;
import dji.v5.utils.common.LogUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;

public class StringUtils {
    private static final String TAG = LogUtils.getTag("StringUtils");
    private static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";
    private static final String DEFAULT_DATETIME_PATTERN = "yyyy-MM-dd hh:mm:ss";
    private static final Pattern EMOJI_PATTERN = Pattern.compile("[\ud83c\udc00-\ud83c\udfff]|[\u2600-\u27ff]", 66);

    private StringUtils() {
    }

    public static String formatDate(Date date, String string2) {
        return null;
    }

    public static String formatDate(Date date) {
        return null;
    }

    public static String getDate() {
        return null;
    }

    public static String getDateTime() {
        return null;
    }

    public static String formatDateTime(Date date) {
        return null;
    }

    public static String join(ArrayList<String> arrayList, String string2) {
        return null;
    }

    public static String join(String[] stringArray, String string2) {
        return null;
    }

    public static boolean isEmpty(String string2) {
        return false;
    }

    public static String getDateStr(int n, int n2, int n3, int n4, int n5, int n6) {
        return null;
    }

    public static String getResStr(Context context, int n, Object ... objectArray) {
        return null;
    }

    public static String getResStr(int n, Object ... objectArray) {
        return null;
    }

    public static String getResStr(Context context, String string2) {
        return null;
    }

    public static String getHexStrToUpperCase(long l2) {
        return null;
    }

    public static String getHexStr(long l2) {
        return null;
    }

    public static String formatDoubleForStr(double d2) {
        return null;
    }

    public static double formatDouble(double d2) {
        return 0.0;
    }

    public static String formatDouble(double d2, String string2) {
        return null;
    }

    public static boolean containsEmoji(String string2) {
        return false;
    }

    public static String removeLastCharacter(String string2) {
        return null;
    }
}

