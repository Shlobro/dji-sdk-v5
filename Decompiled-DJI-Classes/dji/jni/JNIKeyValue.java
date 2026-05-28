/*
 * Decompiled with CFR 0.152.
 */
package dji.jni;

import dji.jni.JNIProguardKeepTag;
import dji.jni.callback.key.JNIActionCallback;
import dji.jni.callback.key.JNIGetCallback;
import dji.jni.callback.key.JNIListenCallback;
import dji.jni.callback.key.JNISetCallback;
import dji.sdk.jni.LibraryLoader;
import dji.sdk.keyvalue.key.DJIKey;
import dji.sdk.keyvalue.value.base.DJIValue;

public final class JNIKeyValue
implements JNIProguardKeepTag {
    public static <ParamType extends DJIValue> void set(DJIKey dJIKey, ParamType ParamType, JNISetCallback jNISetCallback) {
    }

    public static void get(DJIKey dJIKey, JNIGetCallback jNIGetCallback) {
    }

    public static byte[] get(DJIKey dJIKey) {
        return null;
    }

    public static int listen(DJIKey dJIKey, JNIListenCallback jNIListenCallback) {
        return 0;
    }

    public static void cancelListen(DJIKey dJIKey, int n) {
    }

    public static <ParamType extends DJIValue> void doAction(DJIKey dJIKey, ParamType ParamType, JNIActionCallback jNIActionCallback) {
    }

    private static native void native_set(int var0, int var1, int var2, int var3, int var4, String var5, byte[] var6, JNISetCallback var7);

    private static native void native_get(int var0, int var1, int var2, int var3, int var4, String var5, JNIGetCallback var6);

    private static native byte[] native_get_sync(int var0, int var1, int var2, int var3, int var4, String var5);

    private static native int native_listen(int var0, int var1, int var2, int var3, int var4, String var5, JNIListenCallback var6);

    private static native void native_cancel_listen(int var0, int var1, int var2, int var3, int var4, int var5);

    private static native void native_do_action(int var0, int var1, int var2, int var3, int var4, String var5, byte[] var6, JNIActionCallback var7);

    static {
        try {
            LibraryLoader.load();
        }
        catch (Throwable e2) {
            LibraryLoader.load();
        }
    }
}

