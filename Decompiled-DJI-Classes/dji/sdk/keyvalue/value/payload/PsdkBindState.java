/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class PsdkBindState
extends Enum<PsdkBindState>
implements JNIProguardKeepTag {
    public static final /* enum */ PsdkBindState UNBOUND = new PsdkBindState(0);
    public static final /* enum */ PsdkBindState BOUND = new PsdkBindState(1);
    public static final /* enum */ PsdkBindState UNBOUNDED = new PsdkBindState(2);
    public static final /* enum */ PsdkBindState MISMATCH = new PsdkBindState(3);
    public static final /* enum */ PsdkBindState UNKNOWN = new PsdkBindState(65535);
    private int value;
    private static final PsdkBindState[] allValues;
    private static final /* synthetic */ PsdkBindState[] $VALUES;

    public static PsdkBindState[] values() {
        return null;
    }

    public static PsdkBindState valueOf(String string) {
        return null;
    }

    private PsdkBindState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PsdkBindState find(int n) {
        return null;
    }

    private static /* synthetic */ PsdkBindState[] $values() {
        return null;
    }

    static {
        $VALUES = PsdkBindState.$values();
        allValues = PsdkBindState.values();
    }
}

