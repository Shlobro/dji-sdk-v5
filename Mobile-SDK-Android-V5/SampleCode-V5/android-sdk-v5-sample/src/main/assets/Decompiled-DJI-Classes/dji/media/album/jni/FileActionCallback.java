/*
 * Decompiled with CFR 0.152.
 */
package dji.media.album.jni;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.file.FileActionResponse;

public interface FileActionCallback
extends JNIProguardKeepTag {
    public void invoke(int var1, FileActionResponse var2);
}

