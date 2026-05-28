/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class FixedSpeedStateSetFailedReason
extends Enum<FixedSpeedStateSetFailedReason>
implements JNIProguardKeepTag {
    public static final /* enum */ FixedSpeedStateSetFailedReason NOT_IN_KS_MODE = new FixedSpeedStateSetFailedReason(0);
    public static final /* enum */ FixedSpeedStateSetFailedReason MSG_LENGTH_ERROR = new FixedSpeedStateSetFailedReason(1);
    public static final /* enum */ FixedSpeedStateSetFailedReason UNKNOWN = new FixedSpeedStateSetFailedReason(65535);
    private int value;
    private static final FixedSpeedStateSetFailedReason[] allValues;
    private static final /* synthetic */ FixedSpeedStateSetFailedReason[] $VALUES;

    public static FixedSpeedStateSetFailedReason[] values() {
        return null;
    }

    public static FixedSpeedStateSetFailedReason valueOf(String string) {
        return null;
    }

    private FixedSpeedStateSetFailedReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FixedSpeedStateSetFailedReason find(int n) {
        return null;
    }

    private static /* synthetic */ FixedSpeedStateSetFailedReason[] $values() {
        return null;
    }

    static {
        $VALUES = FixedSpeedStateSetFailedReason.$values();
        allValues = FixedSpeedStateSetFailedReason.values();
    }
}

