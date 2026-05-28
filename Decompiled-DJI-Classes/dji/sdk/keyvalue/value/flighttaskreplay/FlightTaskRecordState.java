/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flighttaskreplay;

import dji.jni.JNIProguardKeepTag;

public final class FlightTaskRecordState
extends Enum<FlightTaskRecordState>
implements JNIProguardKeepTag {
    public static final /* enum */ FlightTaskRecordState RECORDING = new FlightTaskRecordState(0);
    public static final /* enum */ FlightTaskRecordState RECORD_END = new FlightTaskRecordState(1);
    public static final /* enum */ FlightTaskRecordState UNKNOWN = new FlightTaskRecordState(65535);
    private int value;
    private static final FlightTaskRecordState[] allValues;
    private static final /* synthetic */ FlightTaskRecordState[] $VALUES;

    public static FlightTaskRecordState[] values() {
        return null;
    }

    public static FlightTaskRecordState valueOf(String string) {
        return null;
    }

    private FlightTaskRecordState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlightTaskRecordState find(int n) {
        return null;
    }

    private static /* synthetic */ FlightTaskRecordState[] $values() {
        return null;
    }

    static {
        $VALUES = FlightTaskRecordState.$values();
        allValues = FlightTaskRecordState.values();
    }
}

