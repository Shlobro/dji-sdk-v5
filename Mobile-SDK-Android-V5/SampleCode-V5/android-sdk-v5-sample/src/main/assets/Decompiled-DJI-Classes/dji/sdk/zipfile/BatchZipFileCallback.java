/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.zipfile;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.zipfile.BatchZipCallBackStatus;

public interface BatchZipFileCallback
extends JNIProguardKeepTag {
    public void invoke(long var1, BatchZipCallBackStatus var3);
}

