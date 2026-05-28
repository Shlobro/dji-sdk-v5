/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class IMUSensorState
extends Enum<IMUSensorState>
implements JNIProguardKeepTag {
    public static final /* enum */ IMUSensorState DISCONNECTED = new IMUSensorState(0);
    public static final /* enum */ IMUSensorState CALIBRATING = new IMUSensorState(1);
    public static final /* enum */ IMUSensorState CALIBRATION_FAILED = new IMUSensorState(2);
    public static final /* enum */ IMUSensorState DATA_EXCEPTION = new IMUSensorState(3);
    public static final /* enum */ IMUSensorState WARMING_UP = new IMUSensorState(4);
    public static final /* enum */ IMUSensorState IN_MOTION = new IMUSensorState(5);
    public static final /* enum */ IMUSensorState NORMAL_BIAS = new IMUSensorState(6);
    public static final /* enum */ IMUSensorState MEDIUM_BIAS = new IMUSensorState(7);
    public static final /* enum */ IMUSensorState LARGE_BIAS = new IMUSensorState(8);
    public static final /* enum */ IMUSensorState UNKNOWN = new IMUSensorState(65535);
    private int value;
    private static final IMUSensorState[] allValues;
    private static final /* synthetic */ IMUSensorState[] $VALUES;

    public static IMUSensorState[] values() {
        return null;
    }

    public static IMUSensorState valueOf(String string) {
        return null;
    }

    private IMUSensorState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static IMUSensorState find(int n) {
        return null;
    }

    private static /* synthetic */ IMUSensorState[] $values() {
        return null;
    }

    static {
        $VALUES = IMUSensorState.$values();
        allValues = IMUSensorState.values();
    }
}

