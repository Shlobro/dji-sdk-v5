/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 */
package com.dji.flysafe.util;

import android.content.Context;
import android.os.IBinder;

public class ContextUtil {
    public static final String TAG = "ContextUtil";
    private static Context CONTEXT_INSTANCE;

    public static synchronized Context getContext() {
        return null;
    }

    public static IBinder getService(String string) {
        return null;
    }

    public static String getWifiIP() {
        return null;
    }

    private static String intToIp(int n) {
        return null;
    }

    public static boolean isAppBroughtToBackground() {
        return false;
    }

    public static int getPID() {
        return 0;
    }
}

