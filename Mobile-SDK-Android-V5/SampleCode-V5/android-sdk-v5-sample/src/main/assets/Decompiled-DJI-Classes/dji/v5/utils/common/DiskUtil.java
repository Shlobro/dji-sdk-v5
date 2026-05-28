/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Environment
 */
package dji.v5.utils.common;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.HashMap;

public class DiskUtil {
    private static final String TAG = "V_DiskUtil";
    public static final String MNT_ROOT = "/mnt/";
    public static final String SDCARD_ROOT = Environment.getExternalStorageDirectory().getAbsolutePath();

    private DiskUtil() {
    }

    public static String getExternalCacheDirPath(Context context, String string2) {
        return null;
    }

    public static void mkdirs(String string2) {
    }

    public static File getDiskCacheDir(Context context, String string2) {
        return null;
    }

    public static String getDiskCacheDirPath(Context context, String string2) {
        return null;
    }

    public static HashMap<String, String> getAllMountPath() {
        return null;
    }

    private static String getPathKey(File file, int n) {
        return null;
    }

    private static String getBestMountPath() {
        return null;
    }

    public static File getExternalCacheDir(Context context, String string2) {
        return null;
    }

    public static long getUsableSpace(File file) {
        return 0L;
    }
}

