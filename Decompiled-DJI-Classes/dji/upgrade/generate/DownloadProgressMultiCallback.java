/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;
import dji.upgrade.generate.DownloadProgressInformation;
import java.util.ArrayList;

public interface DownloadProgressMultiCallback
extends JNIProguardKeepTag {
    public void OnProgress(ArrayList<DownloadProgressInformation> var1, DownloadProgressInformation var2);
}

