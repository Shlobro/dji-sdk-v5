/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class LonLatFormat
extends Enum<LonLatFormat>
implements JNIProguardKeepTag {
    public static final /* enum */ LonLatFormat DECIMAL_DEGREE = new LonLatFormat(0);
    public static final /* enum */ LonLatFormat DEGREES_DECIMAL_MINUTES = new LonLatFormat(1);
    public static final /* enum */ LonLatFormat SEXAGESIMAL_DEGREE = new LonLatFormat(2);
    public static final /* enum */ LonLatFormat UNKNOWN = new LonLatFormat(65535);
    private int value;
    private static final LonLatFormat[] allValues;
    private static final /* synthetic */ LonLatFormat[] $VALUES;

    public static LonLatFormat[] values() {
        return null;
    }

    public static LonLatFormat valueOf(String string) {
        return null;
    }

    private LonLatFormat(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LonLatFormat find(int n) {
        return null;
    }

    private static /* synthetic */ LonLatFormat[] $values() {
        return null;
    }

    static {
        $VALUES = LonLatFormat.$values();
        allValues = LonLatFormat.values();
    }
}

