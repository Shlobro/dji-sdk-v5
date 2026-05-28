/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flighttaskreplay;

import dji.jni.JNIProguardKeepTag;

public final class FlightTaskRecorder
extends Enum<FlightTaskRecorder>
implements JNIProguardKeepTag {
    public static final /* enum */ FlightTaskRecorder UAV = new FlightTaskRecorder(0);
    public static final /* enum */ FlightTaskRecorder DOCK = new FlightTaskRecorder(1);
    public static final /* enum */ FlightTaskRecorder PILOT = new FlightTaskRecorder(2);
    public static final /* enum */ FlightTaskRecorder UNKNOWN = new FlightTaskRecorder(65535);
    private int value;
    private static final FlightTaskRecorder[] allValues;
    private static final /* synthetic */ FlightTaskRecorder[] $VALUES;

    public static FlightTaskRecorder[] values() {
        return null;
    }

    public static FlightTaskRecorder valueOf(String string) {
        return null;
    }

    private FlightTaskRecorder(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlightTaskRecorder find(int n) {
        return null;
    }

    private static /* synthetic */ FlightTaskRecorder[] $values() {
        return null;
    }

    static {
        $VALUES = FlightTaskRecorder.$values();
        allValues = FlightTaskRecorder.values();
    }
}

