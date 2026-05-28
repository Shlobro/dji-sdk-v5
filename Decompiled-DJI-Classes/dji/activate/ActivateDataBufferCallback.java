/*
 * Decompiled with CFR 0.152.
 */
package dji.activate;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.activate.ActivateComponentInfoMsg;
import dji.sdk.keyvalue.value.activate.ActivateModulePushMsg;

public interface ActivateDataBufferCallback
extends JNIProguardKeepTag {
    public void callback(int var1, ActivateComponentInfoMsg var2, ActivateModulePushMsg var3, byte[] var4);
}

