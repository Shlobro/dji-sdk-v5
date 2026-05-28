/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraTemperatureUnit
extends Enum<CameraTemperatureUnit>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraTemperatureUnit FAHRENHEIT = new CameraTemperatureUnit(0);
    public static final /* enum */ CameraTemperatureUnit CELSIUS = new CameraTemperatureUnit(1);
    public static final /* enum */ CameraTemperatureUnit UNKNOWN = new CameraTemperatureUnit(65535);
    private int value;
    private static final CameraTemperatureUnit[] allValues;
    private static final /* synthetic */ CameraTemperatureUnit[] $VALUES;

    public static CameraTemperatureUnit[] values() {
        return null;
    }

    public static CameraTemperatureUnit valueOf(String string) {
        return null;
    }

    private CameraTemperatureUnit(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraTemperatureUnit find(int n) {
        return null;
    }

    private static /* synthetic */ CameraTemperatureUnit[] $values() {
        return null;
    }

    static {
        $VALUES = CameraTemperatureUnit.$values();
        allValues = CameraTemperatureUnit.values();
    }
}

