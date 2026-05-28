/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestDeviceType
extends Enum<DroneNestDeviceType>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestDeviceType SUPPLEMENT_LIGHT = new DroneNestDeviceType(0);
    public static final /* enum */ DroneNestDeviceType BUZZER = new DroneNestDeviceType(1);
    public static final /* enum */ DroneNestDeviceType LIGHT_STRIP = new DroneNestDeviceType(2);
    public static final /* enum */ DroneNestDeviceType PUTTER = new DroneNestDeviceType(3);
    public static final /* enum */ DroneNestDeviceType AIR_CONDITIONER = new DroneNestDeviceType(4);
    public static final /* enum */ DroneNestDeviceType COVER = new DroneNestDeviceType(5);
    public static final /* enum */ DroneNestDeviceType DRONE = new DroneNestDeviceType(6);
    public static final /* enum */ DroneNestDeviceType UNKNOWN = new DroneNestDeviceType(65535);
    private int value;
    private static final DroneNestDeviceType[] allValues;
    private static final /* synthetic */ DroneNestDeviceType[] $VALUES;

    public static DroneNestDeviceType[] values() {
        return null;
    }

    public static DroneNestDeviceType valueOf(String string) {
        return null;
    }

    private DroneNestDeviceType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestDeviceType find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestDeviceType[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestDeviceType.$values();
        allValues = DroneNestDeviceType.values();
    }
}

