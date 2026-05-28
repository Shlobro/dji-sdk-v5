/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class ThermalGainMode
extends Enum<ThermalGainMode>
implements JNIProguardKeepTag {
    public static final /* enum */ ThermalGainMode AUTO = new ThermalGainMode(0);
    public static final /* enum */ ThermalGainMode LOW = new ThermalGainMode(1);
    public static final /* enum */ ThermalGainMode HIGH = new ThermalGainMode(2);
    public static final /* enum */ ThermalGainMode SUPER_CLEAR = new ThermalGainMode(3);
    public static final /* enum */ ThermalGainMode UNKNOWN = new ThermalGainMode(65535);
    private int value;
    private static final ThermalGainMode[] allValues;
    private static final /* synthetic */ ThermalGainMode[] $VALUES;

    public static ThermalGainMode[] values() {
        return null;
    }

    public static ThermalGainMode valueOf(String string) {
        return null;
    }

    private ThermalGainMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ThermalGainMode find(int n) {
        return null;
    }

    private static /* synthetic */ ThermalGainMode[] $values() {
        return null;
    }

    static {
        $VALUES = ThermalGainMode.$values();
        allValues = ThermalGainMode.values();
    }
}

