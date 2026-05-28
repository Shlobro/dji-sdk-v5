/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class CableFollowAirState
extends Enum<CableFollowAirState>
implements JNIProguardKeepTag {
    public static final /* enum */ CableFollowAirState STANDDOWN = new CableFollowAirState(0);
    public static final /* enum */ CableFollowAirState EXPLORING = new CableFollowAirState(1);
    public static final /* enum */ CableFollowAirState EXECUTING = new CableFollowAirState(2);
    public static final /* enum */ CableFollowAirState EMERGENCY = new CableFollowAirState(3);
    public static final /* enum */ CableFollowAirState COMPLETE = new CableFollowAirState(4);
    public static final /* enum */ CableFollowAirState UNKNOWN = new CableFollowAirState(255);
    private int value;
    private static final CableFollowAirState[] allValues;
    private static final /* synthetic */ CableFollowAirState[] $VALUES;

    public static CableFollowAirState[] values() {
        return null;
    }

    public static CableFollowAirState valueOf(String string) {
        return null;
    }

    private CableFollowAirState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CableFollowAirState find(int n) {
        return null;
    }

    private static /* synthetic */ CableFollowAirState[] $values() {
        return null;
    }

    static {
        $VALUES = CableFollowAirState.$values();
        allValues = CableFollowAirState.values();
    }
}

