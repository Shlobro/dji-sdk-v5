/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class LandingType
extends Enum<LandingType>
implements JNIProguardKeepTag {
    public static final /* enum */ LandingType NONE = new LandingType(0);
    public static final /* enum */ LandingType NORMAL = new LandingType(1);
    public static final /* enum */ LandingType DRONE_NEST = new LandingType(2);
    public static final /* enum */ LandingType BACKUP_LANDING = new LandingType(3);
    public static final /* enum */ LandingType UNKNOWN = new LandingType(65535);
    private int value;
    private static final LandingType[] allValues;
    private static final /* synthetic */ LandingType[] $VALUES;

    public static LandingType[] values() {
        return null;
    }

    public static LandingType valueOf(String string) {
        return null;
    }

    private LandingType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LandingType find(int n) {
        return null;
    }

    private static /* synthetic */ LandingType[] $values() {
        return null;
    }

    static {
        $VALUES = LandingType.$values();
        allValues = LandingType.values();
    }
}

