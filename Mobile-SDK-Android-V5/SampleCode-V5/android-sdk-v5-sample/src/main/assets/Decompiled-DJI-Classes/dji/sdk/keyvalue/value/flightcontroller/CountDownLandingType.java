/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class CountDownLandingType
extends Enum<CountDownLandingType>
implements JNIProguardKeepTag {
    public static final /* enum */ CountDownLandingType LOW_BAT_GOHOME = new CountDownLandingType(0);
    public static final /* enum */ CountDownLandingType LOW_BAT_LANDING = new CountDownLandingType(1);
    public static final /* enum */ CountDownLandingType LOST_PICTURE = new CountDownLandingType(2);
    public static final /* enum */ CountDownLandingType ABOVE_WATER = new CountDownLandingType(3);
    public static final /* enum */ CountDownLandingType STOP_MOTOR_FOR_SDR = new CountDownLandingType(4);
    public static final /* enum */ CountDownLandingType STOP_LANDING_FOR_AG_PLAT = new CountDownLandingType(5);
    public static final /* enum */ CountDownLandingType PAUSE_GOHOME_FOR_USER_CONFIRM = new CountDownLandingType(6);
    public static final /* enum */ CountDownLandingType IMU_INSTABILITY_FORCE_LANDING = new CountDownLandingType(7);
    public static final /* enum */ CountDownLandingType REQUEST_CLEARANCE_TO_ENTER_CONTROL_ZONE = new CountDownLandingType(8);
    public static final /* enum */ CountDownLandingType GPS_JAMMING_GOHOME_CNT_DOWN = new CountDownLandingType(9);
    public static final /* enum */ CountDownLandingType UNKNOWN = new CountDownLandingType(65535);
    private int value;
    private static final CountDownLandingType[] allValues;
    private static final /* synthetic */ CountDownLandingType[] $VALUES;

    public static CountDownLandingType[] values() {
        return null;
    }

    public static CountDownLandingType valueOf(String string) {
        return null;
    }

    private CountDownLandingType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CountDownLandingType find(int n) {
        return null;
    }

    private static /* synthetic */ CountDownLandingType[] $values() {
        return null;
    }

    static {
        $VALUES = CountDownLandingType.$values();
        allValues = CountDownLandingType.values();
    }
}

