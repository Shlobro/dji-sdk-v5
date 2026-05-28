/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.deactivate;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.activate.ActivateComponentInfoMsg;

public interface DeActivateResultCallback
extends JNIProguardKeepTag {
    public void invoke(int var1, int var2, ActivateComponentInfoMsg var3);
}

