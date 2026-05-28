/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.diagnostics;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.diagnostic.HMSDiagnostic;

public interface HMSDiagnosticsFilterCallback
extends JNIProguardKeepTag {
    public boolean invoke(int var1, int var2, HMSDiagnostic var3);
}

