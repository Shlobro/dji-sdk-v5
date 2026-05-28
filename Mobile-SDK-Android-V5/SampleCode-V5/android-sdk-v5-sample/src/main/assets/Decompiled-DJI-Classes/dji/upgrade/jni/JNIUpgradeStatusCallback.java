/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.jni;

import dji.jni.JNIProguardKeepTag;

public interface JNIUpgradeStatusCallback
extends JNIProguardKeepTag {
    public void callBack(int var1, byte[] var2, byte[] var3, byte[] var4);
}

