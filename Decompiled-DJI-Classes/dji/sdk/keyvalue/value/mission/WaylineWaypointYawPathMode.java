/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaylineWaypointYawPathMode
extends Enum<WaylineWaypointYawPathMode>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylineWaypointYawPathMode CLOCKWISE = new WaylineWaypointYawPathMode(0);
    public static final /* enum */ WaylineWaypointYawPathMode COUNTER_CLOCKWISE = new WaylineWaypointYawPathMode(1);
    public static final /* enum */ WaylineWaypointYawPathMode FOLLOW_BAD_ARC = new WaylineWaypointYawPathMode(2);
    public static final /* enum */ WaylineWaypointYawPathMode UNKNOWN = new WaylineWaypointYawPathMode(65535);
    private int value;
    private static final WaylineWaypointYawPathMode[] allValues;
    private static final /* synthetic */ WaylineWaypointYawPathMode[] $VALUES;

    public static WaylineWaypointYawPathMode[] values() {
        return null;
    }

    public static WaylineWaypointYawPathMode valueOf(String string) {
        return null;
    }

    private WaylineWaypointYawPathMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylineWaypointYawPathMode find(int n) {
        return null;
    }

    private static /* synthetic */ WaylineWaypointYawPathMode[] $values() {
        return null;
    }

    static {
        $VALUES = WaylineWaypointYawPathMode.$values();
        allValues = WaylineWaypointYawPathMode.values();
    }
}

