/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class SubscirbePackType
extends Enum<SubscirbePackType>
implements JNIProguardKeepTag {
    public static final /* enum */ SubscirbePackType WAYPOINT_GIMBAL = new SubscirbePackType(0);
    public static final /* enum */ SubscirbePackType IMU_COORDINATE_TRAN = new SubscirbePackType(1);
    public static final /* enum */ SubscirbePackType USER_FLIGHT_INFO = new SubscirbePackType(2);
    public static final /* enum */ SubscirbePackType UNKNOWN = new SubscirbePackType(4095);
    private int value;
    private static final SubscirbePackType[] allValues;
    private static final /* synthetic */ SubscirbePackType[] $VALUES;

    public static SubscirbePackType[] values() {
        return null;
    }

    public static SubscirbePackType valueOf(String string) {
        return null;
    }

    private SubscirbePackType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SubscirbePackType find(int n) {
        return null;
    }

    private static /* synthetic */ SubscirbePackType[] $values() {
        return null;
    }

    static {
        $VALUES = SubscirbePackType.$values();
        allValues = SubscirbePackType.values();
    }
}

