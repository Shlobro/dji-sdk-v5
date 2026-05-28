/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.waypointv3;

import dji.jni.JNIProguardKeepTag;

public final class WaypointV3ExcutionResult
extends Enum<WaypointV3ExcutionResult>
implements JNIProguardKeepTag {
    public static final /* enum */ WaypointV3ExcutionResult NOT_FINISH_YET = new WaypointV3ExcutionResult(0);
    public static final /* enum */ WaypointV3ExcutionResult FINISH_NORMAL = new WaypointV3ExcutionResult(1);
    public static final /* enum */ WaypointV3ExcutionResult FINISH_ABNORMAL = new WaypointV3ExcutionResult(2);
    public static final /* enum */ WaypointV3ExcutionResult NO_RECENT_MISSION = new WaypointV3ExcutionResult(3);
    public static final /* enum */ WaypointV3ExcutionResult FINISH_BY_USER = new WaypointV3ExcutionResult(4);
    public static final /* enum */ WaypointV3ExcutionResult NOT_FINISH = new WaypointV3ExcutionResult(5);
    public static final /* enum */ WaypointV3ExcutionResult UNKNOWN = new WaypointV3ExcutionResult(256);
    private int value;
    private static final WaypointV3ExcutionResult[] allValues;
    private static final /* synthetic */ WaypointV3ExcutionResult[] $VALUES;

    public static WaypointV3ExcutionResult[] values() {
        return null;
    }

    public static WaypointV3ExcutionResult valueOf(String string) {
        return null;
    }

    private WaypointV3ExcutionResult(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaypointV3ExcutionResult find(int n) {
        return null;
    }

    private static /* synthetic */ WaypointV3ExcutionResult[] $values() {
        return null;
    }

    static {
        $VALUES = WaypointV3ExcutionResult.$values();
        allValues = WaypointV3ExcutionResult.values();
    }
}

