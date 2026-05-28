/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.diagnostics;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.diagnostic.Diagnostic;
import java.util.List;

public interface DiagnosticsUpdateCallback
extends JNIProguardKeepTag {
    public void invoke(int var1, int var2, List<Diagnostic> var3);
}

