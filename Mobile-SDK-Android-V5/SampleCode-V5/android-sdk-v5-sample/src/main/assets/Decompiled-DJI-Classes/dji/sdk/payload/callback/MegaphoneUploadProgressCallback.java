/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.payload.callback;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.payload.MegaphoneUploadProgressMsg;

public interface MegaphoneUploadProgressCallback
extends JNIProguardKeepTag {
    public void invoke(MegaphoneUploadProgressMsg var1);
}

