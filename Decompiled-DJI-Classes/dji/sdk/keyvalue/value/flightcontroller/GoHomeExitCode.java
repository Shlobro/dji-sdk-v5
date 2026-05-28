/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class GoHomeExitCode
extends Enum<GoHomeExitCode>
implements JNIProguardKeepTag {
    public static final /* enum */ GoHomeExitCode OYSTICK_THROTTLE_ADD = new GoHomeExitCode(0);
    public static final /* enum */ GoHomeExitCode JOYSTICK_PITCH_ADD = new GoHomeExitCode(1);
    public static final /* enum */ GoHomeExitCode OABT_INIT_FAIL = new GoHomeExitCode(2);
    public static final /* enum */ GoHomeExitCode OABT_STUCK = new GoHomeExitCode(3);
    public static final /* enum */ GoHomeExitCode VELOCITY_STUCK = new GoHomeExitCode(4);
    public static final /* enum */ GoHomeExitCode SHORT_DISTANCE_OA = new GoHomeExitCode(5);
    public static final /* enum */ GoHomeExitCode GPS_NO_SIGNAL = new GoHomeExitCode(6);
    public static final /* enum */ GoHomeExitCode GPS_VIO_NO_OUTPUT = new GoHomeExitCode(7);
    public static final /* enum */ GoHomeExitCode GPS_VIO_POS_ERROR = new GoHomeExitCode(8);
    public static final /* enum */ GoHomeExitCode BACKTRACK_IN_SHORT_DISTANCE = new GoHomeExitCode(9);
    public static final /* enum */ GoHomeExitCode NOT_HOMING_IN_SHORT_DISTANCE = new GoHomeExitCode(10);
    public static final /* enum */ GoHomeExitCode NO_ERROR = new GoHomeExitCode(255);
    public static final /* enum */ GoHomeExitCode UNKNOWN = new GoHomeExitCode(65535);
    private int value;
    private static final GoHomeExitCode[] allValues;
    private static final /* synthetic */ GoHomeExitCode[] $VALUES;

    public static GoHomeExitCode[] values() {
        return null;
    }

    public static GoHomeExitCode valueOf(String string) {
        return null;
    }

    private GoHomeExitCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GoHomeExitCode find(int n) {
        return null;
    }

    private static /* synthetic */ GoHomeExitCode[] $values() {
        return null;
    }

    static {
        $VALUES = GoHomeExitCode.$values();
        allValues = GoHomeExitCode.values();
    }
}

