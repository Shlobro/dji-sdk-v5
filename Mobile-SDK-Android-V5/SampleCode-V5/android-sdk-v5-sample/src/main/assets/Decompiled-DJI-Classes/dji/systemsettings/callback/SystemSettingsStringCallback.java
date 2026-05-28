/*
 * Decompiled with CFR 0.152.
 */
package dji.systemsettings.callback;

import dji.jni.JNIProguardKeepTag;

public interface SystemSettingsStringCallback
extends JNIProguardKeepTag {
    public void onSuccess(String var1);

    public void onFailed();
}

