/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;
import dji.upgrade.generate.ImageType;

public final class ImageDescriptionInformation
implements JNIProguardKeepTag {
    final ImageType mImageType;
    final String mUavName;
    final String mFirmwareVersion;
    final String mHdvtGndVersion;
    final String mMcuVersion;
    final int mFirmwarePositionIndex;

    public ImageDescriptionInformation(ImageType imageType, String string2, String string3, String string4, String string5, int n) {
    }

    public ImageType getImageType() {
        return null;
    }

    public String getUavName() {
        return null;
    }

    public String getFirmwareVersion() {
        return null;
    }

    public String getHdvtGndVersion() {
        return null;
    }

    public String getMcuVersion() {
        return null;
    }

    public int getFirmwarePositionIndex() {
        return 0;
    }

    public String toString() {
        return null;
    }
}

