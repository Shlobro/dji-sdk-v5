/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.hmslog;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.hmslog.HMSLogDownloadRequestErrorCode;

public interface HMSLogDownloadCallback
extends JNIProguardKeepTag {
    public void invoke(int var1, int var2, String var3, HMSLogDownloadRequestErrorCode var4);
}

