/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class DistanceLimitedReason
extends Enum<DistanceLimitedReason>
implements JNIProguardKeepTag {
    public static final /* enum */ DistanceLimitedReason DEFAULT_LIMIT = new DistanceLimitedReason(0);
    public static final /* enum */ DistanceLimitedReason APP_SET_LIMIT = new DistanceLimitedReason(1);
    public static final /* enum */ DistanceLimitedReason REAL_NAME_LIMIT = new DistanceLimitedReason(2);
    public static final /* enum */ DistanceLimitedReason WIFI_MODE_LIMIT = new DistanceLimitedReason(3);
    public static final /* enum */ DistanceLimitedReason NOVICE_MODE_LIMIT = new DistanceLimitedReason(4);
    public static final /* enum */ DistanceLimitedReason UNKNOWN = new DistanceLimitedReason(255);
    private int value;
    private static final DistanceLimitedReason[] allValues;
    private static final /* synthetic */ DistanceLimitedReason[] $VALUES;

    public static DistanceLimitedReason[] values() {
        return null;
    }

    public static DistanceLimitedReason valueOf(String string) {
        return null;
    }

    private DistanceLimitedReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DistanceLimitedReason find(int n) {
        return null;
    }

    private static /* synthetic */ DistanceLimitedReason[] $values() {
        return null;
    }

    static {
        $VALUES = DistanceLimitedReason.$values();
        allValues = DistanceLimitedReason.values();
    }
}

