/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FlightRecordRecoveryState
extends Enum<FlightRecordRecoveryState>
implements JNIProguardKeepTag {
    public static final /* enum */ FlightRecordRecoveryState IDLE = new FlightRecordRecoveryState(0);
    public static final /* enum */ FlightRecordRecoveryState RESUME_LOCAL = new FlightRecordRecoveryState(1);
    public static final /* enum */ FlightRecordRecoveryState WAIT_RESUME = new FlightRecordRecoveryState(2);
    public static final /* enum */ FlightRecordRecoveryState COMPLETE = new FlightRecordRecoveryState(3);
    public static final /* enum */ FlightRecordRecoveryState FAILED = new FlightRecordRecoveryState(4);
    public static final /* enum */ FlightRecordRecoveryState UNKNOWN = new FlightRecordRecoveryState(65535);
    private int value;
    private static final FlightRecordRecoveryState[] allValues;
    private static final /* synthetic */ FlightRecordRecoveryState[] $VALUES;

    public static FlightRecordRecoveryState[] values() {
        return null;
    }

    public static FlightRecordRecoveryState valueOf(String string) {
        return null;
    }

    private FlightRecordRecoveryState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlightRecordRecoveryState find(int n) {
        return null;
    }

    private static /* synthetic */ FlightRecordRecoveryState[] $values() {
        return null;
    }

    static {
        $VALUES = FlightRecordRecoveryState.$values();
        allValues = FlightRecordRecoveryState.values();
    }
}

