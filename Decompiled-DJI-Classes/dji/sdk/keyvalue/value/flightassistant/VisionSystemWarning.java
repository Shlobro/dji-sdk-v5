/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class VisionSystemWarning
extends Enum<VisionSystemWarning>
implements JNIProguardKeepTag {
    public static final /* enum */ VisionSystemWarning INVALID = new VisionSystemWarning(0);
    public static final /* enum */ VisionSystemWarning SAFE = new VisionSystemWarning(1);
    public static final /* enum */ VisionSystemWarning DANGEROUS = new VisionSystemWarning(2);
    public static final /* enum */ VisionSystemWarning UNKNOWN = new VisionSystemWarning(65535);
    private int value;
    private static final VisionSystemWarning[] allValues;
    private static final /* synthetic */ VisionSystemWarning[] $VALUES;

    public static VisionSystemWarning[] values() {
        return null;
    }

    public static VisionSystemWarning valueOf(String string) {
        return null;
    }

    private VisionSystemWarning(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VisionSystemWarning find(int n) {
        return null;
    }

    private static /* synthetic */ VisionSystemWarning[] $values() {
        return null;
    }

    static {
        $VALUES = VisionSystemWarning.$values();
        allValues = VisionSystemWarning.values();
    }
}

