/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.statuscode;

import dji.jni.JNIProguardKeepTag;

public final class PlaneGearState
extends Enum<PlaneGearState>
implements JNIProguardKeepTag {
    public static final /* enum */ PlaneGearState A = new PlaneGearState(0);
    public static final /* enum */ PlaneGearState P = new PlaneGearState(1);
    public static final /* enum */ PlaneGearState NAV = new PlaneGearState(2);
    public static final /* enum */ PlaneGearState FPV = new PlaneGearState(3);
    public static final /* enum */ PlaneGearState FARM = new PlaneGearState(4);
    public static final /* enum */ PlaneGearState S = new PlaneGearState(5);
    public static final /* enum */ PlaneGearState F = new PlaneGearState(6);
    public static final /* enum */ PlaneGearState M = new PlaneGearState(7);
    public static final /* enum */ PlaneGearState G = new PlaneGearState(8);
    public static final /* enum */ PlaneGearState T = new PlaneGearState(9);
    public static final /* enum */ PlaneGearState UNKNOWN = new PlaneGearState(65535);
    private int value;
    private static final PlaneGearState[] allValues;
    private static final /* synthetic */ PlaneGearState[] $VALUES;

    public static PlaneGearState[] values() {
        return null;
    }

    public static PlaneGearState valueOf(String string) {
        return null;
    }

    private PlaneGearState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PlaneGearState find(int n) {
        return null;
    }

    private static /* synthetic */ PlaneGearState[] $values() {
        return null;
    }

    static {
        $VALUES = PlaneGearState.$values();
        allValues = PlaneGearState.values();
    }
}

