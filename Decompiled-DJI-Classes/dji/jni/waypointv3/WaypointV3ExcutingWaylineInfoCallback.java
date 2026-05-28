/*
 * Decompiled with CFR 0.152.
 */
package dji.jni.waypointv3;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.waypointv3.CurrentExcutingWaylineInfo;

public interface WaypointV3ExcutingWaylineInfoCallback
extends JNIProguardKeepTag {
    public void invoke(long var1, long var3, CurrentExcutingWaylineInfo var5);
}

