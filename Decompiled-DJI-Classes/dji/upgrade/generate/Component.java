/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;

public final class Component
implements JNIProguardKeepTag {
    final int mDeviceId;
    final NativeObjects.UpgradeComponentProductType mId;
    final int mUuid;

    public Component(int n, NativeObjects.UpgradeComponentProductType upgradeComponentProductType, int n2) {
    }

    public int getDeviceId() {
        return 0;
    }

    public NativeObjects.UpgradeComponentProductType getId() {
        return null;
    }

    public int getUuid() {
        return 0;
    }

    public String toString() {
        return null;
    }
}

