/*
 * Decompiled with CFR 0.152.
 */
package dji.jni.waypointv3;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.waypointv3.Waypoint3ErrorCodeMsg;
import java.util.List;

public interface Waypoint3ErrorCodeCallback
extends JNIProguardKeepTag {
    public void invoke(List<Waypoint3ErrorCodeMsg> var1);
}

