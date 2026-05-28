/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class ReasonForExitHoming
extends Enum<ReasonForExitHoming>
implements JNIProguardKeepTag {
    public static final /* enum */ ReasonForExitHoming JOYSTICK_THROTTLE_ADD = new ReasonForExitHoming(0);
    public static final /* enum */ ReasonForExitHoming JOYSTICK_PITCH_ADD = new ReasonForExitHoming(1);
    public static final /* enum */ ReasonForExitHoming OABT_INIT_FAIL = new ReasonForExitHoming(2);
    public static final /* enum */ ReasonForExitHoming OABT_STUCK = new ReasonForExitHoming(3);
    public static final /* enum */ ReasonForExitHoming VELOCITY_STUCK = new ReasonForExitHoming(4);
    public static final /* enum */ ReasonForExitHoming SHORT_DISTANCE_OA = new ReasonForExitHoming(5);
    public static final /* enum */ ReasonForExitHoming GPS_NO_SIGNAL = new ReasonForExitHoming(6);
    public static final /* enum */ ReasonForExitHoming GPS_VIO_NO_OUTPUT = new ReasonForExitHoming(7);
    public static final /* enum */ ReasonForExitHoming GPS_VIO_POS_ERROR = new ReasonForExitHoming(8);
    public static final /* enum */ ReasonForExitHoming BACKTRACK_IN_SHORT_DISTANCE = new ReasonForExitHoming(9);
    public static final /* enum */ ReasonForExitHoming TRIGGER_HOMING_IN_SHORT_DISTANCE = new ReasonForExitHoming(10);
    public static final /* enum */ ReasonForExitHoming UNKNOWN = new ReasonForExitHoming(65535);
    private int value;
    private static final ReasonForExitHoming[] allValues;
    private static final /* synthetic */ ReasonForExitHoming[] $VALUES;

    public static ReasonForExitHoming[] values() {
        return null;
    }

    public static ReasonForExitHoming valueOf(String string) {
        return null;
    }

    private ReasonForExitHoming(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ReasonForExitHoming find(int n) {
        return null;
    }

    private static /* synthetic */ ReasonForExitHoming[] $values() {
        return null;
    }

    static {
        $VALUES = ReasonForExitHoming.$values();
        allValues = ReasonForExitHoming.values();
    }
}

