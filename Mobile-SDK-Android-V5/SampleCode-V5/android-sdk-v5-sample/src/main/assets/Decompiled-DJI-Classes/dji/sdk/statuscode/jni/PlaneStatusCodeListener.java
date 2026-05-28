/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.statuscode.jni;

import dji.jni.JNIProguardKeepTag;

public interface PlaneStatusCodeListener
extends JNIProguardKeepTag {
    public void invoke(int var1, int var2, long var3);
}

