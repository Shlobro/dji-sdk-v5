/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class PsdkMpState
extends Enum<PsdkMpState>
implements JNIProguardKeepTag {
    public static final /* enum */ PsdkMpState TESTING = new PsdkMpState(0);
    public static final /* enum */ PsdkMpState PRODUCTION = new PsdkMpState(1);
    public static final /* enum */ PsdkMpState UNKNOWN = new PsdkMpState(65535);
    private int value;
    private static final PsdkMpState[] allValues;
    private static final /* synthetic */ PsdkMpState[] $VALUES;

    public static PsdkMpState[] values() {
        return null;
    }

    public static PsdkMpState valueOf(String string) {
        return null;
    }

    private PsdkMpState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PsdkMpState find(int n) {
        return null;
    }

    private static /* synthetic */ PsdkMpState[] $values() {
        return null;
    }

    static {
        $VALUES = PsdkMpState.$values();
        allValues = PsdkMpState.values();
    }
}

