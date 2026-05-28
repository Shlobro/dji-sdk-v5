/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.hmslog;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.hmslog.HMSLogLockSupportedInfo;

public interface HMSLogUserLockCheckCallback
extends JNIProguardKeepTag {
    public void invoke(int var1, int var2, HMSLogLockSupportedInfo var3);
}

