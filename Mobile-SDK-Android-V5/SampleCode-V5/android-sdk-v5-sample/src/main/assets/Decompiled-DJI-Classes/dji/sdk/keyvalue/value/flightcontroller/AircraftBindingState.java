/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class AircraftBindingState
extends Enum<AircraftBindingState>
implements JNIProguardKeepTag {
    public static final /* enum */ AircraftBindingState INITIAL = new AircraftBindingState(0);
    public static final /* enum */ AircraftBindingState UNBOUND = new AircraftBindingState(1);
    public static final /* enum */ AircraftBindingState UNBOUND_BUT_CANNOT_SYNC = new AircraftBindingState(2);
    public static final /* enum */ AircraftBindingState BOUND = new AircraftBindingState(3);
    public static final /* enum */ AircraftBindingState NOT_REQUIRED = new AircraftBindingState(4);
    public static final /* enum */ AircraftBindingState NOT_SUPORTED = new AircraftBindingState(5);
    public static final /* enum */ AircraftBindingState UNKNOWN = new AircraftBindingState(65535);
    private int value;
    private static final AircraftBindingState[] allValues;
    private static final /* synthetic */ AircraftBindingState[] $VALUES;

    public static AircraftBindingState[] values() {
        return null;
    }

    public static AircraftBindingState valueOf(String string) {
        return null;
    }

    private AircraftBindingState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AircraftBindingState find(int n) {
        return null;
    }

    private static /* synthetic */ AircraftBindingState[] $values() {
        return null;
    }

    static {
        $VALUES = AircraftBindingState.$values();
        allValues = AircraftBindingState.values();
    }
}

