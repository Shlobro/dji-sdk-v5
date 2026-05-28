/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class SDRDistanceLossReason
extends Enum<SDRDistanceLossReason>
implements JNIProguardKeepTag {
    public static final /* enum */ SDRDistanceLossReason NONE = new SDRDistanceLossReason(0);
    public static final /* enum */ SDRDistanceLossReason GROUND_INTERFERED = new SDRDistanceLossReason(1);
    public static final /* enum */ SDRDistanceLossReason UAV_INTERFERED = new SDRDistanceLossReason(2);
    public static final /* enum */ SDRDistanceLossReason SIGNAL_BLOCK = new SDRDistanceLossReason(3);
    public static final /* enum */ SDRDistanceLossReason UNKNOWN = new SDRDistanceLossReason(255);
    private int value;
    private static final SDRDistanceLossReason[] allValues;
    private static final /* synthetic */ SDRDistanceLossReason[] $VALUES;

    public static SDRDistanceLossReason[] values() {
        return null;
    }

    public static SDRDistanceLossReason valueOf(String string) {
        return null;
    }

    private SDRDistanceLossReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SDRDistanceLossReason find(int n) {
        return null;
    }

    private static /* synthetic */ SDRDistanceLossReason[] $values() {
        return null;
    }

    static {
        $VALUES = SDRDistanceLossReason.$values();
        allValues = SDRDistanceLossReason.values();
    }
}

