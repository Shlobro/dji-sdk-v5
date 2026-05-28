/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.component.firmware.model;

public final class ChargerBatteryState
extends Enum<ChargerBatteryState> {
    public static final /* enum */ ChargerBatteryState CH_BAT_NOT_AVAILABLE = new ChargerBatteryState(0);
    public static final /* enum */ ChargerBatteryState CH_BAT_AVAILABLE = new ChargerBatteryState(1);
    public static final /* enum */ ChargerBatteryState CH_BAT_CHARGING = new ChargerBatteryState(2);
    public static final /* enum */ ChargerBatteryState CH_BAT_QUICK_CHARGING = new ChargerBatteryState(3);
    public static final /* enum */ ChargerBatteryState CH_BAT_FULL = new ChargerBatteryState(4);
    public static final /* enum */ ChargerBatteryState CH_BAT_COMMUNICATION_ABNORMAL = new ChargerBatteryState(5);
    public static final /* enum */ ChargerBatteryState CH_BAT_RECOVERABLE_ABNORMAL = new ChargerBatteryState(6);
    public static final /* enum */ ChargerBatteryState CH_BAT_UNRECOVERABLE_ABNORMAL = new ChargerBatteryState(7);
    public static final /* enum */ ChargerBatteryState CH_BAT_SHUTDOWN = new ChargerBatteryState(8);
    public static final /* enum */ ChargerBatteryState CH_BAT_STATUS_MAX = new ChargerBatteryState(9);
    public static final /* enum */ ChargerBatteryState UNKNOWN = new ChargerBatteryState(255);
    private int state;
    private static ChargerBatteryState[] mValues;
    private static final /* synthetic */ ChargerBatteryState[] $VALUES;

    public static ChargerBatteryState[] values() {
        return null;
    }

    public static ChargerBatteryState valueOf(String string2) {
        return null;
    }

    private ChargerBatteryState(int n2) {
    }

    public int value() {
        return 0;
    }

    private boolean _equals(int n) {
        return false;
    }

    public static ChargerBatteryState[] getValues() {
        return null;
    }

    public static ChargerBatteryState find(int n) {
        return null;
    }

    private static /* synthetic */ ChargerBatteryState[] $values() {
        return null;
    }

    static {
        $VALUES = ChargerBatteryState.$values();
    }
}

