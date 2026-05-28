/*
 * Decompiled with CFR 0.152.
 */
package dji.media.jni.callback;

import dji.jni.JNIProguardKeepTag;

public interface JNIFilelistStateCallback
extends JNIProguardKeepTag {
    public void onFilelistStateChanged(int var1, int var2, byte[] var3);
}

