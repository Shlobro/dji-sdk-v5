/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class LandingGearOpt
extends Enum<LandingGearOpt>
implements JNIProguardKeepTag {
    public static final /* enum */ LandingGearOpt STOP = new LandingGearOpt(0);
    public static final /* enum */ LandingGearOpt UP = new LandingGearOpt(1);
    public static final /* enum */ LandingGearOpt DOWN = new LandingGearOpt(2);
    public static final /* enum */ LandingGearOpt PACK = new LandingGearOpt(3);
    public static final /* enum */ LandingGearOpt UNPACK = new LandingGearOpt(4);
    public static final /* enum */ LandingGearOpt UNKNOWN = new LandingGearOpt(255);
    private int value;
    private static final LandingGearOpt[] allValues;
    private static final /* synthetic */ LandingGearOpt[] $VALUES;

    public static LandingGearOpt[] values() {
        return null;
    }

    public static LandingGearOpt valueOf(String string) {
        return null;
    }

    private LandingGearOpt(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LandingGearOpt find(int n) {
        return null;
    }

    private static /* synthetic */ LandingGearOpt[] $values() {
        return null;
    }

    static {
        $VALUES = LandingGearOpt.$values();
        allValues = LandingGearOpt.values();
    }
}

