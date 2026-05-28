/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class ThermalDigitalZoomFactor
extends Enum<ThermalDigitalZoomFactor>
implements JNIProguardKeepTag {
    public static final /* enum */ ThermalDigitalZoomFactor FACTOR_X1 = new ThermalDigitalZoomFactor(0);
    public static final /* enum */ ThermalDigitalZoomFactor FACTOR_X2 = new ThermalDigitalZoomFactor(1);
    public static final /* enum */ ThermalDigitalZoomFactor FACTOR_X4 = new ThermalDigitalZoomFactor(2);
    public static final /* enum */ ThermalDigitalZoomFactor FACTOR_X8 = new ThermalDigitalZoomFactor(3);
    public static final /* enum */ ThermalDigitalZoomFactor FACTOR_X16 = new ThermalDigitalZoomFactor(4);
    public static final /* enum */ ThermalDigitalZoomFactor FACTOR_X32 = new ThermalDigitalZoomFactor(5);
    public static final /* enum */ ThermalDigitalZoomFactor FACTOR_X64 = new ThermalDigitalZoomFactor(6);
    public static final /* enum */ ThermalDigitalZoomFactor UNKNOWN = new ThermalDigitalZoomFactor(65535);
    private int value;
    private static final ThermalDigitalZoomFactor[] allValues;
    private static final /* synthetic */ ThermalDigitalZoomFactor[] $VALUES;

    public static ThermalDigitalZoomFactor[] values() {
        return null;
    }

    public static ThermalDigitalZoomFactor valueOf(String string) {
        return null;
    }

    private ThermalDigitalZoomFactor(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ThermalDigitalZoomFactor find(int n) {
        return null;
    }

    private static /* synthetic */ ThermalDigitalZoomFactor[] $values() {
        return null;
    }

    static {
        $VALUES = ThermalDigitalZoomFactor.$values();
        allValues = ThermalDigitalZoomFactor.values();
    }
}

