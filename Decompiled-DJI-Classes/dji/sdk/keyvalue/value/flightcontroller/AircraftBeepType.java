/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class AircraftBeepType
extends Enum<AircraftBeepType>
implements JNIProguardKeepTag {
    public static final /* enum */ AircraftBeepType FIND_AIRCRAFT = new AircraftBeepType(0);
    public static final /* enum */ AircraftBeepType MAKE_PAIRING = new AircraftBeepType(1);
    public static final /* enum */ AircraftBeepType UNKNOWN = new AircraftBeepType(65535);
    private int value;
    private static final AircraftBeepType[] allValues;
    private static final /* synthetic */ AircraftBeepType[] $VALUES;

    public static AircraftBeepType[] values() {
        return null;
    }

    public static AircraftBeepType valueOf(String string) {
        return null;
    }

    private AircraftBeepType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AircraftBeepType find(int n) {
        return null;
    }

    private static /* synthetic */ AircraftBeepType[] $values() {
        return null;
    }

    static {
        $VALUES = AircraftBeepType.$values();
        allValues = AircraftBeepType.values();
    }
}

