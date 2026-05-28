/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.zipfile;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.zipfile.ZipCallBackStatus;

public interface ZipFileCallback
extends JNIProguardKeepTag {
    public void invoke(long var1, ZipCallBackStatus var3);
}

