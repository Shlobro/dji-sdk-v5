/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;
import dji.upgrade.UpgradeError;
import dji.upgrade.generate.Component;
import dji.upgrade.generate.DecompressState;

public final class DecompressProgressInformation
implements JNIProguardKeepTag {
    final Component mComponent;
    final float mProgress;
    final DecompressState mState;
    final UpgradeError mError;

    public DecompressProgressInformation(Component component, float f2, DecompressState decompressState, UpgradeError upgradeError) {
    }

    public Component getComponent() {
        return null;
    }

    public float getProgress() {
        return 0.0f;
    }

    public DecompressState getState() {
        return null;
    }

    public UpgradeError getError() {
        return null;
    }

    public String toString() {
        return null;
    }
}

