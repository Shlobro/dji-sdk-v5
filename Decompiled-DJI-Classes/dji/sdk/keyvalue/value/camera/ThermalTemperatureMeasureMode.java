/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class ThermalTemperatureMeasureMode
extends Enum<ThermalTemperatureMeasureMode>
implements JNIProguardKeepTag {
    public static final /* enum */ ThermalTemperatureMeasureMode DISABLED = new ThermalTemperatureMeasureMode(0);
    public static final /* enum */ ThermalTemperatureMeasureMode SPOT = new ThermalTemperatureMeasureMode(1);
    public static final /* enum */ ThermalTemperatureMeasureMode REGION = new ThermalTemperatureMeasureMode(2);
    public static final /* enum */ ThermalTemperatureMeasureMode CENTRAL_POINT_METERING = new ThermalTemperatureMeasureMode(3);
    public static final /* enum */ ThermalTemperatureMeasureMode UNKNOWN = new ThermalTemperatureMeasureMode(65535);
    private int value;
    private static final ThermalTemperatureMeasureMode[] allValues;
    private static final /* synthetic */ ThermalTemperatureMeasureMode[] $VALUES;

    public static ThermalTemperatureMeasureMode[] values() {
        return null;
    }

    public static ThermalTemperatureMeasureMode valueOf(String string) {
        return null;
    }

    private ThermalTemperatureMeasureMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ThermalTemperatureMeasureMode find(int n) {
        return null;
    }

    private static /* synthetic */ ThermalTemperatureMeasureMode[] $values() {
        return null;
    }

    static {
        $VALUES = ThermalTemperatureMeasureMode.$values();
        allValues = ThermalTemperatureMeasureMode.values();
    }
}

