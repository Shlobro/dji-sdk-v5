/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.battery;

import dji.jni.JNIProguardKeepTag;

public final class BatteryCollectEvent
extends Enum<BatteryCollectEvent>
implements JNIProguardKeepTag {
    public static final /* enum */ BatteryCollectEvent TAKE_OFF = new BatteryCollectEvent(1);
    public static final /* enum */ BatteryCollectEvent LANDING = new BatteryCollectEvent(2);
    public static final /* enum */ BatteryCollectEvent LOW_BATTERY_LANDING = new BatteryCollectEvent(3);
    public static final /* enum */ BatteryCollectEvent VERY_LOW_BATTERY_LANDING = new BatteryCollectEvent(4);
    public static final /* enum */ BatteryCollectEvent GO_HOME = new BatteryCollectEvent(5);
    public static final /* enum */ BatteryCollectEvent VERY_LOW_BATTERY_GO_HOME = new BatteryCollectEvent(6);
    public static final /* enum */ BatteryCollectEvent OVER_VOLTAGE = new BatteryCollectEvent(7);
    public static final /* enum */ BatteryCollectEvent UNDER_VOLTAGE = new BatteryCollectEvent(8);
    public static final /* enum */ BatteryCollectEvent OVER_CURRENT = new BatteryCollectEvent(9);
    public static final /* enum */ BatteryCollectEvent OVER_TEMPERATURE = new BatteryCollectEvent(10);
    public static final /* enum */ BatteryCollectEvent UNDER_TEMPERATURE = new BatteryCollectEvent(11);
    public static final /* enum */ BatteryCollectEvent CELL_DAMAGE = new BatteryCollectEvent(12);
    public static final /* enum */ BatteryCollectEvent SOC_JUMP = new BatteryCollectEvent(13);
    public static final /* enum */ BatteryCollectEvent SOC_NO_CHANGE = new BatteryCollectEvent(14);
    public static final /* enum */ BatteryCollectEvent UNKNOWN = new BatteryCollectEvent(65535);
    private int value;
    private static final BatteryCollectEvent[] allValues;
    private static final /* synthetic */ BatteryCollectEvent[] $VALUES;

    public static BatteryCollectEvent[] values() {
        return null;
    }

    public static BatteryCollectEvent valueOf(String string) {
        return null;
    }

    private BatteryCollectEvent(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static BatteryCollectEvent find(int n) {
        return null;
    }

    private static /* synthetic */ BatteryCollectEvent[] $values() {
        return null;
    }

    static {
        $VALUES = BatteryCollectEvent.$values();
        allValues = BatteryCollectEvent.values();
    }
}

