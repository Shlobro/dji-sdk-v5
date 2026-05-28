/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class LiftCapabilityLevel
extends Enum<LiftCapabilityLevel>
implements JNIProguardKeepTag {
    public static final /* enum */ LiftCapabilityLevel LEVEL_0_NORMAL = new LiftCapabilityLevel(0);
    public static final /* enum */ LiftCapabilityLevel LEVEL_1_WARNING = new LiftCapabilityLevel(1);
    public static final /* enum */ LiftCapabilityLevel LEVEL_2_SERIOUS = new LiftCapabilityLevel(2);
    public static final /* enum */ LiftCapabilityLevel UNKNOWN = new LiftCapabilityLevel(65535);
    private int value;
    private static final LiftCapabilityLevel[] allValues;
    private static final /* synthetic */ LiftCapabilityLevel[] $VALUES;

    public static LiftCapabilityLevel[] values() {
        return null;
    }

    public static LiftCapabilityLevel valueOf(String string) {
        return null;
    }

    private LiftCapabilityLevel(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LiftCapabilityLevel find(int n) {
        return null;
    }

    private static /* synthetic */ LiftCapabilityLevel[] $values() {
        return null;
    }

    static {
        $VALUES = LiftCapabilityLevel.$values();
        allValues = LiftCapabilityLevel.values();
    }
}

