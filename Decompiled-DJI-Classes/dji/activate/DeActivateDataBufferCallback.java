/*
 * Decompiled with CFR 0.152.
 */
package dji.activate;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.activate.ActivateComponentInfoMsg;

public interface DeActivateDataBufferCallback
extends JNIProguardKeepTag {
    public void callback(int var1, int var2, ActivateComponentInfoMsg var3, byte[] var4);
}

