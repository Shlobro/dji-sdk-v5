/*
 * Decompiled with CFR 0.152.
 */
package dji.activate.jni;

import dji.jni.JNIProguardKeepTag;

public interface JNIActivateModuleInfoCallback
extends JNIProguardKeepTag {
    public void stateCallback(int var1, byte[] var2, byte[] var3);
}

