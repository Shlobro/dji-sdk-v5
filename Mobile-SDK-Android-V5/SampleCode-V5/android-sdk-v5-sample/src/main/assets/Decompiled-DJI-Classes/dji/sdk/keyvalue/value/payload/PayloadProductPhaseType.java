/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class PayloadProductPhaseType
extends Enum<PayloadProductPhaseType>
implements JNIProguardKeepTag {
    public static final /* enum */ PayloadProductPhaseType PHASE_DEVELOPMENT = new PayloadProductPhaseType(1);
    public static final /* enum */ PayloadProductPhaseType PHASE_RELEASE = new PayloadProductPhaseType(2);
    public static final /* enum */ PayloadProductPhaseType UNKNOWN = new PayloadProductPhaseType(65535);
    private int value;
    private static final PayloadProductPhaseType[] allValues;
    private static final /* synthetic */ PayloadProductPhaseType[] $VALUES;

    public static PayloadProductPhaseType[] values() {
        return null;
    }

    public static PayloadProductPhaseType valueOf(String string) {
        return null;
    }

    private PayloadProductPhaseType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PayloadProductPhaseType find(int n) {
        return null;
    }

    private static /* synthetic */ PayloadProductPhaseType[] $values() {
        return null;
    }

    static {
        $VALUES = PayloadProductPhaseType.$values();
        allValues = PayloadProductPhaseType.values();
    }
}

