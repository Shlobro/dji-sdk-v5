/*
 * Decompiled with CFR 0.152.
 */
package dji.mission.jni.callback;

import dji.jni.JNIProguardKeepTag;

public interface JNIMissionActionCallback
extends JNIProguardKeepTag {
    public void onSuccess();

    public void onFailed(int var1);
}

