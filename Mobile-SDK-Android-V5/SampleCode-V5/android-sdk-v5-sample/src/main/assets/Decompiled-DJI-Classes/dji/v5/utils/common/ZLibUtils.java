/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.utils.common;

import dji.v5.utils.common.LogUtils;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class ZLibUtils {
    public static final String TAG = LogUtils.getTag("ZLibUtils");

    private ZLibUtils() {
    }

    public static byte[] compress(byte[] byArray) {
        return null;
    }

    public static void compress(byte[] byArray, OutputStream outputStream) {
    }

    public static byte[] decompress(byte[] byArray) {
        return null;
    }

    public static byte[] decompress(InputStream inputStream) {
        return null;
    }
}

