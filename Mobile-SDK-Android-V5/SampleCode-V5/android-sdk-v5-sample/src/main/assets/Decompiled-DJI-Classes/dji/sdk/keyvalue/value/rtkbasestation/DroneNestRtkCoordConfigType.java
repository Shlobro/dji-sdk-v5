/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestRtkCoordConfigType
extends Enum<DroneNestRtkCoordConfigType>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestRtkCoordConfigType INVALID = new DroneNestRtkCoordConfigType(0);
    public static final /* enum */ DroneNestRtkCoordConfigType MANUAL = new DroneNestRtkCoordConfigType(1);
    public static final /* enum */ DroneNestRtkCoordConfigType NET_RTK = new DroneNestRtkCoordConfigType(2);
    public static final /* enum */ DroneNestRtkCoordConfigType PPP = new DroneNestRtkCoordConfigType(3);
    public static final /* enum */ DroneNestRtkCoordConfigType PPP_AR = new DroneNestRtkCoordConfigType(4);
    public static final /* enum */ DroneNestRtkCoordConfigType UNKNOWN = new DroneNestRtkCoordConfigType(65535);
    private int value;
    private static final DroneNestRtkCoordConfigType[] allValues;
    private static final /* synthetic */ DroneNestRtkCoordConfigType[] $VALUES;

    public static DroneNestRtkCoordConfigType[] values() {
        return null;
    }

    public static DroneNestRtkCoordConfigType valueOf(String string) {
        return null;
    }

    private DroneNestRtkCoordConfigType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestRtkCoordConfigType find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestRtkCoordConfigType[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestRtkCoordConfigType.$values();
        allValues = DroneNestRtkCoordConfigType.values();
    }
}

