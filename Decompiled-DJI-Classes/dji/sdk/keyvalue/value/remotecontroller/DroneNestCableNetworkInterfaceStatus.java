/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestCableNetworkInterfaceStatus
extends Enum<DroneNestCableNetworkInterfaceStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestCableNetworkInterfaceStatus NO_CONNECTION = new DroneNestCableNetworkInterfaceStatus(0);
    public static final /* enum */ DroneNestCableNetworkInterfaceStatus SPEED_TOO_LOW = new DroneNestCableNetworkInterfaceStatus(1);
    public static final /* enum */ DroneNestCableNetworkInterfaceStatus SPEED_100M = new DroneNestCableNetworkInterfaceStatus(2);
    public static final /* enum */ DroneNestCableNetworkInterfaceStatus SPEED_1000M = new DroneNestCableNetworkInterfaceStatus(3);
    public static final /* enum */ DroneNestCableNetworkInterfaceStatus NOT_SUPPORT = new DroneNestCableNetworkInterfaceStatus(4);
    public static final /* enum */ DroneNestCableNetworkInterfaceStatus UNKNOWN = new DroneNestCableNetworkInterfaceStatus(65535);
    private int value;
    private static final DroneNestCableNetworkInterfaceStatus[] allValues;
    private static final /* synthetic */ DroneNestCableNetworkInterfaceStatus[] $VALUES;

    public static DroneNestCableNetworkInterfaceStatus[] values() {
        return null;
    }

    public static DroneNestCableNetworkInterfaceStatus valueOf(String string) {
        return null;
    }

    private DroneNestCableNetworkInterfaceStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestCableNetworkInterfaceStatus find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestCableNetworkInterfaceStatus[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestCableNetworkInterfaceStatus.$values();
        allValues = DroneNestCableNetworkInterfaceStatus.values();
    }
}

