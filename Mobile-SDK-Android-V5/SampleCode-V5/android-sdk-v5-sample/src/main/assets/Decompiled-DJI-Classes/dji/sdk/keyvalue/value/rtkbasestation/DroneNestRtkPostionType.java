/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestRtkPostionType
extends Enum<DroneNestRtkPostionType>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestRtkPostionType BASE_STATION_MODE = new DroneNestRtkPostionType(1);
    public static final /* enum */ DroneNestRtkPostionType NONE = new DroneNestRtkPostionType(15);
    public static final /* enum */ DroneNestRtkPostionType SINGLE_POINT = new DroneNestRtkPostionType(16);
    public static final /* enum */ DroneNestRtkPostionType FLOAT = new DroneNestRtkPostionType(34);
    public static final /* enum */ DroneNestRtkPostionType FIXED_POINT = new DroneNestRtkPostionType(50);
    public static final /* enum */ DroneNestRtkPostionType UNKNOWN = new DroneNestRtkPostionType(65535);
    private int value;
    private static final DroneNestRtkPostionType[] allValues;
    private static final /* synthetic */ DroneNestRtkPostionType[] $VALUES;

    public static DroneNestRtkPostionType[] values() {
        return null;
    }

    public static DroneNestRtkPostionType valueOf(String string) {
        return null;
    }

    private DroneNestRtkPostionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestRtkPostionType find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestRtkPostionType[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestRtkPostionType.$values();
        allValues = DroneNestRtkPostionType.values();
    }
}

