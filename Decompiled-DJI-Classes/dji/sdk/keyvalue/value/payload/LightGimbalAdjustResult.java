/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class LightGimbalAdjustResult
extends Enum<LightGimbalAdjustResult>
implements JNIProguardKeepTag {
    public static final /* enum */ LightGimbalAdjustResult OK = new LightGimbalAdjustResult(0);
    public static final /* enum */ LightGimbalAdjustResult POSITIVE_LIMIT = new LightGimbalAdjustResult(1);
    public static final /* enum */ LightGimbalAdjustResult NEGATIVE_LIMIT = new LightGimbalAdjustResult(2);
    public static final /* enum */ LightGimbalAdjustResult FAILED = new LightGimbalAdjustResult(3);
    public static final /* enum */ LightGimbalAdjustResult UNKNOWN = new LightGimbalAdjustResult(65535);
    private int value;
    private static final LightGimbalAdjustResult[] allValues;
    private static final /* synthetic */ LightGimbalAdjustResult[] $VALUES;

    public static LightGimbalAdjustResult[] values() {
        return null;
    }

    public static LightGimbalAdjustResult valueOf(String string) {
        return null;
    }

    private LightGimbalAdjustResult(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LightGimbalAdjustResult find(int n) {
        return null;
    }

    private static /* synthetic */ LightGimbalAdjustResult[] $values() {
        return null;
    }

    static {
        $VALUES = LightGimbalAdjustResult.$values();
        allValues = LightGimbalAdjustResult.values();
    }
}

