/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class ThermalFrameRateUpperBound
extends Enum<ThermalFrameRateUpperBound>
implements JNIProguardKeepTag {
    public static final /* enum */ ThermalFrameRateUpperBound BOUND_8DOT3HZ = new ThermalFrameRateUpperBound(0);
    public static final /* enum */ ThermalFrameRateUpperBound BOUND_30HZ = new ThermalFrameRateUpperBound(4);
    public static final /* enum */ ThermalFrameRateUpperBound UNKNOWN = new ThermalFrameRateUpperBound(65535);
    private int value;
    private static final ThermalFrameRateUpperBound[] allValues;
    private static final /* synthetic */ ThermalFrameRateUpperBound[] $VALUES;

    public static ThermalFrameRateUpperBound[] values() {
        return null;
    }

    public static ThermalFrameRateUpperBound valueOf(String string) {
        return null;
    }

    private ThermalFrameRateUpperBound(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ThermalFrameRateUpperBound find(int n) {
        return null;
    }

    private static /* synthetic */ ThermalFrameRateUpperBound[] $values() {
        return null;
    }

    static {
        $VALUES = ThermalFrameRateUpperBound.$values();
        allValues = ThermalFrameRateUpperBound.values();
    }
}

