/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;
import dji.upgrade.UpgradeError;
import dji.upgrade.generate.DownloadState;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;

public interface DownloadProgressCallback
extends JNIProguardKeepTag {
    public void OnProgress(NativeObjects.UpgradeComponentProductType var1, float var2, DownloadState var3, String var4, long var5, UpgradeError var7);
}

