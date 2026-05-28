/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.uploadfile;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.uploadfile.UploadFileCallBackStatus;

public interface UploadFileCallback
extends JNIProguardKeepTag {
    public void invoke(long var1, UploadFileCallBackStatus var3);
}

