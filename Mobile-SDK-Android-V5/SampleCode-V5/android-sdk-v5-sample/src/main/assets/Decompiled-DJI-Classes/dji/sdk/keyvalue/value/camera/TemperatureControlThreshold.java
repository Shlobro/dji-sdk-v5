/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class TemperatureControlThreshold
extends Enum<TemperatureControlThreshold>
implements JNIProguardKeepTag {
    public static final /* enum */ TemperatureControlThreshold LOW = new TemperatureControlThreshold(1);
    public static final /* enum */ TemperatureControlThreshold HIGH = new TemperatureControlThreshold(2);
    public static final /* enum */ TemperatureControlThreshold UNKNOWN = new TemperatureControlThreshold(65535);
    private int value;
    private static final TemperatureControlThreshold[] allValues;
    private static final /* synthetic */ TemperatureControlThreshold[] $VALUES;

    public static TemperatureControlThreshold[] values() {
        return null;
    }

    public static TemperatureControlThreshold valueOf(String string) {
        return null;
    }

    private TemperatureControlThreshold(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TemperatureControlThreshold find(int n) {
        return null;
    }

    private static /* synthetic */ TemperatureControlThreshold[] $values() {
        return null;
    }

    static {
        $VALUES = TemperatureControlThreshold.$values();
        allValues = TemperatureControlThreshold.values();
    }
}

