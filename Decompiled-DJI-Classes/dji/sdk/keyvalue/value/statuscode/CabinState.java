/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.statuscode;

import dji.jni.JNIProguardKeepTag;

public final class CabinState
extends Enum<CabinState>
implements JNIProguardKeepTag {
    public static final /* enum */ CabinState INSIDE = new CabinState(0);
    public static final /* enum */ CabinState OUTSIDE = new CabinState(1);
    public static final /* enum */ CabinState UNKNOWN = new CabinState(65535);
    private int value;
    private static final CabinState[] allValues;
    private static final /* synthetic */ CabinState[] $VALUES;

    public static CabinState[] values() {
        return null;
    }

    public static CabinState valueOf(String string) {
        return null;
    }

    private CabinState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CabinState find(int n) {
        return null;
    }

    private static /* synthetic */ CabinState[] $values() {
        return null;
    }

    static {
        $VALUES = CabinState.$values();
        allValues = CabinState.values();
    }
}

