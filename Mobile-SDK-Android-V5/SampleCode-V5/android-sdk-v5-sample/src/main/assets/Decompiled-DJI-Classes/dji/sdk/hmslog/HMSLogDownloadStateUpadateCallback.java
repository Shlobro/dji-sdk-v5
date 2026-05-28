/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.hmslog;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.hmslog.HMSLogDownloadRequest;
import dji.sdk.keyvalue.value.hmslog.HMSLogDownloadState;

public interface HMSLogDownloadStateUpadateCallback
extends JNIProguardKeepTag {
    public void invoke(int var1, int var2, HMSLogDownloadRequest var3, HMSLogDownloadState var4);
}

