/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class AutoTurnOffLEDMode
extends Enum<AutoTurnOffLEDMode>
implements JNIProguardKeepTag {
    public static final /* enum */ AutoTurnOffLEDMode DISABLED = new AutoTurnOffLEDMode(0);
    public static final /* enum */ AutoTurnOffLEDMode FRONT_LEDS_ONLY = new AutoTurnOffLEDMode(1);
    public static final /* enum */ AutoTurnOffLEDMode BACK_LEDS_ONLY = new AutoTurnOffLEDMode(2);
    public static final /* enum */ AutoTurnOffLEDMode ALL_LEDS = new AutoTurnOffLEDMode(3);
    public static final /* enum */ AutoTurnOffLEDMode UNKNOWN = new AutoTurnOffLEDMode(65535);
    private int value;
    private static final AutoTurnOffLEDMode[] allValues;
    private static final /* synthetic */ AutoTurnOffLEDMode[] $VALUES;

    public static AutoTurnOffLEDMode[] values() {
        return null;
    }

    public static AutoTurnOffLEDMode valueOf(String string) {
        return null;
    }

    private AutoTurnOffLEDMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AutoTurnOffLEDMode find(int n) {
        return null;
    }

    private static /* synthetic */ AutoTurnOffLEDMode[] $values() {
        return null;
    }

    static {
        $VALUES = AutoTurnOffLEDMode.$values();
        allValues = AutoTurnOffLEDMode.values();
    }
}

