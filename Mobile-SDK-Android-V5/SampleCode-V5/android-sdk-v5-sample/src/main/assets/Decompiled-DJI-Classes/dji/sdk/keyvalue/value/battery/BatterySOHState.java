/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.battery;

import dji.jni.JNIProguardKeepTag;

public final class BatterySOHState
extends Enum<BatterySOHState>
implements JNIProguardKeepTag {
    public static final /* enum */ BatterySOHState NORMAL = new BatterySOHState(0);
    public static final /* enum */ BatterySOHState WARNING = new BatterySOHState(1);
    public static final /* enum */ BatterySOHState SERIOUS_WARNING = new BatterySOHState(2);
    public static final /* enum */ BatterySOHState UNKNOWN = new BatterySOHState(255);
    private int value;
    private static final BatterySOHState[] allValues;
    private static final /* synthetic */ BatterySOHState[] $VALUES;

    public static BatterySOHState[] values() {
        return null;
    }

    public static BatterySOHState valueOf(String string) {
        return null;
    }

    private BatterySOHState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static BatterySOHState find(int n) {
        return null;
    }

    private static /* synthetic */ BatterySOHState[] $values() {
        return null;
    }

    static {
        $VALUES = BatterySOHState.$values();
        allValues = BatterySOHState.values();
    }
}

