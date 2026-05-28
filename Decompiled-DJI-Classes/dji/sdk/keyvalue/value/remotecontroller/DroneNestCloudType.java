/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestCloudType
extends Enum<DroneNestCloudType>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestCloudType DJI_FH2 = new DroneNestCloudType(0);
    public static final /* enum */ DroneNestCloudType THIRD_PARTY = new DroneNestCloudType(1);
    public static final /* enum */ DroneNestCloudType PRIVATE = new DroneNestCloudType(2);
    public static final /* enum */ DroneNestCloudType UNKNOWN = new DroneNestCloudType(65535);
    private int value;
    private static final DroneNestCloudType[] allValues;
    private static final /* synthetic */ DroneNestCloudType[] $VALUES;

    public static DroneNestCloudType[] values() {
        return null;
    }

    public static DroneNestCloudType valueOf(String string) {
        return null;
    }

    private DroneNestCloudType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestCloudType find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestCloudType[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestCloudType.$values();
        allValues = DroneNestCloudType.values();
    }
}

