/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.mcs;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.channel.ChannelMode;

public interface TimeDeltaNotificationObserver
extends JNIProguardKeepTag {
    public void invoke(ChannelMode var1, long var2, int var4);
}

