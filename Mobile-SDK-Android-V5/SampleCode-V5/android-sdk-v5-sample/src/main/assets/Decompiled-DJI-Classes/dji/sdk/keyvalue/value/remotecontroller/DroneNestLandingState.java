/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestLandingState
extends Enum<DroneNestLandingState>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestLandingState DEFAULT = new DroneNestLandingState(0);
    public static final /* enum */ DroneNestLandingState GOBACK = new DroneNestLandingState(1);
    public static final /* enum */ DroneNestLandingState STATUS_CHECK = new DroneNestLandingState(2);
    public static final /* enum */ DroneNestLandingState LANDING_PREPARATION = new DroneNestLandingState(3);
    public static final /* enum */ DroneNestLandingState LANDING = new DroneNestLandingState(4);
    public static final /* enum */ DroneNestLandingState UNKNOWN = new DroneNestLandingState(255);
    private int value;
    private static final DroneNestLandingState[] allValues;
    private static final /* synthetic */ DroneNestLandingState[] $VALUES;

    public static DroneNestLandingState[] values() {
        return null;
    }

    public static DroneNestLandingState valueOf(String string) {
        return null;
    }

    private DroneNestLandingState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestLandingState find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestLandingState[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestLandingState.$values();
        allValues = DroneNestLandingState.values();
    }
}

