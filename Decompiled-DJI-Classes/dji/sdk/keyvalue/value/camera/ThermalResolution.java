/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class ThermalResolution
extends Enum<ThermalResolution>
implements JNIProguardKeepTag {
    public static final /* enum */ ThermalResolution RESOLUTION_640X512 = new ThermalResolution(0);
    public static final /* enum */ ThermalResolution RESOLUTION_336X256 = new ThermalResolution(1);
    public static final /* enum */ ThermalResolution RESOLUTION_384x288 = new ThermalResolution(2);
    public static final /* enum */ ThermalResolution RESOLUTION_1024x768 = new ThermalResolution(3);
    public static final /* enum */ ThermalResolution UNKNOWN = new ThermalResolution(65535);
    private int value;
    private static final ThermalResolution[] allValues;
    private static final /* synthetic */ ThermalResolution[] $VALUES;

    public static ThermalResolution[] values() {
        return null;
    }

    public static ThermalResolution valueOf(String string) {
        return null;
    }

    private ThermalResolution(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ThermalResolution find(int n) {
        return null;
    }

    private static /* synthetic */ ThermalResolution[] $values() {
        return null;
    }

    static {
        $VALUES = ThermalResolution.$values();
        allValues = ThermalResolution.values();
    }
}

