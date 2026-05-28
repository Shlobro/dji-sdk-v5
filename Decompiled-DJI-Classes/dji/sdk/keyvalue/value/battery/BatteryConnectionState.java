/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.battery;

import dji.jni.JNIProguardKeepTag;

public final class BatteryConnectionState
extends Enum<BatteryConnectionState>
implements JNIProguardKeepTag {
    public static final /* enum */ BatteryConnectionState NORMAL = new BatteryConnectionState(0);
    public static final /* enum */ BatteryConnectionState INVALID = new BatteryConnectionState(1);
    public static final /* enum */ BatteryConnectionState EXCEPTION = new BatteryConnectionState(2);
    public static final /* enum */ BatteryConnectionState UNKNOWN = new BatteryConnectionState(255);
    private int value;
    private static final BatteryConnectionState[] allValues;
    private static final /* synthetic */ BatteryConnectionState[] $VALUES;

    public static BatteryConnectionState[] values() {
        return null;
    }

    public static BatteryConnectionState valueOf(String string) {
        return null;
    }

    private BatteryConnectionState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static BatteryConnectionState find(int n) {
        return null;
    }

    private static /* synthetic */ BatteryConnectionState[] $values() {
        return null;
    }

    static {
        $VALUES = BatteryConnectionState.$values();
        allValues = BatteryConnectionState.values();
    }
}

