/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;
import dji.upgrade.UpgradeError;
import dji.upgrade.generate.FirmwareState;

public interface FirmwareStateCallback
extends JNIProguardKeepTag {
    public void OnResult(UpgradeError var1, FirmwareState var2, String var3);
}

