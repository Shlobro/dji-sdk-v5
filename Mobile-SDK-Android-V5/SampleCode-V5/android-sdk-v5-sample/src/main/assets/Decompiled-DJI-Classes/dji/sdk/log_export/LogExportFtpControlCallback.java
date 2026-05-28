/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.log_export;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.logexport.LogExportFtpControlRsp;

public interface LogExportFtpControlCallback
extends JNIProguardKeepTag {
    public void invoke(int var1, int var2, LogExportFtpControlRsp var3);
}

