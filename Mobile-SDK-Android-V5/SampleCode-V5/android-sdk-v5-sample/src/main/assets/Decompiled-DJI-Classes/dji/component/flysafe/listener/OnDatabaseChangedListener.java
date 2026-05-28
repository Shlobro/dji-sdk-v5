/*
 * Decompiled with CFR 0.152.
 */
package dji.component.flysafe.listener;

import dji.jni.JNIProguardKeepTag;

public interface OnDatabaseChangedListener
extends JNIProguardKeepTag {
    public void onDbVersionChanged(String var1);
}

