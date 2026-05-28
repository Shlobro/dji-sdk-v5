/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.batterybox;

import dji.jni.JNIProguardKeepTag;

public final class BatteryBoxType
extends Enum<BatteryBoxType>
implements JNIProguardKeepTag {
    public static final /* enum */ BatteryBoxType M30_SERIES = new BatteryBoxType(0);
    public static final /* enum */ BatteryBoxType M300_RTK = new BatteryBoxType(1);
    public static final /* enum */ BatteryBoxType CH630 = new BatteryBoxType(2);
    public static final /* enum */ BatteryBoxType PM431 = new BatteryBoxType(3);
    public static final /* enum */ BatteryBoxType PM440 = new BatteryBoxType(4);
    public static final /* enum */ BatteryBoxType UNKNOWN = new BatteryBoxType(65535);
    private int value;
    private static final BatteryBoxType[] allValues;
    private static final /* synthetic */ BatteryBoxType[] $VALUES;

    public static BatteryBoxType[] values() {
        return null;
    }

    public static BatteryBoxType valueOf(String string) {
        return null;
    }

    private BatteryBoxType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static BatteryBoxType find(int n) {
        return null;
    }

    private static /* synthetic */ BatteryBoxType[] $values() {
        return null;
    }

    static {
        $VALUES = BatteryBoxType.$values();
        allValues = BatteryBoxType.values();
    }
}

