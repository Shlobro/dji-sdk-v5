/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;
import dji.upgrade.UpgradeError;
import dji.upgrade.generate.DownloadState;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;

public final class DownloadProgressInformation
implements JNIProguardKeepTag {
    final NativeObjects.UpgradeComponentProductType mComponentType;
    final float mProgress;
    final DownloadState mState;
    final String mVersion;
    final long mDownloadedSpeed;
    final UpgradeError mError;

    public DownloadProgressInformation(NativeObjects.UpgradeComponentProductType upgradeComponentProductType, float f2, DownloadState downloadState, String string2, long l2, UpgradeError upgradeError) {
    }

    public NativeObjects.UpgradeComponentProductType getComponentType() {
        return null;
    }

    public float getProgress() {
        return 0.0f;
    }

    public DownloadState getState() {
        return null;
    }

    public String getVersion() {
        return null;
    }

    public long getDownloadedSpeed() {
        return 0L;
    }

    public UpgradeError getError() {
        return null;
    }

    public String toString() {
        return null;
    }
}

