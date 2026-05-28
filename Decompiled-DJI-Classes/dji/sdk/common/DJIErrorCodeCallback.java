/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.common;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.errorcode.DJIErrorCode;

public interface DJIErrorCodeCallback
extends JNIProguardKeepTag {
    public void invoke(DJIErrorCode var1);
}

