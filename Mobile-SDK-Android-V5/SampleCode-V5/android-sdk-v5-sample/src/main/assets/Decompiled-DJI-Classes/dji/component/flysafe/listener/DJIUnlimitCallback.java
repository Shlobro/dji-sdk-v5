/*
 * Decompiled with CFR 0.152.
 */
package dji.component.flysafe.listener;

import dji.jni.JNIProguardKeepTag;

public interface DJIUnlimitCallback
extends JNIProguardKeepTag {
    public void onSuccess();

    public void onFailed(String var1);

    public void onAlreadyVerify();

    public void onNotVerify();
}

