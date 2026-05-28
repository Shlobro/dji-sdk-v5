/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;
import dji.upgrade.UpgradeError;
import dji.upgrade.generate.FirmwareInformation;

public interface FirmwareInformationCallback
extends JNIProguardKeepTag {
    public void OnResult(UpgradeError var1, FirmwareInformation var2);
}

