/*
 * Decompiled with CFR 0.152.
 */
package dji.file.jni;

import dji.jni.JNIProguardKeepTag;

public interface JNIFileDataCallback
extends JNIProguardKeepTag {
    public void onReceivedFileData(int var1, boolean var2, double var3, byte[] var5);
}

