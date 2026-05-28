/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Environment
 */
package dji.util;

import android.content.Context;
import android.os.Environment;
import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.product.AppType;

public class DJIPath
implements JNIProguardKeepTag {
    private static String mRootFolderName = "DJI";
    private static String mPackageFolderName;
    private static String mDirName;
    private static String mCacheFolder;

    public static boolean init(Context context, AppType appType) {
        return false;
    }

    public static String GetExternalCacheDirPath(String string2) {
        return null;
    }

    public static String GetLogPath(AppType appType) {
        return null;
    }

    private static boolean makeDir(String string2) {
        return false;
    }

    static {
        mDirName = Environment.getExternalStorageDirectory().getAbsolutePath() + "/DJI/";
    }
}

