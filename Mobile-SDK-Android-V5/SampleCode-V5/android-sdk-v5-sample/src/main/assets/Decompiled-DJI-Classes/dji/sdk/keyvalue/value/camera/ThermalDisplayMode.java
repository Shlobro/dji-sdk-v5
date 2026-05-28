/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class ThermalDisplayMode
extends Enum<ThermalDisplayMode>
implements JNIProguardKeepTag {
    public static final /* enum */ ThermalDisplayMode VISUAL_ONLY = new ThermalDisplayMode(0);
    public static final /* enum */ ThermalDisplayMode THERMAL_ONLY = new ThermalDisplayMode(1);
    public static final /* enum */ ThermalDisplayMode PIP = new ThermalDisplayMode(2);
    public static final /* enum */ ThermalDisplayMode MSX = new ThermalDisplayMode(3);
    public static final /* enum */ ThermalDisplayMode UNKNOWN = new ThermalDisplayMode(65535);
    private int value;
    private static final ThermalDisplayMode[] allValues;
    private static final /* synthetic */ ThermalDisplayMode[] $VALUES;

    public static ThermalDisplayMode[] values() {
        return null;
    }

    public static ThermalDisplayMode valueOf(String string) {
        return null;
    }

    private ThermalDisplayMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ThermalDisplayMode find(int n) {
        return null;
    }

    private static /* synthetic */ ThermalDisplayMode[] $values() {
        return null;
    }

    static {
        $VALUES = ThermalDisplayMode.$values();
        allValues = ThermalDisplayMode.values();
    }
}

