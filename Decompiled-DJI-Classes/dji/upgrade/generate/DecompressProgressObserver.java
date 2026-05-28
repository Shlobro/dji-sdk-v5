/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;
import dji.upgrade.generate.DecompressProgressInformation;

public interface DecompressProgressObserver
extends JNIProguardKeepTag {
    public void OnDepressProgress(DecompressProgressInformation var1);
}

