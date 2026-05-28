/*
 * Decompiled with CFR 0.152.
 */
package dji.utmiss.jni.callback;

import dji.jni.JNIProguardKeepTag;

public interface JNIUtmissUploadStatusCallback
extends JNIProguardKeepTag {
    public void callBack(int var1, int var2, byte[] var3);
}

