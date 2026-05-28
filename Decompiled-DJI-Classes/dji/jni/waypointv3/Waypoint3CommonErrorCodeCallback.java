/*
 * Decompiled with CFR 0.152.
 */
package dji.jni.waypointv3;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.waypointv3.Waypoint3ErrorCode;

public interface Waypoint3CommonErrorCodeCallback
extends JNIProguardKeepTag {
    public void invoke(Waypoint3ErrorCode var1);
}

