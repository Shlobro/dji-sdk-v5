/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class BatteryProtectType
extends Enum<BatteryProtectType>
implements JNIProguardKeepTag {
    public static final /* enum */ BatteryProtectType DEFAULT_TYPE = new BatteryProtectType(0);
    public static final /* enum */ BatteryProtectType CURRENT = new BatteryProtectType(1);
    public static final /* enum */ BatteryProtectType POWER = new BatteryProtectType(2);
    public static final /* enum */ BatteryProtectType UNKNOWN = new BatteryProtectType(65535);
    private int value;
    private static final BatteryProtectType[] allValues;
    private static final /* synthetic */ BatteryProtectType[] $VALUES;

    public static BatteryProtectType[] values() {
        return null;
    }

    public static BatteryProtectType valueOf(String string) {
        return null;
    }

    private BatteryProtectType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static BatteryProtectType find(int n) {
        return null;
    }

    private static /* synthetic */ BatteryProtectType[] $values() {
        return null;
    }

    static {
        $VALUES = BatteryProtectType.$values();
        allValues = BatteryProtectType.values();
    }
}

