/*
 * Decompiled with CFR 0.152.
 */
package dji.component.flysafe.listener;

import dji.jni.JNIProguardKeepTag;

public interface CommonHttpCallback
extends JNIProguardKeepTag {
    public static final int ERROR_UNKNOW = -1;

    public void onSuccess();

    public void onFailure(int var1, String var2);
}

