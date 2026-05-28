/*
 * Decompiled with CFR 0.152.
 */
package dji.media.album.jni;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.file.FileTaskResponse;

public interface FileTaskCallback
extends JNIProguardKeepTag {
    public void invoke(int var1, FileTaskResponse var2, byte[] var3);
}

