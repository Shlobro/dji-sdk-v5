/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestRtkSelfCaliState
extends Enum<DroneNestRtkSelfCaliState>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestRtkSelfCaliState IDEL = new DroneNestRtkSelfCaliState(0);
    public static final /* enum */ DroneNestRtkSelfCaliState WORKING = new DroneNestRtkSelfCaliState(1);
    public static final /* enum */ DroneNestRtkSelfCaliState COMPLETE = new DroneNestRtkSelfCaliState(2);
    public static final /* enum */ DroneNestRtkSelfCaliState FAILED = new DroneNestRtkSelfCaliState(3);
    public static final /* enum */ DroneNestRtkSelfCaliState UNKNOWN = new DroneNestRtkSelfCaliState(65535);
    private int value;
    private static final DroneNestRtkSelfCaliState[] allValues;
    private static final /* synthetic */ DroneNestRtkSelfCaliState[] $VALUES;

    public static DroneNestRtkSelfCaliState[] values() {
        return null;
    }

    public static DroneNestRtkSelfCaliState valueOf(String string) {
        return null;
    }

    private DroneNestRtkSelfCaliState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestRtkSelfCaliState find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestRtkSelfCaliState[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestRtkSelfCaliState.$values();
        allValues = DroneNestRtkSelfCaliState.values();
    }
}

