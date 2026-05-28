/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.battery;

import dji.jni.JNIProguardKeepTag;

public final class BatteryHeatingState
extends Enum<BatteryHeatingState>
implements JNIProguardKeepTag {
    public static final /* enum */ BatteryHeatingState IDLE = new BatteryHeatingState(0);
    public static final /* enum */ BatteryHeatingState HEATING = new BatteryHeatingState(1);
    public static final /* enum */ BatteryHeatingState INSULATION = new BatteryHeatingState(2);
    public static final /* enum */ BatteryHeatingState UNKNOWN = new BatteryHeatingState(65535);
    private int value;
    private static final BatteryHeatingState[] allValues;
    private static final /* synthetic */ BatteryHeatingState[] $VALUES;

    public static BatteryHeatingState[] values() {
        return null;
    }

    public static BatteryHeatingState valueOf(String string) {
        return null;
    }

    private BatteryHeatingState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static BatteryHeatingState find(int n) {
        return null;
    }

    private static /* synthetic */ BatteryHeatingState[] $values() {
        return null;
    }

    static {
        $VALUES = BatteryHeatingState.$values();
        allValues = BatteryHeatingState.values();
    }
}

