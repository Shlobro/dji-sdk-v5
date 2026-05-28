/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaylineWaypointYawMode
extends Enum<WaylineWaypointYawMode>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylineWaypointYawMode FOLLOW_WAYLINE = new WaylineWaypointYawMode(0);
    public static final /* enum */ WaylineWaypointYawMode FIXED = new WaylineWaypointYawMode(1);
    public static final /* enum */ WaylineWaypointYawMode MANUALLY = new WaylineWaypointYawMode(2);
    public static final /* enum */ WaylineWaypointYawMode TOWARD_POI = new WaylineWaypointYawMode(3);
    public static final /* enum */ WaylineWaypointYawMode SMOOTH_TRANSITION = new WaylineWaypointYawMode(4);
    public static final /* enum */ WaylineWaypointYawMode UNKNOWN = new WaylineWaypointYawMode(65535);
    private int value;
    private static final WaylineWaypointYawMode[] allValues;
    private static final /* synthetic */ WaylineWaypointYawMode[] $VALUES;

    public static WaylineWaypointYawMode[] values() {
        return null;
    }

    public static WaylineWaypointYawMode valueOf(String string) {
        return null;
    }

    private WaylineWaypointYawMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylineWaypointYawMode find(int n) {
        return null;
    }

    private static /* synthetic */ WaylineWaypointYawMode[] $values() {
        return null;
    }

    static {
        $VALUES = WaylineWaypointYawMode.$values();
        allValues = WaylineWaypointYawMode.values();
    }
}

