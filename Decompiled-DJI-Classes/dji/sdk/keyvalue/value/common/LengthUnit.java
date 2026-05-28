/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class LengthUnit
extends Enum<LengthUnit>
implements JNIProguardKeepTag {
    public static final /* enum */ LengthUnit METER = new LengthUnit(0);
    public static final /* enum */ LengthUnit FOOT = new LengthUnit(1);
    public static final /* enum */ LengthUnit UNKNOWN = new LengthUnit(65535);
    private int value;
    private static final LengthUnit[] allValues;
    private static final /* synthetic */ LengthUnit[] $VALUES;

    public static LengthUnit[] values() {
        return null;
    }

    public static LengthUnit valueOf(String string) {
        return null;
    }

    private LengthUnit(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LengthUnit find(int n) {
        return null;
    }

    private static /* synthetic */ LengthUnit[] $values() {
        return null;
    }

    static {
        $VALUES = LengthUnit.$values();
        allValues = LengthUnit.values();
    }
}

