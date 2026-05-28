/*
 * Decompiled with CFR 0.152.
 */
package dji.jni.callback;

import dji.jni.JNIProguardKeepTag;

public interface JNIProductConnectionCallback
extends JNIProguardKeepTag {
    public void onProductConnected(int var1, String var2);

    public void onProductDisconnected(int var1);
}

