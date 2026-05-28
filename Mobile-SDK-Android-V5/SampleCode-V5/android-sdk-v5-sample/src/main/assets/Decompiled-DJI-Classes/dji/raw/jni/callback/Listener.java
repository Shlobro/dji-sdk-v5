/*
 * Decompiled with CFR 0.152.
 */
package dji.raw.jni.callback;

import dji.jni.JNIProguardKeepTag;

public interface Listener
extends JNIProguardKeepTag {
    public void onUpdateValue(long var1, int var3, int var4, int var5, int var6, byte[] var7);
}

