/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class ParachuteStateEnumDroneState
extends Enum<ParachuteStateEnumDroneState>
implements JNIProguardKeepTag {
    public static final /* enum */ ParachuteStateEnumDroneState ON_GROUND = new ParachuteStateEnumDroneState(0);
    public static final /* enum */ ParachuteStateEnumDroneState AIR = new ParachuteStateEnumDroneState(1);
    public static final /* enum */ ParachuteStateEnumDroneState UNKNOWN = new ParachuteStateEnumDroneState(255);
    private int value;
    private static final ParachuteStateEnumDroneState[] allValues;
    private static final /* synthetic */ ParachuteStateEnumDroneState[] $VALUES;

    public static ParachuteStateEnumDroneState[] values() {
        return null;
    }

    public static ParachuteStateEnumDroneState valueOf(String string) {
        return null;
    }

    private ParachuteStateEnumDroneState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ParachuteStateEnumDroneState find(int n) {
        return null;
    }

    private static /* synthetic */ ParachuteStateEnumDroneState[] $values() {
        return null;
    }

    static {
        $VALUES = ParachuteStateEnumDroneState.$values();
        allValues = ParachuteStateEnumDroneState.values();
    }
}

