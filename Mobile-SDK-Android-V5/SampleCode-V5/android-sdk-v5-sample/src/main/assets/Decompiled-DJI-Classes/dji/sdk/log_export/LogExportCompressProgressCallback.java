/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.log_export;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.logexport.LogExportCompressProgress;

public interface LogExportCompressProgressCallback
extends JNIProguardKeepTag {
    public void invoke(int var1, int var2, LogExportCompressProgress var3);
}

