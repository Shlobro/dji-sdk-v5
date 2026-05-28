/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.battery;

import dji.jni.JNIProguardKeepTag;

public final class BatteryHwType
extends Enum<BatteryHwType>
implements JNIProguardKeepTag {
    public static final /* enum */ BatteryHwType BA04_JP = new BatteryHwType(99);
    public static final /* enum */ BatteryHwType GET_FAILED = new BatteryHwType(254);
    public static final /* enum */ BatteryHwType UNKNOWN = new BatteryHwType(65535);
    private int value;
    private static final BatteryHwType[] allValues;
    private static final /* synthetic */ BatteryHwType[] $VALUES;

    public static BatteryHwType[] values() {
        return null;
    }

    public static BatteryHwType valueOf(String string) {
        return null;
    }

    private BatteryHwType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static BatteryHwType find(int n) {
        return null;
    }

    private static /* synthetic */ BatteryHwType[] $values() {
        return null;
    }

    static {
        $VALUES = BatteryHwType.$values();
        allValues = BatteryHwType.values();
    }
}

