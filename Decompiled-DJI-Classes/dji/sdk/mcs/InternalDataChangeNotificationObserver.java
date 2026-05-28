/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.mcs;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.multiclientsync.MCSDataModel;

public interface InternalDataChangeNotificationObserver
extends JNIProguardKeepTag {
    public void invoke(MCSDataModel var1, boolean var2);
}

