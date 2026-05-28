/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class PrecisionFileTransVerifyState
extends Enum<PrecisionFileTransVerifyState>
implements JNIProguardKeepTag {
    public static final /* enum */ PrecisionFileTransVerifyState VERIFY_SUCCESS = new PrecisionFileTransVerifyState(0);
    public static final /* enum */ PrecisionFileTransVerifyState MD5_ERROR = new PrecisionFileTransVerifyState(1);
    public static final /* enum */ PrecisionFileTransVerifyState UUID_NULL = new PrecisionFileTransVerifyState(2);
    public static final /* enum */ PrecisionFileTransVerifyState UNKNOWN = new PrecisionFileTransVerifyState(65535);
    private int value;
    private static final PrecisionFileTransVerifyState[] allValues;
    private static final /* synthetic */ PrecisionFileTransVerifyState[] $VALUES;

    public static PrecisionFileTransVerifyState[] values() {
        return null;
    }

    public static PrecisionFileTransVerifyState valueOf(String string) {
        return null;
    }

    private PrecisionFileTransVerifyState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PrecisionFileTransVerifyState find(int n) {
        return null;
    }

    private static /* synthetic */ PrecisionFileTransVerifyState[] $values() {
        return null;
    }

    static {
        $VALUES = PrecisionFileTransVerifyState.$values();
        allValues = PrecisionFileTransVerifyState.values();
    }
}

