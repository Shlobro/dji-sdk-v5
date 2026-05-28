/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FlightControllerErrorCode
extends Enum<FlightControllerErrorCode>
implements JNIProguardKeepTag {
    public static final /* enum */ FlightControllerErrorCode MOTOR_ON = new FlightControllerErrorCode(1);
    public static final /* enum */ FlightControllerErrorCode MOTOR_OFF = new FlightControllerErrorCode(2);
    public static final /* enum */ FlightControllerErrorCode IN_AIR = new FlightControllerErrorCode(3);
    public static final /* enum */ FlightControllerErrorCode NOT_IN_AIR = new FlightControllerErrorCode(4);
    public static final /* enum */ FlightControllerErrorCode HOMEPOINT_NOT_SET = new FlightControllerErrorCode(5);
    public static final /* enum */ FlightControllerErrorCode BAD_GPS = new FlightControllerErrorCode(6);
    public static final /* enum */ FlightControllerErrorCode IN_SIMULATION = new FlightControllerErrorCode(7);
    public static final /* enum */ FlightControllerErrorCode CMD_IS_RUNNING = new FlightControllerErrorCode(8);
    public static final /* enum */ FlightControllerErrorCode CMD_NOT_RUNNING = new FlightControllerErrorCode(9);
    public static final /* enum */ FlightControllerErrorCode CMD_INVALID = new FlightControllerErrorCode(10);
    public static final /* enum */ FlightControllerErrorCode NO_GEAR = new FlightControllerErrorCode(11);
    public static final /* enum */ FlightControllerErrorCode PACK_GIMBAL_MOUNTED = new FlightControllerErrorCode(12);
    public static final /* enum */ FlightControllerErrorCode PACK_US_NOT_HEALTHY = new FlightControllerErrorCode(13);
    public static final /* enum */ FlightControllerErrorCode PACK_HAS_PACKED = new FlightControllerErrorCode(14);
    public static final /* enum */ FlightControllerErrorCode NOT_PACKED = new FlightControllerErrorCode(15);
    public static final /* enum */ FlightControllerErrorCode NOT_SUPPORTED = new FlightControllerErrorCode(16);
    public static final /* enum */ FlightControllerErrorCode CANNOT_START_MOTOR = new FlightControllerErrorCode(17);
    public static final /* enum */ FlightControllerErrorCode LOW_VOLTAGE = new FlightControllerErrorCode(18);
    public static final /* enum */ FlightControllerErrorCode IN_HOVER = new FlightControllerErrorCode(19);
    public static final /* enum */ FlightControllerErrorCode SPEED_TOO_LARGE = new FlightControllerErrorCode(20);
    public static final /* enum */ FlightControllerErrorCode NO_HORIZ_VEL_INFO = new FlightControllerErrorCode(21);
    public static final /* enum */ FlightControllerErrorCode UNKNOWN = new FlightControllerErrorCode(65535);
    private int value;
    private static final FlightControllerErrorCode[] allValues;
    private static final /* synthetic */ FlightControllerErrorCode[] $VALUES;

    public static FlightControllerErrorCode[] values() {
        return null;
    }

    public static FlightControllerErrorCode valueOf(String string) {
        return null;
    }

    private FlightControllerErrorCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlightControllerErrorCode find(int n) {
        return null;
    }

    private static /* synthetic */ FlightControllerErrorCode[] $values() {
        return null;
    }

    static {
        $VALUES = FlightControllerErrorCode.$values();
        allValues = FlightControllerErrorCode.values();
    }
}

