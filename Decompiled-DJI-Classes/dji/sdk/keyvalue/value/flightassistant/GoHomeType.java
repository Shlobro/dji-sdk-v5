/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class GoHomeType
extends Enum<GoHomeType>
implements JNIProguardKeepTag {
    public static final /* enum */ GoHomeType DIVING = new GoHomeType(0);
    public static final /* enum */ GoHomeType LOW_BATTERY_HOMING = new GoHomeType(1);
    public static final /* enum */ GoHomeType RC_LOST_HOMING = new GoHomeType(2);
    public static final /* enum */ GoHomeType CRUISE_HOMING = new GoHomeType(3);
    public static final /* enum */ GoHomeType VIDEO_LOST_HOMING = new GoHomeType(4);
    public static final /* enum */ GoHomeType HIGH_TEMPERATURE_HOMING = new GoHomeType(5);
    public static final /* enum */ GoHomeType UNKNOWN = new GoHomeType(65535);
    private int value;
    private static final GoHomeType[] allValues;
    private static final /* synthetic */ GoHomeType[] $VALUES;

    public static GoHomeType[] values() {
        return null;
    }

    public static GoHomeType valueOf(String string) {
        return null;
    }

    private GoHomeType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GoHomeType find(int n) {
        return null;
    }

    private static /* synthetic */ GoHomeType[] $values() {
        return null;
    }

    static {
        $VALUES = GoHomeType.$values();
        allValues = GoHomeType.values();
    }
}

