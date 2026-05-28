/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class FixedSpeedNavigationFailedReason
extends Enum<FixedSpeedNavigationFailedReason>
implements JNIProguardKeepTag {
    public static final /* enum */ FixedSpeedNavigationFailedReason CAN_ENTER = new FixedSpeedNavigationFailedReason(0);
    public static final /* enum */ FixedSpeedNavigationFailedReason NOT_IN_AIR = new FixedSpeedNavigationFailedReason(1);
    public static final /* enum */ FixedSpeedNavigationFailedReason CTRL_MODE_CHANGE = new FixedSpeedNavigationFailedReason(2);
    public static final /* enum */ FixedSpeedNavigationFailedReason IS_BRAKING = new FixedSpeedNavigationFailedReason(3);
    public static final /* enum */ FixedSpeedNavigationFailedReason VEL_IS_LIMITED = new FixedSpeedNavigationFailedReason(4);
    public static final /* enum */ FixedSpeedNavigationFailedReason IS_NEAR_BOUNDARY = new FixedSpeedNavigationFailedReason(5);
    public static final /* enum */ FixedSpeedNavigationFailedReason CUR_CTRL_MODE_NOT_SUPPORT = new FixedSpeedNavigationFailedReason(6);
    public static final /* enum */ FixedSpeedNavigationFailedReason TRIGGER_PAUSE = new FixedSpeedNavigationFailedReason(7);
    public static final /* enum */ FixedSpeedNavigationFailedReason RC_DISCONNECT = new FixedSpeedNavigationFailedReason(8);
    public static final /* enum */ FixedSpeedNavigationFailedReason STICKS_IS_ZERO_NOT_IN_KS = new FixedSpeedNavigationFailedReason(9);
    public static final /* enum */ FixedSpeedNavigationFailedReason STICKS_IS_ZERO_IN_KS = new FixedSpeedNavigationFailedReason(10);
    public static final /* enum */ FixedSpeedNavigationFailedReason APP_REQUIRE_EXIT = new FixedSpeedNavigationFailedReason(11);
    public static final /* enum */ FixedSpeedNavigationFailedReason EXTERNAL_REQUIRE_EXIT = new FixedSpeedNavigationFailedReason(12);
    public static final /* enum */ FixedSpeedNavigationFailedReason DJI_DRONE_WAYLINE_FINAL_POINT_REQ_EXIT = new FixedSpeedNavigationFailedReason(13);
    public static final /* enum */ FixedSpeedNavigationFailedReason DJI_DRONE_GLASS_CONNECTED = new FixedSpeedNavigationFailedReason(14);
    public static final /* enum */ FixedSpeedNavigationFailedReason UNKNOWN = new FixedSpeedNavigationFailedReason(65535);
    private int value;
    private static final FixedSpeedNavigationFailedReason[] allValues;
    private static final /* synthetic */ FixedSpeedNavigationFailedReason[] $VALUES;

    public static FixedSpeedNavigationFailedReason[] values() {
        return null;
    }

    public static FixedSpeedNavigationFailedReason valueOf(String string) {
        return null;
    }

    private FixedSpeedNavigationFailedReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FixedSpeedNavigationFailedReason find(int n) {
        return null;
    }

    private static /* synthetic */ FixedSpeedNavigationFailedReason[] $values() {
        return null;
    }

    static {
        $VALUES = FixedSpeedNavigationFailedReason.$values();
        allValues = FixedSpeedNavigationFailedReason.values();
    }
}

