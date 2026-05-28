/*
 * Decompiled with CFR 0.152.
 */
package dji.activate;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.activate.ActivateComponentInfoMsg;
import dji.sdk.keyvalue.value.activate.ActivateStateMsg;

public interface ActivateStateInfoCallback
extends JNIProguardKeepTag {
    public void callback(int var1, int var2, ActivateComponentInfoMsg var3, ActivateStateMsg var4);
}

