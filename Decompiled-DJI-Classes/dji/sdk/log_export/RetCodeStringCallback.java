/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.log_export;

import dji.jni.JNIProguardKeepTag;

public interface RetCodeStringCallback
extends JNIProguardKeepTag {
    public void invoke(int var1, String var2);
}

