/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class CableFollowExitReason
extends Enum<CableFollowExitReason>
implements JNIProguardKeepTag {
    public static final /* enum */ CableFollowExitReason UserOperation = new CableFollowExitReason(0);
    public static final /* enum */ CableFollowExitReason VideoDisconnect = new CableFollowExitReason(1);
    public static final /* enum */ CableFollowExitReason LidarCaliImuFail = new CableFollowExitReason(2);
    public static final /* enum */ CableFollowExitReason UNKNOWN = new CableFollowExitReason(255);
    private int value;
    private static final CableFollowExitReason[] allValues;
    private static final /* synthetic */ CableFollowExitReason[] $VALUES;

    public static CableFollowExitReason[] values() {
        return null;
    }

    public static CableFollowExitReason valueOf(String string) {
        return null;
    }

    private CableFollowExitReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CableFollowExitReason find(int n) {
        return null;
    }

    private static /* synthetic */ CableFollowExitReason[] $values() {
        return null;
    }

    static {
        $VALUES = CableFollowExitReason.$values();
        allValues = CableFollowExitReason.values();
    }
}

