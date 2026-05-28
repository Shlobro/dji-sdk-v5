/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;
import dji.upgrade.UpgradeError;
import dji.upgrade.generate.ComponentInformation;
import dji.upgrade.generate.FirmwareState;

public interface UpgradeStateCallback
extends JNIProguardKeepTag {
    public void OnResult(ComponentInformation var1, FirmwareState var2, String var3, String var4, UpgradeError var5);
}

