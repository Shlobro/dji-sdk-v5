/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.inner.analytics.helper;

public class DJIAnalyticsTimeOutHelper {
    private static long startingTime = System.currentTimeMillis();
    private static final long BASE_WAIT_TIME = 5000L;
    private static long minimumWaitTime = 5000L;

    private DJIAnalyticsTimeOutHelper() {
    }

    public static void retry() {
    }

    public static void startTimer() {
    }

    public static long getMinimumWaitTime() {
        return 0L;
    }

    public static boolean shouldRetryNow() {
        return false;
    }
}

