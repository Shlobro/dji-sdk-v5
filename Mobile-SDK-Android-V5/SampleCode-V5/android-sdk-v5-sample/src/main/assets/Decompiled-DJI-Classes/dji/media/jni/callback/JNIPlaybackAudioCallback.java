/*
 * Decompiled with CFR 0.152.
 */
package dji.media.jni.callback;

import dji.jni.JNIProguardKeepTag;

public interface JNIPlaybackAudioCallback
extends JNIProguardKeepTag {
    public void onAudioDataComing(int var1, int var2, double var3, byte[] var5);
}

