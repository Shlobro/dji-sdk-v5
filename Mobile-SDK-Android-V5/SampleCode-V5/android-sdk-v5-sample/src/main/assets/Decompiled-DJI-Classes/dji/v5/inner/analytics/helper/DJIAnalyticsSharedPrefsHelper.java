/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 */
package dji.v5.inner.analytics.helper;

import android.content.Context;
import android.content.SharedPreferences;

public class DJIAnalyticsSharedPrefsHelper {
    private static final String PREFERENCE_FILE_KEY = "dji.internal.analytics";
    private static final String STRING_DEFAULT_VALUE = "";
    private static final long LONG_DEFAULT_VALUE = 0L;
    private static final int INTEGER_DEFAULT_VALUE = 0;
    private static final boolean BOOLEAN_DEFAULT_VALUE = false;
    private static SharedPreferences sSharedPref;
    private static SharedPreferences.Editor sEditor;

    private DJIAnalyticsSharedPrefsHelper() {
    }

    public static void init(Context context) {
    }

    public static String getStringPref(String string) {
        return null;
    }

    public static void setStringPref(String string, String string2) {
    }

    public static void setIntegerPref(String string, int n) {
    }

    public static void setLongPref(String string, long l2) {
    }

    public static int getIntegerPref(String string) {
        return 0;
    }

    public static long getLongPref(String string) {
        return 0L;
    }

    public static void setBooleanPref(String string, boolean bl) {
    }

    public static boolean getBooleanPref(String string) {
        return false;
    }

    public static boolean containsKey(String string) {
        return false;
    }
}

