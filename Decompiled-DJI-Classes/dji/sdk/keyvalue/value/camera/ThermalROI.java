/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class ThermalROI
extends Enum<ThermalROI>
implements JNIProguardKeepTag {
    public static final /* enum */ ThermalROI FULL = new ThermalROI(0);
    public static final /* enum */ ThermalROI SKY_EXCLUDED33 = new ThermalROI(1);
    public static final /* enum */ ThermalROI SKY_EXCLUDED50 = new ThermalROI(2);
    public static final /* enum */ ThermalROI UNKNOWN = new ThermalROI(65535);
    private int value;
    private static final ThermalROI[] allValues;
    private static final /* synthetic */ ThermalROI[] $VALUES;

    public static ThermalROI[] values() {
        return null;
    }

    public static ThermalROI valueOf(String string) {
        return null;
    }

    private ThermalROI(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ThermalROI find(int n) {
        return null;
    }

    private static /* synthetic */ ThermalROI[] $values() {
        return null;
    }

    static {
        $VALUES = ThermalROI.$values();
        allValues = ThermalROI.values();
    }
}

