/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class CompassSensorState
extends Enum<CompassSensorState>
implements JNIProguardKeepTag {
    public static final /* enum */ CompassSensorState DISCONNECTED = new CompassSensorState(1);
    public static final /* enum */ CompassSensorState CALIBRATING = new CompassSensorState(2);
    public static final /* enum */ CompassSensorState UNCALIBRATED = new CompassSensorState(3);
    public static final /* enum */ CompassSensorState DATA_EXCEPTION = new CompassSensorState(4);
    public static final /* enum */ CompassSensorState NORMAL_MODULUS = new CompassSensorState(5);
    public static final /* enum */ CompassSensorState WEAK_MODULUS = new CompassSensorState(6);
    public static final /* enum */ CompassSensorState SERIOUS_MODULUS = new CompassSensorState(7);
    public static final /* enum */ CompassSensorState CALIBRATION_FAILED = new CompassSensorState(8);
    public static final /* enum */ CompassSensorState DIRECTION_EXCEPTION = new CompassSensorState(9);
    public static final /* enum */ CompassSensorState UNKNOWN = new CompassSensorState(65535);
    private int value;
    private static final CompassSensorState[] allValues;
    private static final /* synthetic */ CompassSensorState[] $VALUES;

    public static CompassSensorState[] values() {
        return null;
    }

    public static CompassSensorState valueOf(String string) {
        return null;
    }

    private CompassSensorState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CompassSensorState find(int n) {
        return null;
    }

    private static /* synthetic */ CompassSensorState[] $values() {
        return null;
    }

    static {
        $VALUES = CompassSensorState.$values();
        allValues = CompassSensorState.values();
    }
}

