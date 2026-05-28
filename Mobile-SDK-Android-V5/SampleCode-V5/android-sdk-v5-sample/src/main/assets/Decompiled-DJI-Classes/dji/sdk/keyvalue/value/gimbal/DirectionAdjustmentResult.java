/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class DirectionAdjustmentResult
extends Enum<DirectionAdjustmentResult>
implements JNIProguardKeepTag {
    public static final /* enum */ DirectionAdjustmentResult GOOD = new DirectionAdjustmentResult(0);
    public static final /* enum */ DirectionAdjustmentResult BAD = new DirectionAdjustmentResult(1);
    public static final /* enum */ DirectionAdjustmentResult UNKNOWN = new DirectionAdjustmentResult(100);
    private int value;
    private static final DirectionAdjustmentResult[] allValues;
    private static final /* synthetic */ DirectionAdjustmentResult[] $VALUES;

    public static DirectionAdjustmentResult[] values() {
        return null;
    }

    public static DirectionAdjustmentResult valueOf(String string) {
        return null;
    }

    private DirectionAdjustmentResult(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DirectionAdjustmentResult find(int n) {
        return null;
    }

    private static /* synthetic */ DirectionAdjustmentResult[] $values() {
        return null;
    }

    static {
        $VALUES = DirectionAdjustmentResult.$values();
        allValues = DirectionAdjustmentResult.values();
    }
}

