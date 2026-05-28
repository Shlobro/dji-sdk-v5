/*
 * Decompiled with CFR 0.152.
 */
package dji.file.jni;

import dji.jni.JNIProguardKeepTag;

public interface JNIStreamInfoCallback
extends JNIProguardKeepTag {
    public void onReceivedData(byte[] var1);
}

