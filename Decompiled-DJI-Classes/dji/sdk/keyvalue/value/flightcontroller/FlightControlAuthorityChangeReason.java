/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FlightControlAuthorityChangeReason
extends Enum<FlightControlAuthorityChangeReason>
implements JNIProguardKeepTag {
    public static final /* enum */ FlightControlAuthorityChangeReason MSDK_REQUEST = new FlightControlAuthorityChangeReason(0);
    public static final /* enum */ FlightControlAuthorityChangeReason AUTO_TEST_REQUEST = new FlightControlAuthorityChangeReason(1);
    public static final /* enum */ FlightControlAuthorityChangeReason OSDK_REQUEST = new FlightControlAuthorityChangeReason(2);
    public static final /* enum */ FlightControlAuthorityChangeReason RC_LOST = new FlightControlAuthorityChangeReason(3);
    public static final /* enum */ FlightControlAuthorityChangeReason RC_NOT_P_MODE = new FlightControlAuthorityChangeReason(4);
    public static final /* enum */ FlightControlAuthorityChangeReason RC_SWITCH = new FlightControlAuthorityChangeReason(5);
    public static final /* enum */ FlightControlAuthorityChangeReason RC_PAUSE_STOP = new FlightControlAuthorityChangeReason(6);
    public static final /* enum */ FlightControlAuthorityChangeReason RC_ONE_KEY_GO_HOME = new FlightControlAuthorityChangeReason(7);
    public static final /* enum */ FlightControlAuthorityChangeReason BATTERY_LOW_GO_HOME = new FlightControlAuthorityChangeReason(8);
    public static final /* enum */ FlightControlAuthorityChangeReason BATTERY_SUPER_LOW_LANDING = new FlightControlAuthorityChangeReason(9);
    public static final /* enum */ FlightControlAuthorityChangeReason OSDK_LOST = new FlightControlAuthorityChangeReason(10);
    public static final /* enum */ FlightControlAuthorityChangeReason NEAR_BOUNDARY = new FlightControlAuthorityChangeReason(11);
    public static final /* enum */ FlightControlAuthorityChangeReason AIRPORT_REQUEST = new FlightControlAuthorityChangeReason(12);
    public static final /* enum */ FlightControlAuthorityChangeReason UNKNOWN = new FlightControlAuthorityChangeReason(65535);
    private int value;
    private static final FlightControlAuthorityChangeReason[] allValues;
    private static final /* synthetic */ FlightControlAuthorityChangeReason[] $VALUES;

    public static FlightControlAuthorityChangeReason[] values() {
        return null;
    }

    public static FlightControlAuthorityChangeReason valueOf(String string) {
        return null;
    }

    private FlightControlAuthorityChangeReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlightControlAuthorityChangeReason find(int n) {
        return null;
    }

    private static /* synthetic */ FlightControlAuthorityChangeReason[] $values() {
        return null;
    }

    static {
        $VALUES = FlightControlAuthorityChangeReason.$values();
        allValues = FlightControlAuthorityChangeReason.values();
    }
}

