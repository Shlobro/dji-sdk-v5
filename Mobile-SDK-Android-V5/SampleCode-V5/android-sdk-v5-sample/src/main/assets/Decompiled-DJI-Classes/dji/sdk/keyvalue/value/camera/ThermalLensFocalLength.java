/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class ThermalLensFocalLength
extends Enum<ThermalLensFocalLength>
implements JNIProguardKeepTag {
    public static final /* enum */ ThermalLensFocalLength LENGTH_6DOT8MM = new ThermalLensFocalLength(0);
    public static final /* enum */ ThermalLensFocalLength LENGTH_7DOT5MM = new ThermalLensFocalLength(1);
    public static final /* enum */ ThermalLensFocalLength LENGTH_9MM = new ThermalLensFocalLength(2);
    public static final /* enum */ ThermalLensFocalLength LENGTH_13MM = new ThermalLensFocalLength(3);
    public static final /* enum */ ThermalLensFocalLength LENGTH_19MM = new ThermalLensFocalLength(4);
    public static final /* enum */ ThermalLensFocalLength LENGTH_25MM = new ThermalLensFocalLength(5);
    public static final /* enum */ ThermalLensFocalLength UNKNOWN = new ThermalLensFocalLength(65535);
    private int value;
    private static final ThermalLensFocalLength[] allValues;
    private static final /* synthetic */ ThermalLensFocalLength[] $VALUES;

    public static ThermalLensFocalLength[] values() {
        return null;
    }

    public static ThermalLensFocalLength valueOf(String string) {
        return null;
    }

    private ThermalLensFocalLength(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ThermalLensFocalLength find(int n) {
        return null;
    }

    private static /* synthetic */ ThermalLensFocalLength[] $values() {
        return null;
    }

    static {
        $VALUES = ThermalLensFocalLength.$values();
        allValues = ThermalLensFocalLength.values();
    }
}

