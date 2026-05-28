/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 */
package dji.v5.utils.common;

import android.annotation.SuppressLint;
import android.content.Context;

public class ContextUtil {
    @SuppressLint(value={"StaticFieldLeak"})
    private static Context context;

    private ContextUtil() {
    }

    public static void init(Context context) {
    }

    public static Context getContext() {
        return null;
    }
}

