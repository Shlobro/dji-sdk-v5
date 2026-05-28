/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.hmslog;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.hmslog.HMSLogLockResultInfo;

public interface HMSLogUserLockResultCallback
extends JNIProguardKeepTag {
    public void invoke(int var1, int var2, HMSLogLockResultInfo var3);
}

