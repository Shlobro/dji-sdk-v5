/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;
import dji.upgrade.UpgradeError;
import dji.upgrade.generate.ImageTotalInformation;

public interface ImageFetchInformationCallback
extends JNIProguardKeepTag {
    public void OnResult(ImageTotalInformation var1, UpgradeError var2);
}

