/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;
import dji.upgrade.generate.ImageSwitchRequestReason;
import dji.upgrade.generate.ImageType;

public final class ImageSwitchRequestInformation
implements JNIProguardKeepTag {
    final int mDeviceId;
    final int mUpgradePushComponentType;
    final int mComponentUuid;
    final ImageType mImageType;
    final ImageSwitchRequestReason mRequestReason;

    public ImageSwitchRequestInformation(int n, int n2, int n3, ImageType imageType, ImageSwitchRequestReason imageSwitchRequestReason) {
    }

    public int getDeviceId() {
        return 0;
    }

    public int getUpgradePushComponentType() {
        return 0;
    }

    public int getComponentUuid() {
        return 0;
    }

    public ImageType getImageType() {
        return null;
    }

    public ImageSwitchRequestReason getRequestReason() {
        return null;
    }

    public String toString() {
        return null;
    }
}

