/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FlightRecordFileState
extends Enum<FlightRecordFileState>
implements JNIProguardKeepTag {
    public static final /* enum */ FlightRecordFileState CREATED = new FlightRecordFileState(0);
    public static final /* enum */ FlightRecordFileState RESUMED = new FlightRecordFileState(1);
    public static final /* enum */ FlightRecordFileState SUSPENDED = new FlightRecordFileState(2);
    public static final /* enum */ FlightRecordFileState CLOSED = new FlightRecordFileState(3);
    public static final /* enum */ FlightRecordFileState UNKNOWN = new FlightRecordFileState(65535);
    private int value;
    private static final FlightRecordFileState[] allValues;
    private static final /* synthetic */ FlightRecordFileState[] $VALUES;

    public static FlightRecordFileState[] values() {
        return null;
    }

    public static FlightRecordFileState valueOf(String string) {
        return null;
    }

    private FlightRecordFileState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlightRecordFileState find(int n) {
        return null;
    }

    private static /* synthetic */ FlightRecordFileState[] $values() {
        return null;
    }

    static {
        $VALUES = FlightRecordFileState.$values();
        allValues = FlightRecordFileState.values();
    }
}

