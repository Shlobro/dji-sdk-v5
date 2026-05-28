/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.log_export;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.logexport.LogExportFileSelectRsp;

public interface LogExportFileSelectCallback
extends JNIProguardKeepTag {
    public void invoke(int var1, int var2, LogExportFileSelectRsp var3);
}

