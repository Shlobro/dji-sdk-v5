/*
 * Decompiled with CFR 0.152.
 */
package dji.media.jni.callback;

import dji.jni.JNIProguardKeepTag;

public interface JNIPlaybackVideoCallback
extends JNIProguardKeepTag {
    public void onVideoDataComing(int var1, int var2, boolean var3, double var4, byte[] var6);
}

