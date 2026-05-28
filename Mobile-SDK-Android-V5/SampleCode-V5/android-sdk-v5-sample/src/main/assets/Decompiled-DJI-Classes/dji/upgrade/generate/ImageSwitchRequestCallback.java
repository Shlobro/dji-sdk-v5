/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;
import dji.upgrade.generate.ImageSwitchRequestInformation;

public interface ImageSwitchRequestCallback
extends JNIProguardKeepTag {
    public void OnRequest(ImageSwitchRequestInformation var1);
}

