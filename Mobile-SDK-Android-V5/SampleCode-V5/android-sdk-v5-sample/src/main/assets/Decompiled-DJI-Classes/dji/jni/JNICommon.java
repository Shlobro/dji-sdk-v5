/*
 * Decompiled with CFR 0.152.
 */
package dji.jni;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.jni.LibraryLoader;
import dji.sdk.keyvalue.value.product.AppHeartBeatInfo;

public class JNICommon
implements JNIProguardKeepTag {
    public static void log(int n, String string2) {
    }

    public static void logWithModule(int n, int n2, int n3, String string2) {
    }

    public static void logInit(String string2) {
    }

    public static boolean setHeartBeatInfo(AppHeartBeatInfo appHeartBeatInfo) {
        return false;
    }

    private static native void native_log(int var0, String var1);

    private static native void native_module_log(int var0, int var1, int var2, String var3);

    private static native void native_log_init(String var0);

    private static native boolean native_set_heart_beat_info(String var0);

    static {
        LibraryLoader.load();
    }
}

