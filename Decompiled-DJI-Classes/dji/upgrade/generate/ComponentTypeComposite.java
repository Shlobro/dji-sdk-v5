/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;
import dji.upgrade.generate.ImageType;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;

public final class ComponentTypeComposite
implements JNIProguardKeepTag {
    final NativeObjects.UpgradeComponentProductType mComponentType;
    final ImageType mImageType;

    public ComponentTypeComposite(NativeObjects.UpgradeComponentProductType upgradeComponentProductType, ImageType imageType) {
    }

    public NativeObjects.UpgradeComponentProductType getComponentType() {
        return null;
    }

    public ImageType getImageType() {
        return null;
    }

    public String toString() {
        return null;
    }
}

