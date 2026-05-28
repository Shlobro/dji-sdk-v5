/*
 * Decompiled with CFR 0.152.
 */
package dji.jni.waypointv3;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.waypointv3.ExecutingWaylineActionInfo;

public interface WaypointV3ExcutingActionInfoCallback
extends JNIProguardKeepTag {
    public void invoke(long var1, long var3, ExecutingWaylineActionInfo var5);
}

