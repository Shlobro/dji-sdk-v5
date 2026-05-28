/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class LightGimbalAutoAdjustResult
extends Enum<LightGimbalAutoAdjustResult>
implements JNIProguardKeepTag {
    public static final /* enum */ LightGimbalAutoAdjustResult OK = new LightGimbalAutoAdjustResult(0);
    public static final /* enum */ LightGimbalAutoAdjustResult LP = new LightGimbalAutoAdjustResult(1);
    public static final /* enum */ LightGimbalAutoAdjustResult SUSPEND = new LightGimbalAutoAdjustResult(2);
    public static final /* enum */ LightGimbalAutoAdjustResult MOTOR_ON = new LightGimbalAutoAdjustResult(3);
    public static final /* enum */ LightGimbalAutoAdjustResult NOT_SUPPORTED = new LightGimbalAutoAdjustResult(4);
    public static final /* enum */ LightGimbalAutoAdjustResult UNKNOWN = new LightGimbalAutoAdjustResult(65535);
    private int value;
    private static final LightGimbalAutoAdjustResult[] allValues;
    private static final /* synthetic */ LightGimbalAutoAdjustResult[] $VALUES;

    public static LightGimbalAutoAdjustResult[] values() {
        return null;
    }

    public static LightGimbalAutoAdjustResult valueOf(String string) {
        return null;
    }

    private LightGimbalAutoAdjustResult(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LightGimbalAutoAdjustResult find(int n) {
        return null;
    }

    private static /* synthetic */ LightGimbalAutoAdjustResult[] $values() {
        return null;
    }

    static {
        $VALUES = LightGimbalAutoAdjustResult.$values();
        allValues = LightGimbalAutoAdjustResult.values();
    }
}

