/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.handler.Network.jni;

import dji.sdk.handler.Network.IDownloadCallback;

public class JNIDownloadCallback
implements IDownloadCallback {
    private int mID;

    public JNIDownloadCallback(int n) {
    }

    @Override
    public void result(boolean bl, boolean bl2) {
    }

    @Override
    public void progress(double d2) {
    }

    private static native void native_callback_progress(int var0, double var1);

    private static native void native_callback_result(int var0, boolean var1, boolean var2);
}

