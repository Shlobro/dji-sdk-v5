/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.payload.callback;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.payload.MegaphoneErrorCodeMsg;

public interface MegaphoneErrorCodeCallback
extends JNIProguardKeepTag {
    public void invoke(MegaphoneErrorCodeMsg var1);
}

