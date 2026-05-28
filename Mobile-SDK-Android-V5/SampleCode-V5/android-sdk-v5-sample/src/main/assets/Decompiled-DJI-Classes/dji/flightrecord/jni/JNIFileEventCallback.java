/*
 * Decompiled with CFR 0.152.
 */
package dji.flightrecord.jni;

import dji.jni.JNIProguardKeepTag;

public interface JNIFileEventCallback
extends JNIProguardKeepTag {
    public void callback(int var1, int var2, byte[] var3);
}

