/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
package dji.v5.inner.analytics.helper;

import android.database.Cursor;
import java.text.SimpleDateFormat;

public class DJIAnalyticsEventHelper {
    public static final int BOOLEAN_FALSE = 0;
    public static final int BOOLEAN_TRUE = 1;
    private static final String TIME_PATTERN = "yyyy-MM-dd'T'HH:mm:ss";
    private final SimpleDateFormat dateFormat;

    public static DJIAnalyticsEventHelper getInstance() {
        return null;
    }

    private DJIAnalyticsEventHelper() {
    }

    public String getCurrentTime() {
        return null;
    }

    public static String getString(Cursor cursor, String string) {
        return null;
    }

    public static boolean getBoolean(Cursor cursor, String string) {
        return false;
    }

    public static long getLong(Cursor cursor, String string) {
        return 0L;
    }

    public static int getInt(Cursor cursor, String string) {
        return 0;
    }

    public static byte[] getByteArray(Cursor cursor, String string) {
        return null;
    }

    /* synthetic */ DJIAnalyticsEventHelper(1 var1_1) {
    }

    private static class LazyHolder {
        private static final DJIAnalyticsEventHelper INSTANCE = new DJIAnalyticsEventHelper(null);

        private LazyHolder() {
        }

        static /* synthetic */ DJIAnalyticsEventHelper access$100() {
            return null;
        }
    }
}

