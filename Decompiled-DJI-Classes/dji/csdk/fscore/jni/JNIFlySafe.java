/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.csdk.fscore.jni;

import androidx.annotation.Keep;

@Keep
public class JNIFlySafe {
    private static boolean IS_FS_JNI_LAYER_INIT;

    public static boolean isIsFsJniLayerInit() {
        return false;
    }

    public static synchronized void checkNInitFSJNILayer(String string, String string2, String string3) {
    }

    public static native void native_initialize(String var0, String var1, String var2, float var3);

    static {
        System.loadLibrary("djifs_jni-CSDK");
        IS_FS_JNI_LAYER_INIT = false;
    }
}

