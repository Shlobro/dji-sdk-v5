/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;
import dji.upgrade.UpgradeError;
import dji.upgrade.generate.Component;
import dji.upgrade.generate.ImageType;
import dji.upgrade.generate.State;
import dji.upgrade.generate.UpgradeType;

public final class ProgressInformation
implements JNIProguardKeepTag {
    final Component mComponent;
    final ImageType mImageType;
    final float mProgress;
    final State mState;
    final UpgradeType mUpgradeType;
    final String mVersion;
    final UpgradeError mError;

    public ProgressInformation(Component component, ImageType imageType, float f2, State state, UpgradeType upgradeType, String string2, UpgradeError upgradeError) {
    }

    public Component getComponent() {
        return null;
    }

    public ImageType getImageType() {
        return null;
    }

    public float getProgress() {
        return 0.0f;
    }

    public State getState() {
        return null;
    }

    public UpgradeType getUpgradeType() {
        return null;
    }

    public String getVersion() {
        return null;
    }

    public UpgradeError getError() {
        return null;
    }

    public String toString() {
        return null;
    }
}

