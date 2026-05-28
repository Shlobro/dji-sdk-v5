/*
 * Decompiled with CFR 0.152.
 */
package dji.jni;

import dji.jni.JNIProguardKeepTag;
import dji.jni.callback.JNIEmptyCallback;
import dji.sdk.jni.LibraryLoader;

public final class JNIUsbAccessory
implements JNIProguardKeepTag {
    public static native void native_OnUsbConnected(int var0, String var1);

    public static native void native_OnUsbDisconnected(int var0, String var1);

    public static native boolean native_IsDataLinkAvailable(int var0);

    public static native void native_SetServicePortHandler(JNIEmptyCallback var0);

    static {
        LibraryLoader.load();
    }
}

