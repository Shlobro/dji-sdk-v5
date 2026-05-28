/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.handler.Network.jni;

import dji.sdk.handler.Network.IDownloadSizeCallback;

public class JNIDownloadSizeCallback
implements IDownloadSizeCallback {
    private int mID;

    public JNIDownloadSizeCallback(int n) {
    }

    @Override
    public void result(boolean bl, boolean bl2) {
    }

    @Override
    public void progress(long l2, long l3, double d2) {
    }

    private static native void native_callback_download_size(int var0, long var1, long var3, double var5);

    private static native void native_callback_download_result(int var0, boolean var1, boolean var2);
}

