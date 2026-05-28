/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaypointMissionType
extends Enum<WaypointMissionType>
implements JNIProguardKeepTag {
    public static final /* enum */ WaypointMissionType DEFAULT = new WaypointMissionType(0);
    public static final /* enum */ WaypointMissionType MG = new WaypointMissionType(1);
    public static final /* enum */ WaypointMissionType ENTERPRISE = new WaypointMissionType(2);
    public static final /* enum */ WaypointMissionType MG_TREE_CORE = new WaypointMissionType(3);
    public static final /* enum */ WaypointMissionType MG_VARIABLE_SPRAY = new WaypointMissionType(4);
    public static final /* enum */ WaypointMissionType MG_FIELD_TASK = new WaypointMissionType(5);
    public static final /* enum */ WaypointMissionType MG_GO_HOME_TASK = new WaypointMissionType(6);
    public static final /* enum */ WaypointMissionType MG_SURVEY_MAPING = new WaypointMissionType(7);
    public static final /* enum */ WaypointMissionType UNKNOWN = new WaypointMissionType(65535);
    private int value;
    private static final WaypointMissionType[] allValues;
    private static final /* synthetic */ WaypointMissionType[] $VALUES;

    public static WaypointMissionType[] values() {
        return null;
    }

    public static WaypointMissionType valueOf(String string) {
        return null;
    }

    private WaypointMissionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaypointMissionType find(int n) {
        return null;
    }

    private static /* synthetic */ WaypointMissionType[] $values() {
        return null;
    }

    static {
        $VALUES = WaypointMissionType.$values();
        allValues = WaypointMissionType.values();
    }
}

