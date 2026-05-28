/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.innertools;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.innertool.V1PackHeader;

public interface CmdWatchCallback
extends JNIProguardKeepTag {
    public void invoke(boolean var1, long var2, V1PackHeader var4, byte[] var5);
}

