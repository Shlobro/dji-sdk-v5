/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.handler.Network.jni;

import dji.sdk.handler.Network.INetworkRequestCallback;
import java.util.Map;

public class JNINetworkRequestCallback
implements INetworkRequestCallback {
    private int mID;

    public JNINetworkRequestCallback(int n) {
    }

    @Override
    public void result(boolean bl, int n, byte[] byArray, Map<String, String> map) {
    }

    private static native void native_callback_result(int var0, boolean var1, int var2, byte[] var3, Map<String, String> var4);
}

