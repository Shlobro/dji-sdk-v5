/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.hmslog;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.hmslog.HMSLogDownloadRequestErrorCode;
import dji.sdk.keyvalue.value.hmslog.HMSLogFileInfo;
import java.util.List;

public interface HMSLogFetchListCallback
extends JNIProguardKeepTag {
    public void invoke(int var1, int var2, List<HMSLogFileInfo> var3, HMSLogDownloadRequestErrorCode var4);
}

