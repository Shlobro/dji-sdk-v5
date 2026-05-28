/*
 * Decompiled with CFR 0.152.
 */
package dji.mission.jni.callback;

import dji.jni.JNIProguardKeepTag;

public interface JNIMissionBytesCallback
extends JNIProguardKeepTag {
    public void onSuccess(byte[] var1);

    public void onFailed(int var1);
}

