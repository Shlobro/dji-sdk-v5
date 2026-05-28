/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestState
extends Enum<DroneNestState>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestState NON_DEPLOY = new DroneNestState(0);
    public static final /* enum */ DroneNestState PARKING = new DroneNestState(1);
    public static final /* enum */ DroneNestState TAKEOFF = new DroneNestState(2);
    public static final /* enum */ DroneNestState IN_FLIGHT = new DroneNestState(3);
    public static final /* enum */ DroneNestState LANDING = new DroneNestState(4);
    public static final /* enum */ DroneNestState UNKNOWN = new DroneNestState(255);
    private int value;
    private static final DroneNestState[] allValues;
    private static final /* synthetic */ DroneNestState[] $VALUES;

    public static DroneNestState[] values() {
        return null;
    }

    public static DroneNestState valueOf(String string) {
        return null;
    }

    private DroneNestState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestState find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestState[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestState.$values();
        allValues = DroneNestState.values();
    }
}

