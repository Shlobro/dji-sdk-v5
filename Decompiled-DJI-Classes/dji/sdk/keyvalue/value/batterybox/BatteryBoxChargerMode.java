/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.batterybox;

import dji.jni.JNIProguardKeepTag;

public final class BatteryBoxChargerMode
extends Enum<BatteryBoxChargerMode>
implements JNIProguardKeepTag {
    public static final /* enum */ BatteryBoxChargerMode STANDARD_MODE = new BatteryBoxChargerMode(0);
    public static final /* enum */ BatteryBoxChargerMode QUICK_MODE = new BatteryBoxChargerMode(1);
    public static final /* enum */ BatteryBoxChargerMode STORAGE_MODE = new BatteryBoxChargerMode(2);
    public static final /* enum */ BatteryBoxChargerMode SILENT_STORAGE = new BatteryBoxChargerMode(3);
    public static final /* enum */ BatteryBoxChargerMode SILENT_NORMAL = new BatteryBoxChargerMode(4);
    public static final /* enum */ BatteryBoxChargerMode FAST_STORAGE = new BatteryBoxChargerMode(5);
    public static final /* enum */ BatteryBoxChargerMode FAST_NORMAL = new BatteryBoxChargerMode(6);
    public static final /* enum */ BatteryBoxChargerMode UNKNOWN = new BatteryBoxChargerMode(65535);
    private int value;
    private static final BatteryBoxChargerMode[] allValues;
    private static final /* synthetic */ BatteryBoxChargerMode[] $VALUES;

    public static BatteryBoxChargerMode[] values() {
        return null;
    }

    public static BatteryBoxChargerMode valueOf(String string) {
        return null;
    }

    private BatteryBoxChargerMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static BatteryBoxChargerMode find(int n) {
        return null;
    }

    private static /* synthetic */ BatteryBoxChargerMode[] $values() {
        return null;
    }

    static {
        $VALUES = BatteryBoxChargerMode.$values();
        allValues = BatteryBoxChargerMode.values();
    }
}

