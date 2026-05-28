/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestBindDeviceType
extends Enum<DroneNestBindDeviceType>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestBindDeviceType DRONE_NEST = new DroneNestBindDeviceType(0);
    public static final /* enum */ DroneNestBindDeviceType UAV = new DroneNestBindDeviceType(1);
    public static final /* enum */ DroneNestBindDeviceType BATTERY = new DroneNestBindDeviceType(2);
    public static final /* enum */ DroneNestBindDeviceType UNKNOWN = new DroneNestBindDeviceType(65535);
    private int value;
    private static final DroneNestBindDeviceType[] allValues;
    private static final /* synthetic */ DroneNestBindDeviceType[] $VALUES;

    public static DroneNestBindDeviceType[] values() {
        return null;
    }

    public static DroneNestBindDeviceType valueOf(String string) {
        return null;
    }

    private DroneNestBindDeviceType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestBindDeviceType find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestBindDeviceType[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestBindDeviceType.$values();
        allValues = DroneNestBindDeviceType.values();
    }
}

