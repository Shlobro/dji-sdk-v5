/*
 * Decompiled with CFR 0.152.
 */
package dji.bluetooth.jni;

import dji.jni.JNIProguardKeepTag;

public interface JNIBleStateCallback
extends JNIProguardKeepTag {
    public void onStateUpdate(boolean var1, int var2, byte[] var3);
}

