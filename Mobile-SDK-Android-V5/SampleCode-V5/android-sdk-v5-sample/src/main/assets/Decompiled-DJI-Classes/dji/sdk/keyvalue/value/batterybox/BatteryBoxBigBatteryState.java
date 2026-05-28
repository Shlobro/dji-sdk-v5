/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.batterybox;

import dji.jni.JNIProguardKeepTag;

public final class BatteryBoxBigBatteryState
extends Enum<BatteryBoxBigBatteryState>
implements JNIProguardKeepTag {
    public static final /* enum */ BatteryBoxBigBatteryState NOT_AVAILABLE = new BatteryBoxBigBatteryState(0);
    public static final /* enum */ BatteryBoxBigBatteryState AVAILABLE = new BatteryBoxBigBatteryState(1);
    public static final /* enum */ BatteryBoxBigBatteryState CHARGING = new BatteryBoxBigBatteryState(2);
    public static final /* enum */ BatteryBoxBigBatteryState QUICK_CHARGING = new BatteryBoxBigBatteryState(3);
    public static final /* enum */ BatteryBoxBigBatteryState FULL = new BatteryBoxBigBatteryState(4);
    public static final /* enum */ BatteryBoxBigBatteryState COMMUNICATION_ABNORMAL = new BatteryBoxBigBatteryState(5);
    public static final /* enum */ BatteryBoxBigBatteryState RECOVERABLE_ABNORMAL = new BatteryBoxBigBatteryState(6);
    public static final /* enum */ BatteryBoxBigBatteryState UNRECOVERABLE_ABNORMAL = new BatteryBoxBigBatteryState(7);
    public static final /* enum */ BatteryBoxBigBatteryState SHUTDOWN = new BatteryBoxBigBatteryState(8);
    public static final /* enum */ BatteryBoxBigBatteryState STATUS_MAX = new BatteryBoxBigBatteryState(9);
    public static final /* enum */ BatteryBoxBigBatteryState UNKNOWN = new BatteryBoxBigBatteryState(65535);
    private int value;
    private static final BatteryBoxBigBatteryState[] allValues;
    private static final /* synthetic */ BatteryBoxBigBatteryState[] $VALUES;

    public static BatteryBoxBigBatteryState[] values() {
        return null;
    }

    public static BatteryBoxBigBatteryState valueOf(String string) {
        return null;
    }

    private BatteryBoxBigBatteryState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static BatteryBoxBigBatteryState find(int n) {
        return null;
    }

    private static /* synthetic */ BatteryBoxBigBatteryState[] $values() {
        return null;
    }

    static {
        $VALUES = BatteryBoxBigBatteryState.$values();
        allValues = BatteryBoxBigBatteryState.values();
    }
}

