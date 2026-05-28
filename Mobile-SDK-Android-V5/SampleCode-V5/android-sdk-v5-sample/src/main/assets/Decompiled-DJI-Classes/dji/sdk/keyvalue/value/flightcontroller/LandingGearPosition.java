/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class LandingGearPosition
extends Enum<LandingGearPosition>
implements JNIProguardKeepTag {
    public static final /* enum */ LandingGearPosition UNDEF = new LandingGearPosition(0);
    public static final /* enum */ LandingGearPosition SHOW = new LandingGearPosition(1);
    public static final /* enum */ LandingGearPosition ON_SHOWING = new LandingGearPosition(2);
    public static final /* enum */ LandingGearPosition HIDE = new LandingGearPosition(3);
    public static final /* enum */ LandingGearPosition ON_HIDING = new LandingGearPosition(4);
    public static final /* enum */ LandingGearPosition HOLD = new LandingGearPosition(5);
    public static final /* enum */ LandingGearPosition PACKED = new LandingGearPosition(6);
    public static final /* enum */ LandingGearPosition ON_PACKING = new LandingGearPosition(7);
    public static final /* enum */ LandingGearPosition ON_UNPACKING = new LandingGearPosition(8);
    public static final /* enum */ LandingGearPosition UNKNOWN = new LandingGearPosition(255);
    private int value;
    private static final LandingGearPosition[] allValues;
    private static final /* synthetic */ LandingGearPosition[] $VALUES;

    public static LandingGearPosition[] values() {
        return null;
    }

    public static LandingGearPosition valueOf(String string) {
        return null;
    }

    private LandingGearPosition(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LandingGearPosition find(int n) {
        return null;
    }

    private static /* synthetic */ LandingGearPosition[] $values() {
        return null;
    }

    static {
        $VALUES = LandingGearPosition.$values();
        allValues = LandingGearPosition.values();
    }
}

