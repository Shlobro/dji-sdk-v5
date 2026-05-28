/*
 * Decompiled with CFR 0.152.
 */
package dji.component.flysafe.listener;

import dji.jni.JNIProguardKeepTag;
import java.util.List;

public interface OnUnlockAreasListener
extends JNIProguardKeepTag {
    public void onUnlockAreas(List<Long> var1);
}

