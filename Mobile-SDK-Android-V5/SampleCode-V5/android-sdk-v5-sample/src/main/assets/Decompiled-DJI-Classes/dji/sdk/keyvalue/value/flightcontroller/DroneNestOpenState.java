/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestOpenState
extends Enum<DroneNestOpenState>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestOpenState FAILED = new DroneNestOpenState(0);
    public static final /* enum */ DroneNestOpenState PREPARE = new DroneNestOpenState(1);
    public static final /* enum */ DroneNestOpenState READY = new DroneNestOpenState(2);
    public static final /* enum */ DroneNestOpenState UNKNOWN = new DroneNestOpenState(65535);
    private int value;
    private static final DroneNestOpenState[] allValues;
    private static final /* synthetic */ DroneNestOpenState[] $VALUES;

    public static DroneNestOpenState[] values() {
        return null;
    }

    public static DroneNestOpenState valueOf(String string) {
        return null;
    }

    private DroneNestOpenState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestOpenState find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestOpenState[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestOpenState.$values();
        allValues = DroneNestOpenState.values();
    }
}

