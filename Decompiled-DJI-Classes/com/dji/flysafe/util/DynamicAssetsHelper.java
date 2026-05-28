/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.dji.flysafe.util;

import android.content.Context;
import java.io.File;

public class DynamicAssetsHelper {
    private static String INTERNAL_PATH = "";
    public static String DJI_PATH = "";
    public static final String LIB_HEAD = "libs";
    public static String ABI = "armeabi-v7a";
    public static boolean isApkDebugable = false;

    public static void init(Context context) {
    }

    public static void loadLibrary(String string) {
    }

    public static void loadLibrary(String string, String string2) {
    }

    public static File getInternalFile(String string) {
        return null;
    }

    public static File getExternalFile(String string) {
        return null;
    }

    public static String getInternalPath() {
        return null;
    }

    public static String getExternalPath() {
        return null;
    }

    private static String addTrailingSlash(String string) {
        return null;
    }

    private static String addLeadingSlash(String string) {
        return null;
    }

    public boolean isApkDebugable() {
        return false;
    }
}

