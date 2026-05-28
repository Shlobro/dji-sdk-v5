/*
 * Decompiled with CFR 0.152.
 */
package dji.media.jni.callback;

import dji.jni.JNIProguardKeepTag;

public interface JNIPlaybackStateCallback
extends JNIProguardKeepTag {
    public void onPlaybackStateChanged(int var1, int var2, byte[] var3);
}

