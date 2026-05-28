/*
 * Decompiled with CFR 0.152.
 */
package dji.jni.waypointv3;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.waypointv3.WaypointV3MissionState;

public interface WaypointV3MissionStateCallback
extends JNIProguardKeepTag {
    public void invoke(long var1, long var3, WaypointV3MissionState var5);
}

