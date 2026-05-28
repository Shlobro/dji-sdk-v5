/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class MGPumpClearAirState
extends Enum<MGPumpClearAirState>
implements JNIProguardKeepTag {
    public static final /* enum */ MGPumpClearAirState CLEAR_PREPARE = new MGPumpClearAirState(0);
    public static final /* enum */ MGPumpClearAirState CLEAR_RUN = new MGPumpClearAirState(1);
    public static final /* enum */ MGPumpClearAirState CLEAR_SUCCESS = new MGPumpClearAirState(2);
    public static final /* enum */ MGPumpClearAirState UNKNOWN = new MGPumpClearAirState(65535);
    private int value;
    private static final MGPumpClearAirState[] allValues;
    private static final /* synthetic */ MGPumpClearAirState[] $VALUES;

    public static MGPumpClearAirState[] values() {
        return null;
    }

    public static MGPumpClearAirState valueOf(String string) {
        return null;
    }

    private MGPumpClearAirState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MGPumpClearAirState find(int n) {
        return null;
    }

    private static /* synthetic */ MGPumpClearAirState[] $values() {
        return null;
    }

    static {
        $VALUES = MGPumpClearAirState.$values();
        allValues = MGPumpClearAirState.values();
    }
}

