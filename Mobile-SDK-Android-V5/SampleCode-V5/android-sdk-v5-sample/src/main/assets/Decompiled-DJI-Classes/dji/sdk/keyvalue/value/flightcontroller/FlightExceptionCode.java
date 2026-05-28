/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FlightExceptionCode
extends Enum<FlightExceptionCode>
implements JNIProguardKeepTag {
    public static final /* enum */ FlightExceptionCode NONE = new FlightExceptionCode(0);
    public static final /* enum */ FlightExceptionCode WDG_RESTART = new FlightExceptionCode(1);
    public static final /* enum */ FlightExceptionCode MIDAIR_COLLISION = new FlightExceptionCode(2);
    public static final /* enum */ FlightExceptionCode EXCESSIVE_ATTITUDE = new FlightExceptionCode(3);
    public static final /* enum */ FlightExceptionCode CONTROL_FAILURE = new FlightExceptionCode(4);
    public static final /* enum */ FlightExceptionCode TAKEOFF_EXCEPTION = new FlightExceptionCode(5);
    public static final /* enum */ FlightExceptionCode ESC_STALL = new FlightExceptionCode(6);
    public static final /* enum */ FlightExceptionCode TAKEOFF_HEIGHT_EXCEPTION = new FlightExceptionCode(7);
    public static final /* enum */ FlightExceptionCode ALTITUDE_CONTROL_EXCEPTION = new FlightExceptionCode(8);
    public static final /* enum */ FlightExceptionCode FORCED_LANDING = new FlightExceptionCode(9);
    public static final /* enum */ FlightExceptionCode ABNORMAL_LANDING_OUTSIDE = new FlightExceptionCode(10);
    public static final /* enum */ FlightExceptionCode UNKNOWN = new FlightExceptionCode(65535);
    private int value;
    private static final FlightExceptionCode[] allValues;
    private static final /* synthetic */ FlightExceptionCode[] $VALUES;

    public static FlightExceptionCode[] values() {
        return null;
    }

    public static FlightExceptionCode valueOf(String string) {
        return null;
    }

    private FlightExceptionCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlightExceptionCode find(int n) {
        return null;
    }

    private static /* synthetic */ FlightExceptionCode[] $values() {
        return null;
    }

    static {
        $VALUES = FlightExceptionCode.$values();
        allValues = FlightExceptionCode.values();
    }
}

