/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package dji.v5.utils.common;

import android.content.Context;
import dji.v5.utils.common.LogUtils;

public class PermissionUtil {
    private static final String TAG = LogUtils.getTag("PermissionUtil");

    private PermissionUtil() {
    }

    public static boolean isPermissionGranted(Context context, String string2) {
        return false;
    }

    public static boolean hasPermissionInManifest(Context context, String string2) {
        return false;
    }
}

