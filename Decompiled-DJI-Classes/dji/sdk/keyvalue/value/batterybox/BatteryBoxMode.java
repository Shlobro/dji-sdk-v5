/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.batterybox;

import dji.jni.JNIProguardKeepTag;

public final class BatteryBoxMode
extends Enum<BatteryBoxMode>
implements JNIProguardKeepTag {
    public static final /* enum */ BatteryBoxMode APP = new BatteryBoxMode(0);
    public static final /* enum */ BatteryBoxMode LOADER = new BatteryBoxMode(1);
    public static final /* enum */ BatteryBoxMode UNKNOWN = new BatteryBoxMode(65535);
    private int value;
    private static final BatteryBoxMode[] allValues;
    private static final /* synthetic */ BatteryBoxMode[] $VALUES;

    public static BatteryBoxMode[] values() {
        return null;
    }

    public static BatteryBoxMode valueOf(String string) {
        return null;
    }

    private BatteryBoxMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static BatteryBoxMode find(int n) {
        return null;
    }

    private static /* synthetic */ BatteryBoxMode[] $values() {
        return null;
    }

    static {
        $VALUES = BatteryBoxMode.$values();
        allValues = BatteryBoxMode.values();
    }
}

