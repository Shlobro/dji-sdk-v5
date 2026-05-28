/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaypointMissionFlightPathMode
extends Enum<WaypointMissionFlightPathMode>
implements JNIProguardKeepTag {
    public static final /* enum */ WaypointMissionFlightPathMode NORMAL = new WaypointMissionFlightPathMode(0);
    public static final /* enum */ WaypointMissionFlightPathMode CURVED = new WaypointMissionFlightPathMode(1);
    public static final /* enum */ WaypointMissionFlightPathMode UNKNOWN = new WaypointMissionFlightPathMode(65535);
    private int value;
    private static final WaypointMissionFlightPathMode[] allValues;
    private static final /* synthetic */ WaypointMissionFlightPathMode[] $VALUES;

    public static WaypointMissionFlightPathMode[] values() {
        return null;
    }

    public static WaypointMissionFlightPathMode valueOf(String string) {
        return null;
    }

    private WaypointMissionFlightPathMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaypointMissionFlightPathMode find(int n) {
        return null;
    }

    private static /* synthetic */ WaypointMissionFlightPathMode[] $values() {
        return null;
    }

    static {
        $VALUES = WaypointMissionFlightPathMode.$values();
        allValues = WaypointMissionFlightPathMode.values();
    }
}

