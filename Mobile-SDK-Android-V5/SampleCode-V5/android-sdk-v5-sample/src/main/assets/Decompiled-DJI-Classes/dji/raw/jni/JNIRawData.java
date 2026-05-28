/*
 * Decompiled with CFR 0.152.
 */
package dji.raw.jni;

import dji.jni.JNIProguardKeepTag;
import dji.raw.jni.callback.Listener;
import dji.raw.jni.callback.SendInterface;
import dji.sdk.jni.LibraryLoader;

public final class JNIRawData
implements JNIProguardKeepTag {
    public static native long native_SendData(int var0, int var1, int var2, int var3, int var4, int var5, boolean var6, int var7, int var8, int var9, int var10, int var11, int var12, byte[] var13, SendInterface var14);

    public static native long native_SendDataWithTcpPort(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, byte[] var13, SendInterface var14);

    public static native void native_CancelSend(long var0);

    public static native long native_RegisterObserver(int var0, int var1, int var2, Listener var3);

    public static native void native_UnregisterObserver(long var0);

    public static native int[] native_GetWiFiPortFdSet();

    static {
        LibraryLoader.load();
    }
}

