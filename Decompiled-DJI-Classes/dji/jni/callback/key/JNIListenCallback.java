/*
 * Decompiled with CFR 0.152.
 */
package dji.jni.callback.key;

import dji.jni.JNIProguardKeepTag;

public interface JNIListenCallback
extends JNIProguardKeepTag {
    public void onValueChange(byte[] var1, int var2, int var3);
}

