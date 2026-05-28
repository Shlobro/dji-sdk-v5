/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class PrecisionLandingMode
extends Enum<PrecisionLandingMode>
implements JNIProguardKeepTag {
    public static final /* enum */ PrecisionLandingMode NORMAL = new PrecisionLandingMode(0);
    public static final /* enum */ PrecisionLandingMode PRECISION_LANDING = new PrecisionLandingMode(1);
    public static final /* enum */ PrecisionLandingMode UNKNOWN = new PrecisionLandingMode(255);
    private int value;
    private static final PrecisionLandingMode[] allValues;
    private static final /* synthetic */ PrecisionLandingMode[] $VALUES;

    public static PrecisionLandingMode[] values() {
        return null;
    }

    public static PrecisionLandingMode valueOf(String string) {
        return null;
    }

    private PrecisionLandingMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PrecisionLandingMode find(int n) {
        return null;
    }

    private static /* synthetic */ PrecisionLandingMode[] $values() {
        return null;
    }

    static {
        $VALUES = PrecisionLandingMode.$values();
        allValues = PrecisionLandingMode.values();
    }
}

