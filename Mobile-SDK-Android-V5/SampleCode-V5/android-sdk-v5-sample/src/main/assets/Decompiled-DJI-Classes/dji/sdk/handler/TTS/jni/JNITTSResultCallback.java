/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.handler.TTS.jni;

import dji.sdk.handler.TTS.ITTSResultCallback;

public class JNITTSResultCallback
implements ITTSResultCallback {
    private int mID;

    public JNITTSResultCallback(int n) {
    }

    @Override
    public void result(boolean bl, int n) {
    }

    private static native void native_result_callback(int var0, boolean var1, int var2);
}

