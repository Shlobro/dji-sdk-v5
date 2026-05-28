/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.hmslog;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.hmslog.HMSCodeModuleMapLoadErrorCode;

public interface HMSCodeModuleMapLoadCallback
extends JNIProguardKeepTag {
    public void invoke(HMSCodeModuleMapLoadErrorCode var1);
}

