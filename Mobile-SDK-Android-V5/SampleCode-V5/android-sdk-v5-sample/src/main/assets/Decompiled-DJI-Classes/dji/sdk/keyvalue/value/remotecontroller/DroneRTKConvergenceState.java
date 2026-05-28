/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneRTKConvergenceState
extends Enum<DroneRTKConvergenceState>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneRTKConvergenceState CHECKING = new DroneRTKConvergenceState(0);
    public static final /* enum */ DroneRTKConvergenceState NO_DRIFTING = new DroneRTKConvergenceState(1);
    public static final /* enum */ DroneRTKConvergenceState DRIFTING = new DroneRTKConvergenceState(2);
    public static final /* enum */ DroneRTKConvergenceState NO_PUSH = new DroneRTKConvergenceState(65534);
    public static final /* enum */ DroneRTKConvergenceState UNKNOWN = new DroneRTKConvergenceState(65535);
    private int value;
    private static final DroneRTKConvergenceState[] allValues;
    private static final /* synthetic */ DroneRTKConvergenceState[] $VALUES;

    public static DroneRTKConvergenceState[] values() {
        return null;
    }

    public static DroneRTKConvergenceState valueOf(String string) {
        return null;
    }

    private DroneRTKConvergenceState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneRTKConvergenceState find(int n) {
        return null;
    }

    private static /* synthetic */ DroneRTKConvergenceState[] $values() {
        return null;
    }

    static {
        $VALUES = DroneRTKConvergenceState.$values();
        allValues = DroneRTKConvergenceState.values();
    }
}

