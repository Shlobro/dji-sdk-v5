/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flighttaskreplay;

import dji.jni.JNIProguardKeepTag;

public final class FlightTaskDeviceType
extends Enum<FlightTaskDeviceType>
implements JNIProguardKeepTag {
    public static final /* enum */ FlightTaskDeviceType UAV = new FlightTaskDeviceType(0);
    public static final /* enum */ FlightTaskDeviceType DOCK = new FlightTaskDeviceType(1);
    public static final /* enum */ FlightTaskDeviceType RELAY = new FlightTaskDeviceType(2);
    public static final /* enum */ FlightTaskDeviceType RC = new FlightTaskDeviceType(3);
    public static final /* enum */ FlightTaskDeviceType UNKNOWN = new FlightTaskDeviceType(65535);
    private int value;
    private static final FlightTaskDeviceType[] allValues;
    private static final /* synthetic */ FlightTaskDeviceType[] $VALUES;

    public static FlightTaskDeviceType[] values() {
        return null;
    }

    public static FlightTaskDeviceType valueOf(String string) {
        return null;
    }

    private FlightTaskDeviceType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlightTaskDeviceType find(int n) {
        return null;
    }

    private static /* synthetic */ FlightTaskDeviceType[] $values() {
        return null;
    }

    static {
        $VALUES = FlightTaskDeviceType.$values();
        allValues = FlightTaskDeviceType.values();
    }
}

