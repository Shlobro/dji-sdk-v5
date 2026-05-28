/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestTakeoffState
extends Enum<DroneNestTakeoffState>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestTakeoffState DEFAULT = new DroneNestTakeoffState(0);
    public static final /* enum */ DroneNestTakeoffState STATUS_CHECK = new DroneNestTakeoffState(1);
    public static final /* enum */ DroneNestTakeoffState TAKEOFF_PREPARATION = new DroneNestTakeoffState(2);
    public static final /* enum */ DroneNestTakeoffState TAKEOFF = new DroneNestTakeoffState(3);
    public static final /* enum */ DroneNestTakeoffState UNKNOWN = new DroneNestTakeoffState(255);
    private int value;
    private static final DroneNestTakeoffState[] allValues;
    private static final /* synthetic */ DroneNestTakeoffState[] $VALUES;

    public static DroneNestTakeoffState[] values() {
        return null;
    }

    public static DroneNestTakeoffState valueOf(String string) {
        return null;
    }

    private DroneNestTakeoffState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestTakeoffState find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestTakeoffState[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestTakeoffState.$values();
        allValues = DroneNestTakeoffState.values();
    }
}

