/*
 * Decompiled with CFR 0.152.
 */
package dji.raw.jni.callback;

import dji.jni.JNIProguardKeepTag;

public interface SendInterface
extends JNIProguardKeepTag {
    public void onReceivedData(long var1, byte[] var3);

    public void onTimeout(long var1);
}

