/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.handler.TimeSync;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.common.TimeSyncInfo;

public interface ITimeSyncRequestCallback
extends JNIProguardKeepTag {
    public TimeSyncInfo getTime();
}

