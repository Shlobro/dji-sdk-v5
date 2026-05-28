/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flighttaskreplay;

import dji.jni.JNIProguardKeepTag;

public final class FlightTaskRecorderDataType
extends Enum<FlightTaskRecorderDataType>
implements JNIProguardKeepTag {
    public static final /* enum */ FlightTaskRecorderDataType STRING = new FlightTaskRecorderDataType(0);
    public static final /* enum */ FlightTaskRecorderDataType INT = new FlightTaskRecorderDataType(1);
    public static final /* enum */ FlightTaskRecorderDataType DOUBLE = new FlightTaskRecorderDataType(2);
    public static final /* enum */ FlightTaskRecorderDataType UNKNOWN = new FlightTaskRecorderDataType(65535);
    private int value;
    private static final FlightTaskRecorderDataType[] allValues;
    private static final /* synthetic */ FlightTaskRecorderDataType[] $VALUES;

    public static FlightTaskRecorderDataType[] values() {
        return null;
    }

    public static FlightTaskRecorderDataType valueOf(String string) {
        return null;
    }

    private FlightTaskRecorderDataType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlightTaskRecorderDataType find(int n) {
        return null;
    }

    private static /* synthetic */ FlightTaskRecorderDataType[] $values() {
        return null;
    }

    static {
        $VALUES = FlightTaskRecorderDataType.$values();
        allValues = FlightTaskRecorderDataType.values();
    }
}

