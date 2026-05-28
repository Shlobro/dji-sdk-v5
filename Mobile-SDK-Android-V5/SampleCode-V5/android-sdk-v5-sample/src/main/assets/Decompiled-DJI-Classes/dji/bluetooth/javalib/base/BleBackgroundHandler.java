/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 */
package dji.bluetooth.javalib.base;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

public class BleBackgroundHandler {
    private static BleBackgroundHandler looper;
    public HandlerThread handlerThread;
    public Handler handler;

    public static BleBackgroundHandler get() {
        return null;
    }

    private BleBackgroundHandler() {
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

