/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;
import dji.upgrade.UpgradeError;

public interface ResultCallback
extends JNIProguardKeepTag {
    public void OnResult(UpgradeError var1);
}

