/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestEnvironmentType
extends Enum<DroneNestEnvironmentType>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestEnvironmentType PROD_HZ = new DroneNestEnvironmentType(0);
    public static final /* enum */ DroneNestEnvironmentType PROD_VG = new DroneNestEnvironmentType(1);
    public static final /* enum */ DroneNestEnvironmentType PRE_PRO = new DroneNestEnvironmentType(2);
    public static final /* enum */ DroneNestEnvironmentType STAG_HZ = new DroneNestEnvironmentType(3);
    public static final /* enum */ DroneNestEnvironmentType STAG_VG = new DroneNestEnvironmentType(4);
    public static final /* enum */ DroneNestEnvironmentType TEST = new DroneNestEnvironmentType(5);
    public static final /* enum */ DroneNestEnvironmentType UNKNOWN = new DroneNestEnvironmentType(65535);
    private int value;
    private static final DroneNestEnvironmentType[] allValues;
    private static final /* synthetic */ DroneNestEnvironmentType[] $VALUES;

    public static DroneNestEnvironmentType[] values() {
        return null;
    }

    public static DroneNestEnvironmentType valueOf(String string) {
        return null;
    }

    private DroneNestEnvironmentType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestEnvironmentType find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestEnvironmentType[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestEnvironmentType.$values();
        allValues = DroneNestEnvironmentType.values();
    }
}

