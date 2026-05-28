/*
 * Decompiled with CFR 0.152.
 */
package dji.component.flysafe.dbupgrade.callback;

import dji.jni.JNIProguardKeepTag;

public interface CEDatabaseRefershServerCallback
extends JNIProguardKeepTag {
    public void onStateChange(int var1, int var2, int var3);
}

