/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestBatteryStoreMode
extends Enum<DroneNestBatteryStoreMode>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestBatteryStoreMode PLANNING = new DroneNestBatteryStoreMode(0);
    public static final /* enum */ DroneNestBatteryStoreMode EMERGENCY = new DroneNestBatteryStoreMode(1);
    public static final /* enum */ DroneNestBatteryStoreMode UNKNOWN = new DroneNestBatteryStoreMode(0xFFFFFFF);
    private int value;
    private static final DroneNestBatteryStoreMode[] allValues;
    private static final /* synthetic */ DroneNestBatteryStoreMode[] $VALUES;

    public static DroneNestBatteryStoreMode[] values() {
        return null;
    }

    public static DroneNestBatteryStoreMode valueOf(String string) {
        return null;
    }

    private DroneNestBatteryStoreMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestBatteryStoreMode find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestBatteryStoreMode[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestBatteryStoreMode.$values();
        allValues = DroneNestBatteryStoreMode.values();
    }
}

