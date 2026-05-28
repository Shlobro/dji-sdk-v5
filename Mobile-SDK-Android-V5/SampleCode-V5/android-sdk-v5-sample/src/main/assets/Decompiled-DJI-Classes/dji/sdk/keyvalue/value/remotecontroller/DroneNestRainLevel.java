/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestRainLevel
extends Enum<DroneNestRainLevel>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestRainLevel NO_RAIN = new DroneNestRainLevel(0);
    public static final /* enum */ DroneNestRainLevel LIGHT_RAIN = new DroneNestRainLevel(1);
    public static final /* enum */ DroneNestRainLevel MODERATE_RAIN = new DroneNestRainLevel(2);
    public static final /* enum */ DroneNestRainLevel HEAVY_RAIN = new DroneNestRainLevel(3);
    public static final /* enum */ DroneNestRainLevel UNKNOWN = new DroneNestRainLevel(65535);
    private int value;
    private static final DroneNestRainLevel[] allValues;
    private static final /* synthetic */ DroneNestRainLevel[] $VALUES;

    public static DroneNestRainLevel[] values() {
        return null;
    }

    public static DroneNestRainLevel valueOf(String string) {
        return null;
    }

    private DroneNestRainLevel(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestRainLevel find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestRainLevel[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestRainLevel.$values();
        allValues = DroneNestRainLevel.values();
    }
}

