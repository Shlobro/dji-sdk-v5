/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class SubWaypointMissionType
extends Enum<SubWaypointMissionType>
implements JNIProguardKeepTag {
    public static final /* enum */ SubWaypointMissionType ContinuousSprayingAutomaticEquiDistantMission = new SubWaypointMissionType(0);
    public static final /* enum */ SubWaypointMissionType ContinuousSprayingAutomaticAroundTreeHeart = new SubWaypointMissionType(1);
    public static final /* enum */ SubWaypointMissionType ContinuousSprayingAutomaticManualPlanning = new SubWaypointMissionType(2);
    public static final /* enum */ SubWaypointMissionType ContinuousSprayingHalfAutomaticAroundTreeHeart = new SubWaypointMissionType(3);
    public static final /* enum */ SubWaypointMissionType FixPointSprayingAroundTreeHeart = new SubWaypointMissionType(4);
    public static final /* enum */ SubWaypointMissionType FixPointSprayingHalfAutomaticAroundTreeHeart = new SubWaypointMissionType(5);
    public static final /* enum */ SubWaypointMissionType UNKNOWN = new SubWaypointMissionType(65535);
    private int value;
    private static final SubWaypointMissionType[] allValues;
    private static final /* synthetic */ SubWaypointMissionType[] $VALUES;

    public static SubWaypointMissionType[] values() {
        return null;
    }

    public static SubWaypointMissionType valueOf(String string) {
        return null;
    }

    private SubWaypointMissionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SubWaypointMissionType find(int n) {
        return null;
    }

    private static /* synthetic */ SubWaypointMissionType[] $values() {
        return null;
    }

    static {
        $VALUES = SubWaypointMissionType.$values();
        allValues = SubWaypointMissionType.values();
    }
}

