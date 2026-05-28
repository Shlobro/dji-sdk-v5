/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.sdk_v3;

import dji.jni.JNIProguardKeepTag;

public class CSDKV3Adapter
implements JNIProguardKeepTag {
    public static long getPackManagerPtr() {
        return 0L;
    }

    private static native long native_GetPackManagerPtr();
}

