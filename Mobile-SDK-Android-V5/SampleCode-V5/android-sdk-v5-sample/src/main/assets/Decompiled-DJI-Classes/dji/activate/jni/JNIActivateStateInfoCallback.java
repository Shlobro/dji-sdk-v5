/*
 * Decompiled with CFR 0.152.
 */
package dji.activate.jni;

import dji.jni.JNIProguardKeepTag;

public interface JNIActivateStateInfoCallback
extends JNIProguardKeepTag {
    public void stateCallback(int var1, int var2, byte[] var3, byte[] var4);
}

