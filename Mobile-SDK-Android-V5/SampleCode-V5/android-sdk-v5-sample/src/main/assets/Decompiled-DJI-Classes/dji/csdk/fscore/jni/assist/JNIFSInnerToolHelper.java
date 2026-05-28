/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.csdk.fscore.jni.assist;

import androidx.annotation.Keep;

@Keep
public class JNIFSInnerToolHelper {
    public static void resendTFRs() {
    }

    private static native void native_sendAppTFRs(int var0);

    private static native void native_sendDJIFlightTFRs(int var0);
}

