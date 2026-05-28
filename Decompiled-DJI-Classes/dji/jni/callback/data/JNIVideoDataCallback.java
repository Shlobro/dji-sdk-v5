/*
 * Decompiled with CFR 0.152.
 */
package dji.jni.callback.data;

import dji.jni.JNIProguardKeepTag;

public interface JNIVideoDataCallback
extends JNIProguardKeepTag {
    public void onVideoDataComing(int var1, int var2, byte[] var3, byte[] var4);
}

