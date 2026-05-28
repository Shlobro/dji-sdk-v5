/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaylineWaypointTurnMode
extends Enum<WaylineWaypointTurnMode>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylineWaypointTurnMode TO_POINT_AND_PASS_WITH_CONTINUITY_CURVATURE = new WaylineWaypointTurnMode(0);
    public static final /* enum */ WaylineWaypointTurnMode TO_POINT_AND_STOP_WITH_CONTINUITY_CURVATURE = new WaylineWaypointTurnMode(1);
    public static final /* enum */ WaylineWaypointTurnMode TO_POINT_AND_STOP_WITH_DISCONTINUITY_CURVATURE = new WaylineWaypointTurnMode(2);
    public static final /* enum */ WaylineWaypointTurnMode COORDINATE_TURN = new WaylineWaypointTurnMode(3);
    public static final /* enum */ WaylineWaypointTurnMode UNKNOWN = new WaylineWaypointTurnMode(65535);
    private int value;
    private static final WaylineWaypointTurnMode[] allValues;
    private static final /* synthetic */ WaylineWaypointTurnMode[] $VALUES;

    public static WaylineWaypointTurnMode[] values() {
        return null;
    }

    public static WaylineWaypointTurnMode valueOf(String string) {
        return null;
    }

    private WaylineWaypointTurnMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylineWaypointTurnMode find(int n) {
        return null;
    }

    private static /* synthetic */ WaylineWaypointTurnMode[] $values() {
        return null;
    }

    static {
        $VALUES = WaylineWaypointTurnMode.$values();
        allValues = WaylineWaypointTurnMode.values();
    }
}

