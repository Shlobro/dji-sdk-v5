/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class WindWarning
extends Enum<WindWarning>
implements JNIProguardKeepTag {
    public static final /* enum */ WindWarning LEVEL_0 = new WindWarning(0);
    public static final /* enum */ WindWarning LEVEL_1 = new WindWarning(1);
    public static final /* enum */ WindWarning LEVEL_2 = new WindWarning(2);
    public static final /* enum */ WindWarning UNKNOWN = new WindWarning(65535);
    private int value;
    private static final WindWarning[] allValues;
    private static final /* synthetic */ WindWarning[] $VALUES;

    public static WindWarning[] values() {
        return null;
    }

    public static WindWarning valueOf(String string) {
        return null;
    }

    private WindWarning(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WindWarning find(int n) {
        return null;
    }

    private static /* synthetic */ WindWarning[] $values() {
        return null;
    }

    static {
        $VALUES = WindWarning.$values();
        allValues = WindWarning.values();
    }
}

