/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class LandingProtectType
extends Enum<LandingProtectType>
implements JNIProguardKeepTag {
    public static final /* enum */ LandingProtectType NONE = new LandingProtectType(0);
    public static final /* enum */ LandingProtectType UNEVEN_GROUND = new LandingProtectType(1);
    public static final /* enum */ LandingProtectType SECOND_STAGE_LANDING = new LandingProtectType(2);
    public static final /* enum */ LandingProtectType AUTO_WORK_PLATFORM = new LandingProtectType(3);
    public static final /* enum */ LandingProtectType UNKNOWN = new LandingProtectType(65535);
    private int value;
    private static final LandingProtectType[] allValues;
    private static final /* synthetic */ LandingProtectType[] $VALUES;

    public static LandingProtectType[] values() {
        return null;
    }

    public static LandingProtectType valueOf(String string) {
        return null;
    }

    private LandingProtectType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LandingProtectType find(int n) {
        return null;
    }

    private static /* synthetic */ LandingProtectType[] $values() {
        return null;
    }

    static {
        $VALUES = LandingProtectType.$values();
        allValues = LandingProtectType.values();
    }
}

