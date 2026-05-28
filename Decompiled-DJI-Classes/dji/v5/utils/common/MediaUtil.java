/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.media.MediaScannerConnection
 *  android.media.MediaScannerConnection$MediaScannerConnectionClient
 */
package dji.v5.utils.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import dji.v5.utils.common.LogUtils;

public class MediaUtil {
    public static final String TAG = LogUtils.getTag("MediaUtil");
    private static MediaScannerConnection sc = null;

    private MediaUtil() {
    }

    public static Bitmap getImageThumbnail(String string2, int n, int n2) {
        return null;
    }

    public static Bitmap getVideoThumbnail(String string2, int n, int n2, int n3) {
        return null;
    }

    public static void scanDir(Context context, String string2, MediaScannerConnection.MediaScannerConnectionClient mediaScannerConnectionClient) {
    }

    public static String getMimeTypeFromPath(String string2) {
        return null;
    }

    private static void scan(MediaScannerConnection mediaScannerConnection, String string2) {
    }

    static /* synthetic */ MediaScannerConnection access$000() {
        return null;
    }

    static /* synthetic */ void access$100(MediaScannerConnection mediaScannerConnection, String string2) {
    }
}

