/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class EmergencyBrakeEndReason
extends Enum<EmergencyBrakeEndReason>
implements JNIProguardKeepTag {
    public static final /* enum */ EmergencyBrakeEndReason NONE = new EmergencyBrakeEndReason(0);
    public static final /* enum */ EmergencyBrakeEndReason AVOID = new EmergencyBrakeEndReason(1);
    public static final /* enum */ EmergencyBrakeEndReason FLY_LIMIT = new EmergencyBrakeEndReason(2);
    public static final /* enum */ EmergencyBrakeEndReason RADIUS_LIMIT = new EmergencyBrakeEndReason(3);
    public static final /* enum */ EmergencyBrakeEndReason UNKNOWN = new EmergencyBrakeEndReason(65535);
    private int value;
    private static final EmergencyBrakeEndReason[] allValues;
    private static final /* synthetic */ EmergencyBrakeEndReason[] $VALUES;

    public static EmergencyBrakeEndReason[] values() {
        return null;
    }

    public static EmergencyBrakeEndReason valueOf(String string) {
        return null;
    }

    private EmergencyBrakeEndReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static EmergencyBrakeEndReason find(int n) {
        return null;
    }

    private static /* synthetic */ EmergencyBrakeEndReason[] $values() {
        return null;
    }

    static {
        $VALUES = EmergencyBrakeEndReason.$values();
        allValues = EmergencyBrakeEndReason.values();
    }
}

