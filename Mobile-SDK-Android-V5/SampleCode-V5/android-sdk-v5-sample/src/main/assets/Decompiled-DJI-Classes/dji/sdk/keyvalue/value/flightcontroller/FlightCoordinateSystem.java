/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FlightCoordinateSystem
extends Enum<FlightCoordinateSystem>
implements JNIProguardKeepTag {
    public static final /* enum */ FlightCoordinateSystem GROUND = new FlightCoordinateSystem(0);
    public static final /* enum */ FlightCoordinateSystem BODY = new FlightCoordinateSystem(1);
    public static final /* enum */ FlightCoordinateSystem UNKNOWN = new FlightCoordinateSystem(65535);
    private int value;
    private static final FlightCoordinateSystem[] allValues;
    private static final /* synthetic */ FlightCoordinateSystem[] $VALUES;

    public static FlightCoordinateSystem[] values() {
        return null;
    }

    public static FlightCoordinateSystem valueOf(String string) {
        return null;
    }

    private FlightCoordinateSystem(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlightCoordinateSystem find(int n) {
        return null;
    }

    private static /* synthetic */ FlightCoordinateSystem[] $values() {
        return null;
    }

    static {
        $VALUES = FlightCoordinateSystem.$values();
        allValues = FlightCoordinateSystem.values();
    }
}

