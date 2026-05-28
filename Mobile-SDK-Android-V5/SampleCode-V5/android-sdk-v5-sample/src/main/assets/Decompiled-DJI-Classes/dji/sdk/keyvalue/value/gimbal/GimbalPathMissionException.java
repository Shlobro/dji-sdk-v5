/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class GimbalPathMissionException
extends Enum<GimbalPathMissionException>
implements JNIProguardKeepTag {
    public static final /* enum */ GimbalPathMissionException NONE = new GimbalPathMissionException(0);
    public static final /* enum */ GimbalPathMissionException MOTOR_PROTECTION = new GimbalPathMissionException(1);
    public static final /* enum */ GimbalPathMissionException TIMEOUT = new GimbalPathMissionException(2);
    public static final /* enum */ GimbalPathMissionException LIMIT_POSITION_REACHING = new GimbalPathMissionException(3);
    public static final /* enum */ GimbalPathMissionException TOO_LARGE_INCLINATION_ANGLE = new GimbalPathMissionException(4);
    public static final /* enum */ GimbalPathMissionException LOST_CONNECTION_WITH_APP = new GimbalPathMissionException(5);
    public static final /* enum */ GimbalPathMissionException ROTATE_180 = new GimbalPathMissionException(6);
    public static final /* enum */ GimbalPathMissionException UNKNOWN = new GimbalPathMissionException(65535);
    private int value;
    private static final GimbalPathMissionException[] allValues;
    private static final /* synthetic */ GimbalPathMissionException[] $VALUES;

    public static GimbalPathMissionException[] values() {
        return null;
    }

    public static GimbalPathMissionException valueOf(String string) {
        return null;
    }

    private GimbalPathMissionException(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GimbalPathMissionException find(int n) {
        return null;
    }

    private static /* synthetic */ GimbalPathMissionException[] $values() {
        return null;
    }

    static {
        $VALUES = GimbalPathMissionException.$values();
        allValues = GimbalPathMissionException.values();
    }
}

