/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.mop;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.mop.PipelineIdentifier;
import java.util.List;

public interface PipelineConnectionObserver
extends JNIProguardKeepTag {
    public void invoke(int var1, int var2, List<PipelineIdentifier> var3);
}

