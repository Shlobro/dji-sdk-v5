/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestLandingType
extends Enum<DroneNestLandingType>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestLandingType NO_LADNING = new DroneNestLandingType(0);
    public static final /* enum */ DroneNestLandingType BASESTATION_LANDING = new DroneNestLandingType(1);
    public static final /* enum */ DroneNestLandingType BACKUP_LANDING = new DroneNestLandingType(2);
    public static final /* enum */ DroneNestLandingType NORMAL_LANDING_BY_USER = new DroneNestLandingType(3);
    public static final /* enum */ DroneNestLandingType NORMAL_LANDING_BY_AUTO = new DroneNestLandingType(4);
    public static final /* enum */ DroneNestLandingType UNKNOWN = new DroneNestLandingType(65535);
    private int value;
    private static final DroneNestLandingType[] allValues;
    private static final /* synthetic */ DroneNestLandingType[] $VALUES;

    public static DroneNestLandingType[] values() {
        return null;
    }

    public static DroneNestLandingType valueOf(String string) {
        return null;
    }

    private DroneNestLandingType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestLandingType find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestLandingType[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestLandingType.$values();
        allValues = DroneNestLandingType.values();
    }
}

