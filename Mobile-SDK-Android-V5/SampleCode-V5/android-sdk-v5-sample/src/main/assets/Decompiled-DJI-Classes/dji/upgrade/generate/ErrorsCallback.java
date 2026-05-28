/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;
import dji.upgrade.UpgradeError;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;
import java.util.ArrayList;

public interface ErrorsCallback
extends JNIProguardKeepTag {
    public void OnResult(long var1, NativeObjects.UpgradeComponentProductType var3, int var4, ArrayList<UpgradeError> var5);
}

