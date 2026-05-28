/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RcCurrentPairState
extends Enum<RcCurrentPairState>
implements JNIProguardKeepTag {
    public static final /* enum */ RcCurrentPairState UN_PAIRING = new RcCurrentPairState(0);
    public static final /* enum */ RcCurrentPairState PAIRING = new RcCurrentPairState(1);
    public static final /* enum */ RcCurrentPairState PAIRED = new RcCurrentPairState(2);
    public static final /* enum */ RcCurrentPairState NOT_COMPATIBLE = new RcCurrentPairState(3);
    public static final /* enum */ RcCurrentPairState UNKNOWN = new RcCurrentPairState(65535);
    private int value;
    private static final RcCurrentPairState[] allValues;
    private static final /* synthetic */ RcCurrentPairState[] $VALUES;

    public static RcCurrentPairState[] values() {
        return null;
    }

    public static RcCurrentPairState valueOf(String string) {
        return null;
    }

    private RcCurrentPairState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RcCurrentPairState find(int n) {
        return null;
    }

    private static /* synthetic */ RcCurrentPairState[] $values() {
        return null;
    }

    static {
        $VALUES = RcCurrentPairState.$values();
        allValues = RcCurrentPairState.values();
    }
}

