/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;

public final class InsuranceState
extends Enum<InsuranceState>
implements JNIProguardKeepTag {
    public static final /* enum */ InsuranceState VALID = new InsuranceState(0);
    public static final /* enum */ InsuranceState EXIT = new InsuranceState(1);
    public static final /* enum */ InsuranceState EXPIRED = new InsuranceState(2);
    public static final /* enum */ InsuranceState INVALID = new InsuranceState(3);
    public static final /* enum */ InsuranceState CANCEL = new InsuranceState(4);
    public static final /* enum */ InsuranceState UNKNOWN = new InsuranceState(65535);
    private int value;
    private static final InsuranceState[] allValues;
    private static final /* synthetic */ InsuranceState[] $VALUES;

    public static InsuranceState[] values() {
        return null;
    }

    public static InsuranceState valueOf(String string) {
        return null;
    }

    private InsuranceState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static InsuranceState find(int n) {
        return null;
    }

    private static /* synthetic */ InsuranceState[] $values() {
        return null;
    }

    static {
        $VALUES = InsuranceState.$values();
        allValues = InsuranceState.values();
    }
}

