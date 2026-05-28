/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class ThermalIsothermUnit
extends Enum<ThermalIsothermUnit>
implements JNIProguardKeepTag {
    public static final /* enum */ ThermalIsothermUnit PERCENTAGE = new ThermalIsothermUnit(0);
    public static final /* enum */ ThermalIsothermUnit CELSIUS = new ThermalIsothermUnit(1);
    public static final /* enum */ ThermalIsothermUnit UNKNOWN = new ThermalIsothermUnit(65535);
    private int value;
    private static final ThermalIsothermUnit[] allValues;
    private static final /* synthetic */ ThermalIsothermUnit[] $VALUES;

    public static ThermalIsothermUnit[] values() {
        return null;
    }

    public static ThermalIsothermUnit valueOf(String string) {
        return null;
    }

    private ThermalIsothermUnit(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ThermalIsothermUnit find(int n) {
        return null;
    }

    private static /* synthetic */ ThermalIsothermUnit[] $values() {
        return null;
    }

    static {
        $VALUES = ThermalIsothermUnit.$values();
        allValues = ThermalIsothermUnit.values();
    }
}

