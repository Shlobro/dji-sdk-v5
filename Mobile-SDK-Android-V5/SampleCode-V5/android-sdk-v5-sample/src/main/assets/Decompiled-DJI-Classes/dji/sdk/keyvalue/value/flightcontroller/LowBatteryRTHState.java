/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class LowBatteryRTHState
extends Enum<LowBatteryRTHState>
implements JNIProguardKeepTag {
    public static final /* enum */ LowBatteryRTHState IDLE = new LowBatteryRTHState(0);
    public static final /* enum */ LowBatteryRTHState COUNTING_DOWN = new LowBatteryRTHState(1);
    public static final /* enum */ LowBatteryRTHState EXECUTED = new LowBatteryRTHState(2);
    public static final /* enum */ LowBatteryRTHState CANCELLED = new LowBatteryRTHState(3);
    public static final /* enum */ LowBatteryRTHState UNKNOWN = new LowBatteryRTHState(65535);
    private int value;
    private static final LowBatteryRTHState[] allValues;
    private static final /* synthetic */ LowBatteryRTHState[] $VALUES;

    public static LowBatteryRTHState[] values() {
        return null;
    }

    public static LowBatteryRTHState valueOf(String string) {
        return null;
    }

    private LowBatteryRTHState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LowBatteryRTHState find(int n) {
        return null;
    }

    private static /* synthetic */ LowBatteryRTHState[] $values() {
        return null;
    }

    static {
        $VALUES = LowBatteryRTHState.$values();
        allValues = LowBatteryRTHState.values();
    }
}

