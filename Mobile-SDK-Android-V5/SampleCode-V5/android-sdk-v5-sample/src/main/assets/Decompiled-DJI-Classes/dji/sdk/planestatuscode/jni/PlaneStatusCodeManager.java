/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.planestatuscode.jni;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.planestatuscode.jni.PlaneStatusCodeListener;

public class PlaneStatusCodeManager
implements JNIProguardKeepTag {
    public static long addPlaneStatusCodeListener(PlaneStatusCodeListener planeStatusCodeListener) {
        return 0L;
    }

    public static long getCurrentPlaneStateCode(long l2) {
        return 0L;
    }

    public static void removePlaneStatusCodeListener(long l2) {
    }

    private static native long native_AddPlaneStatusCodeListener(PlaneStatusCodeListener var0);

    private static native long native_GetCurrentPlaneStateCode(long var0);

    private static native void native_RemovePlaneStatusCodeListener(long var0);
}

