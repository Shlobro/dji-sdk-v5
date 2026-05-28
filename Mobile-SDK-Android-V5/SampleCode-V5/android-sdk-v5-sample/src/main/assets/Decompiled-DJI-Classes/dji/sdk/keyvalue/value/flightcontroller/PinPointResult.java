/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class PinPointResult
extends Enum<PinPointResult>
implements JNIProguardKeepTag {
    public static final /* enum */ PinPointResult SUCCESS_BUT_OUT_OF_SCREEN = new PinPointResult(1);
    public static final /* enum */ PinPointResult PINPOINT_SUCCESS = new PinPointResult(0);
    public static final /* enum */ PinPointResult PINPOINT_FAILED = new PinPointResult(-1);
    public static final /* enum */ PinPointResult BAD_PARAM_DRONE_POSITION = new PinPointResult(-2);
    public static final /* enum */ PinPointResult BAD_PARAM_POINT_POSITION = new PinPointResult(-3);
    public static final /* enum */ PinPointResult BAD_PARAM_GIMBAL_ATTI = new PinPointResult(-4);
    public static final /* enum */ PinPointResult BAD_PARAM_CAMERA_INTRINSICS = new PinPointResult(-5);
    public static final /* enum */ PinPointResult UNKNOWN = new PinPointResult(4095);
    private int value;
    private static final PinPointResult[] allValues;
    private static final /* synthetic */ PinPointResult[] $VALUES;

    public static PinPointResult[] values() {
        return null;
    }

    public static PinPointResult valueOf(String string) {
        return null;
    }

    private PinPointResult(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PinPointResult find(int n) {
        return null;
    }

    private static /* synthetic */ PinPointResult[] $values() {
        return null;
    }

    static {
        $VALUES = PinPointResult.$values();
        allValues = PinPointResult.values();
    }
}

