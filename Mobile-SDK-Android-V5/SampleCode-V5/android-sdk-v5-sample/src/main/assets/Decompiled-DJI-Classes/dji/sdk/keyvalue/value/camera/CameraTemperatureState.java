/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraTemperatureState
extends Enum<CameraTemperatureState>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraTemperatureState NORMAL = new CameraTemperatureState(0);
    public static final /* enum */ CameraTemperatureState OVER_HEAT_LEVEL_1 = new CameraTemperatureState(1);
    public static final /* enum */ CameraTemperatureState OVER_HEAT_LEVEL_2 = new CameraTemperatureState(2);
    public static final /* enum */ CameraTemperatureState OVER_HEAT_LEVEL_3 = new CameraTemperatureState(3);
    public static final /* enum */ CameraTemperatureState UNKNOWN = new CameraTemperatureState(65535);
    private int value;
    private static final CameraTemperatureState[] allValues;
    private static final /* synthetic */ CameraTemperatureState[] $VALUES;

    public static CameraTemperatureState[] values() {
        return null;
    }

    public static CameraTemperatureState valueOf(String string) {
        return null;
    }

    private CameraTemperatureState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraTemperatureState find(int n) {
        return null;
    }

    private static /* synthetic */ CameraTemperatureState[] $values() {
        return null;
    }

    static {
        $VALUES = CameraTemperatureState.$values();
        allValues = CameraTemperatureState.values();
    }
}

