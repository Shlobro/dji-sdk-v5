/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;
import dji.upgrade.generate.ImageDescriptionInformation;
import dji.upgrade.generate.ImageType;
import java.util.ArrayList;

public final class ImageTotalInformation
implements JNIProguardKeepTag {
    final int mMaxImageNum;
    final int mValidImageNum;
    final ImageType mRunningImageType;
    final ArrayList<ImageDescriptionInformation> mInstalledImage;

    public ImageTotalInformation(int n, int n2, ImageType imageType, ArrayList<ImageDescriptionInformation> arrayList) {
    }

    public int getMaxImageNum() {
        return 0;
    }

    public int getValidImageNum() {
        return 0;
    }

    public ImageType getRunningImageType() {
        return null;
    }

    public ArrayList<ImageDescriptionInformation> getInstalledImage() {
        return null;
    }

    public String toString() {
        return null;
    }
}

