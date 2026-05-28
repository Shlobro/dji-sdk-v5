/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.statuscode.jni;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.statuscode.jni.StatusCodeUpdateCallback;

public class StatusCodeManager
implements JNIProguardKeepTag {
    public static long addStatusCodeListener(int n, int n2, StatusCodeUpdateCallback statusCodeUpdateCallback) {
        return 0L;
    }

    public static long getCurrentStatusCode(int n, int n2) {
        return 0L;
    }

    public static void removeStatusCodeListener(int n, int n2, long l2) {
    }

    private static native long native_AddStatusCodeListener(int var0, int var1, StatusCodeUpdateCallback var2);

    private static native long native_GetCurrentStatusCode(int var0, int var1);

    private static native void native_RemoveStatusCodeListener(int var0, int var1, long var2);
}

