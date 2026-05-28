/*
 * Decompiled with CFR 0.152.
 */
package dji.jni.callback.data;

import dji.jni.JNIProguardKeepTag;

public interface JNIAudioDataCallback
extends JNIProguardKeepTag {
    public void onAudioDataComing(int var1, byte[] var2, byte[] var3);
}

