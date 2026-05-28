/*
 * Decompiled with CFR 0.152.
 */
package dji.systemsettings.callback;

import dji.jni.JNIProguardKeepTag;

public interface SystemSettingsBoolCallback
extends JNIProguardKeepTag {
    public void onSuccess(boolean var1);

    public void onFailed();
}

