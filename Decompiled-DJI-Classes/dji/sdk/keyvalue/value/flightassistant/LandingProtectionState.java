/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class LandingProtectionState
extends Enum<LandingProtectionState>
implements JNIProguardKeepTag {
    public static final /* enum */ LandingProtectionState NONE = new LandingProtectionState(0);
    public static final /* enum */ LandingProtectionState ANALYZING = new LandingProtectionState(1);
    public static final /* enum */ LandingProtectionState ANALYSIS_FAILED = new LandingProtectionState(2);
    public static final /* enum */ LandingProtectionState SAFE_TO_LAND = new LandingProtectionState(3);
    public static final /* enum */ LandingProtectionState NOT_SAFE_TO_LAND = new LandingProtectionState(4);
    public static final /* enum */ LandingProtectionState UNKNOWN = new LandingProtectionState(65535);
    private int value;
    private static final LandingProtectionState[] allValues;
    private static final /* synthetic */ LandingProtectionState[] $VALUES;

    public static LandingProtectionState[] values() {
        return null;
    }

    public static LandingProtectionState valueOf(String string) {
        return null;
    }

    private LandingProtectionState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LandingProtectionState find(int n) {
        return null;
    }

    private static /* synthetic */ LandingProtectionState[] $values() {
        return null;
    }

    static {
        $VALUES = LandingProtectionState.$values();
        allValues = LandingProtectionState.values();
    }
}

