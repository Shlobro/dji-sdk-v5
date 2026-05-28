/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.zipfile.jni;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.zipfile.ZipFileCallback;
import java.util.List;

public class ZipFileManager
implements JNIProguardKeepTag {
    public static long startZip(List<String> list, String string, ZipFileCallback zipFileCallback) {
        return 0L;
    }

    public static boolean cancelZip(long l2) {
        return false;
    }

    private static native long native_StartZip(List<String> var0, String var1, ZipFileCallback var2);

    private static native boolean native_CancelZip(long var0);
}

