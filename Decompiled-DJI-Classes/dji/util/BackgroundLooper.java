/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 */
package dji.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

public class BackgroundLooper {
    private static volatile BackgroundLooper looper;
    public HandlerThread handlerThread;
    public Handler handler;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static BackgroundLooper get() {
        return null;
    }

    private BackgroundLooper() {
    }

    public static Looper getLooper() {
        return null;
    }

    public static void post(Runnable runnable) {
    }

    public static void postDelayed(Runnable runnable, long l2) {
    }

    public static void remove(Runnable runnable) {
    }
}

