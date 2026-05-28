/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class AccessLockerDeviceType
extends Enum<AccessLockerDeviceType>
implements JNIProguardKeepTag {
    public static final /* enum */ AccessLockerDeviceType MASTER = new AccessLockerDeviceType(0);
    public static final /* enum */ AccessLockerDeviceType SLAVE_1 = new AccessLockerDeviceType(1);
    public static final /* enum */ AccessLockerDeviceType SLAVE_2 = new AccessLockerDeviceType(2);
    public static final /* enum */ AccessLockerDeviceType SLAVE_3 = new AccessLockerDeviceType(3);
    public static final /* enum */ AccessLockerDeviceType SLAVE_4 = new AccessLockerDeviceType(4);
    public static final /* enum */ AccessLockerDeviceType SLAVE_5 = new AccessLockerDeviceType(5);
    public static final /* enum */ AccessLockerDeviceType SLAVE_6 = new AccessLockerDeviceType(6);
    public static final /* enum */ AccessLockerDeviceType SLAVE_7 = new AccessLockerDeviceType(7);
    public static final /* enum */ AccessLockerDeviceType UNKNOWN = new AccessLockerDeviceType(65535);
    private int value;
    private static final AccessLockerDeviceType[] allValues;
    private static final /* synthetic */ AccessLockerDeviceType[] $VALUES;

    public static AccessLockerDeviceType[] values() {
        return null;
    }

    public static AccessLockerDeviceType valueOf(String string) {
        return null;
    }

    private AccessLockerDeviceType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AccessLockerDeviceType find(int n) {
        return null;
    }

    private static /* synthetic */ AccessLockerDeviceType[] $values() {
        return null;
    }

    static {
        $VALUES = AccessLockerDeviceType.$values();
        allValues = AccessLockerDeviceType.values();
    }
}

