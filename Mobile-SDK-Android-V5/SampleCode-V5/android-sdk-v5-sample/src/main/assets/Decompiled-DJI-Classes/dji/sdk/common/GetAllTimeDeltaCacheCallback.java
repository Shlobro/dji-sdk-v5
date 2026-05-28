/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.common;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.multiclientsync.TimeDeltaData;
import java.util.List;

public interface GetAllTimeDeltaCacheCallback
extends JNIProguardKeepTag {
    public void invoke(List<TimeDeltaData> var1);
}

